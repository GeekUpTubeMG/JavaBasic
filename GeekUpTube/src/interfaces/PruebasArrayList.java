package interfaces;

import java.util.ArrayList;

import java.util.Scanner;


public class PruebasArrayList {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> almacenNumeros = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		String aux = "";
		int suma = 0;
		
		do{
			System.out.println("Introduzca un numero a sumnar");
			aux = sc.nextLine();
			
			if(!aux.equals("o"))
				almacenNumeros.add(Integer.parseInt(aux));
			
		}while(!aux.equals("o"));
		sc.close();
		
		for (Integer num : almacenNumeros) {
			if(num%2 == 0){
				pares.add(num);
			}
			suma += num;//suma = suma + num;
		}
		System.out.println(suma);
		System.out.println(pares);
		
		/*
		ArrayList<String> miArrayList = new ArrayList<String>();
		
		miArrayList.add("Hola");
		miArrayList.add("Adios");
		miArrayList.add("GeekUpTube");
		miArrayList.add("pepe");
		
		System.out.println(miArrayList);
		
		System.out.println(miArrayList.size());
		System.out.println(miArrayList.get(2));
		
		miArrayList.remove(2);
		
		System.out.println(miArrayList);
		
		Iterator<String> it = miArrayList.iterator();
		
		while(it.hasNext()){
			if (it.next() == "Hola"){
				it.remove();
			}
		}
		
		for (String string : miArrayList) {
			System.out.println(string);
		}
		*/
	}
}
