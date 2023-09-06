package practica_tad_1;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class menu_tad1 {
    
    public void iniciar() {
        
        // 0 - escribe tu nombre arriba luego de la palabra @author
        
        // 1 - crear un objeto ArrayList
        // llenarlo con los datos siguientes:
        // blanco
        // negro
        // marron
        // rojo
        // verde
        // azul
        // violeta
        // amarillo
        // indigo
        // cyan
        
        ArrayList<String> array1 = new ArrayList();

        System.out.println("----Elementos que ingresan--------------------");
        
        array1.add("blanco");
        array1.add("negro");
        array1.add("marron");
        array1.add("rojo");
        array1.add("verde");
        array1.add("azul");
        array1.add("violeta");
        array1.add("amarillo");
        array1.add("indigo");
        array1.add("cyan");
        
        System.out.println("---------------------------------");
        for(String elemento:array1) {
            System.out.println(elemento);
        }
            
        
        // 2 - crear un objeto ejercicio_tad1
        ejercicio_tad1 etad1 = new ejercicio_tad1();
        
        etad1.llenar_pila(array1);
        etad1.print_pila();

        // 3 - llamar a los metodos de ejercicio_tad1

        etad1.llenar_cola(array1);
        etad1.print_cola();
        
    }
    
}
