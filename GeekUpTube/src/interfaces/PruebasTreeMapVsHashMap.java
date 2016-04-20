package interfaces;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import persona.Persona;

public class PruebasTreeMapVsHashMap {

	public static void main(String[] args) {
		Map<Integer,Persona> mapaHash = new HashMap<Integer,Persona>();
        Map<Integer,Persona> mapaTree = new TreeMap<Integer,Persona>();
        long tiempoIni;//Para almacenar el tiempo en nano segundos
        
        // Introducción de Datos en ArrayList y LinkedList
        for (int i = 0; i < 100; i++) {
			mapaHash.put(i,new Persona(i, "Geek "+i, "UpTube"));
			mapaTree.put(i,new Persona(i, "Geek "+i, "UpTube"));
		}
       
       //Pruebas ArrayList
       tiempoIni = System.nanoTime();
       System.out.println("Vamos a ver cuanto tiempo se tarda en añadir un nuevo elemento a un HashMap");
       mapaHash.put(101,new Persona(101, "Geek 101", "UpTube"));
       System.out.println("El tiempo en nano segundos a sido: "+(System.nanoTime()-tiempoIni));
       
       //Pruebas LinkedList
       tiempoIni = System.nanoTime();
       System.out.println("Vamos a ver cuanto tiempo se tarda en añadir un nuevo elemento a un TreeMap");
       mapaTree.put(101,new Persona(101, "Geek 101", "UpTube"));
       System.out.println("El tiempo en nano segundos a sido: "+(System.nanoTime()-tiempoIni));

	}

}
