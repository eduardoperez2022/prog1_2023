package demo_recursividad_2;

/**
 *
 * @author eduardo.perez
 */
public class paridad {

    public boolean esimpar(int numero) {
        if (numero == 0) {
            return false;
        } else {
            return espar(numero - 1);
        }
    }

    public boolean espar(int numero) {
        if (numero == 0) {
            return true;
        } else {
            return esimpar(numero - 1);
        }
    }

}
