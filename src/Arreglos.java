public class Arreglos {
    public int[] arreglo(int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            arreglo[i]=(int)(Math.random()*99+1);
        }
        return arreglo;
    }

}
