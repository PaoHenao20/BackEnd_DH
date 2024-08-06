package salas;

import clase.Diagrama.Computadora;
import clase.Diagrama.ComputadoraFactory;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100000; i++) {
            Arbol arbol1 = ArbolFactory.getArbol("Ornamentales", "Verde",200, 400);
            Arbol arbol2 = ArbolFactory.getArbol("Frutales", "Rojo",500, 300);
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -  runtime.freeMemory()) / (1024 * 1024));

    }
}