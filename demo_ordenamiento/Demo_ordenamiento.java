package demo_ordenamiento;

public class Demo_ordenamiento {

    public static void main(String[] args) {
        
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};

        Ordena.burbuja(vals);

        System.out.println("----------- Orden burbuja");
        for (Integer val : vals) {
            System.out.println(val);
        }
        
        
        int[] vals2 = {15, 60, 8, 16, 44, 27, 12, 35};

        Ordena_por_seleccion.seleccion(vals2);

        System.out.println("----------- Orden seleccion");
        for (Integer val2 : vals2) {
            System.out.println(val2);
        }
        
        

    }
    
}
