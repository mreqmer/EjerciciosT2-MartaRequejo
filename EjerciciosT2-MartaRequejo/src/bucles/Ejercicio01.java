package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: Hora: 25 Minutos: 12 Segundos: 00 Segundos a incrementar: 2 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: Hora: 22 Minutos: 68 Segundos: 00 Segundos a incrementar: 3 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: Hora: 21 Minutos: 12 Segundos: 69 Segundos a incrementar: 4 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: Hora: 21 Minutos: 12 Segundos: 40 Segundos a incrementar:-1 | RES. ESPERADO: vuelve a preguntar | RES. OBTENIDO: vuelve a preguntar
		 * ENTRADA: Hora: 21 Minutos: 12 Segundos: 40 Segundos a incrementar: k | RES. ESPERADO: Error. Introduce un valor numérico positivo | RES. OBTENIDO: Error. Introduce un valor numérico positivo
		 * ENTRADA: Hora: 20 Minutos: 58 Segundos: 20 Segundos a incrementar:20 | RES. ESPERADO: 20:58:40 | RES. OBTENIDO: 20:58:40 
		 * ENTRADA: Hora: 13 Minutos: 50 Segundos: 40 Segundos a incrementar:80 | RES. ESPERADO: 13:52:00 | RES. OBTENIDO: 13:52:00
		 * ENTRADA: Hora: 13 Minutos: 59 Segundos: 35 Segundos a incrementar:150| RES. ESPERADO: 14:02:05 | RES. OBTENIDO:14:02:05
		 * 
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//Guarda la hora, los minutos y los segundos
		int hora= -1, min=-1, sec=-1;
		//Guarda los segundos a incrementar
		int n = -1;
		//Pedir datos para escanearlos y comprueba datos válidos
		do {
			try {
				System.out.print("Hora, valor entre [0-23] : ");
				hora = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error. introduce un valor numérico entre [0-23]");
				sc.nextLine();
			}
		}while (hora<0 || hora > 23);	
		
		do {
			try {
				System.out.print("Minutos, valor entre [0-59] : ");
				min = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error de minutos, introduce un valor numérico entre [0-59]");
				sc.nextLine();
			}
		}while (min<0 || min > 59);
		
		do {
			try {
				System.out.print("Segundos, valor entre [0-59] : ");
				sec = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error de segundos, introduce un valor numérico entre [0-59]");
				sc.nextLine();
			}
		}while (sec<0 || sec > 59);
		
		do {
			try {
				System.out.print("Segundos a incrementar (valor positivo): ");
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error, introduce un número positivo.");
				sc.nextLine();
			}
		}while (n<0);
		
			//bucle para incrementar los segundos, min y horas
		for (int i=0; i<n; i++) {
			sec++;
			if (sec>=60) {
				sec = 00;
				min += 1;
				if(min>=60) {
					min = 00;
					hora += 1;
					if(hora>=24) {
						hora = 00;
					}//if hora
				}//if min
			}//if sec
		}//for
		//Una vez hecho el calculo devuelve la hora sumada	
		System.out.println(hora + ":" + min + ":" + sec);	
		sc.close();
	}

}
