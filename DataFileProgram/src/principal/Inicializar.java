package principal;

import java.io.File;

/**
 *
 * @author User
 */
public class Inicializar implements interfazBase{
    
    private File file;
    
    @Override
    public void operacion() {

            //usar ruta Absoluta
            this.file= new File("C:\\Users\\User\\Desktop\\DataFileProgram\\src\\principal\\datos.txt");
            
    }
    
    public File getFile(){
        return this.file;
    }
    
}
