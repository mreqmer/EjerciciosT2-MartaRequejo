package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Variables
		/*
		* ENTRADA: -4520 | RES. ESPERADO: El número tiene 4 dígitos.| RES. OBTENIDO: El número tiene 4 dígitos.
		* ENTRADA: -21   | RES. ESPERADO: El número tiene 2 dígitos.| RES. OBTENIDO: El número tiene 2 dígitos.		
		* ENTRADA: 120   | RES. ESPERADO: El número tiene 3 dígitos.| RES. OBTENIDO: El número tiene 3 dígitos.
		* ENTRADA: 2     | RES. ESPERADO: El número tiene 1 dígito. | RES. OBTENIDO: El número tiene 1 dígito.
		*/
		Scanner sc = new Scanner(System.in);
		//Registra el número a introducir
		int n;
		//cuenta las iteraciones del bucle
		int cont=0;

		//pide un número al usuario
		System.out.print("Introduce un número: ");
		n = sc.nextInt(); 
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

