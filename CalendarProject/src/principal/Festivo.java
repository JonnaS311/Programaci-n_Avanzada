package principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Festivo {
    private int[] anio_nuevo = new int[2];
    private int[] reyes_magos = new int[2];
    private int[] san_jose = new int[2];
    private int[] dia_trabajo = new int[2];
    private int[] asuncion_cristo = new int[2];
    private int[] sp_sp = new int[2];
    private int[] independencia = new int[2];
    private int[] b_boyaca = new int[2];
    private int[] v_maria = new int[2];
    private int[] d_raza = new int[2];
    private int[] d_santos = new int[2];
    private int[] i_cartagena = new int[2];
    private int[] concepcion = new int[2];
    private int[] navidad = new int[2];
    final private int dias_festivos =13;
    private List festivo;
    
    
    public Festivo(){
        // 0 mes 
        // 1 dia
        this.anio_nuevo[0]= 1;
        this.anio_nuevo[1]= 1;
        
        this.reyes_magos[0]= 1;
        this.reyes_magos[1]=11;
        
        this.san_jose[0]= 3;
        this.san_jose[1]=22;
        
        this.dia_trabajo[0]= 5;
        this.dia_trabajo[1]=1;
        
        this.asuncion_cristo[0]= 5;
        this.asuncion_cristo[1]=17;
        
        this.sp_sp[0]= 7;
        this.sp_sp[1]=5;
        
        this.independencia[0]= 7;
        this.independencia[1]=20;
        
        this.b_boyaca[0]= 8;
        this.b_boyaca[1]=7;
        
        this.v_maria[0]= 8;
        this.v_maria[1]=16;
        
        this.d_raza[0]= 10;
        this.d_raza[1]=18;
        
        this.d_santos[0]= 11;
        this.d_santos[1]=1;
        
        this.i_cartagena[0]= 11;
        this.i_cartagena[1]=15;
        
        this.concepcion[0]= 12;
        this.concepcion[1]=8;
        
        this.navidad[0]= 12;
        this.navidad[1]=25;   
        
        festivo = new ArrayList();
        festivo.add(this.anio_nuevo);
        festivo.add(this.reyes_magos);
        festivo.add(this.san_jose);
        festivo.add(this.dia_trabajo);
        festivo.add(this.asuncion_cristo);
        festivo.add(this.sp_sp);
        festivo.add(this.independencia);
        festivo.add(this.b_boyaca);
        festivo.add(this.v_maria);
        festivo.add(this.d_raza);
        festivo.add(this.d_santos);
        festivo.add(this.i_cartagena);
        festivo.add(this.concepcion);
        festivo.add(this.anio_nuevo);
        festivo.add(this.navidad);
    }
    public int get_dias_festivos(){
        return dias_festivos;
    }
    public String nombre_dia_festivo(int mes){
        String festividad = "";
        switch(mes){
            case 1:
                festividad= "Año nuevo 1 de enero y\n reyes magos 11 de enero";
                break;
            case 3:
                festividad= "San José 22 de marzo";
                break;
            case 5:
                festividad= "Día del trabajo 1 de mayo\ny asunción de cristo 17 de mayo";
                break;
            case 7:
                festividad= "San Pedro y San Pablo 5 de julio e\n Independencia de Colombia 20 de julio";
                break;
            case 8:
                festividad= "Batalla de Boyaca 7 de agosto y\n Virgen María 16 de agosto";
                break;
            case 10:
                festividad= "dia de la raza 18 de octubre";
                break;
            case 11:
                festividad= "dia de Muertos 1 de noviembre e\n Independencia de Cartagena 15 de noviembre";
                break;
            case 12:
                festividad= "Concepción 8 de diciembre y\n Navidad 25 de diciembre";
                break;
            default:
                festividad= "Ninguna!";
                
        }
        return festividad;
    }
    
public int numero_festivo_mes(int mes){
        int festividad = 0;
        switch(mes){
            case 1:
                festividad= 2;
                break;
            case 3:
                festividad= 1;
                break;
            case 5:
                festividad= 2;
                break;
            case 7:
                festividad= 2;
                break;
            case 8:
                festividad= 2;
                break;
            case 11:
                festividad= 2;
                break;
            case 12:
                festividad= 2;
                break;
            default:
                festividad= 0;
                
        }
        return festividad;
    }
     public List get_lista(){
         return festivo;
     }
}
