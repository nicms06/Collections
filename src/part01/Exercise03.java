/*
Realiza un programa que genere 30 números enteros aleatorios, con valores comprendidos entre 1 y 10.
Se deben almacenar en una colección de forma ordenada. Pinta la colección por consola una vez rellena.
 */

package part01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        //Creación de un objeto de la clase Random
        Random rand = new Random();

        //Creamos, rellenamos y ordenamos la lista
        ArrayList<Integer> numeros = rellenarLista(rand);

        //Mostramos la lista
        mostrarLista(numeros);
    }

    static void mostrarLista (ArrayList<Integer> numeros){
            System.out.println(Arrays.toString(numeros.toArray()));
    }

    /**
     * Función que rellena con 30 números aleatorios entre 1 y 10 una lista y la ordena
     * @param rand Objetos de la clase Random
     * @return devolvemos la lista ordenada con los 30 números
     */
    static ArrayList<Integer> rellenarLista (Random rand){
        //Creación de una nueva lista
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 30; i++){
            numeros.add(rand.nextInt(1, 11));
        }
        Collections.sort(numeros);

        return numeros;
    }

}
