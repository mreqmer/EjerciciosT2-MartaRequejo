package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * 
		 * ENTRADA: 0 | RES. ESPERADO: Error. Número no válido | RES. OBTENIDO: Error. Número no válido
		 * ENTRADA: -5| RES. ESPERADO: Error. Número no válido | RES. OBTENIDO: Error. Número no válido
		 * ENTRADA: 2 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
		 *      		               22                   22
		 *      
		 *  ENTRADA: 3 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
		 *                              22                   22
		 *                              333                  333
		 *                             
		 *  ENTRADA: 4 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
		 *                              22                   22
		 *                              333                 333
		 *                              4444                 4444 
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//número de lineas del triángulo
		int n;
		//es el número que se mostrará en cada linea y cuantas veces se repite
		int numero=0, contNum=1;
		//pide datos por consola
		System.out.print("Dime un número: ");
		n = sc.nextInt();
		
		if(n>0) {
			for (int i=1; i<=n; i++) {
				/*Cada vez que se ejecuta el bucle:
				 * un retorno de carro
				 * el número mostrado en cada linea ++
				 * el contador de veces que se repite un número vuelve a 1
				 */
				numero++;
				contNum=1;
				//numero que se muestra y las veces que se repite
				while(contNum<=numero) {
					System.out.print(numero);
					contNum++;
				}
				System.out.println(" ");
			}
			//mensaje de error
		}else {
			System.out.println("Error. Introduce un número positivo.");
		}
		sc.close();//cierre de escaner
	}

}
