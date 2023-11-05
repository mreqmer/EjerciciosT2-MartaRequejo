package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int a, b, mayor;
		int mcm;
		do {	
			System.out.print("Introduce el primer número: ");
			a = sc.nextInt();
			System.out.print("Introduce el segundo número: ");
			b = sc.nextInt();
			}while (a<0 || b<0);
		
		if(a>b) {
			mayor=a;
		}else {
			mayor=b;
		}
		
		
		for ( mcm=mayor; mcm>=1;mcm++) {
				
			if(mcm % a == 0&& mcm%b==0) {
				break;
			}
		}
		
		System.out.println(mcm);
		
		sc.close();
		}
		
	}
