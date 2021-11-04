package principal;

/** 
 * @version 1.0, 02/11/201

 * @author Briyid Catalina Cruz Ostos & Jonnathan Sotelo Rodríguez
 */


public class order {
	
    private int[] lista;

	order(int[] lista) {
		this.lista = lista;
	}
    
    /**@return lista*/
    public int[] bubble(){
        for(int i=0; i<lista.length;i++){
            for(int j=i+1;j<lista.length;j++){
                if (lista[i]>lista[j]){
                    int aux= lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
        return lista;
    }
    
    /**@return lista*/
    public int[] selection(){
        for(int i=0;i<lista.length-1;i++){
            int min = i;
            for(int j=i+1;j<lista.length;j++){
                if(lista[j]<lista[min]){
                    min=j;
                }   
            }
            int aux=lista[i];
            lista[i]=lista[min];
            lista[min]=aux;
       } 
       return lista;
    }
     
    /** @return lista*/
     public int[] insertion(){
        for(int i =1; i<lista.length;i++){
            int aux= lista[i];
            int j;
            for(j=i-1;j>=0 && aux<lista[j];j--){
                lista[j+1]=lista[j];
            }
            lista[j+1]=aux;
        }
        return lista;
     }
}