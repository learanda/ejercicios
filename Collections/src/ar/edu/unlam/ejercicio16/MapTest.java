package ar.edu.unlam.ejercicio16;

import static org.junit.Assert.assertNull;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
public class MapTest {
	
	//Ejercicio 16: Explica la diferencia entre los dos assertNull del siguiente test
	
	@Test
	public void nullElements(){


	    Map<Integer,Integer> mapa = new HashMap<>();


	    mapa.put(1,null);
	    
	    
	    assertNull(mapa.get(1));
	    assertNull(mapa.get(2));
	    
	    //assertNull verifica que el elemento proporcionado es Null
	    //En el 1er caso da verde porque en la clave 1 el valor insertado es null
	    //En el 2do, da verde porque no existe ningún elemento como valor en la clave 2
	    
	}

}
