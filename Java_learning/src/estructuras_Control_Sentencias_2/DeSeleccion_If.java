package estructuras_Control_Sentencias_2;

public class DeSeleccion_If {

	public static void main(String[] args) {
		
		//declaramos 2 variable e inicializamos
		int  numero1 = 22;
		int numero2 = 55;
		
		//practico1:  indica si una variable es: mayor de 0, menor o igual a 0.
		System.out.println("---- practico 1 ------------");
		if(numero1 > 0) {
			System.out.println("el numero es mayor que 0");
		}else {
			System.out.println("el numero es menor o igual que 0");
		} 
		
		//practico2 indica si las variables es: mayor , menor o igual a 0.
		System.out.println("---- practico 2 -------------");
		if(numero1 < numero2) {
			System.out.println("numero1 es menor que el numero 2");
		}else if(numero1 > numero2){
			System.out.println("numero 1 es mayor que el numero 2");
		}else {
			System.out.println("los numeros son iguales");
		}
		
		//practico3 indica si es un numero es par o impar 
		//si el resto de la division es entera 0
		int num1 = 11;
		int resto = num1%2;
				System.out.println("---- practico 3 -------------");
		if(resto == 0) {
			System.out.println("el numero es par");			
		}else {
			System.out.println("el numero es impar");
		}
		
		

	}

}
