package demo_arbol1;

//Definición de la Clase Lista
class Cola {

    NodosListaA PrimerNodo;
    NodosListaA UltimoNodo;
    String Nombre;

    //Constructor construye una lista vacia con un nombre de List
    public Cola() {
        this("Lista");
    }

    //Constructor
    public Cola(String s) {
        Nombre = s;
        PrimerNodo = UltimoNodo = null;
    }

    //Retorna True si Lista Vacía
    public boolean VaciaLista() {
        return PrimerNodo == null;
    }

    //Inserta un Elemento al Frente de la Lista
    public void InsertaInicio(NodoBinario ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = UltimoNodo = new NodosListaA(ElemInser);
        } else {
            PrimerNodo = new NodosListaA(ElemInser, PrimerNodo);
        }
    }

    //Inserta al Final de la Lista
    public void InsertaFinal(NodoBinario ElemInser) {
        if (VaciaLista()) {
            PrimerNodo = UltimoNodo = new NodosListaA(ElemInser);
        } else {
            UltimoNodo = UltimoNodo.siguiente = new NodosListaA(ElemInser);
        }
    }

    //Eliminar al Inicio
    public void EliminaInicio() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        }

        // Restablecer  las referencias de PrimerNodo y UltimoNodo
        if (PrimerNodo.equals(UltimoNodo)) {
            PrimerNodo = UltimoNodo = null;
        } else {
            PrimerNodo = PrimerNodo.siguiente;
        }
    }

    //Elimina al final
    public void EliminaFinal() {
        if (VaciaLista()) {
            System.out.println("No hay elementos");
        }

        // Restablecer  las referencias de PrimerNodo y UltimoNodo
        if (PrimerNodo.equals(UltimoNodo)) {
            PrimerNodo = UltimoNodo = null;
        } else {
            NodosListaA Actual = PrimerNodo;
            while (Actual.siguiente != UltimoNodo) {
                Actual = Actual.siguiente;
            }

            UltimoNodo = Actual;
            Actual.siguiente = null;
        }
    }
}
