package Arrays1;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//---- 1 FORMA DE DECLARAR ---------------------------------------------------------
		//declaro en memoria
		String [] names = new String[4];
		
		//declaro la variable en el array
		names[0]="susan";
		names[1]="Jhon";
		names[2]="Bea";
		names[3]="Mark";
		
		//imprimir valores de los elementos individuales
		System.out.println("el primer nomre es: " + names[0]);
		System.out.println("el tercer nombre es: " + names[2]);
		System.out.println("--------------------------------------------------------------");
		
//----****** 2º FORMA DE DECLARAR SIMPLIFICADA ***********-------------------------------------------
		int[] number = {2, 4, 6, 8};
		
		//******* imprimir SIMPLIFICANDO todos los valores de los elementos de la matriz ******
		System.out.println("---- imprimir SIMPLIFICANDO SIN FOR: (int element : number)   los elementos de la matriz ----- ");
		int sum = 0;
		for(int element : number) {
			sum += element;
		}
		System.out.println("La suma es: " + sum);
		System.out.println("--------------------------------------------------------------");
		
		//imprimir todos los valores de los elementos de la matriz CON BUCLE FOR:
		System.out.println("----------PASAR LOS ELEMENTOS SABIENDO CUANTOS ELEMENTOS TENEMOS: (int i=0; i<4; i++)-----------");
		
		//declarar todos los elementos del array con BUCLE FOR
		for(int i=0; i<4; i++) {  //si sabemos el nº de elementos lo agregamos y si no con con la prpopiedad lenght
			 int element = number[i];
			 System.out.println(" el elemento del index: " + i + " es: "+ element);
		}
		
		System.out.println("----------PASAR LOS ELEMENTOS CON VARIBALE.LENGTH (int i=0; i<number.length; i++)-----------");
		for(int i=0; i<number.length; i++) {  
			 int element = number[i];
			 System.out.println(" el elemento del index: " + i + " es: "+ element);
		}
		
	
		
		
		

	}

}
