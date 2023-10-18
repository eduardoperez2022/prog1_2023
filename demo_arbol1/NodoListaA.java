package demo_arbol1;

//Definición de la Clase NodoLista
class NodosListaA {

    NodoBinario datos;
    NodosListaA siguiente;

    //Construtor  Crea un nodo del tipo Object
    NodosListaA(NodoBinario valor) {
        datos = valor;
        siguiente = null;  //siguiente con valor de nulo
    }

    // Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
    NodosListaA(NodoBinario valor, NodosListaA signodo) {
        datos = valor;
        siguiente = signodo; //siguiente se refiere al siguiente nodo
    }
}
