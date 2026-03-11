/*
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego calcule
    -La suma
    -La media
    -El máximo
    -El mínimo de esos números.
El tamaño de la lista también será aleatorio y podrá oscilar entre 5 y 10 elementos ambos inclusive.
 */

package part01;

import java.util.ArrayList;
import java.util.Random;

public class Exercise02 {
    public static void main(String[] args) {

    }

    /**
     * Función que genera un número aleatorio entre 0 y 100
     * @return se devuelve un número aleatorio entre 0 y 100
     */
    static int generarRandom(){
        Random rand = new Random();
        return rand.nextInt(0, 101);
    }

    /**
     * Función que genera una longitud aleatoriamente y crea un arraylist con números aleatorios
     * @param longitud Tamaño de la lista
     * @return Se devuelve la lista con los números aleatorios
     */
    static ArrayList<Integer> crearLista(int longitud){
        do{
            longitud = generarRandom();
        } while (longitud < 5 || longitud > 10);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < longitud; i++){
            listaNumeros.add(generarRandom());
        }

        return listaNumeros;
    }

    static int suma ()
}























