/*
Crear una lista de números enteros positivos introducidos por consola hasta que se introduzca uno negativo.
A continuación, recorrer la lista y mostrar por pantalla los índices de los elementos de valor par.
 */

package part01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numerosPositivos = new ArrayList<>();

        int num;

        do{
            System.out.println("Introduce un número positivo: ");
            num = sc.nextInt();
            if (num > 0){
                numerosPositivos.add(num);
            }
        }while(num >= 0);

        int indice = 0;
        for (int numero : numerosPositivos){
            if (numero % 2 == 0){
                System.out.print(indice + "\t");
            }
            indice++;
        }

        //Cerramos el Scanner
        sc.close();
    }
}
