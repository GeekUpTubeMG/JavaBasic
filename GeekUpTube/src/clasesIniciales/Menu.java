package clasesIniciales;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		String opcion = "";
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		while(opcion.compareToIgnoreCase("S") != 0){
			System.out.println("introduzca la opcion que desea realizar");
			System.out.println("A-Sumar 2 numeros");
			System.out.println("B-Restar 2 numeros");
			System.out.println("S-Salir");

			opcion = sc.nextLine();
			
			if(opcion.compareToIgnoreCase("a") == 0){
				System.out.println("introduzca los numeros a sumar de uno en uno");
				num1 = sc.nextInt();
				System.out.println("introduzca el siguiente");
				num2 = sc.nextInt();
				System.out.println("El resultado de la operaion es => " + (num1 + num2)+"\n");
			}else if(opcion.compareToIgnoreCase("b") == 0){
				System.out.println("introduzca los numeros a restar de uno en uno");
				num1 = sc.nextInt();
				System.out.println("introduzca el siguiente");
				num2 = sc.nextInt();
				System.out.println("El resultado de la operaion es => " + (num1 - num2)+"\n");
			}
			sc.nextLine();
		}
		System.out.println("Adios");
		sc.close();
		/*do{
			System.out.println("introduzca la opcion que desea realizar");
			System.out.println("A-Sumar 2 numeros");
			System.out.println("B-Restar 2 numeros");
			System.out.println("S-Salir");

			opcion = sc.nextLine();

			switch (opcion.toUpperCase()) {
			case "A":
				System.out.println("introduzca los numeros a sumar de uno en uno");
				num1 = sc.nextInt();
				System.out.println("introduzca el siguiente");
				num2 = sc.nextInt();
				System.out.println("El resultado de la operaion es => " + (num1 + num2)+"\n");
				break;
			case "B":
				System.out.println("introduzca los numeros a restar de uno en uno");
				num1 = sc.nextInt();
				System.out.println("introduzca el siguiente");
				num2 = sc.nextInt();
				System.out.println("El resultado de la operaion es => " + (num1 - num2)+"\n");
				break;
			default:
				System.out.println("Adios");
				break;
			}
			sc.nextLine();
		}while (opcion.compareToIgnoreCase("S") != 0) ;*/
	
	}

}
