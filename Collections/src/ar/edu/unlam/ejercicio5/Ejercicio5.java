package ar.edu.unlam.ejercicio5;

public class Ejercicio5 {
	
	/*
	 
	Ejercicio 5
	�Que diferencia existe entra la implementacion de un ArrayList y la de LinkedList?
	Contesta las siguientes preguntas:

	�Puedo hacer lo mismo con los dos?
	�Hay algo que puedo hacer con uno que con otro no?
	�Cuando usarias cada uno de ellos?
	
	Se puede hacer pr�cticamente lo mismo con ambos, sin embargo existen algunas diferencias
	que hacen que uno sea m�s conveniente de usar que otro dependiendo del requerimiento.
	
	Busquedas: en ArrayList es m�s r�pido que en LinkedList, ya que su sistema est� basado
	en indices, lo que hace que su estructura brinde un proceso de b�squedas m�s veloz. Por
	otra parte el LinkedList una lista doble enlazada, se maneja por punteros, lo que requiere
	mayor tiempo al recorrer todos los elementos.
	
	Borrado: LinkedList es m�s eficiente que ArrayList, ya que al manejarse por punteros,
	al eliminar un elemento simplemente se modifica el puntero hacia un elemento "vecino".
	En cambio en ArrayList se tienen que mover todos los elementos hasta ocupar el espacio
	que qued� vacio.
	
	Inserciones: LinkedList es m�s eficiente que ArrayList. El motivo es el mismo que el
	del proceso de borrado.
	
	Similitudes:
		- Implementan la interfaz List.
		- Mantienen el orden de inserci�n de los elementos.
		- Son no sincronizadas y pueden hacerse sincronizadas explicitamente utilizando
		  el m�todo Collections.synchronizedList
		- El el retorno de iterator y listIterator son fail-fast (fallo r�pido). Es decir,
		  si la colecci�n es modificada estructuralmente luego de que el iterador sea creado,
		  de cualquier forma (a excepci�n de los propios m�todos de adhisi�n o borrado del
		  iterador), el iterador arrojar� la excepci�n ConcurrentModificationException.
	
	�Cu�ndo usar uno u otro?
	
	Si se van a realizar muchas operaciones de inserci�n y/o borrado, es mejor LinkedList
	debido a su estructura de punteros.
	
	Si se van a realizar muchas operaciones de b�squeda y no tanto agregado y borrado,
	lo mejor es utilizar ArrayList, ya que las b�squedas son m�s r�pidas debido a su
	estructura basada en �ndices.
	  
	*/

}
