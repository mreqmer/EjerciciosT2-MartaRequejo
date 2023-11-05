package condicionales;
import java. util.Random;
import java.util.Scanner;
public class Ejercicio06 {
	
	public static void main(String[] args) {
		//Genera dos numeros aleatorios y pide al usuario que los sume, luego le dice si es o no correcto
		
		/*
		 *EJEMPLO: 36 + 98 = | ENTRADA: 5  | RES. ESPERADO: Incorrecto.  | RES. OBTENIDO: Incorrecto.
		 *EJEMPLO: 30 + 38 = | ENTRADA: 68 | RES. ESPERADO: CORRECTO!!!. | RES. OBTENIDO: CORRECTO!!!
		 *EJEMPLO: 47 + 30 = | ENTRADA: -2 | RES. ESPERADO: Incorrecto.  | RES. OBTENIDO: Incorrecto.
		 */
		
		// Variables
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//guardan, respectivamente, la suma que introduce el usuario y la suma real de los dos números generados
		int sumaUsuario, suma = 0;
		int r1 = rand.nextInt(1,100);//primer número random
		int r2 = rand.nextInt(1,100);//segundo número random
		//pide la suma del usuario
		System.out.print("Suma estos números: \n" + r1 + " + " + r2 + " = ");
		sumaUsuario = sc.nextInt();//escaner
		//suma real de los dos números random
		suma = r1+ r2;
		//comprueba si es correcto o no lo es
		if(sumaUsuario == suma ) {
			System.out.println("CORRECTO!!!");
		}else
			System.out.println("Incorrecto.");
		sc.close();
	}
}
