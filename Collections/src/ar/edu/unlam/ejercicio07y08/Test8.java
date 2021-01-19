package ar.edu.unlam.ejercicio7y8;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Test8 {
	
	//Ejercicio 8: Completa el siguiente test
	
	 @Test
	 public void ordenarRectangulosDeMenorAMyorPorSuperfice(){

	        List<Rectangulo>  miLista = new LinkedList<>();

	        miLista.add(new Rectangulo(4d,6d));
	        miLista.add(new Rectangulo(3d,2d));
	        miLista.add(new Rectangulo(4d,5d));


	        Collections.sort(miLista, new Comparator<Rectangulo>() {
	            @Override
	            public int compare(Rectangulo o1, Rectangulo o2) {
	                return (int) (o1.getArea() - o2.getArea());// implementa la comparacion
	            }
	        });

			
	        Double superficie1 = 6d; 
	        Double superficie2 = 20d;
	        Double superficie3 = 24d;
	        assertEquals(superficie1, miLista.get(0).getArea());
	        assertEquals(superficie2, miLista.get(1).getArea());
	        assertEquals(superficie3, miLista.get(2).getArea());
	    }

}
