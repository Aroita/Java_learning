package Arrays1;

import java.util.Scanner;

public class Array_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cuántos nº desea insertar?");
		
		int count = Integer.parseInt(scanner.nextLine()); //recoge el valor y lo guarda en count
		
		int[] numbers = new int[count]; //se almacena en la variable numbers
		
		for(int i=0; i < numbers.length; i++) {  
			System.out.println("escribe un nº ");
			numbers[i] = Integer.parseInt(scanner.nextLine());
					
		}

	}

}
