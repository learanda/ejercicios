package ar.edu.unlam.ejercicio09;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SetTest {
	
	/* Ejercicio 9: El siguiente test no compila, falta declarar la variable
	 * unaColeccion. Declara la variable y cambia el valor del variable
	 * tamanioEsperado para que el test de verde. */

    @Test
    public void listTest(){	
    	
    	List<Integer> unaColeccion = new LinkedList<Integer>();

		unaColeccion.add(1);
		unaColeccion.add(1);
		assertEquals(2,unaColeccion.size());
		   
		unaColeccion.add(2);
		unaColeccion.add(3);
		
		Integer tamanioEsperado = 4;
		assertEquals((int)tamanioEsperado,unaColeccion.size());
		//casteo tamanioEsperado porque sino no funciona el assert
		
	}  
}