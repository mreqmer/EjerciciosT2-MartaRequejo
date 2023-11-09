package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: -2 | RES. ESPERADO: vuelve a preguntar  | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: 0  | RES. ESPERADO: vuelve a preguntar  | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA:dos | RES. ESPERADO: Error. Introduce un valor numérico positivo. | RES. OBTENIDO: Error. Introduce un valor numérico positivo.
		 * ENTRADA: 7  | RES. ESPERADO: Entre 1 y 7 hay 4 primos.   | RES. OBTENIDO: Entre 1 y 7 hay 4 primos.
		 * ENTRADA: 12 | RES. ESPERADO: Entre 1 y 12 hay 5 primos.  | RES. OBTENIDO: Entre 1 y 12 hay 5 primos. 
		 * ENTRADA: 40 | RES. ESPERADO: Entre 1 y 40 hay 12 primos. | RES. OBTENIDO: Entre 1 y 40 hay 12 primos.
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//determina si es primo o no
		boolean primo;
		//número que introduce el usuario
		int num=-1;
		//contador
		int j;
		//contador de primos
		int cont=0;
		//pregunta datos y comprueba que son válidos
		do {
			try {
				System.out.print("Introduce un número para saber cuantos son primos: ");
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un valor numérico positivo.");
				sc.nextLine();
			}	
		}while(num<1);
		
		for (int i=2; i<=num; i++) {
			primo = true;
			j=2;
			while (j<=i-1 && primo == true) {
				if(i%j==0) {
					primo=false;
				}
				j++;	
			}
			if (primo) {
				cont++;
			}
		}
		//devuelve respuesta
		System.out.println("Entre 1 y " + num + " hay " + cont + " primos.");
		
		//cierre escaner
		sc.close();
	}
}