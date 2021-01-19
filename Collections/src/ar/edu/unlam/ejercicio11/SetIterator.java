package ar.edu.unlam.ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {

	public static void main(String[] args) {
		
		//Ejercicio 11: ¿Que pasa con el orden de insercion de los elemenos de un Set cuando lo iteras?
		
		Set<String> set = new HashSet();
		
		set.add("Hola");
		set.add("Set");
		set.add("5");
		set.add("3");
		set.add("1");
		set.add("10");
		set.add("Zoom");
		set.add("3");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		//la interfaz Set no mantiene el orden de insercion de los elementos

		
		//https://www.youtube.com/watch?v=rruCajMgvGA
	}

}
