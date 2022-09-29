package repaso;

import java.io.File;
import java.io.IOException;

public class repaso {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("java", "src\\repaso\\ClaseIsaac.java");

        pb.directory(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src"));

        pb.inheritIO();

        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
