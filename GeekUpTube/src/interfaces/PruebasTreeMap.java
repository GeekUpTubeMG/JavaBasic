package interfaces;

import java.util.TreeMap;

import persona.Persona;

import java.util.Map.Entry;

public class PruebasTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> mapaArbol = new TreeMap<Integer, String>();

		mapaArbol.put(2, "dos");
		mapaArbol.put(4, "cuatro");
		mapaArbol.put(1, "uno");
		mapaArbol.put(3, "tres");

		/*for (Entry<Integer, String> numero : mapaArbol.entrySet()) {
			Integer key = numero.getKey();
			String value = numero.getValue();
			System.out.println("Clave: " + key + ", Valor: " + value);
		}*/
		

		TreeMap<Integer, Persona> mapaTree = new TreeMap<Integer, Persona>();

		for (int i = 0; i < 1000; i++) {
			mapaTree.put(generaNumeroAleatorio(),new Persona(i, ""+i, ""));
		}

		for (Entry<Integer, Persona> numero : mapaTree.entrySet()) {
			Integer key = numero.getKey();
			Persona value = numero.getValue();
			System.out.println("Clave: " + key + ", Valor: " + value);
		}
	}

	public static int generaNumeroAleatorio() {
		return (int) Math.floor(Math.random() * (0 - (1000 + 1)) + (1000 + 1));
	}

}
