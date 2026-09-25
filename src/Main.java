import com.sun.source.tree.CaseLabelTree;
import org.generation.adoption.interfaces.Adoptable;
import org.generation.adoption.models.Cat;
import org.generation.adoption.models.Pet;
import org.generation.adoption.models.Turtle;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        /**
         * Clase abstracta que es y para que sirve
         * Como generar documentación de java usando javadoc (css y html)
         * Interfaces, que son y para que sirven (diferencia entre herencia e implementación)
         * Como heredar
         * Sobrecarga de metodos
         * Override de metodos
         * Excepciones y como propagarlas
         * Polimorfismo y encapsulación.
         */

        ///Creando un arraylist de tipo pet
        ArrayList<Pet> mascotas = new ArrayList<>();
        mascotas.add(new Cat("Paty", 4, "Tricolor", 4,"American shorthair"));
        mascotas.add(new Cat ("Salem",1,"Negro",4, "Bombay"));
        mascotas.add(new Cat("Martina",9,"Tricolor",4,"American shorthair"));
        mascotas.add(new Turtle("Donatello", 50, "Verde", 4, "Rígido"));
        mascotas.add(new Turtle("Rafa", 30, "Verde", 4, "Liso"));



        for (Pet mascota : mascotas) {
            mascota.makeSound();
            mascota.showDetails();
            if (mascota instanceof Adoptable){
                ((Adoptable) mascota).adopt();
            }
        }

    }
}
