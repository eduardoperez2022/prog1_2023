package demo_recursividad_2;

/**
 *
 * @author eduardo.perez
 */
public class fibonaci {

    public int calcula_fibonaci(int n) {
        
        if (n == 0) {
            return 0;
        } 
        else if (n == 1) {
            return 1;
        }
        else {
            return calcula_fibonaci(n - 1) + calcula_fibonaci(n - 2);
        }
    }

}
