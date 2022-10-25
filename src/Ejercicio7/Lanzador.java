package Ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lanzador {

    public static void main(String[] args) {
        ProcessBuilder pb1 = new ProcessBuilder("java", "Proceso1.java");
//		pb1.inheritIO();
        ProcessBuilder pb2 = new ProcessBuilder("java", "Proceso1.java");
        ProcessBuilder pb3 = new ProcessBuilder("java", "Proceso1.java");
        pb1.directory(new File("src/Ejercicio7"));
        pb2.directory(new File("src/Ejercicio7"));
        pb3.directory(new File("src/Ejercicio7"));
//
        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);
//		pb3.redirectOutput(Redirect.INHERIT);
        pb1.redirectErrorStream(true);
        pb2.redirectErrorStream(true);
        pb3.redirectErrorStream(true);

        pb3.redirectOutput(new File("salida.txt"));
        try {
            List<Process> lProcess = ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
