package clase;

public class Efectivo extends Empleado{
    private double sueldoBase;
    private double premio;
    private double descuento;

    public Efectivo(String nombre, String apellido, String nroCuenta, double sueldoBase, double premio, double descuento) {
        super(nombre, apellido, nroCuenta);
        this.sueldoBase = sueldoBase;
        this.premio = premio;
        this.descuento = descuento;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getPremio() {
        return premio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
