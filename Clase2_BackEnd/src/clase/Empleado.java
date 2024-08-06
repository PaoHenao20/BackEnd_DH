package clase;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String nroCuenta;

    public Empleado(String nombre, String apellido, String nroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCuenta = nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
}
