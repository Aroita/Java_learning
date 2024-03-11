package Arrays1;

import java.util.Arrays;

public class Matriz_metodos {



	public static void main(String[] args) {
		int[]num1 = {16, 23, 30};
		
		// **********   //toString() convierte el array en una cadena con los elementos  *****************
		
		//metodo copyOf() toma 2 argumentos del array que desea copiar y el tamaño del nuevo array a crear.
		int[] num2 = Arrays.copyOf(num1, 4) ;
		System.out.println(Arrays.toString(num2));
		
		//metodo copyRfRange() toma los indices del array y da el rango desde un indice y hasta otro indice 
		int[] num3 = Arrays.copyOfRange(num2, 1, 3);
		System.out.println(Arrays.toString(num3));
		
		//ORDENAR MATRIZ Short()

		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2));
		
		//metodo binarySearch() devuelve el INDEX Del valor especificado utilizando el algoritmo de búsqueda binaria.
		int index = Arrays.binarySearch(num1, 23);
		System.out.println("found 23 at index: "+ index);
 		

	}
		
	
		
	

	
}
