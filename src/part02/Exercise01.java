/**
 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y luego la mezcle de forma aleatoria.
 * Finalmente, muestra la lista original y la lista mezclada por pantalla.
 */

package part02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {

        //Creación de una lista del 1 al 10
        ArrayList<Integer> numeros = new ArrayList<>();

        rellenarLista(numeros);

        ArrayList<Integer> numerosDesordenados = desordenarLista(numeros);

        System.out.println("Lista original: ");
        mostrarLista(numeros);

        System.out.println("Lista desordenada: ");
        mostrarLista(numerosDesordenados);
    }

    /**
     * Función que rellena una lista con números del 1 al 10
     * @param numeros ArrayList
     */
    static void rellenarLista (ArrayList<Integer> numeros){
        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }
    }

    /**
     * Función que desordena una lista
     * @param numeros lista que contiene números del 1 al 10
     * @return devuelve la lista desordenada
     */
    static ArrayList<Integer> desordenarLista (ArrayList<Integer> numeros){
        ArrayList<Integer> copia = new ArrayList<>(numeros);
        Collections.shuffle(copia);
        return copia;
    }

    /**
     * Función que muestra una lista
     * @param numeros lista que contiene números del 1 al 10
     */
    static void mostrarLista (ArrayList<Integer> numeros){
        System.out.println(Arrays.toString(numeros.toArray()));
    }
}
