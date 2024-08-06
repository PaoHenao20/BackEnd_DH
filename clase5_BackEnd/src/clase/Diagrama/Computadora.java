package clase.Diagrama;

public class Computadora {
    private String tipo;
    private int ram;
    private int discoRigido;
    private static int contador = 0;

    public Computadora(String tipo, int ram, int discoRigido) {
        this.tipo = tipo;
        this.ram = ram;
        this.discoRigido = discoRigido;
        contador++;
    }
}
