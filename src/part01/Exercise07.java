/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción).
 * Utiliza un objeto de la clase TreeMap para almacenar las parejas de palabras.
 * El programa mostrará un menú con dos opciones:
 *      1. Inserta palabra. Debe solicitar una palabra en español y su traducción al inglés.
 *      2. Busca palabra. Pregunta por una palabra en español y devuelve su traducción en inglés.
 *      0. Salir. Termina el programa.
 */

package part01;

import java.util.TreeMap;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un TreeMap
        TreeMap<String, String> diccionario = new TreeMap<>();

        rellenarDiccionacio(diccionario); //Rellenamos el mapa

        int opcion = -1;

        do {
            System.out.println("""
                    /////////// MENU ///////////\s
                    1. Insertar Palabra
                    2. Buscar Palabra
                    0. Salir
                    ////////////////////////////
                    Introduce una opción:""");

            opcion = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (opcion){

                case 1:
                    insertar (diccionario, sc);
                    break;
                case 2:
                    System.out.println("Introduce la palabra que deseas buscar: ");
                    String palabra = sc.nextLine().trim(); // leemos la palabra del usuario
                    String traduccion = buscarPalabra(diccionario, palabra);

                    if (traduccion != null){
                        System.out.println("La traducción de '" + palabra + "' es '" + traduccion + "'.");
                    } else{
                        System.out.println("No existe esa palabra en el diccionario.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
            }

        }while (opcion!= 0);

        //Cerramos el Scanner
        sc.close();

    }

    /**
     * Función que rellena un treeMap
     * @param diccionario treemap con claves en español y valores en ingles
     * @return devolvemos el treemap con los valores
     */
    static TreeMap<String, String> rellenarDiccionacio (TreeMap<String, String> diccionario){

        diccionario.put("Hola", "Hello");
        diccionario.put("Adiós", "Goodbye");
        diccionario.put("Gracias", "Thank you");
        diccionario.put("Por favor", "Please");
        diccionario.put("Lo siento", "Sorry");
        diccionario.put("Sí", "Yes");
        diccionario.put("No", "No");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Casa", "House");
        diccionario.put("Escuela", "School");
        diccionario.put("Comida", "Food");
        diccionario.put("Agua", "Water");
        diccionario.put("Perro", "Dog");
        diccionario.put("Gato", "Cat");
        diccionario.put("Libro", "Book");
        diccionario.put("Trabajo", "Work");
        diccionario.put("Familia", "Family");
        diccionario.put("Coche", "Car");
        diccionario.put("Ciudad", "City");
        diccionario.put("País", "Country");

        return diccionario;
    }

    /**
     * Función que pide una palabra en español y otra en inglés y las añade al diccionario
     * @param diccionario TreeMap con palabras en español y sus traducciones al inglés
     * @param sc Objeto de la clase Scanner
     */
    static void insertar (TreeMap<String, String> diccionario, Scanner sc){
        System.out.println("Introduce la palabra en Español: ");
        String palabraEspaniol = sc.nextLine();

        while (palabraEspaniol.isEmpty()){
            System.out.println("La palabra no puede estar vacía: ");
            palabraEspaniol = sc.nextLine();
        }

        System.out.println("Introduce la palabra en Inglés: ");
        String palabraIngles = sc.nextLine();

        while (palabraIngles.isEmpty()){
            System.out.println("La palabra no puede estar vacía: ");
            palabraIngles = sc.nextLine();
        }

        diccionario.put(palabraEspaniol, palabraIngles);
    }

    /**
     * Función que busca una palabra en el mapa y si la encuentra devuelve la traducción
     * @param diccionario TreeMap con palabras en español y sus traducciones al inglés
     * @param palabraEspaniol Palabra que queremos buscar
     * @return devolvemos la traducción si existe la palabra o null si no existe
     */
    static String buscarPalabra(TreeMap<String, String> diccionario, String palabraEspaniol){
        // Devuelve la traducción o null si no existe
        return diccionario.get(palabraEspaniol);
    }
}