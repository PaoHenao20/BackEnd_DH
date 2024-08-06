package salas;

public class Arbol {

    private String tipo;
    private String color;
    private double ancho;
    private double alto;
    private static int contador = 0;

    public Arbol(String tipo, String color, double ancho, double alto) {
        this.tipo = tipo;
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        contador++;
    }
}
