package condicionales;
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		/*
		 * ENTRADA: 1  | RES. ESPERADO: uno             | RES. OBTENIDO: uno
		 * ENTRADA: 9  | RES. ESPERADO: nueve           | RES. OBTENIDO: nueve
		 * ENTRADA: 12 | RES. ESPERADO: doce            | RES. OBTENIDO: doce
		 * ENTRADA: 16 | RES. ESPERADO: dieciseis       | RES. OBTENIDO: dieciseis
		 * ENTRADA: 21 | RES. ESPERADO: veintiuno       | RES. OBTENIDO: veintiuno
		 * ENTRADA: 35 | RES. ESPERADO: treinta y cinco | RES. OBTENIDO: treinta y cinco
		 * ENTRADA: 50 | RES. ESPERADO: cincuenta       | RES. OBTENIDO: cincuenta
		 * ENTRADA: 99 | RES. ESPERADO: noventa y nueve | RES. OBTENIDO: noventa y nueve
		 * ENTRADA: -5 | RES. ESPERADO: Error.          | RES. OBTENIDO: Error.
		 */
		// Variables
		Scanner sc = new Scanner(System.in);
		int n; //recoge el número del usuario
		//recoge las unidades del número en texto y las añade si precisa a nCadena donde se guarda el número introducido escrito en String
		String unidades = "", nCadena;
		//se guardan el primer y último dígito del número introducido
		int ultimoN, primerN; 
		
		//pedir datos por consola
		System.out.print("Introduce un número entre 1 y 99: ");
		n = sc.nextInt();//escaner
		
		//comprueba que el número esté dentro del rango, sino error
		if(n>0 && n<100) {
			//calculo del primer y último dígito
			ultimoN=n%10;
			primerN=n/10;
			
			//asigna un string a las unidades de un número para convertirlas en texto
			switch(ultimoN) {
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
			}
			//convierte las decenas en texto y le añade las unidades en texto si precisa
			nCadena = switch(primerN) {
				case 1 ->
					//excepciones del 10
						switch(ultimoN) {
						case 0-> "diez";
						case 1-> "once";
						case 2-> "doce";
						case 3-> "trece";
						case 4-> "catorce";
						case 5-> "quince";
						default-> "dieci" + unidades;
					};
				case 2->
					switch(ultimoN) {
						case 0-> "veinte";
						default-> "veinti" + unidades;
					};
				case 3->
					switch(ultimoN) {
						case 0-> "treinta";
						default-> "treinta y " + unidades;
					};
				case 4->
					switch(ultimoN) {
						case 0-> "cuarenta";
						default-> "cuarenta y " + unidades;
					};
				case 5->
					switch(ultimoN) {
						case 0-> "cincuenta";
						default-> "cincuenta y " + unidades;
					};
				case 6->
					switch(ultimoN) {
						case 0-> "sesenta";
						default-> "sesenta y " + unidades;
					};
				case 7->
					switch(ultimoN) {
						case 0-> "setenta";
						default-> "setenta y " + unidades;
					};
				case 8->
					switch(ultimoN) {
						case 0-> "ochenta";
						default-> "ochenta y " + unidades;
					};
				case 9->
					switch(ultimoN) {
						case 0-> "noventa";
						default-> "noventa y " + unidades;
					};
				default -> unidades;
			};
			//mensaje de resultado al usuario
			System.out.println(nCadena);
		//mensaje de error si es mayor de 99 o menor de 0
		}else
			System.err.println("Error.");
		//cierre escaner
		sc.close();
	}
	
}