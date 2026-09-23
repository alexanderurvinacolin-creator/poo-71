package org.generation.adoption.models;

    /**
     * La palabra reservada para heredar es Extends
     */

    public class Cat extends Pet {
        private String breed;

        public Cat(String name, Integer age, String color, Integer numPatas, String breed) {
            super(name, age, color, numPatas);
            this.breed = breed;
        }


        @Override
        public void showDetails() {

        }

        @Override
        public void makeSound() {

        }
    }


