package principal;

import java.util.Calendar;

public class GenerateYear extends GenerateMonth {
	
	GenerateYear(){
        super();
    }
    
    public boolean anio_Bisiesto(){
        if((this.anio % 4 == 0) && ((this.anio % 100 != 0) || (this.anio % 400 == 0))){
            return true;
        }
       return false;
    }
    public String nombre_dia(int mes, int dia){
        this.calendario.set(this.anio, mes, dia);
        System.out.print(this.anio);
        String dia_nombre="";
        switch(this.calendario.get(Calendar.DAY_OF_WEEK)){
            case 1:
                dia_nombre="Sunday";
            break;
            case 2:
                dia_nombre="Monday";
            break;
            case 3:
                dia_nombre="Tuesday";
            break;
            case 4:
                dia_nombre="Wednesday";
            break;
            case 5:
                dia_nombre="Thursday";
            break;
            case 6:
                dia_nombre="Friday";
            break;
            case 7:
                dia_nombre="Saturday";
            break;
              
        }
        return dia_nombre;
    }
    public boolean tiempo_unix(long segundos){
        //long unixTime = System.currentTimeMillis() / 1000L;
        long anio_segundo=  31536000L;
        int anio_unix=1970;
        long unix_segundo= 0L;
        
        while(this.anio>anio_unix){
            unix_segundo+= anio_segundo;
            anio_unix+=1;
        }
        
        if(segundos>=anio_unix && segundos<unix_segundo+anio_segundo){
            //System.out.println(unix_segundo);
            //System.out.println(unix_segundo+anio_segundo);
            return true;
        }
        //System.out.println(unix_segundo);
        //System.out.println(unix_segundo+anio_segundo);
        return false;
    }
    
    public int espacio_dias(int mes){
        this.calendario.set(this.anio, mes-1,1);
        return  this.calendario.get(Calendar.DAY_OF_WEEK);
    }

}
