package demo_agenda_archivo;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class archivo_agenda  {
    
    public ArrayList agenda_array;
    public String agenda_fname;

    public archivo_agenda() {
        agenda_fname="C:/temporal/agenda_datos.txt";
    }
    
    public void leer_archivo()  {

        File agenda_file = new File(agenda_fname);
        Scanner reader = null;
        agenda_array = new ArrayList<String>();

        try {
            // Open an input stream
            reader = new Scanner(agenda_file);
            String line;
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                // System.out.println(line);
                agenda_array.add(line);
            }            
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
        
        return;
        
    }

    public ArrayList<String> getAgenda_array() {
        return agenda_array;
    }

    public void setAgenda_array(ArrayList<String> agenda_array) {
        this.agenda_array = agenda_array;
    }
    
    
    public void escribe_archivo(Contacto[] lista_cont)  {
        
        File agenda_file = new File(agenda_fname);
        FileWriter writer = null;

        try {
            // Open an input stream
            writer = new FileWriter(agenda_file);
            
            for (int t = 0; t < lista_cont.length; t++) {
                // Es necesario por precaución usar el this para el metodo, puesto que si se ejecuta muchas veces la referencias a memoria pueden fallar.
               Contacto unconta = lista_cont[t];
               if (unconta != null) {
                   String linea = unconta.getNombre() + "," + Integer.toString(unconta.getTelefono());
                   writer.append(linea);
                   writer.append('\n');
               }
            }
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }

}
