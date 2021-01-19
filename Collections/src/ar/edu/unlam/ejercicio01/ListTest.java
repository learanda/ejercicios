package ar.edu.unlam.ejercicio01;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ListTest {

	//Ejercicio 1: Crea los assert por cada punto y responde cada pregunta
	
    @Test
    public void listTest1(){

        List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
            
        //1. miLista tiene 7 elementos
        Integer ve1 = 7;
        Integer vo1 = miLista.size();
        
        Assert.assertEquals(ve1, vo1);
        //Respuesta: La lista tiene 8 elementos    
    }
    
    @Test
    public void listTest2(){
    	
    	List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        
        //2. el cuarto elemento es 3
        Integer ve2 = 3;
        Integer vo2 = miLista.get(3);
        
        Assert.assertEquals(ve2, vo2);
        //Respuesta: el 4to elemento es 4
    }
    
    @Test
    public void listTest3(){
    	
    	List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        
        //¿que pasa en este caso?
        miLista.add(2,2);
        //Respuesta: agrega el 2 en el indice 2
    	
        //3. ¿Como probarias lo que paso anterior?
        /* si cambio el numero y pongo 2,12 por ejemplo, después en el
         * indice 2 se puede ver que está el 12.
        */
        System.out.println(miLista.get(2));
        
        
        // ¿que pasa en este caso?
        miLista.remove(8);
        //System.out.println(miLista.get(8));
        //Respuesta: elimina el elemento de la posicion 8
    	
    }
    
    @Test
    public void listTest4() {
    	//¿que prueba se te ocurre?
    	
    	List<Integer>  miLista = new LinkedList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        
        //Si la lista está vacía
        Assert.assertFalse(miLista.isEmpty());
        //Como es falso tira verde el test
        
        //Si contiene determinado elemento
        Boolean vo = miLista.contains(4);
        Assert.assertTrue(vo);
        
        //Uso el metodo clear
        miLista.clear();
        
        //Y luego verifico que está vacía
        Assert.assertTrue(miLista.isEmpty());
    }
    
}