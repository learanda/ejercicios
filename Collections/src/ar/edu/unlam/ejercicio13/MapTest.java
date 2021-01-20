package ar.edu.unlam.ejercicio13;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	
	//Ejercicio 13: Completa el valor de la variable indiceEsperado para que el test de verde y contesta las preguntas
	
	@Test
    public void mapaTest(){

        Map<Integer,Integer> mapa = new HashMap<>();


        mapa.put(1,2);
        mapa.put(2,4);
        mapa.put(3,6);
        //mapa.put(2, 10);
        //System.out.println(mapa.size());

        Integer indiceEsperado = 3;
        assertEquals(6, mapa.get(indiceEsperado).intValue());
        
        //¿Como llamamos a los numeros 1,2 y 3?
        //1, 2 y 3 son las claves
        
        //¿Son la posicion del elemento en el Mapa?
        //No. Son claves, la interfaz map mapea claves unicas a valores, no se pueden repetir las claves,
        //pero si los valores. Las claves se utilizan para recuperar valores.
        //Si se ingresa una clave repetida, el valor(nuevo) que acompaña a la clave repetida va a reemplazar al valor
        //anterior que estaba en esa clave.
        
    }

}
