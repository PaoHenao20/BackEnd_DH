package model;

public class ApiCantidad {
    public int descuento (int cantidad){
        int descuento = 0;
        if (cantidad.getTipo().equals("Star Bank")){
            descuento = 2;
        }
        return descuento;
    }
}
