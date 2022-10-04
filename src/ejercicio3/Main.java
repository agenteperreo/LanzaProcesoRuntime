package ejercicio3;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String comando = JOptionPane.showInputDialog("Escribe el comando que quieras lanzar:");

        ProcessBuilder pb = new ProcessBuilder(comando);

        pb.directory(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src"));

        pb.inheritIO();

        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
