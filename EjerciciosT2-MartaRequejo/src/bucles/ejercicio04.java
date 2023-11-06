package bucles;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		//calculadora de mcd
		/*
		 * ENTRADA: 5   -2  | RES. ESPERADO: Error. Introduce números positivos. | RES. OBTENIDO: Error. Introduce números positivos.
		 * ENTRADA: -5   2  | RES. ESPERADO: Error. Introduce números positivos. | RES. OBTENIDO: Error. Introduce números positivos.
		 * ENTRADA: 15  28  | RES. ESPERADO: 1 | RES. OBTENIDO: 1
		 * ENTRADA: 25  30  | RES. ESPERADO: 5 | RES. OBTENIDO: 5
		 * ENTRADA: 20  40  | RES. ESPERADO: 20 | RES. OBTENIDO: 20
		 */
		
		//variables
		Scanner sc = new Scanner(System.in);
		//guarda el primer número, el segundo y cual es el menor de los dos
		int a, b, menor;
		int i;
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
			//va buscando de forma decreciente desde el menor cual es el primer número que divide a ambos simultáneamente, cuando lo encuentra se sale
			for (i=menor; i>=2;i--) {
				if(a%i==0 && b%i==0) {
					break;
				}
			}
			
			//devuelve el mcd
			System.out.println(i);
		//mensaje de error	
		}else
			System.out.println("Error. Introduce números positivos.");
		
	}

}
