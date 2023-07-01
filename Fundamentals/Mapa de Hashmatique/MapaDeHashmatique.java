package fundamentals;

import java.util.HashMap;
import java.util.Set;

public class MapaDeHashmatique {
	public void trackList() {
		HashMap<String, String> cancionesMap = new HashMap<String, String>();
		cancionesMap.put("Iris - Goo Goo Dolls", "And I don't want the world to see me 'Cause I don't think that they'd understand\n");
		cancionesMap.put("She Don't Give a FO", "Sabe que la quiero pero she don't give a fo\n");
		cancionesMap.put("Sweater Weather", "And all I am is a man I want the world in my hands");
		cancionesMap.put("Wonderwall ", "Today is gonna be the day that they're gonna throw it back to you\n");
		
		System.out.println(cancionesMap.get("Iris - Goo Goo Dolls"));
		
		Set<String> claves = cancionesMap.keySet();
        for(String clave : claves) {
            System.out.println(clave);
            System.out.println(cancionesMap.get(clave));    
        }
	}
}
