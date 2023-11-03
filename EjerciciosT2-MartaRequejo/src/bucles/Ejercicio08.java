package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int inicial;
		int n; int mayor;
		int i =0;
		int fallo=0;

		System.out.print("Introduce un número inicial: ");
		inicial = sc.nextInt(); 
		mayor=inicial;

		do{
			i++;
			System.out.print("Introduce un número: ");
		    n = sc.nextInt();
		    if(n>mayor){
		    	mayor=n;
		    }else if (n==0){
		     	break;
		    }else{
		    	System.out.println("Fallo es menor.");
		    	fallo++;
		    }
		}while (n!=0);

		System.out.println("Total de números introducidos: "+ i);
		System.out.println("Total fallados: "+ fallo);
		sc.close();
	}
}

