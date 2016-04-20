package clasesIniciales;

import java.util.Scanner;

public class ImprimirPares {

	public static void main(String[] args) {
		int[] numerosIntroducidos = new int[5];
		Scanner sc = new Scanner(System.in);
		int aux;
		int contadorPosicion = 0;
		
		System.out.println("Por favor introduzca 5 numeros enteros y nostros le diremos cuales son pares");
		
		do{
			System.out.println("introduzca un numero entero por favor");
			aux =sc.nextInt();
			while(aux != 0 && aux != 1  && aux != 2 && aux != 3  && aux != 4  && aux != 5  && aux != 6  && aux != 7  && aux != 8  && aux != 9 ){
				System.out.println("introduzca un numero entero de un solo caracter (0,1,2,3,4,5,6,7,8,9)");
				aux =sc.nextInt();
			}
			numerosIntroducidos[contadorPosicion] = aux;
			contadorPosicion++;
		}while(contadorPosicion < numerosIntroducidos.length);
		sc.close();
		
		System.out.println("Los numeros pares son: ");
		for(int i = 0;i<numerosIntroducidos.length;i++){
			if(numerosIntroducidos[i] % 2 == 0){
				System.out.println(numerosIntroducidos[i]);
			}
		}
	}
}
