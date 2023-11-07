package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 *ENTRADA:                             | ENTRADA:                        
		 *Introduce un número inicial: 20      | Introduce un número inicial: 0
         *Introduce un número: 12              | Introduce un número: 0
         *Fallo es menor.                      |
         *Introduce un número: 21              |   
         *Introduce un número: 0               |  
         *Fallo es menor.                      | 
		 *RES. ESPERADO:                       | RES. ESPERADO: 
		 *Total de números introducidos: 3     | Total de números introducidos: 1  
         *Total fallados: 1                    | Total fallados: 0
		 *RES. OBTENIDO:                       | RES. OBTENIDO:   
		 *Total de números introducidos: 3     | Total de números introducidos: 1  
         *Total fallados: 1                    | Total fallados: 0
		 */
		//Variables
		Scanner sc = new Scanner(System.in);
		//numero inicial introducido
		int inicial;
		//numeros introducidos
		int n;
		//guarda el último número mayor introducido
		int mayor;
		//contador de números introducidos
		int i =0;
		//contador de fallos
		int fallo=0;
		//pedir número inicial por consola
		System.out.print("Introduce un número inicial: ");
		inicial = sc.nextInt(); 
		//iguala mayor al inicial
		mayor=inicial;

		do{
			//Cada iteración cuenta +1 al contador de números y pide otro 
			i++;
			System.out.print("Introduce un número: ");
		    n = sc.nextInt();
		    //Si es mayor lo guarda en la variable, sino da mensaje de fallo y cuenta fallo++
		    if(n>mayor){
		    	mayor=n;
		    //break para que no cuente 0 como falle y salga del bucle	
		    }else if(n==0) {
		    	break;
		    }else{
		    	System.out.println("Fallo es menor.");
		    	fallo++;
		    }
		//hasta que el número introducido es 0    
		}while (n!=0);
		//devuelve el número de números y los errores
		System.out.println("Total de números introducidos: "+ i);
		System.out.println("Total fallados: "+ fallo);
		sc.close();//cierre escaner
	}
}

