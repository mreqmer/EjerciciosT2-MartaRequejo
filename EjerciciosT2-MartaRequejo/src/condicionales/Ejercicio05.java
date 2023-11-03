package condicionales;
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
		//Calcula valor absoluto
		
		// Variables
		Scanner sc = new Scanner(System.in);
		// n recoge el valor del usuario y absol donde se calcula el valor absoluto del número
		int n, absol = 0;
		//pedir el numero al usuario
		System.out.println("Introduce un número");
		n = sc.nextInt();//escaner
		
		//comprueba si es mayor de 0, en caso true devuelve el mismo número, en caso false lo multiplica por -1 para pasarlo a positivo
		absol = (n>0) ? n : n*-1 ;
		//devuelve por consola el numero absoluto del numero introducido
		System.out.println("|"+ n + "| = " + absol);
		
		sc.close();
	}
}

