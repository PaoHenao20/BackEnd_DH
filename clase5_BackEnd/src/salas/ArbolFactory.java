package salas;

import clase.Diagrama.Computadora;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, Arbol> poolArboles = new HashMap<>();
    public static Arbol getArbol(String tipo, String color, double ancho,double alto){
        String clave = "key: " + tipo+color+ancho+alto;
        Arbol arbol;

        if(!poolArboles.containsKey(clave)){
            arbol = new Arbol(tipo, color, ancho, alto);
            System.out.println("El árbol fue creado: " + arbol);
            poolArboles.put(clave, arbol);
        }
        arbol = poolArboles.get(clave);
        System.out.println("Arbol encontrado ");
        return arbol;
    }


 }

