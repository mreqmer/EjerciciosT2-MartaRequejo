package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//El programa comprueba si un número comprendido entre 0 y 9999 es capicúa o no, por ejemplo
		//1221 si lo invertimos es 1221, por tanto es capicúa. Tanbién lo son los números de 1 dígito
		// Variables
		Scanner sc = new Scanner(System.in);
		int n1;//Recoge el número introducido por el usuario
		int copia, resto = 0, invertido=0;
		//Pedir datos al usuario
		System.out.print("Introduce un número comprendido entre 0 y 9999: ");
		n1 = sc.nextInt(); 
		//condicional para ver si el número está comprendido entre 0 y 9999, sino mensaje de error
		if (n1>=0 && n1<=9999) {
			//copia n1 en copia
			copia = n1;
			//bucle para hacer las operaciones hasta que el último dígito no sea 0
			while(copia!=0) {
			//resto guarda el último dígito	de copia
			resto = copia%10;
			//invertido se multiplica *10 y se le suma resto, actualizandose invertdio
			invertido=invertido*10+resto;
			//se divide copia entre 10 para ir quitando dígitos
			copia = copia/10;
			}//fin del bucle
			//este condicional comprueba de que si n1 es igual a invertido es capicua si n1 es distinto a invertido
			if(n1 == invertido) {	
				System.out.println(n1 + " es igual a su invertido, por tanto es capicúa.");
			}else {
				System.out.println(n1 + " no es igual a su invertido (" + invertido + ") por tanto no es capicúa.");
			}//fin de la comprobación del capicúa
		}else {//mensaje de error
			System.err.println("ERROR.");
			System.out.println("Introdude un número comprendido entre 0 y 9999.");
		}//fin del if
		sc.close();
	}

}