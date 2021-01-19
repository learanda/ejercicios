package ar.edu.unlam.ejercicio03;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

//Ejercicio 3: Completa los siguientes test

public class ListTest {
	  	
		@Test
	    public void ejemplosLista(){

	        List<Integer>  miLista = new LinkedList<>();

	        miLista.add(8);
	        miLista.add(4);
	        miLista.add(7);
	        miLista.add(10);
	        miLista.add(12);
	        miLista.add(90);
	        miLista.add(24);
	        miLista.add(84);
	        miLista.add(18);

	        //assertEquals(257, calcularPromedio(miLista), 0.01);
	        //257 es una sumatoria nada más
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
}
