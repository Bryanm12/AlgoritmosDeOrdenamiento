public class App {
    public static void main(String[] args) throws Exception {
        Arreglos arreglo = new Arreglos();
        Metodos metodo = new Metodos();

        System.out.println("Arreglos aleatorios: ");
        long tiempoI = System.nanoTime();
        int[] arreglo1 = new int[10];
        arreglo.arreglo(arreglo1);
        long tiempoF = System.nanoTime();
        double duracionSegundos = (tiempoF-tiempoI)/1_000_000_000.0;
        System.out.println("Arreglo de 10: "+java.util.Arrays.toString(arreglo1)+" "+duracionSegundos+" Segundos.");

        long tiempoI1= System.nanoTime();
        int[] arreglo2= new int[10];
        arreglo.arreglo(arreglo2);
        int[] arreglotot = new int[arreglo1.length+arreglo2.length];
        System.arraycopy(arreglo1, 0, arreglotot, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, arreglotot, arreglo1.length, arreglo2.length);
        long tiempoF1= System.nanoTime();
        double duracionSegundos1 = (tiempoF1-tiempoI1)/1_000_000_000.0;
        System.out.println("Arreglo de 20: "+java.util.Arrays.toString(arreglotot)+" "+duracionSegundos1+" Segundos");

        long tiempoI2=System.nanoTime();
        int[] arreglo3 = new int[80];
        arreglo.arreglo(arreglo3);
        int[] arreglotot1= new int[arreglotot.length+arreglo3.length];
        System.arraycopy(arreglotot, 0, arreglotot1, 0, arreglotot.length);
        System.arraycopy(arreglo3, 0, arreglotot1, arreglotot.length, arreglo3.length);
        long tiempoF2=System.nanoTime();
        double duracionSegundos2 = (tiempoF2-tiempoI2)/1_000_000_000.0; 
        System.out.println("Arreglo de 100: "+arreglo1.length+" "+duracionSegundos2+" Segundos");

        
        long tiempoI3=System.nanoTime();
        int[] arreglo4 = new int[900];
        arreglo.arreglo(arreglo4);
        int[] arreglotot2= new int[arreglotot1.length+arreglo4.length];
        System.arraycopy(arreglotot1, 0, arreglotot2, 0, arreglotot1.length);
        System.arraycopy(arreglo4, 0, arreglotot2, arreglotot1.length, arreglo4.length);
        long tiempoF3=System.nanoTime();
        double duracionSegundos3 = (tiempoF3-tiempoI3)/1_000_000_000.0; 
        System.out.println("Arreglo de 1000: "+arreglotot2.length+" "+duracionSegundos3+" Segundos");
        
        long tiempoI4=System.nanoTime();
        int[] arreglo5 = new int[4000];
        arreglo.arreglo(arreglo5);
        int[] arreglotot3= new int[arreglotot2.length+arreglo5.length];
        System.arraycopy(arreglotot2, 0, arreglotot3, 0, arreglotot2.length);
        System.arraycopy(arreglo5, 0, arreglotot3, arreglotot2.length, arreglo5.length);
        long tiempoF4=System.nanoTime();
        double duracionSegundos4 = (tiempoF4-tiempoI4)/1_000_000_000.0; 
        System.out.println("Arreglo de 5000: "+arreglotot3.length+" "+duracionSegundos4+" Segundos");

        long tiempoI5=System.nanoTime();
        int[] arreglo6 = new int[5000];
        arreglo.arreglo(arreglo6);
        int[] arreglotot4= new int[arreglotot3.length+arreglo6.length];
        System.arraycopy(arreglotot3, 0, arreglotot4, 0, arreglotot3.length);
        System.arraycopy(arreglo6, 0, arreglotot4, arreglotot3.length, arreglo6.length);
        long tiempoF5=System.nanoTime();
        double duracionSegundos5 = (tiempoF5-tiempoI5)/1_000_000_000.0; 
        System.out.println("Arreglo de 10000: "+arreglotot4.length+" "+duracionSegundos5+" Segundos");

        long tiempoI6=System.nanoTime();
        int[] arreglo7 = new int[20000];
        arreglo.arreglo(arreglo7);
        int[] arreglotot5= new int[arreglotot4.length+arreglo7.length];
        System.arraycopy(arreglotot4, 0, arreglotot5, 0, arreglotot4.length);
        System.arraycopy(arreglo7, 0, arreglotot5, arreglotot4.length, arreglo7.length);
        long tiempoF6=System.nanoTime();
        double duracionSegundos6 = (tiempoF6-tiempoI6)/1_000_000_000.0; 
        System.out.println("Arreglo de 30000: "+arreglotot5.length+" "+duracionSegundos6+" Segundos \n");
        
        long tiempoI7 = System.nanoTime();
        int[] burbujaMejorado = metodo.metodoBurbujaMejorado(arreglo1);
        long tiempoF7 = System.nanoTime();
        double duracionSegundos7 = (tiempoF7-tiempoI7)/1_000_000_000.0;
        System.out.println("Metodo burbuja mejorado: \nArreglo de 10: "+java.util.Arrays.toString(burbujaMejorado)
        +" "+duracionSegundos7+" Segundos.");

        long tiempoI8 = System.nanoTime();
        burbujaMejorado = metodo.metodoBurbujaMejorado(arreglotot);
        long tiempoF8 = System.nanoTime();
        double duracionSegundos8 = (tiempoF8-tiempoI8)/1_000_000_000.0;
        System.out.println("Arreglo de 20: "+java.util.Arrays.toString(burbujaMejorado)
        +" "+duracionSegundos8+" Segundos.");
  
        long tiempoI9 = System.nanoTime();
        burbujaMejorado = metodo.metodoBurbujaMejorado(arreglotot1);
        long tiempoF9 = System.nanoTime();
        double duracionSegundos9 = (tiempoF9-tiempoI9)/1_000_000_000.0;
        System.out.println("Arreglo de 100: "+burbujaMejorado.length
        +" "+duracionSegundos9+" Segundos.");

        long tiempoI10 = System.nanoTime();
        burbujaMejorado = metodo.metodoBurbujaMejorado(arreglotot2);
        long tiempoF10 = System.nanoTime();
        double duracionSegundos10 = (tiempoF10-tiempoI10)/1_000_000_000.0;
        System.out.println("Arreglo de 1000: "+burbujaMejorado.length+" "+duracionSegundos10+" Segundos.");

        long tiempoI11 = System.nanoTime();
        burbujaMejorado = metodo.metodoBurbujaMejorado(arreglotot3);
        long tiempoF11 = System.nanoTime();
        double duracionSegundos11 = (tiempoF11-tiempoI11)/1_000_000_000.0;
        System.out.println("Arreglo de 5000: "+burbujaMejorado.length+" "+duracionSegundos11+" Segundos.");

        long tiempoI12 = System.nanoTime();
        burbujaMejorado = metodo.metodoBurbujaMejorado(arreglotot4);
        long tiempoF12 = System.nanoTime();
        double duracionSegundos12 = (tiempoF12-tiempoI12)/1_000_000_000.0;
        System.out.println("Arreglo de 10000: "+burbujaMejorado.length+" "+duracionSegundos12+" Segundos.");

        long tiempoI13 = System.nanoTime();
        burbujaMejorado = metodo.metodoBurbujaMejorado(arreglotot5);
        long tiempoF13 = System.nanoTime();
        double duracionSegundos13 = (tiempoF13-tiempoI13)/1_000_000_000.0;
        System.out.println("Arreglo de 30000: "+burbujaMejorado.length+" "+duracionSegundos13+" Segundos.");

        long tiempoI14 = System.nanoTime();
        int[] insercion = metodo.metodoInsercion(arreglo1);
        long tiempoF14 = System.nanoTime();
        double duracionSegundos14 = (tiempoF14-tiempoI14)/1_000_000_000.0;
        System.out.println("\nMetodo de insercion: \nArreglo de 10: "+java.util.Arrays.toString(insercion)
        +" "+duracionSegundos14+" Segundos.");

        long tiempoI15 = System.nanoTime();
        insercion = metodo.metodoInsercion(arreglotot);
        long tiempoF15 = System.nanoTime();
        double duracionSegundos15 = (tiempoF15-tiempoI15)/1_000_000_000.0;
        System.out.println("Arreglo de 20: "+java.util.Arrays.toString(insercion)
        +" "+duracionSegundos15+" Segundos.");

        long tiempoI16 = System.nanoTime();
        insercion = metodo.metodoInsercion(arreglotot1);
        long tiempoF16 = System.nanoTime();
        double duracionSegundos16 = (tiempoF16-tiempoI16)/1_000_000_000.0;
        System.out.println("Arreglo de 100: "+insercion.length
        +" "+duracionSegundos16+" Segundos.");

        long tiempoI17 = System.nanoTime();
        insercion = metodo.metodoInsercion(arreglotot2);
        long tiempoF17 = System.nanoTime();
        double duracionSegundos17 = (tiempoF17-tiempoI17)/1_000_000_000.0;
        System.out.println("Arreglo de 1000: "+insercion.length
        +" "+duracionSegundos17+" Segundos.");

        long tiempoI18 = System.nanoTime();
        insercion = metodo.metodoInsercion(arreglotot3);
        long tiempoF18 = System.nanoTime();
        double duracionSegundos18 = (tiempoF18-tiempoI18)/1_000_000_000.0;
        System.out.println("Arreglo de 5000: "+insercion.length
        +" "+duracionSegundos18+" Segundos.");

        long tiempoI19 = System.nanoTime();
        insercion = metodo.metodoInsercion(arreglotot4);
        long tiempoF19 = System.nanoTime();
        double duracionSegundos19 = (tiempoF19-tiempoI19)/1_000_000_000.0;
        System.out.println("Arreglo de 10000: "+insercion.length
        +" "+duracionSegundos19+" Segundos.");

        long tiempoI20 = System.nanoTime();
        insercion = metodo.metodoInsercion(arreglotot5);
        long tiempoF20 = System.nanoTime();
        double duracionSegundos20 = (tiempoF20-tiempoI20)/1_000_000_000.0;
        System.out.println("Arreglo de 10000: "+insercion.length
        +" "+duracionSegundos20+" Segundos.");

        long tiempoI21 = System.nanoTime();
        int[] seleccion = metodo.metodoSeleccion(arreglo1);
        long tiempoF21 = System.nanoTime();
        double duracionSegundos21 = (tiempoF21-tiempoI21)/1_000_000_000.0;
        System.out.println("\nMetodo de selección: \nArreglo de 10: "+java.util.Arrays.toString(seleccion)
        +" "+duracionSegundos21+" Segundos.");

        long tiempoI22 = System.nanoTime();
        seleccion = metodo.metodoSeleccion(arreglotot);
        long tiempoF22 = System.nanoTime();
        double duracionSegundos22 = (tiempoF22-tiempoI22)/1_000_000_000.0;
        System.out.println("Arreglo de 20: "+java.util.Arrays.toString(seleccion)
        +" "+duracionSegundos22+" Segundos.");

        long tiempoI23 = System.nanoTime();
        seleccion = metodo.metodoSeleccion(arreglotot1);
        long tiempoF23 = System.nanoTime();
        double duracionSegundos23 = (tiempoF23-tiempoI23)/1_000_000_000.0;
        System.out.println("Arreglo de 100: "+seleccion.length+" "+duracionSegundos23+" Segundos.");

        long tiempoI24 = System.nanoTime();
        seleccion = metodo.metodoSeleccion(arreglotot2);
        long tiempoF24 = System.nanoTime();
        double duracionSegundos24 = (tiempoF24-tiempoI24)/1_000_000_000.0;
        System.out.println("Arreglo de 1000: "+seleccion.length+" "+duracionSegundos24+" Segundos.");

        long tiempoI25 = System.nanoTime();
        seleccion = metodo.metodoSeleccion(arreglotot3);
        long tiempoF25 = System.nanoTime();
        double duracionSegundos25 = (tiempoF25-tiempoI25)/1_000_000_000.0;
        System.out.println("Arreglo de 5000: "+seleccion.length+" "+duracionSegundos25+" Segundos.");

        long tiempoI26 = System.nanoTime();
        seleccion = metodo.metodoSeleccion(arreglotot4);
        long tiempoF26 = System.nanoTime();
        double duracionSegundos26 = (tiempoF26-tiempoI26)/1_000_000_000.0;
        System.out.println("Arreglo de 10000: "+seleccion.length+" "+duracionSegundos26+" Segundos.");

        long tiempoI27 = System.nanoTime();
        seleccion = metodo.metodoSeleccion(arreglotot5);
        long tiempoF27 = System.nanoTime();
        double duracionSegundos27 = (tiempoF27-tiempoI27)/1_000_000_000.0;
        System.out.println("Arreglo de 30000: "+seleccion.length+" "+duracionSegundos27+" Segundos.");
    }

}
