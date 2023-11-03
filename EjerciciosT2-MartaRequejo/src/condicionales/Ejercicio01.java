package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int unidad = 0, decena = 0, centena = 0, mil=0;
		//Pedir datos al usuario
		System.out.print("Introduce un número comprendido entre 0 y 9999: ");
		n = sc.nextInt(); 
		if (n>0 && n<10){
			System.out.println("Es capicúa");
		}else if (n>9 && n<100) {
			unidad = n%10;
			decena = n/10;
			if(unidad == decena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		}else if (n>99 && n<1000) {
			unidad = n%10;
			centena = n/100;
			if(unidad == centena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		}else if (n>999 && n<=9999) {
			unidad = n%10;
			decena = (n/10)%10;
			centena = (n/100)%10;
			mil = n/1000;
			if(unidad == mil && decena == centena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
				
		}else {
			System.err.print("Error.");
		}

		sc.close();
	}

}

