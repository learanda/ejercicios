package ar.edu.unlam.ejercicio07_08y12;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.Assert;

public class Test12 {
	
	//Ejercicio 12: Queremos borrar la linea
	//Collections.sort(miLista)
	//del test del Ejercicio 7 y que el mismo siga dando verde. ¿Que cambios tenes que hacer?
	
	 @Test
	 public void ordenarRectangulosDeMenorAMyorPorPerimetro(){

	        SortedSet<Rectangulo> miLista = new TreeSet<Rectangulo>();

	        miLista.add(new Rectangulo(4d,6d));
	        miLista.add(new Rectangulo(3d,2d));
	        miLista.add(new Rectangulo(4d,5d));

	        //System.out.println(miLista);
	        
	        
	        List<Rectangulo> miListaOrdenada = new LinkedList<Rectangulo>(miLista);
	        
	        
	        assertEquals(10, miListaOrdenada.get(0).getPerimetro(), 0);
	        assertEquals(18, miListaOrdenada.get(1).getPerimetro(), 0);
	        assertEquals(20, miListaOrdenada.get(2).getPerimetro(), 0);
	        
	        
	        //En lugar de usar in LinkedList para almacenar los rectangulos, utilizo la
	        //clase TreeSet implementando SortedSet para tener un orden natural.
	        //Luego vuelvo a almacenar los valores en una LinkedList para poder acceder
	        //por los indices para obtener los perimetros y compararlos en el test.
	        

	        //https://www.javacodeexamples.com/convert-treeset-to-arraylist-list-linkedlist-in-java-example/2834
	 }
}
