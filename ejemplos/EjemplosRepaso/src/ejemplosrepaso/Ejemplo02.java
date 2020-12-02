/*
 *  Las entradas son: ciudad Loja, pais Ecuador
    La salida del programa debe ser así:
    
    Loja, situada en el sur del país:
    
        ECUADOR.
 */
package ejemplosrepaso;

import java.util.Scanner;


public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String pais;
        System.out.println("Ingresar el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar el nombre del país");
        pais = entrada.nextLine();
        System.out.printf("%s, situada en el dur del país:\n\n %s", ciudad,
                pais);
       
    }
    
}
