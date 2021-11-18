package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insertar implements interfazBase {

    private Inicializar I;
    private User user;
    private Consultar nuevo = new Consultar();
    private boolean confirmar ;

    public Insertar(User user) {
        this.user = user;
    }

    @Override
    public void operacion() {
        I = new Inicializar();
        I.operacion();
        nuevo.setCod(user.getCodigo());
        nuevo.setNom(user.getNombre());
        nuevo.operacion();
        try {
            if (!nuevo.existeUser()) {
                // llamamos al archivo (true->sobreescribir en el archivo)
                FileWriter writer = new FileWriter(I.getFile(), true);
                // escribimos en el archivo
                writer.write("\n" + user.getCodigo() + "/" + user.getNombre());
                // guardamos cambios
                writer.flush();
                // cerramos el archivo
                writer.close();
                confirmar=true;
                
            } else {
                confirmar=false;
            }
        } catch (IOException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean message() {
        return confirmar;
    }

}
