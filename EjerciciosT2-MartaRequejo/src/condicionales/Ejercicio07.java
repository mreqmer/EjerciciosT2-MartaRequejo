package condicionales;
import java.time.LocalTime;
public class Ejercicio07 {
	public static void main(String[] args) {
		// Variables
		LocalTime horaActual = LocalTime.now();
		
		int hora = horaActual.getHour();
		int min = horaActual.getMinute();
		int sec = horaActual.getSecond();
		/* Lineas de prueba
		int hora=1;
		int min=59;
		int sec=59;
		*/
		System.out.println("Son las: " + hora + ":" + min + ":" + sec);
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
		}else
			sec += 1;
		
		System.out.println("La hora más un segundo es: " + hora + ":" + min + ":" + sec);
	}
}

