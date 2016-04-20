package interfaces;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import persona.Persona;

public class LinkedListVsArraylist {

	
	public static void main (String[] args){
		 List<Persona> listaArray = new ArrayList<Persona>();
         List<Persona> listaLinked = new LinkedList<Persona>();
         long tiempoIni;//Para almacenar el tiempo en nano segundos
         
         // Introducción de Datos en ArrayList y LinkedList
         for (int i = 0; i < 100; i++) {
			listaArray.add(new Persona(i, "Geek "+i, "UpTube"));
			listaLinked.add(new Persona(i, "Geek "+i, "UpTube"));
		}
        
        //Pruebas ArrayList
        tiempoIni = System.nanoTime();
        System.out.println("Vamos a ver cuanto tiempo se tarda en añadir un nuevo elemento a un ArrayList");
        listaArray.add(new Persona(101, "Geek 101", "UpTube"));
        System.out.println("El tiempo en nano segundos a sido: "+(System.nanoTime()-tiempoIni));
        
        //Pruebas LinkedList
        tiempoIni = System.nanoTime();
        System.out.println("Vamos a ver cuanto tiempo se tarda en añadir un nuevo elemento a un LinkedList");
        listaLinked.add(new Persona(101, "Geek 101", "UpTube"));
        System.out.println("El tiempo en nano segundos a sido: "+(System.nanoTime()-tiempoIni));
	}
}
