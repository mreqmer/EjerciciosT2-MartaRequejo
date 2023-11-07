package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: Hora: 25 Minutos: 12 Segundos: 00 Segundos a incrementar: 2| RES. ESPERADO: ERROR. Valores incorrectos | RES. OBTENIDO: ERROR. Valores incorrectos
		 * ENTRADA: Hora: 22 Minutos: 68 Segundos: 00 Segundos a incrementar: 3| RES. ESPERADO: ERROR. Valores incorrectos | RES. OBTENIDO: ERROR. Valores incorrectos
		 * ENTRADA: Hora: 21 Minutos: 12 Segundos: 69 Segundos a incrementar: 4| RES. ESPERADO: ERROR. Valores incorrectos | RES. OBTENIDO: ERROR. Valores incorrectos
		 * ENTRADA: Hora: 21 Minutos: 12 Segundos: 40 Segundos a incrementar:-1 | RES. ESPERADO: ERROR. Valores incorrectos | RES. OBTENIDO: ERROR. Valores incorrectos
		 * ENTRADA: Hora: 20 Minutos: 58 Segundos: 20 Segundos a incrementar:20 | RES. ESPERADO: 20:58:40 | RES. OBTENIDO: 20:58:40 
		 * ENTRADA: Hora: 13 Minutos: 50 Segundos: 40 Segundos a incrementar:80 | RES. ESPERADO: 13:52:00 | RES. OBTENIDO: 13:52:00
		 * ENTRADA: Hora: 13 Minutos: 59 Segundos: 35 Segundos a incrementar:150| RES. ESPERADO: 14:02:05 | RES. OBTENIDO:14:02:05
		 * 
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//Guarda la hora, los minutos y los segundos
		int hora, min, sec;
		//Guarda los segundos a incrementar
		int n;
		//Pedir datos para escanearlos
		System.out.print("Hora: ");
		hora = sc.nextInt();
		System.out.print("Minutos: ");
		min = sc.nextInt();
		System.out.print("Segundos: ");
		sec = sc.nextInt();
		System.out.print("Segundos a incrementar: ");
		n = sc.nextInt();
		//comprueba si los números están en un rango correcto
		if((hora>=0 && hora<=23)&&(min>=0 && min<=59)&&(sec>=0 && sec<=59)&&(n>=0)){
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
						}
					}
				
				}
			}
		//Una vez hecho el calculo devuelve la hora sumada	
		System.out.println(hora + ":" + min + ":" + sec);
		//Si no está en rango mensaje de error
		}else
			System.out.println("ERROR. Valores incorrectos.");
			
		
		sc.close();
	}

}
