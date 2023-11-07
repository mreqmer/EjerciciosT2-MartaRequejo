package bucles;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
				/*
				 * 
				 * ENTRADA: 0 | RES. ESPERADO: Error. Número no válido | RES. OBTENIDO: Error. Número no válido
				 * ENTRADA: -5| RES. ESPERADO: Error. Número no válido | RES. OBTENIDO: Error. Número no válido
				 * ENTRADA: 2 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
				 *      		               121                  121
				 *      
				 *  ENTRADA: 3 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
				 *                              121                  121
				 *                              12321                12321
				 *                             
				 *  ENTRADA: 4 | RES. ESPERADO: 1   | RES. OBTENIDO: 1
				 *                              121                  121
				 *                              12321                12321
				 *                              1234321              1234321  
				 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//número de lineas que tendrá el triángulo
		int lineas;
		//guarda los números de 1 hasta el número de la linea
		int contNum;
		//pedir datos por consola
		System.out.print("Introduce un número:");
		lineas = sc.nextInt();
		
		for (int i = 1; i<=lineas; i++){
			/* Cada vez que se ejecuta el bucle:
			 * el contNum de número vuelve a 1
			 * retorno de carro
			 */
			contNum=1;
			//muestra los números de forma creciente hasta el número de linea y luego de forma decreciente hasta 1
			while (contNum<i){
					System.out.print(contNum);
					contNum++;
			}
			while (contNum>=1){
				System.out.print(contNum);
				contNum--;
			}
			System.out.println("");
		}
		sc.close();//cierre escaner
	} 
}

