/**
 * Implementa una aplicación que genere 10 números enteros aleatorios distintos en el rango del 1 al 20 y los guarde
 * en una implementación que no permita que se dupliquen números en el caso de que se repitan y que garantice un orden
 * basado en inserción.
 * Luego, muestra los números únicos generados por pantalla.
 */

package part02;

import java.util.LinkedHashSet;
import java.util.Random;

public class Exercise02 {
    public static void main(String[] args) {

        //Creación un nuevo objeto de la clase Random
        Random rand = new Random();

        //Creación de un nuevo LinkedHashSet
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        while (numeros.size() < 10){
            int numero = rand.nextInt(1, 21);
            numeros.add(numero);
        }

        System.out.println(numeros);

    }
}
