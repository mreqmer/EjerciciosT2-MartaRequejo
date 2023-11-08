package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;//número que introduce el usuario
		boolean primo;
		int j;
		int cont=0;
		System.out.print("Introduce un número para saber cuantos son primos: ");
		num = sc.nextInt();
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
		System.out.println("Entre 1 y " + num + " hay " + cont + " primos.");
		
		
		sc.close();
	}
}