package clase;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Personas> personas;

    public Grupo() {
        this.personas = new ArrayList<>();
    }

    public List<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Personas> personas) {
        this.personas = personas;
    }

    public void agregarPersonas(Personas persona) {
        if (persona.chequearEdad() &&
                persona.chequearLongNombre() &&
                persona.chequearNombreEntreAz() &&
                persona.chequearEdadEntre0y120()) {

            // Agregar la persona a la lista
            this.personas.add(persona);
            System.out.println("Persona agregada correctamente");
        } else {
            System.out.println("No se pudo agregar");
        }
    }
}
