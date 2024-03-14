package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class Act_adicionales_2 {
	

	//practica adicional 3: imprimir las tablas de mulltiplicar del 1 al 10
	//funcion para practica 3
	public static void tablas2(int num3) {
		for(int j=0; j<11; j++) {
			System.out.println(num3 + " X " + j + "= "+ j*num3);
		}
	};

	
	public static void main(String[] args) {
		 int tablasM = 1;
			
			while(tablasM <= 10) {
				//con esto hace un salto de linea en cada tabla
				System.out.println(" ---- TABLA DE MULTIPLICA DEL ----" + tablasM);
				
				//funcion set(pasa parametro: num3) 
				Act_adicionales_2.tablas2(tablasM);  //funcion set en la clase
				System.out.println();
				tablasM++;
			}
		
	}
	
}	
		  
			
	
	
	
	/*	
	//practica adicional 1: contar para atras un nº positivo recogido por scanner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escribe nº entero positivo: ");
		int num1 = scanner.nextInt();
		
		while(num1 > 0) {  //contar para atras un nº positivo
			num1--;
			System.out.println(num1 + ",");
			
		};
		
		//practica adicional 2: tabla mulltiplicar
		
		System.out.println("escribe nº: ");
		int num = scanner.nextInt();
		
	
		
		for(int i=0; i<11; i++) {
			System.out.println(num + " X " + i + "= "+ i*num);
		}
		


	}

}
*/
