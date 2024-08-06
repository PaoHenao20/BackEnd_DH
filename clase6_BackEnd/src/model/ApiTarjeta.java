package model;

public class ApiTarjeta {
    public int descuento(Tarjeta tarjeta){
        int descuento = 0;
        if (tarjeta.getBanco().equals("Star Bank")){
            descuento = 2;
        }
        return descuento;
    }
}
