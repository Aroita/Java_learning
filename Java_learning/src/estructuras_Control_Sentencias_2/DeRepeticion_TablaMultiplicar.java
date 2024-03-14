package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class DeRepeticion_TablaMultiplicar {

	public static void Tabla(int num) {
		//PRACTICO 3: llama a una funcion e imprime por pantalla la tabla de multiplicar
		//del numero pasado como parametro
		System.out.println("--------- EJERCICIO PRACTICO 3 ---------");
		System.out.println(" #####  tabla de multiplicar del: " + num + " ##### ");
						
		//sabemos que por general se multiplica hasta el 10, si cuenta el 0 ponemos 11
		for(int i=0; i<11; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		
	}

				
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mostrar la tabla de multiplicar del nº:  ");
		int num = scanner.nextInt();
		
		
		//llamamos a la funcion Tabla que lleva el for
		DeRepeticion_TablaMultiplicar.Tabla(num);
			

	}
}


