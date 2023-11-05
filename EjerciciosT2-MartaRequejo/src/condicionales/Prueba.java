package condicionales;
import java.util.Scanner;
public class Prueba {
	public static void main(String[] args) {
		//Pide un número del 1-99 y lo devuelve en formato texto.
		/*
		 * ENTRADA: -5 | RES. ESPERADO: Error. | RES. OBTENIDO: Error.
		 * ENTRADA: 50000 | RES. ESPERADO: Error. | RES. OBTENIDO: Error.
		 * ENTRADA: 5 | RES. ESPERADO: Es capicúa | RES. OBTENIDO: Es capicúa
		 * ENTRADA: 25 | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * ENTRADA: 22 | RES. ESPERADO: Es capicúa | RES. OBTENIDO:Es capicúa
		 * ENTRADA: 122 | RES. ESPERADO: No es capicúa | RES. OBTENIDO: No es capicúa
		 * ENTRADA: 212 | RES. ESPERADO: Es capicúa | RES. OBTENIDO: Es capicúa
		 * 
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		int n; //recoge el número del usuario
		String unidades = "", nCadena;//recogen las unidades y las decenas en una cadena de texto
		int primerN, ultimoN;
		
		//pedir datos por consola
		System.out.print("Introduce un número entre 1 y 99: ");
		n = sc.nextInt();//escaner
		
		primerN=n%10;
		ultimoN=n/10;
		
		//asigna un string a las unidades de un número, para saber la unidad se calcula el modulo de 10
		switch(primerN) {
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
		nCadena = switch(ultimoN) {
			//si es 0 nos da nada "" ya que no hay decenas
			
			case 1 ->
				//este switch es para las excepciones del 10, en el cual se calcula el modulo de 10 para ver que número es y asignarle el valor
					switch(primerN) {
					case 0-> "diez";
					case 1-> "once";
					case 2-> "doce";
					case 3-> "trece";
					case 4-> "catorce";
					case 5-> "quince";
					default-> "dieci" + unidades;
				};
			case 2->
				//switch para el 20 y sus excepciones
				switch(primerN) {
					case 0-> "veinte";
					default-> "veinti" + unidades;
				};
			case 3->
				switch(primerN) {
					case 0-> "treinta";
					default-> "treinta y " + unidades;
				};
			case 4->
				switch(primerN) {
					case 0-> "cuarenta";
					default-> "cuarenta y " + unidades;
				};
			case 5->
				switch(primerN) {
					case 0-> "cincuenta";
					default-> "cincuenta y " + unidades;
				};
			case 6->
				switch(primerN) {
					case 0-> "sesenta";
					default-> "sesenta y " + unidades;
				};
			case 7->
				switch(primerN) {
					case 0-> "setenta";
					default-> "setenta y " + unidades;
				};
			case 8->
				switch(primerN) {
					case 0-> "ochenta";
					default-> "ochenta y " + unidades;
				};
			case 9->
				switch(primerN) {
					case 0-> "noventa";
					default-> "noventa y " + unidades;
				};
			default -> unidades;
		};
		
		System.out.println(nCadena);
		
		sc.close();//cierre escaner
	}
	
}