package ejercicio3;


import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String comando = JOptionPane.showInputDialog("Escribe el comando que quieras lanzar:");

        String comandos []= new String[10];
        comando=comandos[1];

        ProcessBuilder pb = new ProcessBuilder(comandos[1]);

        pb.inheritIO();

        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
