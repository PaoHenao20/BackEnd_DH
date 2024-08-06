package clase;

public class LiquidacionContratado extends Liquidacion{
    @Override
    public double calcularSueldo(Empleado empleado){
        Contratado empleadoContratado = ((Contratado) empleado);
        return empleadoContratado.getCantdHoras() * empleadoContratado.getMontoPorHoras();
    }

    @Override
    public String imprimir(Empleado empleado){
        return "papel";
    }
}
