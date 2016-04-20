package interfaces;

import java.util.TreeSet;

import persona.Persona;

public class PruebasTreeSet {
	public static void main(String[] args) {
		TreeSet<String> arbol1 = new TreeSet<String>();

		arbol1.add("Geek");
		arbol1.add("GeekUpTube");
		arbol1.add("Mario");
		arbol1.add("Garrido");
		arbol1.add("A");
		
		for (String s : arbol1) {
			System.out.println(s);
		}
		
		TreeSet<Persona> arbolP = new TreeSet<Persona>();
		
		arbolP.add(new Persona(10, "Mario", "Garrido"));
		arbolP.add(new Persona(10, "Alfonso", "Garrido"));
		arbolP.add(new Persona(10, "Benito", "Garrido"));
		arbolP.add(new Persona(10, "Carlos", "Garrido"));
		arbolP.add(new Persona(10, "Carlos", "arrido"));
		
		for (Persona s : arbolP) {
			System.out.println(s.toString());
		}
		
	}
}
