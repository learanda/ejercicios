package ar.edu.unlam.ejercicio17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
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
	   
	    //Almaceno solo los valores del Map en un SortedSet para que queden ordenados
	    SortedSet<Integer> valores = new TreeSet<Integer>();
	    valores.addAll(mapa.values());
	    
	    //Meto los elementos del SortedSet en un ArrayList para poder hacer la operacion aritmetica
	    //porque desde el SortedSet no podia
	    ArrayList<Integer> nueva = new ArrayList<Integer>();
	    nueva.addAll(valores);
	    
	    //En un nuevo ArrayList almaceno el retorno del metodo que va a calcular los multiplos
	    ArrayList<Integer> multiplosDe4 = obtenerMultiplosDe4(nueva);
	    
	    //Imprimo el contenido del array
	    System.out.println(multiplosDe4);
	}

	//Paso por parametro el ArrayList que tenia los elementos ordenados
	private ArrayList<Integer> obtenerMultiplosDe4(ArrayList<Integer> nueva) {
		ArrayList<Integer> multiplos = new ArrayList<Integer>();
		for (int i = 0; i < nueva.size(); i++) {
			if((nueva.get(i)%4) == 0) {
				multiplos.add(nueva.get(i));
			}
		}
		return multiplos;
	}
}
