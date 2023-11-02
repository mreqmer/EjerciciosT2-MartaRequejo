package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;//número que introduce el usuario
		boolean primo = true;
		
		System.out.print("Introduce un número para saber si es primo: ");
		num = sc.nextInt();
		if(num>0) {
		for (int n=2; n<num; n++) {
			if (num%n==0) {
			primo = false;
			break;
			}
		}
			if (primo) {
				System.out.println("Es primo.");
			}else{
				System.out.println("No es primo.");
			}
		}else {
			System.out.println("Valor no válido.");
		}
		
		sc.close();
	}
}
