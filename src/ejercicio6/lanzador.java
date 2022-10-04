package ejercicio6;

import java.io.File;
import java.io.IOException;

public class lanzador {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("java", "TicketCompra.java");

        pb.directory(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio6"));

        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("C:\\Users\\igarcia\\IdeaProjects\\LanzaProceso\\src\\ejercicio6\\tickets.txt")));

        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);

        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
