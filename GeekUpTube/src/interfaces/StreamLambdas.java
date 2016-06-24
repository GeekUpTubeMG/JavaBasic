package interfaces;

import java.util.ArrayList;
import java.util.List;

import persona.Persona;

public class StreamLambdas {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		int auxEdades = 0;
		
		Persona p1 = new Persona(1, "Geek", "Up");
		Persona p2 = new Persona(2, "Mario", "Garrido");
		Persona p3 = new Persona(3, "Pepe", "Up");
		Persona p4 = new Persona(4, "Alexis", "Up");
		Persona p5 = new Persona(5, "Pepe", "Villuelas");
		Persona p6 = new Persona(5, "Carlos", "Up");
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5);
		listaPersonas.add(p6);

		// TODOS LOS EJERCICIOS SIN LAMBDAS NI STREAM
		System.out.println("\nNOMBRE TODAS LAS PERSONAS\n");
		for (Persona persona : listaPersonas) {
			System.out.println("Nombre: " + persona.getNombre());
		}


		System.out.println("\nNOMBRE DE TODAS LAS PERSONAS CON APELLIDO \"UP\"\n");
		for (Persona persona : listaPersonas) {
			if (persona.getApeelido().equalsIgnoreCase("up")) {
				System.out.println(persona);
			}
		}

		System.out.println("\nEDAD DE TODAS LAS PERSONAS\n");
		for (Persona persona : listaPersonas) {
			if (persona.getApeelido().equalsIgnoreCase("up")) {
				System.out.println(persona.getEdad());
			}
		}
		
		for (Persona persona : listaPersonas) {
			if (persona.getApeelido().equalsIgnoreCase("up")) {
				auxEdades += persona.getEdad();
			}
		}
		
		System.out.println("Suma total de las edades de estas personas: " + auxEdades);


		// CON STREAMS Y LAMBDAS
		System.out.println("\nNOMBRE TODAS LAS PERSONAS STREAMS Y LAMBDAS\n");
		listaPersonas.stream()
				.forEach(persona -> System.out.println("Nombre: " + persona.getNombre()));

		System.out.println("\nNOMBRE DE TODAS LAS PERSONAS CON APELLIDO \"UP\" STREAMS Y LAMBDAS\n");
		listaPersonas
				.stream()
				.filter(persona -> persona.getApeelido().equalsIgnoreCase("up"))
				.forEach(System.out::println);
	
		System.out.println("\nEDAD DE TODAS LAS PERSONAS STREAMS AND LAMBDAS\n");
		listaPersonas
				.stream()
				.filter(persona -> persona.getApeelido().equalsIgnoreCase("up"))
				.map(persona -> persona.getEdad()).forEach(System.out::println);

		System.out.println("Suma total de las edades de estas personas: "
				+ listaPersonas
						.stream()
						.filter(persona -> persona.getApeelido().equalsIgnoreCase("up"))
						.mapToInt(persona -> persona.getEdad())
						.sum());


	}

}
