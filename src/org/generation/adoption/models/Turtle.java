package org.generation.adoption.models;

public class Turtle extends Pet {

    /// Atributo propio de la tortuga
    private String tipoCaparazon;

    public Turtle(String name, Integer age, String color, Integer numPatas, String tipoCaparazon) {
        super(name, age, color, numPatas);
        this.tipoCaparazon = tipoCaparazon;
    }
    public String getTipoCaparazon() {
        return tipoCaparazon;
    }
    @Override
    public void makeSound() {
        // Usamos this.getName() porque el nombre lo tiene guardado el padre
        System.out.println("La tortuga " + this.getName() + " hace un sonido de siseo.");
    }

    @Override
    public void showDetails() {
        System.out.println("Tortuga: " + this.getName() + ", Tipo de caparazón: " + this.tipoCaparazon);
    }



}
