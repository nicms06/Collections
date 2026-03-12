/**
 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres, que se insertarán en una colección, de
 * forma que se conserve el orden de inserción y que no puedan repetirse. Al final, la colección se mostrará por pantalla.
 */

package part01;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un Linked Hash set
        LinkedHashSet<String> nombres = new LinkedHashSet<>();

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