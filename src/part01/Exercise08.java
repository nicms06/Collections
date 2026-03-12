/**
 * Implementa el control de acceso al área restringida de un programa. Los nombres de usuario con sus correspondientes
 * contraseñas deben estar almacenados en una estructura de la clase HashMap. El programa mostrará un menú con dos opciones:
 *
 *      1. Registro. Debe pedir un nombre de usuario y una contraseña. A continuación, se almacenarán en el mapa.
 *      2. Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente,
 *         el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades.
 *         Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”.
 *      3. Salir. Termina el programa.
 */

package part01;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        //Creación de un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Creación de un nuevo HashMap
        HashMap<String, String> usuarios = new HashMap<>();

        int opcion = 0;

        do{
            mostrarMenu(sc);

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduce un nombre de usuario: ");
                    String usuario = sc.nextLine();

                    if (usuarios.containsKey(usuario)){
                        System.out.println("Usuario ya existente.");
                    } else{
                        System.out.println("Introduce la contraseña: ");
                        String password = sc.nextLine();

                        registro (usuario, password, usuarios);
                    }
                    break;
                case 2:
                    login (usuarios, sc);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opcion != 3);

        //Cerramos el Scanner
        sc.close();

    }

    static void mostrarMenu (Scanner sc){
        System.out.println("///////////// MENU /////////////");
        System.out.println("1. Registro");
        System.out.println("2. Login");
        System.out.println("3. Salir");
        System.out.println("////////////////////////////////");
        System.out.println("Introduce una opción: ");
    }

    static void registro (String usuario, String password, HashMap<String, String> usuarios){
        usuarios.put(usuario, password);
    }

    static void login (HashMap<String, String> usuarios, Scanner sc){
        boolean esCorrecto = false;

        for (int i = 0; i < 3; i++){
            System.out.println("Intento " + (i+1) + ":");

            System.out.println("Introduce un nombre de usuario: ");
            String usuario = sc.nextLine();

            System.out.println("Introduce la contraseña: ");
            String password = sc.nextLine();

            if (!usuarios.containsKey(usuario) || !usuarios.get(usuario).equals(password)){
                System.out.println("Incorrecto");
                continue;
            } else {
                esCorrecto = true;
                break;
            }
        }

        if (esCorrecto){
            System.out.println("Ha accedido al área restringida");
        } else{
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }

}