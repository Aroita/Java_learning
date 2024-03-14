package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class DeSeleccion_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//practico1: introduce un nº por teclado y muestra un color:
		//1.blanco, 2.negro, 3.rojo, 4.azul, otro numero: desconocido
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------- practico 1 ------------");
		
		System.out.println("selecciona: 1.blanco, 2.negro, 3.rojo, 4.azul");
		int opcion = scanner.nextInt();
		
		switch(opcion) {
		
		case 1: 
			System.out.println("1.Blanco");
			break;
		case 2:
			System.out.println("2.Negro");
			break;
		case 3: 
			System.out.println("3. Rojo");
			break;
		case 4:
			System.out.println("4.Azul");
			break;
		default:
			System.out.println("Numero desconocido");
		}
		
		//practico2: introduce 2 numeros por teclado, despues introduce un nº 
		//para seleccionar una operacion: 1.sumar, 2.restar, 3.multiplicae, 4.dividir, otro nº salir
		System.out.println("----------------------------- practico 2 ------------");
		
		
	
		
		//1º declarar las variables:
		//y  pasamos scanner que recoga el valor por teclado
		System.out.println("---- escribe un numero ------------");
		int numeroTecla1 = scanner.nextInt();
		System.out.println("---- escribe otro numero ------------");
		int numeroTecla2 = scanner.nextInt();
		
		
		System.out.println("---- Elige operar: \n 1.Suma \n 2.Resta \n 3.Multiplica \n 4.Divide \n --Otro nº SALIR--");
		int operar = scanner.nextInt();

		switch(operar) {
		case 1:
			int suma = numeroTecla1 + numeroTecla2;
			System.out.println("Total de la suma: " + suma);
			break;
		case 2:
			int resta = numeroTecla1 - numeroTecla2;
			System.out.println("Total de la resta: " + resta);
			break;
		case 3:
			int multiplica = numeroTecla1 * numeroTecla2;
			System.out.println("Total de la multiplicacion: " + multiplica);
			break;
		case 4: 
			if(numeroTecla2 == 0) {
				System.out.println("infinito al dividir el 2º numero con 0");
			}else {
			int divide = numeroTecla1 / numeroTecla2;
			System.out.println("Total de la division: " + divide);
			}
			break;
		default: 
			System.out.println("salida del programa");

		};	
		
		scanner.close();
		
		
		
		

	}

}
