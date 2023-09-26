/**
 * Primera clase que es ejecutada
 */
public class Principal {

    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Carro miCarro = new Carro("Mazda", 2020, 1.6);
        miCarro.arrancar();
        miCarro.acelerar();
        miCarro.frenar();
    }
}
