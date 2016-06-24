package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import figuras.QuienSoy;
import persona.Persona;
import persona.Persona2;

public class PruebasConLambdas {
	public static void main(String[] args) {
		Persona persona = new Persona(1, "Mario", "Garrido");
		
		persona.dimeQuienSoy();
		
		Persona2 persona2 = new Persona2(1, "Mario", "Garrido");
		
		persona2.quienSoy(new QuienSoy() {
			@Override
			public void dimeQuienSoy() {
				System.out.println("Soy una persona");	
			}
		});
		
		persona2.quienSoy(() -> System.out.println("Soy una persona"));
		
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add(persona);
		
		Collections.sort(personas,(persona0, persona1) -> persona1.compareTo(persona0));
	}
}
