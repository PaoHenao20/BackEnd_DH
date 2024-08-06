package clase.Diagrama;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputadoraFactoryTest {
    @Test
    @DisplayName("Testear qie si se crean computadores del mismo tipo")
    void caso1(){
        //dado
        Computadora computadora1 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora2 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora3 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora4 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora5 = ComputadoraFactory.getComputadora("windows", 2, 128);
    }

    void caso2(){
        //dado
        Computadora computadora1 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora2 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora3 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora4 = ComputadoraFactory.getComputadora("windows", 2, 128);
        Computadora computadora5 = ComputadoraFactory.getComputadora("windows", 2, 128);
    }


}