package bucles;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: 5   -2  | RES. ESPERADO: Error. Introduce números positivos. | RES. OBTENIDO: Error. Introduce números positivos.
		 * ENTRADA: -5   2  | RES. ESPERADO: Error. Introduce números positivos. | RES. OBTENIDO: Error. Introduce números positivos.
		 * ENTRADA: 15  28  | RES. ESPERADO: El mcd es: 1 | RES. OBTENIDO: El mcd es: 1
		 * ENTRADA: 25  30  | RES. ESPERADO: El mcd es: 5 | El mcd es: 5
		 * ENTRADA: 20  40  | RES. ESPERADO: El mcd es: 20 | RES. OBTENIDO: El mcd es: 20
		 */
		
		//variables
		Scanner sc = new Scanner(System.in);
		//guarda el primer número, el segundo y cual es el menor de los dos
		int a, b, menor;
		//pide los datos al usuario	
		System.out.print("Introduce el primer número: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		b = sc.nextInt();
		
		sc.close();//cierre de escaner
		//comprueba si los números pedidos están en rango, sino error
		if(a>0 && b>0) {
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
		//mensaje de error	
		}else
			System.out.println("Error. Introduce números positivos.");
		
	}

}
