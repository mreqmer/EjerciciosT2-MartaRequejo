package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Variables
		/*
		* ENTRADA: -4520 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		* ENTRADA: -21   | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		* ENTRADA: q     | RES. ESPERADO: Error. Introduce un número positivo | RES. OBTENIDO: Error. Introduce un número positivo
		* ENTRADA: 120   | RES. ESPERADO: El número tiene 3 dígitos.| RES. OBTENIDO: El número tiene 3 dígitos.
		* ENTRADA: 2     | RES. ESPERADO: El número tiene 1 dígito. | RES. OBTENIDO: El número tiene 1 dígito.
		*/
		Scanner sc = new Scanner(System.in);
		//Registra el número a introducir
		int n=-1;
		//cuenta las iteraciones del bucle
		int cont=0;

		//pide un número al usuario y comprueba que es válido
		do {
			try{
				System.out.print("Dime un número positivo: ");
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un número positivo");	
				sc.nextLine();
			}
		}while(n<1);
		//va diividiendo en un bucle /10 hasta que llega a 0 y cuenta las iteraciones
		while(n!=0){
			cont++;
			n=n/10; 
		}
		
		//devuelve el número de dígitos al usuario
		if(cont>1){
			System.out.println("El número tiene " + cont + " dígitos."); 
		}else System.out.println("El número tiene " + cont + " dígito.");
		sc.close();//cierre de escaner
	}
}

