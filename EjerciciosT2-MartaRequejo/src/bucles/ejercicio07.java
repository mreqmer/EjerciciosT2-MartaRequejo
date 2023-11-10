package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
				/*
				 * 
				 * ENTRADA: 0 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
				 * ENTRADA: -5| RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
				 * ENTRADA: q | RES. ESPERADO: Error. Introduce un valor numérico positivo. | RES. OBTENIDO: Error. Introduce un valor numérico positivo.
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
		int lineas=-1;
		//guarda los números de 1 hasta el número de la linea
		int contNum;
		//pedir datos por consola y comprueba que sean válidos
		do {
			try {
				System.out.print("Introduce un número:");
				lineas = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un valor numérico positivo.");
				sc.nextLine();
			}
		}while(lineas<1);
		
		//va contando el número mostrado en cada linea como maximo y las lineas totales
		for (int i = 1; i<=lineas; i++){
			//Cuanta los números hasta el máximo de la linea actual
			for (contNum=1; contNum<=i; contNum++){
				System.out.print(contNum);
			}
			//cuenta los números hasta el 1
			for (contNum=(i-1); contNum>=1; contNum--){
				System.out.print(contNum);
			}
			System.out.println("");
		}	
		sc.close();//cierre escaner
	} 
}

