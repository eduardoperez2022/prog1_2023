/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_tad_cuit;

/**
 *
 * @author eduardo
 */
public class cuitarg {

    public static boolean isValidCUITCUIL(String cuit) {

        if (cuit.length() != 13) {
            return false;
        }

        boolean rv = false;
        int resultado = 0;
        String cuit_nro = cuit.replace("-", "");
        String codes = "6789456789";
        int verificador = Character.getNumericValue(cuit_nro.charAt(cuit_nro.length() - 1));
        int x = 0;

        while (x < 10) {
            int digitoValidador = Integer.parseInt(codes.substring(x, x + 1));
            int digito = Integer.parseInt(cuit_nro.substring(x, x + 1));
            int digitoValidacion = digitoValidador * digito;
            resultado += digitoValidacion;
            x++;
        }
        resultado = resultado % 11;
        rv = (resultado == verificador);
        return rv;
    }


    public void isvalid3() {

        String cuit = "30-63945373-8";
        cuit = cuit.substring(0, 2) + cuit.substring(3, 11) + cuit.substring(12);

        // la secuencia de valores de factor es 5, 4, 3, 2, 7, 6, 5, 4, 3, 2
        int[] factor = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2};

        int[] c = new int[11];
        c[10] = Integer.parseInt(cuit.substring(10));
        int resultado = 0;

        for (int i = 0; i < 10; i++) {
            // se toma el valor de cada cifra
            c[i] = Integer.parseInt(Character.toString(cuit.charAt(i)));
            // se suma al resultado el producto de la cifra por el factor que
            // corresponde resultado = resultado + c[i]* factor[i];
            resultado = resultado + c[i] * factor[i];
        }
        // se obtiene el valor calculado a comparar
        int control = (11 - (resultado % 11)) % 11;
        // Si la cifra de control es igual al valor calculado
        if (control == c[10]) {
            System.out.println("CUIT Correcto");
        } else {
            System.out.println("CUIT Erróneo");
        }

    }


}
