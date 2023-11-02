package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Programa que te asigna una letra a tu número de DNI
		
		Scanner sc = new Scanner(System.in);//Scanner
		//constante 
		final int MODULO = 23;
		// Variables
		int dni;//Guarda el dni administrado por el usuario
		int numLetra;//guarda el resultado de una operacion
		String letra=null;//guarda la letra que se le asignará al DNI
		
		//Pedir DNI al usuario
		System.out.print("Introduce el DNI para asignarle una letra: ");
		dni = sc.nextInt();
		//if que comprueba el rango válido de un número de DNI
		if (dni>0 && dni <= 99999999) {
		numLetra= dni%MODULO;
			switch (numLetra) {
				case 0 ->
					letra = "T";
				case 1 ->
					letra = "R";
				case 2 ->
					letra = "W";
				case 3 ->
					letra = "A";
				case 4 ->
					letra = "G";
				case 5 ->
					letra = "M";
				case 6 ->
					letra = "Y";
				case 7 ->
					letra = "F";
				case 8 ->
					letra = "P";
				case 9 ->
					letra = "D";
				case 10 ->
					letra = "X";
				case 11 ->
					letra = "B";
				case 12 ->
					letra = "N";
				case 13 ->
					letra = "J";
				case 14 ->
					letra = "Z";
				case 15 ->
					letra = "S";
				case 16 ->
					letra = "Q";
				case 17 ->
					letra = "V";
				case 18 ->
					letra = "H";
				case 19 ->
					letra = "L";
				case 20 ->
					letra = "C";
				case 21 ->
					letra = "K";
				case 22 ->
					letra = "E";
		}//fin switch
			System.out.println("Para el dni " + dni + " le corresponde la letra " + letra);
		}else {
			System.out.println("Error");
		}
		sc.close();
	}

}
