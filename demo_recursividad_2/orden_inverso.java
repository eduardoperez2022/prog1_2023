package demo_recursividad_2;

import java.util.Scanner;

/**
 *
 * @author eduardo.perez
 */
public class orden_inverso {

    public void imp_OrdenInverso(int n) {

        Scanner teclado = new Scanner(System.in);
        
        String palabra;
        if (n == 1) {
            palabra = teclado.nextLine();
            System.out.println(palabra);
        } else {
            palabra = teclado.nextLine();
            imp_OrdenInverso(n - 1);
            System.out.println(palabra);
        }
    }

}
