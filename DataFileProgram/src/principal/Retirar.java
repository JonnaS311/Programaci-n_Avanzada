package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Retirar implements interfazBase {

    private List<String> al = new ArrayList<String>();
    private Inicializar ini;
    private String eliminar;

    public Retirar(String eliminar){
        this.eliminar= eliminar;
    }
    
    @Override
    public void operacion() {

        BufferedReader Lectura;
        ini = new Inicializar();
        ini.operacion();
        try {
            //leemos cada linea de datos.txt
            Lectura = new BufferedReader(new FileReader(ini.getFile()));
            String leerLinea = Lectura.readLine();

            while (leerLinea != null) {
                //ArrayList que está recibiendo los valores de leerLinea
                this.al.add(leerLinea);
                leerLinea = Lectura.readLine();

            }
            int i = al.size() - 1;

            while (i != -1) {
                //particionamos para traer solo la lista con Códigos
                String linea = al.get(i);
                String[] parts = linea.split("/");
                String cod = parts[0];
                
                //validamos si es el código a eliminar
                if (cod.equals(eliminar)) {
                    al.remove(i);

                }
                i -= 1;
            }
           

            FileWriter fw = new FileWriter(ini.getFile(), false);
            i = al.size() - 1;
            while (i != -1) {
                fw.write(al.get(i) + "\n");
                i -= 1;
            }
            fw.flush();
            fw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setEliminar(String seleccion) {
        this.eliminar = seleccion;
    }

}
