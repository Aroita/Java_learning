package estructuras_Control_Sentencias_2;

import java.util.Scanner;

public class Act_adicionales_2 {
	

	
	//funcion para practica 3
	public static void tablas2(int num3) {
		for(int j=0; j<11; j++) {
			System.out.println(num3 + " X " + j + "= "+ j*num3);
		}
	};

	
	public static void main(String[] args) {
		 
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practica adicional 1: contar para atras un nº positivo recogido por scanner
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
		
		
		//practica adicional 3: imprimir las tablas de mulltiplicar del 1 al 10
		int tablasM = 1;
			
			while(tablasM <= 10) {
				//con esto hace un salto de linea en cada tabla
				System.out.println(" ---- TABLA DE MULTIPLICA DEL ----" + tablasM);
				
				//funcion set(pasa parametro: num3) 
				Act_adicionales_2.tablas2(tablasM);  //funcion set en la clase
				System.out.println();//salto de linea, espaciar tablas
				tablasM++;
			}
	

		//practica adicional 4:el usuario escribira palabras y debe escribir "salir" para cortar el bucle
		
		Scanner scanner = new Scanner(System.in);
		
		String escribe;//declara
		
		do {
			
			System.out.println("dime una palabra");
			escribe = scanner.next(); //inicializa la variable recodida de scanner
			System.out.println("eco: "+ escribe);
			
		}while(!escribe.equals("salir") ); //metodo equals compara y para de ejecutar
		
		scanner.close();
		

		//practica adicional 5: media piramide
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escribe un nº: ");
		int n1=scanner.nextInt();	
		
		for(int i =0; i< n1; i++) {
			 for(int k=0; k<i +1; k++) {
			
				System.out.print( " * ");
			 }
			 System.out.println();//para que vaya saltando linea a linea
		}//cierra for
		
		
		//practica: piramide entera
		System.out.println("escribe un nº: ");
		int filas =scanner.nextInt();
		
		for(int a=0; a<filas; a++) {
			for(int v=0; v<filas -a -1; v++) {
				System.out.print(" ");
			}
			
			//añadir *
			for(int r=0; r<2 *a +1; r++) {
				System.out.print("*");
			}
		    System.out.println();  //salto por cada fila que pasa
		}

*/	
		
		//PRACTICA 6 ADICIONA: app que pases cantidad, interes anual y año/s te dara un capital obtenido.
		Scanner scanner = new Scanner(System.in);
		System.out.println("escribe cantidad a invertir: ");
		double cantidad =scanner.nextDouble();
		System.out.println("escribe tipo de interes anual: ");
		double interesAnual = scanner.nextDouble();
		System.out.println("escribe año/s: ");
		int anio = scanner.nextInt();
		
		for(int i=1; i <= anio; i++) {
			double renta = cantidad * interesAnual / 100;
			System.out.println("Capital obtenido en 1º año: " + i + " ="+ renta);  
			cantidad += renta; //es igual que: cantidad = capital + renta
			
		}
		

		
	
		
		
		
		scanner.close();

	}
}

