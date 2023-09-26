package demo_recursividad_2;

/**
 *
 * @author eduardo.perez
 */
public class factorial {

    public double fact_iterativo(int n) {
        double fact = 1;
        int i;
        if (n == 0) {
            fact = 1;
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public double fact_recursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (fact_recursivo(n - 1));
        }
    }

}
