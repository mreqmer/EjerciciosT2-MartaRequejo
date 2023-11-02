package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int a, b, mayor;
		int multiploA=0, multiploB=0;
		int i;
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
			
		for ( i=mayor; i>=1;i++) {
			multiploA = a*i;
			multiploB = b*i;
					
			if((multiploA)==(multiploB)) {
				break;
			}
			
		}
		System.out.println(multiploA);
		}
	}

}
