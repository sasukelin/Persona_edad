/**
 * Clase Persona
 */
public class Persona {

    /******************** Atributos ********************/
    String nombre;
    int edad;
    String direccion;

    /******************** Métodos ********************/
    /**
     * Constructor de la clase Persona: Inicializa los atributos de la persona
     * @param nombre
     * @param edad
     * @param direccion
     */
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    /**
     * Método que muestra la información de la persona
     */
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion);
    }

}

