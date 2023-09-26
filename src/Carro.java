/**
 * Clase Carro
 */
public class Carro {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
    String marca;
    int modelo;
    double cilindraje;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Carro: Inicializa los atributos de mi clase
     * @param marca
     * @param modelo
     * @param cilindraje
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Carro(String marca, int modelo, double cilindraje){
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    /**
     * Método de inicia la marcha de mi carro
     * @return boolean: Indica si mi carro pudo arrancar
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean arrancar(){
        System.out.println("Run run ... Arranqué");
        return true;
    }

    /**
     * Método que detiene la marcha de mi carro
     * @return boolean: Indica si mi carro se pudo detenerse
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean frenar(){
        System.out.println("Me detuve");
        return true;
    }

    /**
     * Método que acelera mi carro
     * @return boolean: Indica si mi carro pudo acelerar
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean acelerar(){
        System.out.println("Yeiiii, voy más rápido");
        return true;
    }
}
