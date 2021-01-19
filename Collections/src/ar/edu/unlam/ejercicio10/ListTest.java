package ar.edu.unlam.ejercicio10;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListTest {
	
	@Test
    public void listTest(){
		
		// Ejercicio 10: Implementa el metodo eliminar repetidos y prueba
		// que funciona correctamente

	    List<Integer>  miLista = new LinkedList<>();
	
	    miLista.add(1);
	    miLista.add(2);
	    miLista.add(3);
	    miLista.add(4);
	    miLista.add(1);
	    miLista.add(2);
	    miLista.add(3);
	    miLista.add(4);
	    
	    Set sinRepetidos = eliminarRepetidos(miLista);
	    
	    sinRepetidos.forEach(System.out::println);
       
    }
    
    private Set<Integer> eliminarRepetidos(List<Integer> miLista){
    	Set<Integer> sinRepetidos = new HashSet();
    	sinRepetidos.addAll(miLista);
    	return sinRepetidos;
    }
    //Como Set no admite repetidos, al agregar la lista con repetidos al Set,
    //directamente no se agregan.

    //https://www.youtube.com/watch?v=rruCajMgvGA
    //https://es.stackoverflow.com/questions/196951/borrar-elementos-repetidos-de-una-lista
    //https://es.stackoverflow.com/questions/155209/java-8-list-obtener-elementos-no-repetidos-de-una-lista
}
