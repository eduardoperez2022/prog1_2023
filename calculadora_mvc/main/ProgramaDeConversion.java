package calculadora_mvc.main;

import calculadora_mvc.controller.ControlConversor;
import calculadora_mvc.controller.ConversorEurosPesetas;
import calculadora_mvc.view.InterfazTextualConversor;
import calculadora_mvc.view.InterfazVista;
import calculadora_mvc.view.VentanaConversor;

public class ProgramaDeConversion {

    public static void main(String[] args) {
        
        // el modelo:
        ConversorEurosPesetas modelo = new ConversorEurosPesetas();

        // la vista:
        InterfazVista vista = new VentanaConversor();
        // InterfazVista vista = new InterfazTextualConversor();

        // y el control:
        ControlConversor control = new ControlConversor(vista,  modelo);
        
        // configura la vista
        vista.setControlador(control);
        
        // y arranca la interfaz (vista):
        vista.arranca();
    }
}
