package ar.edu.unlam.ejercicio5;

public class Ejercicio5 {
	
	/*
	 
	Ejercicio 5
	¿Que diferencia existe entra la implementacion de un ArrayList y la de LinkedList?
	Contesta las siguientes preguntas:

	¿Puedo hacer lo mismo con los dos?
	¿Hay algo que puedo hacer con uno que con otro no?
	¿Cuando usarias cada uno de ellos?
	
	Se puede hacer prácticamente lo mismo con ambos, sin embargo existen algunas diferencias
	que hacen que uno sea más conveniente de usar que otro dependiendo del requerimiento.
	
	Busquedas: en ArrayList es más rápido que en LinkedList, ya que su sistema está basado
	en indices, lo que hace que su estructura brinde un proceso de búsquedas más veloz. Por
	otra parte el LinkedList una lista doble enlazada, se maneja por punteros, lo que requiere
	mayor tiempo al recorrer todos los elementos.
	
	Borrado: LinkedList es más eficiente que ArrayList, ya que al manejarse por punteros,
	al eliminar un elemento simplemente se modifica el puntero hacia un elemento "vecino".
	En cambio en ArrayList se tienen que mover todos los elementos hasta ocupar el espacio
	que quedó vacio.
	
	Inserciones: LinkedList es más eficiente que ArrayList. El motivo es el mismo que el
	del proceso de borrado.
	
	Similitudes:
		- Implementan la interfaz List.
		- Mantienen el orden de inserción de los elementos.
		- Son no sincronizadas y pueden hacerse sincronizadas explicitamente utilizando
		  el método Collections.synchronizedList
		- El el retorno de iterator y listIterator son fail-fast (fallo rápido). Es decir,
		  si la colección es modificada estructuralmente luego de que el iterador sea creado,
		  de cualquier forma (a excepción de los propios métodos de adhisión o borrado del
		  iterador), el iterador arrojará la excepción ConcurrentModificationException.
	
	¿Cuándo usar uno u otro?
	
	Si se van a realizar muchas operaciones de inserción y/o borrado, es mejor LinkedList
	debido a su estructura de punteros.
	
	Si se van a realizar muchas operaciones de búsqueda y no tanto agregado y borrado,
	lo mejor es utilizar ArrayList, ya que las búsquedas son más rápidas debido a su
	estructura basada en índices.
	  
	*/

}
