package condicionales;
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		//calcula el precio del viaje de un cliente
		
		/*
		 * ENTRADA: Tiempo de estancia: 0 Km recorridos: 5 | RES. ESPERADO: Su precio es de: 12.5€ | RES. OBTENIDO: Su precio es de: 12.5€
		 * ENTRADA: Tiempo de estancia: 7 Km recorridos: 5 | RES. ESPERADO: Su precio es de: 12.5€ | RES. OBTENIDO: Su precio es de: 12.5€
		 * ENTRADA: Tiempo de estancia: 8 Km recorridos: 5 | RES. ESPERADO: Su precio es de: 12.5€ | RES. OBTENIDO: Su precio es de: 12.5€
		 * ENTRADA: Tiempo de estancia: 7 Km recorridos: 900 | RES. ESPERADO: Su precio es de: 2250.0€ | RES. OBTENIDO: Su precio es de: 2250.0€
		 * ENTRADA: Tiempo de estancia: 8 Km recorridos: 900 | RES. ESPERADO: Su precio es de: 1575.0€ | RES. OBTENIDO: Su precio es de: 1575.0€
		 */
		
		// Variables
		Scanner sc = new Scanner(System.in);
		//constantes que guardan la tarifa por km y el descuento que se aplica con unas condiciones dadas, respectivamente
		double TARIFA = 2.5, DESCUENTO = 0.3;
		//guarda los dias de estancia del usuario
		int estancia;
		//guardan la distancia que va a recorrer el usuario y el precio que pagará
		double distKm, precio = 0;
		//le pide al usuario el tiempo de estancia y cuando recorrerá
		System.out.print("Tiempo de estancia: ");
		estancia = sc.nextInt();
		System.out.print("Km recorridos: ");
		distKm = sc.nextDouble();
		
		//comprueba los valores esten dentro del rango
		if (estancia>=0 && distKm >0) {
			//si se queda más de 7 dias y recorre más de 800km se le aplicará un descuento al precio
			if (estancia > 7 && distKm > 800) {
				precio = (TARIFA * distKm) - (TARIFA * distKm)*DESCUENTO;
			//si no el precio es el normal sin ningun tipo de descuento
			}else {
				precio = (TARIFA * distKm);
			}
			//le devuelve el precio al usuario
			System.out.println("Su precio es de: " + precio+ "€");
		//mensaje de error
		}else {
			System.out.println("Error. Algún valor es incorrecto.");
		}
		
		sc.close();
	}
}
