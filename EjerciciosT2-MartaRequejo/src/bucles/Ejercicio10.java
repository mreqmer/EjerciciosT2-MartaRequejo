package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: -5 | RES. ESPERADO: vuelta de bucle | RES. OBTENIDO: vuelta de bucle
		 * ENTRADA: q | RES. ESPERADO: Error. Introduce un número positivo. | RES. OBTENIDO: Error. Introduce un número positivo.
		 * ENTRADA: 5 | RES. ESPERADO: Es capicúa | RES. OBTENIDO: Es capicúa
		 * ENTRADA: 25 | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * ENTRADA: 22 | RES. ESPERADO: Es capicúa | RES. OBTENIDO:Es capicúa
		 * ENTRADA: 122 | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * ENTRADA: 212 | RES. ESPERADO: Es capicúa | RES. OBTENIDO: Es capicúa
		 * ENTRADA: 9119 | RES. ESPERADO: Es capicúa | RES. OBTENIDO: Es capicúa
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		int n1=-1;//Recoge el número introducido por el usuario
		int copia, resto = 0, invertido=0;
		//Pedir datos al usuario y comprueba si es válido
		do {
			try {
				System.out.print("Introduce un número: ");
				n1 = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. Introduce un número positivo.");
				sc.nextLine();
			}
		}while(n1<1);
		//comprueba si el número está comprendido entre 0 y 9999, sino mensaje de error
		
		//copia n1 en copia
		copia = n1;
		//bucle para hacer las operaciones hasta que el último dígito no sea 0
		while(copia!=0) {
		//resto guarda el último dígito	de copia
		resto = copia%10;
		//invertido se multiplica *10 y se le suma resto, actualizandose invertido
		invertido=invertido*10+resto;
		//se divide copia entre 10 para ir quitando dígitos
		copia = copia/10;
		}//fin del bucle
		//comprueba si el número inicial es igual a su invertido y devuelve el mensaje correspondiente
		if(n1 == invertido) {	
			System.out.println(n1 + " es capicúa.");
		}else {
		System.out.println(n1 + " no es capicúa");
		}
		sc.close();//cierre de escaner
	}

}