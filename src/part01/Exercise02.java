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
        Random rand = new Random();

        ArrayList<Integer> numeros = crearLista(rand); //Creación de una lista con longitud y contenido aleatorio
        mostrarLista(numeros); //Mostramos la lista

        //Mostramos la suma, media, maximo y mínimo
        System.out.println(
                "///////////////////////\n" +
                "Suma: " + suma(numeros) + "\n" +
                "Media: " + media(numeros) + "\n" +
                "Mayor: " + numeroMaximo(numeros) + "\n" +
                "Menor: " + numeroMinimo(numeros)
        );

    }

    /**
     * Función que muestra una lista
     * @param lista ArrayList con números aleatorios
     */
    static void mostrarLista (ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    /**
     * Función que genera un número aleatorio entre 0 y 100
     * @return se devuelve un número aleatorio entre 0 y 100
     */
    static int generarRandom(Random rand){
        return rand.nextInt(0, 101);
    }

    /**
     * Función que genera una longitud aleatoriamente y crea un arraylist con números aleatorios
     * @return Se devuelve la lista con los números aleatorios
     */
    static ArrayList<Integer> crearLista(Random rand){
        int longitud = rand.nextInt(6) + 5;

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < longitud; i++){
            listaNumeros.add(generarRandom(rand));
        }

        return listaNumeros;
    }

    /**
     * Función que suma todos los números de una lista
     * @param numeros lista con números enteros
     * @return devolvemos la suma de todos los números de la lista
     */
    static int suma (ArrayList<Integer> numeros){
        int suma = 0;

        for (int i = 0; i < numeros.size(); i++){
            suma += numeros.get(i);
        }
        return suma;
    }

    /**
     * Función que calcula la media de los números de una lista
     * @param numeros Lista que contiene números enteros
     * @return devolvemos un float con la media de los números de la lista
     */
    static float media (ArrayList<Integer> numeros){
        return (float) suma(numeros) / numeros.size();
    }

    /**
     * Función que busca el número más grande de una lista
     * @param numeros lista que contiene números enteros
     * @return devolvemos un entero que representa el número más grande de una lista
     */
    static int numeroMaximo (ArrayList<Integer> numeros){
        int maximo = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) > maximo){
                maximo = numeros.get(i);
            }
        }

        return maximo;
    }

    /**
     * Función que busca el número más pequeño de una lista
     * @param numeros lista que contiene números enteros
     * @return devolvemos un entero que representa el número más pequeño de una lista
     */
    static int numeroMinimo (ArrayList<Integer> numeros){
        int minimo = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) < minimo){
                minimo = numeros.get(i);
            }
        }

        return minimo;
    }
}