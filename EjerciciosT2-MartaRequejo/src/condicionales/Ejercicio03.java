package condicionales;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * ENTRADA: 2   2   0  | RES. ESPERADO: A cada animal le corresponden 1.0kg de comida. | RES. OBTENIDO: A cada animal le corresponden 1.0kg de comida.
		 * ENTRADA: 0   2   4  | RES. ESPERADO: No hay suficiente comida comprada. | RES. OBTENIDO: No hay suficiente comida comprada.
		 * ENTRADA: 5 | RES. ESPERADO: Es capicúa | RES. OBTENIDO: Es capicúa
		 * ENTRADA: 25 | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * 
		 * 
		 */
		
		// Variables
		Scanner sc = new Scanner(System.in);
		//guardan (en ese orden) la comida comprada, la comida, la restante y las raciones de cada animal
		double comprado, comido, restante = 0, racion = 0;
		int  animales;//numero de animales 
		System.out.print("Introduce la cantidad de comida comprada en kg: ");
		comprado = sc.nextDouble();//recoge la comida comprada
		System.out.print("Introduce el número de animales:");
		animales = sc.nextInt();//recoge cuantos animales hay
		System.out.print("Introduce los kg que han comido:");
		comido = sc.nextDouble();//recoge cuanto se han comido 
		//comprueba si lo comprado es menor a lo que comen para ver si hay que comprar mas
		if (comprado < comido && comprado >=0 ) {
			System.out.println("No hay suficiente comida comprada.");
		//ahora comprueba si existen animales, si han comido algo y si hay comida, sino da error	
		}else if (comprado > 0 && animales > 0 && comido >= 0) { 
		//calcula la comida restante
		restante = comprado - comido;
		//comprueba si queda comida restante
			if (restante > 0) {
				//calcula las raciones de cada animal y lo devuelve a la consola
				racion =(double) restante / animales;
				System.out.println("A cada animal le corresponden " + racion + "kg de comida.");
			}else {//si no queda lo muestra
				System.out.println("No queda comida restante.");
			}//fin if	
		//error si no se cumplen las condiciones
		}else {
			System.err.println("Error.");
		}//fin if principal
		sc.close();
	}

}
