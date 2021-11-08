package principal;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenerateCalendar {
	
	protected Calendar calendario;
    protected int anio;
    
    GenerateCalendar(){
        this.calendario = new GregorianCalendar();
    }
    public void generar_anio(int anio){
        this.anio= anio;
        calendario.set(anio, 0, 0);
    }   
    public String mostrar(){
        return this.calendario.toString();
    }

}
