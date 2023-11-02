package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n;
		int numero=0;
		int contNum=1;
		System.out.print("Introduzca un número: ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			numero++;
			contNum=1;
			System.out.println(" ");
			while(contNum<=numero) {
				System.out.print(numero + " ");
				contNum++;
			}
		}
		sc.close();
	}

}
