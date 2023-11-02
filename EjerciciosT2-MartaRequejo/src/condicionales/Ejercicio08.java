package condicionales;
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		//calcula el precio del viaje de un cliente
		// Variables
		Scanner sc = new Scanner(System.in);
		//constantes que guardan la tarifa por km y el descuento que se aplica con unas condiciones dadas, respectivamente
		double TARIFA = 2.5, DESCUENTO = 0.3;
		//guarda los dias de estancia del usuario
		int estancia;
		//guarda la distancia que va a recorrer el usuario y el precio que pagará, el cual se calcula luego
		double distKm, precio = 0;
		//le pide al usuario el tiempo de estancia y cuando recorrerá
		System.out.print("Tiempo de estancia: ");
		estancia = sc.nextInt();
		System.out.print("Km recorridos:");
		distKm = sc.nextDouble();
		
		//si se queda mas de 7 dias y recorre mas de 800km se le aplicará un descuento al precio
		if (estancia > 7 && distKm > 800) {
			precio = (TARIFA * distKm) - (TARIFA * distKm)*DESCUENTO;
		//si no el precio es el normal sin ningun tipo de descuento
		}else {
			precio = (TARIFA * distKm);
		}
		//le devuelve el precio al usuario
		System.out.println("Su precio son: " + precio+ "€");
		sc.close();
	}
}
