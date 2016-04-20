package interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import persona.Persona;

public class PruebasHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> mapa1 = new HashMap<Integer,String>();
		
		mapa1.put(0, "cero");
		mapa1.put(1, "uno");
		mapa1.put(2, "dos");
		mapa1.put(3, "tres");
		mapa1.put(4, "cuatro");
		
		System.out.println(mapa1.get(0));
		
		for (Entry<Integer,String> numero : mapa1.entrySet()){
			Integer key = numero.getKey();
			String value = numero.getValue();
			System.out.println("Clave: "+key+", Valor: "+value);
		}

		HashMap<Integer,Persona> mapaPersonas = new HashMap<Integer,Persona>();
		
		mapaPersonas.put(0, new Persona(10, "Mario", "Garrido"));
		mapaPersonas.put(1, new Persona(11, "Geek", "UpTube"));
		mapaPersonas.put(2, new Persona(12, "Pepe", "Granjero"));
		mapaPersonas.put(3, new Persona(13, "Juan", "Youtuber"));
		
		System.out.println(mapaPersonas.get(0));
		
		Iterator<Integer> it = mapaPersonas.keySet().iterator();
		
		while(it.hasNext()){
			Integer key = it.next();
			System.out.println("Clave: "+key+", Valor: ("+mapaPersonas.get(key)+")");	
		}
	}

}
