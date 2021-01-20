package ar.edu.unlam.ejercicio15;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

	//Ejercicio 15: Utilizando el ejercicio 13 implementa el metodo crearNuevoMapa para que el siguiente test de verde

public class MapTest {
	
	@Test
	public void mapearElementosTest(){
		
		
	    Map<Integer,Integer> mapa = new HashMap<>();
		
		
	    mapa.put(1,2);
	    mapa.put(2,4);
	    mapa.put(3,6);
		
	    Map<Integer, String> otroMapa = crearNuevoMapa(mapa);
	    
	    System.out.println(otroMapa);
	    
	    
	    assertEquals(otroMapa.get(1), "El doble de 1 es 2");
	    assertEquals(otroMapa.get(2), "El doble de 2 es 4");
	    assertEquals(otroMapa.get(3), "El doble de 3 es 6");
		
	}

	private Map<Integer, String> crearNuevoMapa(Map<Integer, Integer> mapa) {
		Map<Integer, String> nuevoMapa = new HashMap();
		for (int i = 1; i <= mapa.size(); i++) {
			nuevoMapa.put(i, "El doble de " + i + " es "+ mapa.get(i));
		}
		return nuevoMapa;
	}

}
