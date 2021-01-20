package ar.edu.unlam.ejercicio17;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

	//Ejercicio 17: Crea un metodo que te devuelva todos los multiplos de 4 ordenados de menor a mayor

public class MapTest {
	
	@Test
	public void multiplosDe4Ordenados(){


	    Map<Integer,Integer> mapa = new HashMap<>();

	    mapa.put(1,2);
	    mapa.put(2,4);
	    mapa.put(3,6);
	    mapa.put(12,24);
	    mapa.put(6,12);
	    
	    Map<Integer, Integer> otroMapa = crearNuevoMapaConMultiplosDe4(mapa);
	    
	    //System.out.println(otroMapa);
	    
	    /*
	    SortedSet<Integer> lista = new TreeSet();
		lista.add(1);
		lista.add(5);
		lista.add(2);
		System.out.println(lista);*/
	    
	}
	
	
		private Map<Integer, Integer> crearNuevoMapaConMultiplosDe4(Map<Integer, Integer> mapa) {
		SortedSet<Integer> lista = new TreeSet();
		lista.addAll((Collection<? extends Integer>) mapa);
		
		Map<Integer, Integer> nuevoMapa = new HashMap();
		for (int i = 1; i < lista.size(); i++) {
			if ((((Map<Integer, Integer>) lista).get(i) % 4) == 0) {
				nuevoMapa.put(i, ((Map<Integer, Integer>) lista).get(i));
			}
		}
		return nuevoMapa;
	}

}
