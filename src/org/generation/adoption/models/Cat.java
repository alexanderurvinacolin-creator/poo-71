package org.generation.adoption.models;

import org.generation.adoption.interfaces.Adoptable;

/**
     * La palabra reservada para heredar es Extends
     */

    public class Cat extends Pet implements Adoptable {
        private String breed;

        public Cat(String name, Integer age, String color, Integer numPatas, String breed) {
            super(name, age, color, numPatas);
            this.breed = breed;
        }///Constructor

        /**
         * OVERRIDE VS OVERLOAD
         * Overrride es cuando una subclase sobreescribe un metodo heredado usando exactamente
         * la misma firma
         *
         * Overload es cuando tenemos un metodo con el mismo nombre varias veces, pero que recibe
         * diferente cantidad de parametros o en diferente orden.
         */

        @Override
        public void showDetails() {
            System.out.println("El gato de nombre " + this.getName() + " tiene " + this.getAge() + " años y cuenta con " + getNumPatas() + " patas, por ultimo es un gato  " + getColor());

        }

        @Override
        public void makeSound() {
            System.out.println("El gato " + this.getName() + " hace miau" );

        }

    @Override
    public void adopt() {
        System.out.println("Felicidades " + this.getName() + " fue adoptade");

    }
}///CAT


