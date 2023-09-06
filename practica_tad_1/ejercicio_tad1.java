package practica_tad_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Eduardo
 */
public class ejercicio_tad1 {
    
    // 0 - escribe tu nombre arriba luego de la palabra @author

    // 1 - agregar a esta clase un objeto pila (stack) y un objeto cola (queue)
    
    Stack<String> pila1 = new Stack();
    Queue<String> str_queue = new LinkedList<> ();
    
    // 2 - escribir un metodo llenar_pila, que tiene como entrada el Arraylist de menu_tad1
    // en llenar_pila se debe recorrer el arrayList de entrada y llenar con esos datos el 
    // objeto pila de la clase
    
    public void llenar_pila(ArrayList<String> parArray) {
        
        for(String elemento_array: parArray) {
            this.pila1.push(elemento_array);
        }

    }
    
    // 3 - escribir un metodo print_pila
    // en print_pila se debe recorrer la pila e imprimir cada valor obtenido en consola
    
    public void print_pila() {

        System.out.println("----Salen de la Pila----------------");
        while (!this.pila1.empty()) {
            String elemento_pila = this.pila1.pop();
            System.out.println(elemento_pila);
        }
    }
    
    // 3 - escribir un metodo llenar_cola, que tiene como entrada el Arraylist de menu_tad1
    // en llenar_cola se debe recorrer el arrayList de entrada y llenar con esos datos el 
    // objeto cola de la clase
    
    public void llenar_cola(ArrayList<String> parArray) {
        
        for(String elemento_array: parArray) {
            this.str_queue.add(elemento_array);
        }

    }
    
    // 4 - escribir un metodo print_cola
    // en print_cola se debe recorrer la cola e imprimir cada valor obtenido en consola

    public void print_cola() {
        System.out.println("----Salen de la Cola----------------");
        while (this.str_queue.size()>0) {
            String elemento_cola = this.str_queue.remove();
            System.out.println(elemento_cola);
        }
    }
    
}



