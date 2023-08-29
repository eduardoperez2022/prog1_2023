package demo_excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo2_solucion {
    
    
    public void convierte_a_numero() {
        
        Scanner lector1 = new Scanner(System.in);
        
        String entrada = "";
        
        ArrayList<Integer> lista_num = new ArrayList<>();
        
        System.out.println("Ingrese numeros:");
        
        while (!entrada.equals("-1")) {
            
            entrada = lector1.nextLine();
            try {
                Integer numero = Integer.parseInt(entrada);
                lista_num.add(numero);
            }
            catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto. Reingrese !");
            }
            
        }
        
        System.out.println("Los ingresos al ArrayList fueron:");
        System.out.println(lista_num.toString());
        
    }

    
    public void divide_por_cero() {
    
        int numerador = 100;
        
        int denominador = 0;
        
        int division;
        
        Scanner lector2 = new Scanner(System.in);
        
        System.out.println("Ingrese divisores:");
        
        while (denominador != -1) {
            
            try {
                denominador = lector2.nextInt();
                division = numerador / denominador;
                System.out.println("Resultado: " + division);
            }
            catch (ArithmeticException e) {
               System.out.println("Divide por cero. Reingrese !");
            }
            
        }
        
        System.out.println("Antes ...");
        
    }
    
    
    public void elemento_array() {
    
        String [] elementos = new String[11];
        elementos[0] = "Frase";
        elementos[1] = "que";
        elementos[2] = "se";
        elementos[3] = "guarda";
        elementos[4] = "fragmentada";
        elementos[5] = "en";
        elementos[6] = "un";
        elementos[7] = "arreglo";
        elementos[8] = "nativo";
        elementos[9] = "punto";
        elementos[10] = "";
        
        Scanner lector3 = new Scanner(System.in);
        
        System.out.println("Ingrese posicion:");

        int indice = 0;
        
        while (indice != 10) {
            
            try {
                indice = lector3.nextInt();
                String palabra = elementos[indice];
                System.out.println(indice + ":" + palabra);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice incorrecto. Reingrese !");
            }
            
        }
        
    }
    

    public void divide_por_cero_tipo() {
    
        int numerador = 100;
        
        String denominador = "";
        
        int division;
        
        Scanner lector2 = new Scanner(System.in);
        
        System.out.println("Ingrese divisores:");
        
        while (!denominador.equals("-1")) {
            
            try {
                denominador = lector2.nextLine();
                int deno2 = Integer.parseInt(denominador);
                division = numerador / deno2;
                System.out.println("Resultado: " + division);
            }
            catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto. Reingrese !");
            }
            catch (ArithmeticException e) {
               System.out.println("Divide por cero. Reingrese !");
            }
        }
        
        System.out.println("Antes ...");
        
    }
    
    
}
