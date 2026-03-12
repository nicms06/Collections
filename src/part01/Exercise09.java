/**
 * Realiza una aplicación donde se registren nombres de productos y su precio. Lleva a cabo el siguiente menú:
 * PRODUCTOS
 * 1. Alta de producto
 * 2. Baja de producto
 * 3. Listar existencias
 * 0. Salir
 * El orden en el que se almacenan los productos no importa.
 */

package part01;

import java.util.HashMap;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un nuevo HashMap
        HashMap <String, Double> productos = new HashMap<>();

        int opcion = 0;

        do{
            menu(sc);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    altaProducto(productos, sc);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del producto: ");
                    String nombreProducto = sc.nextLine();
                    bajaProducto(productos, nombreProducto);
                    break;
                case 3:
                    listarExistencias(productos);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
            }
        } while (opcion != 0);

        //Cerramos el Scanner
        sc.close();

    }

    /**
     * Función que muestra el menú
     * @param sc Objeto de la clase random
     */
    static void menu (Scanner sc){
        System.out.println("////////// PRODUCTOS //////////");
        System.out.println("1. Alta de producto");
        System.out.println("2. Baja de producto");
        System.out.println("3. Listar existencias");
        System.out.println("0. Salir");
        System.out.println("///////////////////////////////");
        System.out.println("Elija una opción: ");
    }

    /**
     * Función que pide al usuario un producto y su precio y los añade a un HashMap
     * @param productos HashMap que contiene productos y sus precios
     * @param sc Objeto de la clase Scanner
     */
    static void altaProducto (HashMap<String, Double> productos, Scanner sc){

        System.out.print("Introduce el nombre del producto: ");
        String nombreProducto = sc.nextLine();

        if (productos.containsKey(nombreProducto)){
            System.out.println("El producto '" + nombreProducto + "' ya existe en el almacén.");
        } else {
            System.out.print("Introduce un precio para '" + nombreProducto + "': ");
            Double precioProducto = sc.nextDouble();

            productos.put(nombreProducto, precioProducto);

            System.out.println("Producto dado de alta correctamente.");
        }
    }

    /**
     * Función que dado el producto, elimina la clave-valor del HashMap
     * @param productos HashMap que contiene productos y sus precios
     * @param nombreProducto Clave del HashMap que representa el nombre del producto
     */
    static void bajaProducto (HashMap<String, Double> productos, String nombreProducto){

        if (productos.remove(nombreProducto) == null){
            System.out.println("Producto no encontrado");
        } else{
            System.out.println("Producto eliminado correctamente.");
        }
    }

    static void listarExistencias (HashMap<String, Double> productos){
        System.out.println(productos);
    }
}