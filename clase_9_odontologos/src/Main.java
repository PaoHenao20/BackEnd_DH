import db.H2Connection;
import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    public static final Logger logger = Logger.getLogger(Main.class);
    public static final String CREATE = "DROP TABLE ODONTOLOGOS IF EXISTS;" +
            "CREATE TABLE ODONTOLOGOS( ID INT AUTO_INCREMENT PRIMARY KEY," +
            "NOMBRE VARCHAR(25) NOT NULL, APELLIDO VARCHAR(25), MATRICULA VARCHAR(50)NOT NULL) ";

    public static final String SELECT_ALL = "SELECT * FROM ODONTOLOGOS";


    public static final String INSERT = "INSERT INTO ODONTOLOGOS VALUES (DEFAULT,?,?,?)";
    public static final String UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE ID=?";

    public static void main(String[] args) {
        Connection connection = null;
        Odontologo odontologo = new Odontologo("Juan","Perez", "435435");
        Odontologo odontologoDesdeDb = null;
        try{
            connection = H2Connection.getConnection();
            Statement statement = connection.createStatement();
            //Crear base de datos
            statement.execute(CREATE);

            //Insertar datos
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, odontologo.getNombre());
            preparedStatement.setString(2, odontologo.getApellido());
            preparedStatement.setString(3, odontologo.getMatricula());
            preparedStatement.executeUpdate();

            // Recuperar valores de la base de datos
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);

            while (resultSet.next()){
                Integer id = resultSet.getInt(1);
                String nombre = resultSet.getString(2);
                String apellido = resultSet.getString(3);
                String matricula = resultSet.getString(4);
                odontologoDesdeDb = new Odontologo(id, nombre, apellido, matricula);
            }
            logger.info("odontologo"+ odontologoDesdeDb);
            // update
            // esto lo vamos a tratar como una transaccion
            connection.setAutoCommit(false);
            try {
                preparedStatement = connection.prepareStatement(UPDATE);
                preparedStatement.setString(1, odontologoDesdeDb.setMatricula("1231"));
                preparedStatement.setInt(2, odontologoDesdeDb.getId());
                preparedStatement.executeUpdate();

                connection.commit();
                odontologoDesdeDb.setMatricula(odontologoDesdeDb.setMatricula("1234"));
            }catch (Exception e){
                connection.rollback();
                logger.error(e.getMessage());
            }finally {
                connection.setAutoCommit(true);
            }
            logger.info("odontologo" + odontologoDesdeDb);

        }catch (Exception e){
            logger.error(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}