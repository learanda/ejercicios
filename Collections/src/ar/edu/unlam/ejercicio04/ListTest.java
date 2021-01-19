package ar.edu.unlam.ejercicio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	//Ejercicio 4: Dada la sentencia
	List<Integer>  miLista = new LinkedList<>();
	
	//Cual de las siguientes lineas son validas para reemplazarla
	
	/*a*/ //List<Integer> miLista1 = new List<>();
	/*b*/ //List<Integer> miLista2 = new List<Integer>();
	/*c*/ List<Integer> miLista3 = new ArrayList<Integer>();
	/*d*/ //List<Integer> miLista4 = new LinkedList<String>();
	
	/*a : no se puede porque List es una interfaz y no puede ser instanciada,
	 * solo puede ser implementada, por eso se usa por ejemplo ArrayList */
	
	/*b : lo mismo que 'a', solo que dice List<Integer> pero sigue queriendose
	 * usar List, así que no va a funcionar */
	
	/*c : considero que es la respuesta correcta a la consigna, aunque no va
	 * a tener las mismas caracteristicas, pero puede funcionar */
	
	/*d : no funciona porque 1ro se declaró List<Integer> y después 
	 * LinkedList<String>, tienen que ser del mismo tipo (Integer o String)*/

}
