package identificadoresEnClases_1;

import java.util.Scanner;

public class OperarConVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1=5;
		int numero2=15;
		int numero3=10;
		
		int resultadoSuma= numero1+numero2+numero3;
		int resultadoResta = numero3 - numero1;
		
		
		//System.out.println(resultadoSuma);
		System.out.println("elige 1: para mostrar la suma");
		System.out.println("elige 2: para mostrar la resta");
		int calcula =scanner.nextInt(); //recoge el scanner el marcado del teclado
		
		
		switch(calcula) {
		case 1:
			System.out.println("la suma da: " + resultadoSuma);
			break;
		case 2: 
			System.out.println("la resta da: " +resultadoResta);
			break;
		
		default: System.out.println("error, elige 1 para la suma y 2 para la resta");
		}
		

	}

}
