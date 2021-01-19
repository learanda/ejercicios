package ar.edu.unlam.ejercicio10;

import org.junit.Test;
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
	    
	    List<Integer> sinRepetidos = eliminarRepetidos(miLista);
	    
	    //miLista = miLista.stream().distinct().collect(Collectors.toList());
	    sinRepetidos.forEach(System.out::println);
       
    }
    
    private List<Integer> eliminarRepetidos(List<Integer> miLista){
    	List<Integer> norep = miLista.stream().distinct().collect(Collectors.toList());
    	return norep;
    	/*
    	List<Integer>  miListaSinRepetidos = new LinkedList<>();
    	miListaSinRepetidos = miLista.stream().distinct().collect(Collectors.toList());
    	return (Set<Integer>) miListaSinRepetidos;*/
    }

    
    //https://es.stackoverflow.com/questions/196951/borrar-elementos-repetidos-de-una-lista
    //https://es.stackoverflow.com/questions/155209/java-8-list-obtener-elementos-no-repetidos-de-una-lista
}
