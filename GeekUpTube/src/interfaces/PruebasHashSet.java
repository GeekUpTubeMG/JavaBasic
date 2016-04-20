package interfaces;

import java.util.HashSet;
import java.util.Set;

import persona.Persona;

public class PruebasHashSet {

	public static void main(String[] args){
		Persona p1 = new Persona(10, "Geek", "UpTube");
		Persona p2 = new Persona(10, "Geek", "UpTube");
		Persona p3 = new Persona(10, "Hola", "Adios");
		Persona p4 = new Persona(10, "Pepe", "Hola");
		
		Set<Persona> personas = new HashSet<Persona>();
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		System.out.println(personas.size());
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		System.out.println(personas.contains(p2));
	}
}
