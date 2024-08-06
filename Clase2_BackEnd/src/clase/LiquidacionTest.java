package clase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidacionTest {
    @Test
    @DisplayName("Testea Debería emitir un documento en papel cuando es un empleado efectivo.")
    void caso1(){
        //Dado
        Empleado empleado = new Efectivo("Martin", "Martini", "343242", 400, 60, 40);
        Liquidacion liquidacion = new LiquidacionEfectivo();

        // cuando
        String respuestaEsperada =  "la liquidacion generada es un documento impreso saldo a liquidar: 420.0";
        String respuestaObtenida = liquidacion.liquidarSueldo(empleado);


        // entonces
        assertEquals(respuestaObtenida,respuestaEsperada);
    }

    @Test
    @DisplayName("Testea Debería emitir un documento digital cuando es un empleado contratado.")
    void caso2(){
        //Dado
        Empleado empleado = new Efectivo("Martin", "Martini", "343242", 400, 60, 40);
        Liquidacion liquidacion = new LiquidacionEfectivo();

        // cuando
        String respuestaEsperada =  "la liquidacion generada es un documento impreso saldo a liquidar: 420.0";
        String respuestaObtenida = liquidacion.liquidarSueldo(empleado);


        // entonces
        assertEquals(respuestaObtenida,respuestaEsperada);
    }

}