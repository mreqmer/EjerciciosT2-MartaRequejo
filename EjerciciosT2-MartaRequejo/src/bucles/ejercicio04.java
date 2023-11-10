package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: 5   -2  | RES. ESPERADO: vuelve a preguntar  | RES. OBTENIDO: Error. Introduce números positivos.
		 * ENTRADA: -5   2  | RES. ESPERADO: vuelve a preguntar  | RES. OBTENIDO: Error. Introduce números positivos.
		 * ENTRADA: 15  28  | RES. ESPERADO: El mcd es: 1 | RES. OBTENIDO: El mcd es: 1
		 * ENTRADA: 25  30  | RES. ESPERADO: El mcd es: 5 | El mcd es: 5
		 * ENTRADA: 20  40  | RES. ESPERADO: El mcd es: 20 | RES. OBTENIDO: El mcd es: 20
		 * ENTRADA: 15  q   | RES. ESPERADO: El mcd es: Error. Introduce un número positivo. | RES. OBTENIDO: El mcd es: Error. Introduce un número positivo.
		 */
		
		//variables
		Scanner sc = new Scanner(System.in);
		//guarda el primer número, el segundo y cual es el menor de los dos
		int a=-1, b=-1, menor;
		//pide los datos al usuario	 y comprueba que seean válidos
		do {
			try {
				System.out.print("Introduce el primer número: ");
				a = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un número positivo.");	
				sc.nextLine();
			}
		}while(a<1);
		
		do {
			try {
				System.out.print("Introduce el segundo número: ");
				b = sc.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un número positivo.");	
				sc.nextLine();
			}
		}while(b<1);
		
		sc.close();//cierre de escaner
		//comprueba si los números pedidos están en rango, sino error
		
			//comprueba que número es menor
			if(a>b) {
				menor=b;
			}else {
				menor=a;
			}
			//si los números introducidos no son divisibles disminuye el valor de menor
			while(a%menor!=0 || b%menor!=0) {
				menor--;
			}
			//devuelve el mcd
			System.out.println("El mcd es: " + menor);
		
	}

}
