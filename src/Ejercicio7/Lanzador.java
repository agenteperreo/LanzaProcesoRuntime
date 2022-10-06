package Ejercicio7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lanzador {

    public static void main(String[] args) {

        ProcessBuilder pb1 = new ProcessBuilder("");
        ProcessBuilder pb2 = new ProcessBuilder("");

        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);

        try {
            List<Process> lProcess = ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
