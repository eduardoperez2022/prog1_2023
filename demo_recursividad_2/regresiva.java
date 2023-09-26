package demo_recursividad_2;

/**
 *
 * @author eduardo.perez
 */
public class regresiva {

    public void cuentaRegresiva(int numero) {
        numero--;
        if (numero > 0) {
            System.out.println(numero);
            //Llamar la misma función
            cuentaRegresiva(numero);
        } else {
            System.out.println("LLego hasta 0");
        }
    }

}
