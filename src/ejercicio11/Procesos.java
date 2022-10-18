package ejercicio11;

import java.io.IOException;

public class Procesos {

    public static void main(String[] args) {
        String[] comando1={"cmd", "/C", "type nul > C:\\pruebas\\carpeta1\\fichero2.txt"};
        String[] comando2={"notepad", "C:\\pruebas\\carpeta1\\fichero2.txt"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        pb1.inheritIO();
        pb2.inheritIO();

        try {
            Process p1 = pb1.start();
            p1.waitFor();
            Process p2 = pb2.start();
            p2.waitFor();
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
