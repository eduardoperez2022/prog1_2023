package demo_recursividad_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author eduardo.perez
 */
public class menu {
    
    public void iniciar() {
        
        // ****** factorial iterativo
        System.out.println("------------------------");
        System.out.println("Calculo de factorial");
        System.out.println("Ingrese un entero:");
        
        // ****** factorial recursivo
        
        
        // ****** paridad
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Calculo de paridad");
        System.out.println("Ingrese un entero:");
        
        
        // ****** fibonaci
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Calculo de fibonaci");
        System.out.println("Ingrese un entero:");
        
        System.out.println("La serie fibonaci de nNum:");

        // for (int i = 0; i < nNum; i++) {
 
        
        // ****** orden inverso
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Calculo de orden inverso");
        
        
        // ****** cuenta regresiva
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Calculo de cuenta regresiva");
        System.out.println("Ingrese un entero:");
        
    }
    
    public static String EliminarNotaciónCientífica(double número) {
        String d = "####################################";
        return new DecimalFormat("#." + d + d + d).format(número);
    }

}
