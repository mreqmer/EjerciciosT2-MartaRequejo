package bucles;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int a, b, menor;
		int i;
		
		do {	
		System.out.print("Introduce el primer número: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		b = sc.nextInt();
		}while (a<0 || b<0);
		
		if(a>b) {
			menor=b;
		}else {
			menor=a;
		}
		for (i=menor; i>=2;i--) {
			if(a%i==0 && b%i==0) {
				break;
			}
		}
		
		System.out.println(i);
		sc.close();
	}

}
