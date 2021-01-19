package ar.edu.unlam.ejercicio07_08y12;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class Test7 {
	
	//Ejercicio 7: Dada la clase Cuadrado y la interfaz Figura
	//¿Que modificaciones tenes que hacer para que el siguiente test de verde?
	
	 @Test
	 public void ordenarRectangulosDeMenorAMyorPorPerimetro(){

	        List<Rectangulo> miLista = new LinkedList<>();

	        miLista.add(new Rectangulo(4d,6d));
	        miLista.add(new Rectangulo(3d,2d));
	        miLista.add(new Rectangulo(4d,5d));

	        
	        Collections.sort(miLista);
	        
	        /*System.out.println(miLista.get(0).getPerimetro());
	        System.out.println(miLista.get(1).getPerimetro());
	        System.out.println(miLista.get(2).getPerimetro());*/
	        
	        assertEquals(10, miLista.get(0).getPerimetro(), 0);
	        assertEquals(18, miLista.get(1).getPerimetro(), 0);
	        assertEquals(20, miLista.get(2).getPerimetro(), 0);

	 }
	 
	 /*
	  * Agregué atributos area y perimetro en la clase Rectangulo, y los agregue
	  * en el constructor, indicando que sus valores serían el retorno de los metodos.
	  * Sobreescribí el metodo compareTo que agregue en la interfaz Figura,
	  * e implemente la interfaz Comparable en Rectangulo. Para poder hacer el
	  * ordenamiento usando como valores los perimetros se especifica todo en el
	  * compareTo. Tambien agregue getters de area y perimetro.
	  * Finalmente Collections.sort(miLista) no tira error porque ya esta el compareTo,
	  * y el test da verde porque el valor esperado coindide con el obtenido, que se
	  * obtiene gracias al getter.
	  */
}
