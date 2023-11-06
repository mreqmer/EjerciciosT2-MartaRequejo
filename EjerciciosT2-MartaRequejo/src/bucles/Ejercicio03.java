package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Dibuja triangulos
		/*
		 * 
		 * ENTRADA: 0 | RES. ESPERADO: Error. Número no válido | RES. OBTENIDO: Error. Número no válido
		 * ENTRADA: -5| RES. ESPERADO: Error. Número no válido | RES. OBTENIDO: Error. Número no válido
		 * ENTRADA: 2 | RES. ESPERADO:  *   | RES. OBTENIDO: *
		 *      		               * *                  * *
		 *      
		 *  ENTRADA: 3 | RES. ESPERADO:  *   | RES. OBTENIDO: *
		 *      		                * *                  * *
		 *                             * * *                * * *
		 *                             
		 *  ENTRADA: 3 | RES. ESPERADO:  *   | RES. OBTENIDO: *
		 *      		                * *                  * *
		 *                             * * *                * * *
		 *                            * * * *              * * * *
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//número dado por el usuario
		int num;
		//asteriscos que se muestran cada linea
		int asterisco, contAst=0;
		//espacios de cada linea
		int espacio;
		//pide un número que será el número de lineas
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		//comprueba si el número introducido es válido
		if(num>0) {
			for (int i=num; i>0; i--) {
				/*cada vez que se ejecuta el bucle:
				 * un retorno de carro
				 * asterisco vuelve a 0
				 * la siguiente linea de asteriscos tendrá 1 más
				 * el número de espacios antes de poner los asteriscos se vuelve a igualar a i-1
				 */
				System.out.println(" ");
				asterisco=0;
				contAst++;
				espacio=i-1;
				//pone el número de espacios correspondientes a cada linea
				while(espacio!=0) {
					System.out.print(" ");
					espacio--;
				}
				//pone el número de asteriscos en cada linea
				while(contAst!=asterisco) {
					System.out.print("* ");
					asterisco++;
				}
			}
		}else
			System.out.println("Error. Número no válido");
		sc.close();//cierre de escaner
	}

}
