package estructura_Almacenamiento_Arrays_3;

import java.util.Arrays;

public class Array_MathRandom {
	
	//GENERAR 10 NUMEROS Y PASARLE UNA FUNCION PARA ORDENARLOS
	
	//funcion
	public static void ordenarArray(int [] a) {
		boolean ordenado = true;
		int swap=0;
		
		do {
			ordenado=true;
			for(int n=0; n < a.length; n++) {
				if(n+1 == a.length)
					continue;
				if(a[n] > a[n+1]) {
					swap = a[n];
					a[n]=a[n+1];
					a[n+1]=swap ;
					ordenado=false;
					
				}
			}
		}while(!ordenado);
	}
	
	
	
	

	public static void main(String[] args) {
		
		int [] arrayEnteros = new int[10];
		
		for(int i=0; i < arrayEnteros.length; i++) {
			//castin (int) con Math.radom realiza conversion y genera 10 numeros
			arrayEnteros[i] = (int)(Math.random() * 100);	 
			
		}//toString convierte el array en una cadena de un array separado por comas
		System.out.println(Arrays.toString( arrayEnteros));
		//pasamos la funcion para ordenarlos
		ordenarArray(arrayEnteros);
		System.out.println(Arrays.toString(arrayEnteros));
		
	}
	
	}
	

