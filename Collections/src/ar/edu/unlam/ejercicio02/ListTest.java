package ar.edu.unlam.ejercicio02;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

// Ejercicio 2: Modifica la siguiente porcion de codigo para que compile.
// Explica que tuviste que agregar para que compile.

public class ListTest {

    @Test
    public void borrarUnaPosicionNoExistente(){


        List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);

	    miLista.remove(0);
	    
	    Assert.assertTrue(miLista.isEmpty());
	    //Agregue ; despues de miLista.remove
	    //Le agregué el indice porque sino no sabe que eliminar
	    //Use un assertTrue para comprobar que habia algo que borrar en la posicion 0
    }
    
    @Test
    public void agregarUnElementoEnUnaPosicion(){

        List<Integer>  miLista = new LinkedList <>();

        miLista.add(1);
		miLista.add(2);

		//No se puede agregar un elemento en una posicion que excede el tamaño
		//actual de la lista
	    //miLista.add(3, 3);
	    
		//Si por ejemplo hago
		miLista.add(2,3);
		//Agrego el 3 en el indice 2
		
		Integer ve = miLista.get(2);
		Integer vo = 3;
		Assert.assertEquals(ve,vo);
    }

}