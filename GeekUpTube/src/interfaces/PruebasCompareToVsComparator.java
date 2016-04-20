package interfaces;
import java.util.*;

import persona.Persona;

public class PruebasCompareToVsComparator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();//TOTALMENTE VALIDO, para mi gusto la mejor forma
		List<String> lista1 = new ArrayList<>();//TOTALMENTE VALIDO
		@SuppressWarnings("rawtypes")
		List lista2 = new ArrayList();//NO ACONSEJABLE
		
		//*************ORDENACION*************
		
		List<Persona> miListaPersonasCompareTo = new ArrayList<Persona>();
		
		List<Persona> miListaPersonaCompare = new ArrayList<Persona>();
		
		Persona p1 = new Persona(1, "one", "uno");
		Persona p2 = new Persona(2, "two", "dos");
		Persona p3 = new Persona(3, "three", "tres");
		Persona p4 = new Persona(4, "four", "cuatro");
		Persona p5 = new Persona(5, "five", "cinco");
		Persona p6 = new Persona(5, "five", "cincos");
		
		miListaPersonasCompareTo.add(p1);
		miListaPersonasCompareTo.add(p2);
		miListaPersonasCompareTo.add(p3);
		miListaPersonasCompareTo.add(p4);
		miListaPersonasCompareTo.add(p5);
		miListaPersonasCompareTo.add(p6);
		
		miListaPersonaCompare.add(p1);
		miListaPersonaCompare.add(p2);
		miListaPersonaCompare.add(p3);
		miListaPersonaCompare.add(p4);
		miListaPersonaCompare.add(p5);
		
		Collections.sort(miListaPersonasCompareTo);
		System.out.println("*******LISTA ORDENADA POR ORDEN NATURAL DEL NOMBRE Y APELLIDO*******\n");
		for (Persona persona : miListaPersonasCompareTo ) {
			System.out.println(persona);
		}
		
		Collections.sort(miListaPersonaCompare, new OrdenacionPorComparatorOrdenNaturalPersonaEdad());
		System.out.println("\n*******LISTA ORDENADA POR ORDEN NATURAL DE LA EDAD*******\n");
		for (Persona persona : miListaPersonaCompare ) {
			System.out.println(persona);
		}
		
		
	}

}
