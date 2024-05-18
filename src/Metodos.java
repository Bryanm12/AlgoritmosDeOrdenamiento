import java.util.Arrays;
public class Metodos {
    public int[] metodoBurbujaMejorado(int[] arreglo){
        arreglo = Arrays.copyOf(arreglo, arreglo.length);

        for(int i=arreglo.length-1;i>0;i--){
            for(int j=0; j<i;j++){
                if(arreglo[j]>arreglo[j+1]){
                    int temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
            }
        }
        return arreglo;
        

    }
    public int[] metodoSeleccion(int[] arreglo){
        arreglo= Arrays.copyOf(arreglo, arreglo.length);
        for(int i=0; i<arreglo.length; i++){
            int menorNum=i;
            for(int j=i+1; j<arreglo.length;j++){
                if(arreglo[j]<arreglo[menorNum]){
                    menorNum=j;
                }
            }
            int temporal = arreglo[i];
            arreglo[i] = arreglo[menorNum];
            arreglo[menorNum] = temporal;
        }
        
        return arreglo;
    }
    public int[] metodoInsercion(int[] arreglo){
        arreglo= Arrays.copyOf(arreglo, arreglo.length);
        for(int i=0; i<arreglo.length; i++){
            int key= arreglo[i];
            int j=i-1;
            while(j>=0 && arreglo[j]>key){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=key;
        }
        return arreglo;
    }
}
