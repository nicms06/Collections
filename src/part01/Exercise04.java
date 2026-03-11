/*
Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, menores que 100, en una colección.
Hay que asegurarse de que se guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se mostrará la
colección resultante por pantalla.
 */

package part01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {

        //Creación de un nuevo objeto de la clase Random
        Random rand = new Random();

        //Creamos una lista y la rellenamos
        ArrayList<Integer> numeros = rellenarLista(rand);

        //Mostramos la lista
        mostrarLista(numeros);

    }

    /**
     * Función que crea una lista, la rellena con números aleatorios positivos y distintos menores a 100 y los ordena
     * @param rand Objeto de la clase random
     * @return devolvemos la lista llena y ordenada
     */
    static ArrayList<Integer> rellenarLista (Random rand){

        //Creación de una lista
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++){

            int aleatorio;

            do{
                aleatorio = rand.nextInt(0, 100);
            } while (Collections.binarySearch(numeros, aleatorio) >= 0);

            numeros.add(aleatorio);

            Collections.sort(numeros);
        }

        return numeros;
    }

    /**
     * Función que pasa una lista a array y la muestra por pantalla
     * @param numeros lista con números aleatorios ordenados
     */
    static void mostrarLista(ArrayList<Integer> numeros){
        System.out.println(Arrays.toString(numeros.toArray()));
    }
}
