package condicionales;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int hora;
		int min;
		int sec;
		

		System.out.print("Hora: ");
		hora = sc.nextInt();
		System.out.print("Minutos: ");
		min = sc.nextInt();
		System.out.print("Segundos: ");
		sec = sc.nextInt();
		if ((hora>=0&&hora<=23)&&(min>=0&&min>=59)&&(sec>=0&&sec>=59)) {
			if (sec==59) {
				sec = 00;
				min += 1;
				if(min==60) {
					min = 00;
					hora += 1;
					if(hora==24) {
						hora = 00;
					}
				}
		System.out.println("La hora más un segundo es: " + hora + ":" + min + ":" + sec);
			}else
				sec += 1;
		}else
			System.out.println("ERROR.");
	
		sc.close();
	}
}

