package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: -5    | RES. ESPERADO: Error. | RES. OBTENIDO: Error.
		 * ENTRADA: 50000 | RES. ESPERADO: Error. | RES. OBTENIDO: Error.
		 * ENTRADA: 5     | RES. ESPERADO: Es capicúa    | RES. OBTENIDO: Es capicúa
		 * ENTRADA: 25    | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * ENTRADA: 22    | RES. ESPERADO: Es capicúa    | RES. OBTENIDO:Es capicúa
		 * ENTRADA: 122   | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * ENTRADA: 212   | RES. ESPERADO: Es capicúa    | RES. OBTENIDO: Es capicúa
		 * ENTRADA: 9119  | RES. ESPERADO: Es capicúa    | RES. OBTENIDO: Es capicúa
		 */
		
		//Variables
		Scanner sc = new Scanner(System.in);
		int n;//Recoge el número introducido por el usuario
		//Recogen, respectivamente, las unidades, decenas, centenas y mil
		int unidad = 0, decena = 0, centena = 0, mil=0;
		//Pedir datos al usuario
		System.out.print("Introduce un número comprendido entre 0 y 9999: ");
		n = sc.nextInt();
		//si el número tiene 1 dígito siempre es capicúa
		if (n>0 && n<10){
			System.out.println("Es capicúa");
		//comprobación de números 2 dígitos, los cuales son capicúa si sus dígitos son iguales	
		}else if (n>9 && n<100) {
			unidad = n%10;
			decena = n/10;
			//comprueba es capicúa o no
			if(unidad == decena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		//Comprueba los números de 3 dígitos, los cuales son capicúa solo si las unidades y centenas son iguales	
		}else if (n>99 && n<1000) {
			unidad = n%10;
			centena = n/100;
			//Comprueba si es capicúa o no
			if(unidad == centena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		//Comprueba los números de 4 dígitos, los cuales son capicúa solo si los mil y unidades son iguales y las
		//decenas y centenas iuales	
		}else if (n>999 && n<=9999) {
			unidad = n%10;
			decena = (n/10)%10;
			centena = (n/100)%10;
			mil = n/1000;
			//Comprueba si es capicúa o no
			if(unidad == mil && decena == centena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		//si esta fuera de rango 1-9999 error		
		}else {
			System.err.print("Error.");
		}

		sc.close();
	}

}

