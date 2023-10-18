package demo_arbol1;

//Definicion de la clase NodoBinario
import java.io.*;

class NodoBinario {

    int dato;
    NodoBinario Hizq, Hder;
    //Constructores

    NodoBinario(int Elem) {
        dato = Elem;
        NodoBinario Hizq, Hder = null;
    }

    //Insercion de un elemento
    public void InsertaBinario(int Elem) {
        if (Elem < dato) {
            if (Hizq == null) {
                Hizq = new NodoBinario(Elem);
            } else {
                Hizq.InsertaBinario(Elem);
            }
        } else {
            if (Elem > dato) {
                if (Hder == null) {
                    Hder = new NodoBinario(Elem);
                } else {
                    Hder.InsertaBinario(Elem);
                }
            }
        }
    }
}
