package org.generation.adoption.models;

/**
 * Una clase abstracta, es una clase que sirve de molde para otras clases
 * Importante:
 * <ul>
 *     <li>No puede ser instanciada(No podemos crear objetos)</li>
 *     <li>Pueden tener metodos abstractos</li>
 *          <p>
 *              Los métodos abstractos solo declaran la firma, y la clase que herede
 *              la clase abstracta se tiene que encargar de completarlos
 *              Indica que vamos a hacer pero no el como.
 *          </p>
 *     <li>Puede tener atributos/propiedades</li>
 *     <li>Puede tener métodos normales</li>
 *     <li>Puede tener constrructor</li>
 * </ul>
 */

public abstract class Pet {

    /**
     * Propiedades o atributos
     * Son características del objeto
     * Nota:
     * Las clases no acumulan espacio en memoria
     * Cuando creamos el objeto, se reserva un espacio en memoria para llenar las características
     *
     */

    private String name;
    private Integer age;
    private String color;
    private Integer numPatas;

    /**
     * Metodo constructor
     * <p>Es un metodo especial que ayuda a definir el estado inicial del objeto</p>
     * Caracteristícas
     * <ul>
     *     <li>
     *         Tiene el mismo nombre que la clase, en este caso Pet
     *     </li>
     *     <li>
     *         Se ejecuta cuando usamos la palabra reservada new
     *     </li>
     *     <li>
     *         No retorna y no es necesario ponerle void
     *     </li>
     * </ul>
     */

    public Pet (String name, Integer age, String color, Integer numPatas) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.numPatas = numPatas;
    }
}
