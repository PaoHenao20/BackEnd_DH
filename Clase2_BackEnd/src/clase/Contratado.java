package clase;

public class Contratado extends Empleado{
    private int cantdHoras;
    private double montoPorHoras;

    public Contratado(String nombre, String apellido, String nroCuenta, int cantdHoras, double montoPorHoras) {
        super(nombre, apellido, nroCuenta);
        this.cantdHoras = cantdHoras;
        this.montoPorHoras = montoPorHoras;
    }

    public int getCantdHoras() {
        return cantdHoras;
    }

    public double getMontoPorHoras() {
        return montoPorHoras;
    }

    public void setCantdHoras(int cantdHoras) {
        this.cantdHoras = cantdHoras;
    }

    public void setMontoPorHoras(double montoPorHoras) {
        this.montoPorHoras = montoPorHoras;
    }
}
