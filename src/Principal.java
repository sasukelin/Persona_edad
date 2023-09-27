/**
 * Clase ProgramaPrincipal para ejecutar el programa
 */
public class Principal {
    /**
     * Método principal que se ejecuta en la aplicación
     * @param args
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andres", 19, "calle 27 a 42 norte");
        Persona persona2 = new Persona("Camilo", 20, "25-75 sur");

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}
