package condicionales;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		//Suma 1 segundo a una hora dada
		/*
		 * ENTRADA: Hora: 25 Minutos: 12 Segundos: 00 | RES. ESPERADO: ERROR. Hora incorrecta. | RES. OBTENIDO: ERROR. Hora incorrecta.
		 * ENTRADA: Hora: 22 Minutos: 68 Segundos: 00 | RES. ESPERADO: ERROR. Hora incorrecta. | RES. OBTENIDO: ERROR. Hora incorrecta.
		 * ENTRADA: Hora: 21 Minutos: 12 Segundos: 69 | RES. ESPERADO: ERROR. Hora incorrecta. | RES. OBTENIDO: ERROR. Hora incorrecta.
		 * ENTRADA: Hora: 20 Minutos: 58 Segundos: 19 | RES. ESPERADO: La hora más un segundo es: 20:58:20 | RES. OBTENIDO: La hora más un segundo es: 20:58:20
		 * ENTRADA: Hora: 13 Minutos: 50 Segundos: 59 | RES. ESPERADO: La hora más un segundo es: 13:51:00 | RES. OBTENIDO: La hora más un segundo es: 13:51:00
		 * ENTRADA: Hora: 13 Minutos: 59 Segundos: 59 | RES. ESPERADO: La hora más un segundo es: 14:00:00 | RES. OBTENIDO:La hora más un segundo es: 14:00:00
		 * 
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		//guarda la hora, los minutos y los segundos del usuario
		int hora, min, sec;	

		//escanea las horas, minutos y segundos del usuario
		System.out.print("Hora: ");
		hora = sc.nextInt();
		System.out.print("Minutos: ");
		min = sc.nextInt();
		System.out.print("Segundos: ");
		sec = sc.nextInt();
		//suma de 1 segundo a la hora introducida y comprueba que sea una hora válida
		if ((hora>=0&&hora<=23)&&(min>=0&&min<=59)&&(sec>=0&&sec<=59)) {
			sec++;
			if (sec==60) {
				sec = 00;
				min ++;
				if(min==60) {
					min = 00;
					hora ++;
					if(hora==24) {
						hora = 00;
					}
				}
			}
		//devuelve la hora sumada
		System.out.println("La hora más un segundo es: " + hora + ":" + min + ":" + sec);
		//si está fuera de rango devuelve error	
		}else {
			System.out.println("ERROR. Hora incorrecta.");
		}
	
		sc.close();
	}
}

