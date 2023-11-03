package condicionales;
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		//Pide un número del 1-99 y lo devuelve en formato texto.
		
		// Variables
		Scanner sc = new Scanner(System.in);
		int n; //recoge el número del usuario
		String unidades = "", decenas = "";//recogen las unidades y las decenas en una cadena de texto
		//pedir datos por consola
		System.out.print("Introduce un número entre 1 y 99: ");
		n = sc.nextInt();//escaner
		
		//asigna un string a las unidades de un número, para saber la unidad se calcula el modulo de 10
		switch(n % 10) {
			case 1 ->
			unidades = "uno";
			case 2 ->
			unidades = "dos";
			case 3 ->
			unidades = "tres";
			case 4 ->
			unidades = "cuatro";
			case 5 ->
			unidades = "cinco";
			case 6 ->
			unidades = "seis";
			case 7 ->
			unidades = "siete";
			case 8 ->
			unidades = "ocho";
			case 9 ->
			unidades = "nueve";
		}//fin
		//en este caso dividimos entre 10 para saber las decenas y así asignarle a estas un valor al string decenas
		switch(n/10) {
			//si es 0 nos da nada "" ya que no hay decenas
			case 0:
				decenas = "";
				break;
			case 1:
				//este switch es para las excepciones del 10, en el cual se calcula el modulo de 10 para ver que número es y asignarle el valor
				switch(n%10) {
					case 0:
						decenas = "diez";
						break;
					case 1:
						decenas = "once";
						break;
					case 2:
						decenas = "doce";
						break;
					case 3:
						decenas = "trece";
						break;
					case 4:
						decenas = "catorce";
						break;
					case 5:
						decenas = "quince";
						break;
					default:
						decenas = "dieci";
						break;
				}//fin
				break;
			case 2:
				//switch para el 20 y sus excepciones
				switch(n%10) {
					case 0:
						decenas = "veinte";
						break;
					default:
						decenas = "veinti";
						break;
				}//fin
			break;
			case 3:
				decenas = "treinta";
				break;
			case 4:
				decenas = "cuarenta";
				break;
			case 5:
				decenas = "cincuenta";
				break;
			case 6:
				decenas = "sesenta";
				break;
			case 7:
				decenas = "setenta";
				break;
			case 8:
				decenas = "ochenta";
				break;
			case 9:
				decenas = "noventa";
				break;
		}
		
		//ahora que está asignado el texto a su variable correspondiente empieza el if para ver que devuelve la consola
		//si se cumple la condición devuelve decenas y unidades, en caso de ser menor de 10 al asignarsele a las decenas "" se queda vacío
		//solo mostrando las unidades
		if ((n<=10 || n>15) && n<=30 || n%10==0) {
			System.out.println(decenas + unidades);
		//para los casos especiales del 11-15
		}else if (n>10 && n<=15) {
			System.out.println(decenas);
		//numeros mayores de 30 que no acaben en 0
		}else
			System.out.println(decenas + " y " + unidades);
		
		sc.close();//cierre escaner
	}
	
}
