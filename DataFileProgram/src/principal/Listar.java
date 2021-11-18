package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Listar implements interfazBase {

    private List<String> al = new ArrayList<String>();
    private Inicializar ini;
    //lista base
    private List<String> nom = new ArrayList<String>();
    private List<Long> cod = new ArrayList<Long>();
    //listas Organizadas
    private List<Long> codO = new ArrayList<Long>();
    private List<String> nomO = new ArrayList<String>();

    @Override
    public void operacion() {
        BufferedReader Lectura;
        ini = new Inicializar();
        ini.operacion();
        try {
            Lectura = new BufferedReader(new FileReader(ini.getFile()));
            String leerLinea = Lectura.readLine();

            while (leerLinea != null) {
                //ArrayList que está recibiendo los valores de leerLinea
                this.al.add(leerLinea);
                leerLinea = Lectura.readLine();

            }
            int i = al.size() - 1;

            //particionar listas, codO incialmente está desordenada
            while (i != -1) {
                String linea = al.get(i);
                String[] parts = linea.split("/");
                cod.add(Long.parseLong(parts[0]));
                codO.add(Long.parseLong(parts[0]));
                nom.add(parts[1]);
                i -= 1;
            }
            //organizamos
            Collections.sort(codO);
            for (int j = 0; j < al.size(); j++) {
                for (int k = 0; k < al.size(); k++) {
                    if (codO.get(j).equals(cod.get(k))) {
                        nomO.add(nom.get(k));
                    }
                }
            }
            //prueba por consola
            /*int m=0;
            while(m!=al.size()){
                System.out.print(codO.get(m)+" ");
                System.out.println(nomO.get(m));
                m+=1;
            }*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Long> getCodO() {
        return codO;
    }

    public List<String> getNomO() {
        return nomO;
    }
}
