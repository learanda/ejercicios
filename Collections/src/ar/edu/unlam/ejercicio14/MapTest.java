package ar.edu.unlam.ejercicio14;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	
	//Ejercicio 14: ¿Como haria para obtener el promedio de las claves del ejercicio anterior?
	//Con un bucle for voy obteniendo los valores de las claves, hago una sumatoria y lo divido por
	//la cantidad de elementos del map, que lo obtengo haciendo mapa.size()
	
	@Test
    public void mapaTest(){

        Map<Integer,Integer> mapa = new HashMap<>();


        mapa.put(1,2);
        mapa.put(2,4);
        mapa.put(3,6);
        
        
        Integer sumatoria = 0;
        
        
        for (int i = 1; i <= mapa.size(); i++ ) {  	
        	sumatoria += mapa.get(i);
        }
        
        Integer promedioObtenido = sumatoria/mapa.size();
        Integer promedioEsperado = 4;
        
        assertEquals(promedioEsperado, promedioObtenido);
    }

}
