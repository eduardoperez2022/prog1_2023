package demo_enumerador;

public class PruebaEnum {
    public static void main(String[] ar) {
        
        // acceso a un elemento
        Mes mes1 = Mes.AGOSTO;
        System.out.println(mes1 + " " + mes1.retornarNumero()); // AGOSTO 8
        System.out.println("");
        
        
        // listar elementos
        for (Mes mes : Mes.values()) {
            System.out.println(mes + " " + mes.retornarNumero());        
        }
        
    }
}