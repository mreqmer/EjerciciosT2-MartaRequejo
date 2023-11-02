package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int hora;
		int min;
		int sec;
		int i;
		
		System.out.print("Hora: ");
		hora = sc.nextInt();
		System.out.print("Minutos: ");
		min = sc.nextInt();
		System.out.print("Segundos: ");
		sec = sc.nextInt();
		System.out.print("Segundos a incrementar: ");
		i = sc.nextInt();
		
		for (int n=0; n<i; n++) {
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
