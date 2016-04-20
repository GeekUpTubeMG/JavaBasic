package interfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import persona.Persona;

public class PruebasLinkedHashSet {

	public static void main(String[] args) {
		Set<Persona> coleccionHash = new HashSet<Persona>();
        Set<Persona> coleccionLinkedHash = new LinkedHashSet<Persona>();
        long tiempoIni;//Para almacenar el tiempo en nano segundos
        
        // Introducción de Datos en HashSet y LinkedHashSet
        for (int i = 0; i < 100; i++) {
			coleccionHash.add(new Persona(i, "Geek "+i, "UpTube"));
			coleccionLinkedHash.add(new Persona(i, "Geek "+i, "UpTube"));
		}
       
       //Pruebas HashSet
       tiempoIni = System.nanoTime();
       System.out.println("Vamos a ver cuanto tiempo se tarda en añadir un nuevo elemento a un HashSet");
       coleccionHash.add(new Persona(101, "Geek 101", "UpTube"));
       System.out.println("El tiempo en nano segundos a sido: "+(System.nanoTime()-tiempoIni));
       
       //Pruebas LinkedHashSet
       tiempoIni = System.nanoTime();
       System.out.println("Vamos a ver cuanto tiempo se tarda en añadir un nuevo elemento a un LinkedHashSet");
       coleccionLinkedHash.add(new Persona(101, "Geek 101", "UpTube"));
       System.out.println("El tiempo en nano segundos a sido: "+(System.nanoTime()-tiempoIni));

	}

}
