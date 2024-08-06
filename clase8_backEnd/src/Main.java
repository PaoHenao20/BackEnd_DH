import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    public static final Logger logger = Logger.getLogger(Main.class);
    public static final String CREATE = "DROP TABLE IF EXISTS FIGURAS; " +
            "CREATE TABLE FIGURAS (ID INT AUTO_INCREMENT PRIMARY KEY, " +
            "FIGURA VARCHAR(50) NOT NULL, COLOR VARCHAR(50) NOT NULL) ";
    public static final String INSERT = "INSERT INTO FIGURAS VALUES " +
            "(DEFAULT, 'CIRCULO', 'ROJO'), (DEFAULT, 'CUADRADO', 'ROJO')," +
            "(DEFAULT, 'CIRCULO', 'VERDE'), (DEFAULT, 'CUADRADO', 'VERDE'), " +
            "(DEFAULT, 'CUADRADO', 'MORADO')";
    public static final String SELECT_ALL = "SELECT * FROM FIGURAS";

    public static final String SELECT_POR_FIGURA_ROJA = "SELECT * FROM FIGURAS WHERE COLOR = 'ROJO'";

    //public static final String DELETE = "DELETE FROM FIGURAS WHERE ID = 5";

    public static void main(String[] args) {
        Connection connection = null;
        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            // CREAR LA TABLA
            statement.execute(CREATE);
            // INSERTAR DATOS
            statement.execute(INSERT);
            // CONSULTAR DATOS
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            // MOSTRAMOS DATOS
            while (resultSet.next()){
                logger.info("Figura: "+ resultSet.getInt(1)+" "+
                        resultSet.getString(2)+" "+ resultSet.getString(3));
            }

            // BORRAR DATOS
            //statement.execute(DELETE);

            // CONSULTAR DE NUEVO
            resultSet = statement.executeQuery(SELECT_POR_FIGURA_ROJA);
            logger.info("-------------------------------------------------------");
            // MOSTRAMOS DATOS
            while (resultSet.next()){
                logger.info("Figura: "+ resultSet.getInt(1)+" "+
                        resultSet.getString(2)+" "+ resultSet.getString(3));
            }

        } catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }

    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:./clase8","sa","sa");
    }

}
