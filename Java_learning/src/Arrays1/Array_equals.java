package Arrays1;

import java.util.Arrays;

public class Array_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers1 = {16, 23, 30, 41};
		int[] numbers2 = {12, 13, 14, 15};
		
		
		boolean result = Arrays.equals(numbers1, numbers2);
		System.out.println("Son iguales los elementos de ambos arrays?: " +  result);
		
		
		
		int[] a1 = {16, 23, 30, 41};
		int[] a2 = {16, 23, 30, 41};
		boolean resultado = Arrays.equals(a1, a2);
		System.out.println("Son iguales los elementos de ambos arrays?: " +  resultado);
		
		
		//metodo hashCode: asi NO calcula si son iguales el  hashCode: 
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		//metodo hashCode: cuando 2 objetos se consideran iguales, deben tener el mismo codigo hashcode
		System.out.println(Arrays.hashCode(a1));
		System.out.println(Arrays.hashCode(a2));

	}

}
