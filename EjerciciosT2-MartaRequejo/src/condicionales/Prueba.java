package condicionales;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int hora;
		int min;
		int sec;
		int n;
		
		System.out.print("Hora: ");
		hora = sc.nextInt();
		System.out.print("Minutos: ");
		min = sc.nextInt();
		System.out.print("Segundos: ");
		sec = sc.nextInt();
		System.out.print("Segundos a incrementar: ");
		n = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			sec++;
			if (sec>=59) {
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
			
		System.out.println(hora + ":" + min + ":" + sec);
		sc.close();
	}

}
