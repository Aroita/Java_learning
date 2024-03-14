package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class DeRepeticion_Do_While {

	public static void main(String[] args) {
		
		// DO WHILE: ejecuta al menos una vez, 
		/*
		//PRACTICO 1: 
		System.out.println("--------- EJERCICIO PRACTICO 1 ---------");
		
		int i =1;
		do {         //primero ejecuta el bloque de instruccion 
			System.out.println("iteracción: " + i);
			i++;  //va sumando 1, si cumple la condicion
		}while(i<0);  //y luego la condicion(si es V se repite, si es F no se repite
		
		};
		
		
		
		//PRACTICO 1: crea un menu como el ejemplo de switch de sumas y restas 
		//y repitelo hasta que la opcion salida sea 0
		System.out.println("--------- EJERCICIO PRACTICO 1 ---------");
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("escribe un nº");
		num1 = scanner.nextInt();
		
		System.out.println("escribe un nº");
		num2 = scanner.nextInt();

		int operar;
		
		do {
			System.out.println("Menu: \n 1.Sumar, \n 2.Restar, \n 3.Multiplicar, \n 4.Dividir, \n 0.Salir");
			operar = scanner.nextInt();
			
			switch(operar) {
			case 1:
				int suma = num1 + num2;
				System.out.println("Total de la suma: " + num1 + " + " + num2 +" =" + suma);
				break;
			case 2:
				int resta = num1 - num2;
				System.out.println("Total de la resta: "+ num1 + " - " + num2 +" =" + + resta);
				break;
			case 3:
				int multiplica = num1 * num2;
				System.out.println("Total de la multiplicacion: "+ num1 + " * " + num2 +" =" + + multiplica);
				break;
			case 4: 
				if(num2 == 0) {
					System.out.println("infinito al dividir el 2º numero con 0");
					break;
				}else {
				int divide = num1 / num2;
				System.out.println("Total de la division: " + num1 + " / " + num2 +" =" + divide);
				break;
				}
				
			default: 
				System.out.println("---salida del programa---");

			}	
			
		}while(operar != 0); 
		System.out.println("adios");
		
		scanner.close();
		*/
	
	
		//PRACTICO 2: usar metodo(funcion) y determina si el año es bisiesto o no
		System.out.println("--------- EJERCICIO PRACTICO 2 ---------");
		System.out.println("Años bisiestos");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escribe un año: ");
		int anio=scanner.nextInt();
		
		if(esBisiesto(anio)) {
			System.out.println("el año " + anio + " es bisiesto");
		}else {
			System.out.println(anio + " NO es bisiesto");
			
		}
		
	};//funcion 
		public static boolean esBisiesto(int anio){  //bisiesto cada 4 años
			boolean resultado;
			
			resultado = ((anio % 4 == 0) && (anio % 100 != 0) || anio % 400 ==0);
			return resultado;
				
		

	}
}


