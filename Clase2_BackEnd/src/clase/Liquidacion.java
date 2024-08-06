package clase;

public abstract class Liquidacion {
    public String liquidarSueldo(Empleado empleado){
        String respuesta = "La liquidacion no pudo ser efectuada";
        //1. Calcular sueldo
        double sueldo = calcularSueldo(empleado);
        //2. Imprimir comprobante
        String impresion = imprimir(empleado);
        //3.Depositae
        respuesta = "la liquidacion generada es un documento " + impresion + " saldo a liquidar: " + sueldo;
        return respuesta;


    }
    public abstract double calcularSueldo(Empleado empleado);
    protected abstract String imprimir(Empleado empleado);
    private void depositarSueldo(Empleado empleado){
        System.out.println("Sueldo depositado"+ "al empleado" + empleado.getApellido());
    }

}
