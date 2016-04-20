package interfaces;

import java.util.Comparator;

import persona.Persona;

public class OrdenacionPorComparatorOrdenNaturalPersonaEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona persona1,Persona persona2) {
		return Integer.valueOf(persona1.getEdad()).compareTo(persona2.getEdad());
	}

}
