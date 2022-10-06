package ejemplo_preocesoTuberia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcesoTuberia {

    public static void main(String[] args) {

        ProcessBuilder pb1 = new ProcessBuilder("");
        ProcessBuilder pb2 = new ProcessBuilder("");
        ProcessBuilder pb3 = new ProcessBuilder("");
        ProcessBuilder pb4 = new ProcessBuilder("");

        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);
        lpb.add(pb4);

        try {
            List<Process> lProcess = ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
