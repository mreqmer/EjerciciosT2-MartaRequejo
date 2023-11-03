package bucles;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int lineas;
		int contNum;
		System.out.print("Introduce un número:");
		lineas = sc.nextInt();
		for (int i = 1; i<=lineas; i++){
			contNum=1;
			System.out.println("");
			while (contNum<i){
					System.out.print(contNum + " ");
					contNum++;
			}
			while (contNum>=1){
				System.out.print(contNum + " ");
				contNum--;
			}
		}
		sc.close();
	} 
}

