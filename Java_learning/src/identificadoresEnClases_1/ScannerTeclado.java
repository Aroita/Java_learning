package identificadoresEnClases_1;

import java.util.Scanner;

public class ScannerTeclado {
	
	public static final int SUMARCONSTANTE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//interactua entrada y salida del teclado
		Scanner scanner = new Scanner(System.in);
		
		//recogemos el valor de esta variable con el scanner
		System.out.println("dime un nº");
		int varibaleEscaneada;
		varibaleEscaneada = scanner.nextInt(); 
		
		
		
		//SUMAMOS LA CONTANTE CON LA VARIABLE DE SCANNER(nº que yo pase por teclado)
System.out.println("\"SUMARCONSTANTE + varibaleEscaneada es: \"  ");
		System.out.println(SUMARCONSTANTE + varibaleEscaneada);
		
		//cerramos scanner para que no consuma recursos
		scanner.close();
		
		
		
		
		

	}

}
