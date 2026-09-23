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
    /**
     * GETTERS Y SETTERS
     * Son metodos que permiten obtener la información de un atributo
     * O fijar un valor a un atributo
     *
     * El getter retorna algo y no recibe parámetros
     * El setter recibe parametros pero no retorna nada
     *
     */

    /**
     * Retorna el valor del atributo name
     * @return tipo String name
     */

    public String getName() {
        return this.name;
    }

    /**
     * Fija un nuevo valor al atributo name
     * @param newName tipo String
     */

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(Integer numPatas) {
        this.numPatas = numPatas;
    }

    public  abstract void makeSound();

    /**
     * Metodo Abstracto
     *
     * Los metodos abstractos solo se pueden crear en clases abstractas o interfaces
     * <p>
     *     Son metodos que definen que se tiene que hacer, pero no como se hace
     *     Esto quiere decir que nos brindan la firma del metodo sin el body
     * </p>
     * <p>
     *     Las clases que hereden la clase abstracta se veran obligadas a
     *     implementar y completar el metodo abstracto
     * </p>
     */

    public abstract void showDetails();
}
