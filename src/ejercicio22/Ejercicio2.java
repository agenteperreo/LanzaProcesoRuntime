package ejercicio22;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Ejercicio2 {

    public static int MAX_TIEMPO=30;

    public static void main(String[] args) {

        String[] comando1 = {"notepad", "numLineas.txt"};
        String[] comando2 = {"java", "cuentaLineas.java"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        pb1.inheritIO();

        try {
            Process p1 = pb1.start();
                if (!p1.waitFor(MAX_TIEMPO, TimeUnit.SECONDS)){
                    p1.destroy();
                    System.out.printf("AVISO: No ha terminado en %d seg\n",MAX_TIEMPO);
                }
            Process p2 = pb2.start();

        } catch (IOException e) {
            e.getMessage();
            System.exit(1);
        } catch (InterruptedException ex) {
            ex.getMessage();
            System.exit(2);
        }
    }

}
