package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Variables
		
		Scanner sc = new Scanner(System.in);
		int n;
		int cont=0;

		
		do{
			System.out.print("Introduce un número: ");
			n = sc.nextInt(); 
		}while(n<=0);{
			while(n!=0){
				cont++; n=n/10; 
			}
		}	
	
		if(cont>1){
			System.out.println("El número tiene " + cont + " dígitos."); 
		}else System.out.println("El número tiene " + cont + " dígito.");
		sc.close();
	}
}

