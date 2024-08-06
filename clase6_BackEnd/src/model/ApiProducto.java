package model;

public class ApiProducto {
    public int descuento(Producto producto){
        int descuento = 0;
        if (producto.getNombre().equals("Latas")){
            descuento = 2;
        }
        return descuento;
    }
}
