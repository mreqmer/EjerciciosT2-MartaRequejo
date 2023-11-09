package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * 
		 * ENTRADA: 0   | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: -5  | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: dos | RES. ESPERADO: Error. Introduce un valor numérico positivo. | RES. OBTENIDO: Error. Introduce un valor numérico positivo.
		 * ENTRADA: 2   | RES. ESPERADO:  *   | RES. OBTENIDO: *
		 *      		                 * *                  * *
		 *      
		 * ENTRADA: 3   | RES. ESPERADO:  *   | RES. OBTENIDO: *
		 *                               * *                  * *
		 *                              * * *                * * *
		 *                             
		 * ENTRADA: 4   | RES. ESPERADO:  *   | RES. OBTENIDO: *
		 *                               * *                  * *
		 *                              * * *                * * *
		 *                             * * * *              * * * *
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//número dado por el usuario
		int num=-1;
		//asteriscos que se muestran cada linea
		int asterisco, contAst=0;
		//espacios de cada linea
		int espacio;
				//recoge el número de lineas dentro de un valor positivo.
				do {
					try {
						System.out.print("Introduce un número:");;
						num = sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Error. Introduce un número positivo.");
						sc.nextLine();
					}
				}while (num<1);	
	
		for (int i=num; i>0; i--) {
			/*cada vez que se ejecuta el bucle:
			 * un retorno de carro
			 * asterisco vuelve a 0
			 * la siguiente linea de asteriscos tendrá 1 más
			 * el número de espacios antes de poner los asteriscos se vuelve a igualar a i-1
			 */
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
			System.out.println(" ");
		}
		sc.close();//cierre de escaner
	}

}
