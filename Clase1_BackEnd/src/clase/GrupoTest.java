package clase;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    /* Dadas 5 personas (Juan, Pedro, Ana, Luz y Julián) y una colección vacía de objetos tipo Persona,
     cuando se intentan agregar estas a la colección, el tamaño de la colección debería ser 2.
     */
    @BeforeAll
    static void antesTest(){
        System.out.println("se ejecuta antes de todos los tests");
    }

    @BeforeEach
    void antesCadaTest(){
        System.out.println("se ejecuta antes de cada test de todos los tests");
    }

    @Test
    void caso1(){
        // DADO las instanciaciones de objetos que necesitamos para el test
        Personas persona1 = new Personas("Juan", 19);
        Personas persona2 = new Personas("Pedro", 19);
        Personas persona3 = new Personas("Ana", 19);
        Personas persona4 = new Personas("Luz", 19);
        Personas persona5 = new Personas("Julian", 19);
        Grupo grupoPersonas = new Grupo();

        // CUANDO se ejecuten los rocesos que necesito para el test
        grupoPersonas.agregarPersonas(persona1);
        grupoPersonas.agregarPersonas(persona2);
        grupoPersonas.agregarPersonas(persona3);
        grupoPersonas.agregarPersonas(persona4);
        grupoPersonas.agregarPersonas(persona5);

        // ENTONCES
        assertEquals(2,grupoPersonas.getPersonas().size());

    }

    @Test
    @DisplayName("Chequea que las edades sean mayores a 18")
    void caso2(){
        // DADO las instanciaciones de objetos que necesitamos para el test
        Personas persona1 = new Personas("Pedro", 18);
        Personas persona2 = new Personas("Pedro", 17);
        Personas persona3 = new Personas("Pedro", 22);
        Personas persona4 = new Personas("Pedro", 14);
        Personas persona5 = new Personas("Pedro", 32);
        Grupo grupoPersonas = new Grupo();

        // CUANDO se ejecuten los rocesos que necesito para el test
        grupoPersonas.agregarPersonas(persona1);
        grupoPersonas.agregarPersonas(persona2);
        grupoPersonas.agregarPersonas(persona3);
        grupoPersonas.agregarPersonas(persona4);
        grupoPersonas.agregarPersonas(persona5);

        // ENTONCES
        assertEquals(3,grupoPersonas.getPersonas().size());
        //assertTrue(grupoPersonas.getPersonas().size() == 3);

    }

    @AfterAll
    static void DespuesTest(){
        System.out.println("se ejecuta despues de todos los tests");
    }

    @AfterEach
    void DespuesCadaTest(){
        System.out.println("se ejecuta despues de cada test de todos los tests");
    }

}