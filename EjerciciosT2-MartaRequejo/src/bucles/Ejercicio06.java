package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * 
		 * ENTRADA: 0 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar 
		 * ENTRADA: -5| RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: Error. Número no válido
		 * ENTRADA: q | RES. ESPERADO: Error. Introduce un número entre 1 y 20. | RES. OBTENIDO: Error. Introduce un número entre 1 y 20.
		 * ENTRADA: 2 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
		 *      		               22                   22
		 *      
		 *  ENTRADA: 3 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
		 *                              22                   22
		 *                              333                  333
		 *                             
		 *  ENTRADA: 4 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
		 *                              22                   22
		 *                              333                  333
		 *                              4444                 4444 
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//número de lineas del triángulo
		int n=-1;
		//es el número que se mostrará en cada linea y cuantas veces se repite
		int numero=0, contNum=1;
		//pide datos por consola y comprueba que sea válido
		do {
			try{
				System.out.print("Dime un número(entre 1-20): ");
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un número entre 1 y 20.");	
				sc.nextLine();
			}
		}while(n<1 || n>20);
		
		//cuenta los números de lineas hasta llegar de tope al introducido por el usuario
		for (int i=1; i<=n; i++) {
			numero++;
			contNum=1;
			//numero que se muestra y las veces que se repite
			while(contNum<=numero) {
				System.out.print(numero);
				contNum++;
			}
			
			System.out.println("");
		}
			
		
		sc.close();//cierre de escaner
	}

}
