package clase;

public class Personas {
    private String nombre;
    private int edad;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public boolean chequearEdad(){
        return edad >= 18;
    }

    public boolean chequearLongNombre(){
        return nombre.length() > 4;
    }

    public boolean chequearNombreEntreAz(){
        return nombre.matches("[a-zA-Z]+");
    }

    public boolean chequearEdadEntre0y120(){
        return edad > 0 && edad < 120;
    }
}
