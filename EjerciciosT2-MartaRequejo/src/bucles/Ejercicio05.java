package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: 5   -2  | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: Error. Introduce un número positivo.
		 * ENTRADA: -5   2  | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: Error. Introduce un número positivo.
		 * ENTRADA: 15  28  | RES. ESPERADO: El mcm es: 420 | RES. OBTENIDO: El mcm es: 420
		 * ENTRADA: 25  30  | RES. ESPERADO: El mcm es: 150 | RES. OBTENIDO: El mcm es: 150
		 * ENTRADA: 20  40  | RES. ESPERADO: El mcm es: 40  | RES. OBTENIDO: El mcm es: 40
		 * ENTRADA: 15  q   | RES. ESPERADO: El mcd es: Error. Introduce un número positivo. | RES. OBTENIDO: El mcd es: Error. Introduce un número positivo.
		 */
		//Variables
		Scanner sc = new Scanner(System.in);
		//guarda el primer número, el segundo y el mayor de los dos
		int a=-1, b=-1, mayor;
		
		//pide los números por consola y comprueba que sean válidos
		
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
	
		//comprueba cual de los dos es mayor
		if(a>b) {
			mayor=a;
		}else {
			mayor=b;
		}
		//si los números introducidos no son divisibles aumenta el valor de mayor
		while (mayor%a != 0 || mayor%b != 0) {
			mayor++;
		}
		//devuelve el mcm
		System.out.println("El mcm es: " + mayor);
		
		sc.close();
		
		}
		
	}
