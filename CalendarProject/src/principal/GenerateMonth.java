package principal;

import java.util.Calendar;

public class GenerateMonth extends GenerateCalendar{
	
	GenerateMonth(){
        super();
    }
	
       public int dias_mes(int mes){
        this.calendario.set(this.anio, mes,0);
        return this.calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    public void generar_mes(int anio,int mes,int dia){
        this.calendario.set(anio, mes,dia);
    }
	

}
