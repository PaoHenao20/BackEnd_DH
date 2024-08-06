package clase;

public class LiquidacionEfectivo extends Liquidacion{
    @Override
    public double calcularSueldo(Empleado empleado){
        Efectivo empleadoEfectivo = ((Efectivo) empleado);
        return empleadoEfectivo.getSueldoBase() + empleadoEfectivo.getPremio() - empleadoEfectivo.getDescuento();
    }

    @Override
    public String imprimir(Empleado empleado){
        return "impreso";
    }
}
