package week9homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 10. Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name
public class ParticularStation {
    public static void main(String[] args) {

        Map<String,String> zone = new HashMap<>();

        zone.put( "Aldgate","Metropolitan/Circle line/Hammersmith & City");
        zone.put("BakerStreet", "Metrolitan/Circle line/Central line/Hammersmith & City");
        zone.put("Euston square", "Metrolitan/Circle line/Hammersmith & City");
        zone.put("Great portland street","Metropolitan/Circle line/Hammersmith & City");
        zone.put("Barbican","Metropolitan/Circle line/Hammersmith & City");
        zone.put("Moorgate","Metropolitan/Circle line/Hammersmith & City");
        zone.put("Liverpool street","Metropolitan/Circle line/Hammersmith & City");


        for (Map.Entry<String, String> station : zone.entrySet()) {
            System.out.println(station.toString() + ", " + station.toString());


        }
    }
}