package ar.edu.unlam.ejercicio06;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

	//Ejercicio 6: Modifica Los puntos 1,2 y 3 con las sentencias validas del punto 4
	//y comprueba que todos los test den verde. Explica por que sucede esto.

public class ListTest {

	// ============== EJERCICIO 1 ==============
	@Test
    public void listTest1(){

		List<Integer> miLista = new ArrayList<Integer>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
            
        Integer ve1 = 8;
        Integer vo1 = miLista.size();
        
        Assert.assertEquals(ve1, vo1);   
    }
    
    @Test
    public void listTest2(){
    	
    	List<Integer> miLista = new ArrayList<Integer>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        
        Integer ve2 = 4;
        Integer vo2 = miLista.get(3);
        
        Assert.assertEquals(ve2, vo2);
    }
    
    @Test
    public void listTest3(){
    	
    	List<Integer> miLista = new ArrayList<Integer>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        
        miLista.add(2,2);

        System.out.println(miLista.get(2));
        
        miLista.remove(8);
        //System.out.println(miLista.get(8));
    }
    
    @Test
    public void listTest4() {

    	List<Integer> miLista = new ArrayList<Integer>();

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
        
        //Si contiene determinado elemento
        Boolean vo = miLista.contains(4);
        Assert.assertTrue(vo);
        
        //Uso el metodo clear
        miLista.clear();
        
        //Y luego verifico que está vacía
        Assert.assertTrue(miLista.isEmpty());
    }
	
    // ============== EJERCICIO 2 ==============
    @Test
    public void borrarUnaPosicionNoExistente(){

    	List<Integer> miLista = new ArrayList<Integer>();

        miLista.add(1);

	    miLista.remove(0);
	    
	    Assert.assertTrue(miLista.isEmpty());
    }
    
    @Test
    public void agregarUnElementoEnUnaPosicion(){

    	List<Integer> miLista = new ArrayList<Integer>();

        miLista.add(1);
		miLista.add(2);

		miLista.add(2,3);
		
		Integer ve = miLista.get(2);
		Integer vo = 3;
		Assert.assertEquals(ve,vo);
    }
    
    // ============== EJERCICIO 3 ==============
    @Test
    public void ejemplosLista(){

    	List<Integer> miLista = new ArrayList<Integer>();

        miLista.add(8);
        miLista.add(4);
        miLista.add(7);
        miLista.add(10);
        miLista.add(12);
        miLista.add(90);
        miLista.add(24);
        miLista.add(84);
        miLista.add(18);
        
        assertEquals(28.56, calcularPromedio(miLista), 0.01);
        assertEquals(90, buscarElMayor(miLista).intValue());

    }

    private Double calcularPromedio(List<Integer> miLista) {

        Double promedio = 0d;
        Integer tamanioLista = miLista.size();
        Double sumatoria = 0d;
        
        for(int i = 0; i < tamanioLista; i++) {
        	Integer valor = miLista.get(i);
        	sumatoria += valor;
        }
        
        promedio = (Double) sumatoria/tamanioLista;
        Double promedioRedondeadoADosDecimales = Math.round(promedio * 100d) / 100d;
        return promedioRedondeadoADosDecimales;
    }
    
    private Integer buscarElMayor(List<Integer> miLista) {

    	//Tomo el 1er elemento como el mayor
        Integer mayor = miLista.get(0);
        
        for(int i = 0; i < miLista.size(); i++) {
        	if(miLista.get(i) > mayor) {
        		mayor = miLista.get(i);
        	}
        }
        return mayor;
    }
    
    //Todo da verde porque ArrayList y LinkedList implementan la interfaz Collection
    //comparten los mismos métodos.
}
