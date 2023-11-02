package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int num;
		int asterisco;
		int contAst=0;
		int espacio;
		
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		
		for (int n=num; n>0; n--) {
		System.out.println(" ");
		asterisco=0;
		contAst++;
		espacio=n-1;
		while(espacio!=0) {
			System.out.print(" ");
			espacio--;
		}
		while(contAst!=asterisco) {
			System.out.print("* ");
			asterisco++;
		}
	}
		sc.close();
	}

}
