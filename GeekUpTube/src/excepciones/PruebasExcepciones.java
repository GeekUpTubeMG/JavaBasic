package excepciones;

import punto.Punto;

public class PruebasExcepciones {
	public static void main(String[] args){
		
		
		
		
		try {
			//LanzadorDeExcepciones.lanzarExcepcion();
			Punto p1 = new Punto(1, -1);
		}catch (NumberFormatException e){
			System.out.println(e.getMessage());
		}
	
//		String[] palabras = new String[10];
//		
//		try{
//			System.out.println(palabras[10]);
//			
//		}catch(NullPointerException e){
//			System.out.println("NullPointer");
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Array fuera de rango");
//			
//			try{
//				palabras[9].length();
//			}catch(NullPointerException a){
//				System.out.println("NullPointer");
//			}
//			
//		}catch(Exception e){
//			System.out.println("Cualquier excepcion");
//		}
	}
}
