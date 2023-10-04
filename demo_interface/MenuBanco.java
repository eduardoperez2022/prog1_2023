package demo_interface;

import java.util.Arrays;
import java.util.Scanner;

public class MenuBanco {
    
    public void menu() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 5 saldos para crear 5 cuentas:");
        
        CuentaBanco[] Cuentas = new CuentaBanco[5];
        
        for (int i=0; i<5 ; i++) {
            Double saldo1 = entrada.nextDouble();
            Cuentas[i] = new CuentaBanco();
            Cuentas[i].setBalance(saldo1);
        }
        
        // sin ordenar
        System.out.println("Cuentas ingresadas:");
        
        for (int i=0; i<5 ; i++) {
            System.out.println(Cuentas[i].getSaldo());
        }
        
        
        // ordenadas
        System.out.println("Cuentas ordenadas:");

        Arrays.sort(Cuentas);

        for (int i=0; i<5 ; i++) {
            System.out.println(Cuentas[i].getSaldo());
        }
        
        
    }
    
}
