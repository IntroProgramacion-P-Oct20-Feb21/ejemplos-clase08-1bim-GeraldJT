/*
    El siguiente programa muestra de forma infinita la frase:
    Usted está en el ciclo

    Modificar el código para que el usuario decida si quiere seguir en el ciclo
    El usuario podrá salir con las siguiente opciones:
    SI
    Si
    SI
    si
    sI
    S
    s
 */
package ejemplosrepaso;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cambio = "";
        while (bandera) {
            System.out.println("Usted está en el ciclo");
            System.out.println("Ingrese 'Si' o 'S' si quiere salir del ciclo");
            cambio= entrada.nextLine();
            cambio = cambio.toUpperCase();
            
            if (cambio.equals("SI")) || (cambio.equals("S")){
                bandera = false;
            }
            
        }
    }
}
