/**
 * Repite la actividad anterior de forma que se inserten los nombres manteniendo el orden alfabético.
 */

package part01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise06 {
    public static void main(String[] args) {
        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un Linked Hash set
        TreeSet<String> nombres = new TreeSet<>();

        String nombre = " ";

        System.out.println("Introduzca nombres (Fin para finalizar y no se admiten repetidos): ");

        do{
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("fin")){
                nombres.add(nombre.toLowerCase());
            }
        }while (!nombre.equalsIgnoreCase("fin"));

        System.out.println(Arrays.toString(nombres.toArray()));

        //Cerramos el Scanner
        sc.close();
    }
}






















