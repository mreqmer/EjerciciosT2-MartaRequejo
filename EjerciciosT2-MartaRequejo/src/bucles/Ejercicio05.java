package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: 5   -2  | RES. ESPERADO: Error. Introduce un número positivo. | RES. OBTENIDO: Error. Introduce un número positivo.
		 * ENTRADA: -5   2  | RES. ESPERADO: Error. Introduce un número positivo. | RES. OBTENIDO: Error. Introduce un número positivo.
		 * ENTRADA: 15  28  | RES. ESPERADO: El mcm es: 420 | RES. OBTENIDO: El mcm es: 420
		 * ENTRADA: 25  30  | RES. ESPERADO: El mcm es: 150 | RES. OBTENIDO: El mcm es: 150
		 * ENTRADA: 20  40  | RES. ESPERADO: El mcm es: 40  | RES. OBTENIDO: El mcm es: 40
		 */
		//Variables
		Scanner sc = new Scanner(System.in);
		//guarda el primer número, el segundo y el mayor de los dos
		int a, b, mayor;
		
		//pide los números por consola
		System.out.print("Introduce el primer número: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		b = sc.nextInt();
		sc.close();
		//comprueba si los números pedidos están en rango, sino error
		if(a>0 && b>0) {	
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
		//mensaje de error
		}else {
			System.out.println("Error. Introduce un número positivo.");
		}
		}
		
	}
