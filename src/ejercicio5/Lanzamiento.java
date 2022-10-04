package ejercicio5;

import java.io.File;
import java.io.IOException;

public class Lanzamiento {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("java", "Nombre.java");

        pb.directory(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio5"));

        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        pb.redirectInput(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio5\\entrada.txt"));

        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
