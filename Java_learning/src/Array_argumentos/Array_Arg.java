package Array_argumentos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Array_Arg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable argumentos. declarar y llamar metodos con un nº de variable de argumentos
		String text = String.format("hola %s  es %s"," hoy: ", LocalDate.now().getDayOfWeek());
		System.out.println(text);
		
		
		
		
		//convertir  array y clases para colecciones
		String[]array = {"one", "two","three"};
		List<String> list = Arrays.asList(array);
		
		List<String> list2 = Arrays.asList("one", "two","three");   //Devuelve una lista de tamaño fijo respaldada por la matriz especificada.
;		
		list.set(0, "four");
		System.out.println(Arrays.toString(array));  //[four, two, three]
		
		array[2]= "five";
		System.out.println(list);  // [four, two, five]
		//list.add("six");    // ----  de esta manera no se puede añadir elementos
		//System.out.println(list);
	
		
		
		//copia y crear nueva lista de array para poder añadir
		List<String> list3 = new ArrayList<>(Arrays.asList(array));
		list3.add("six");  // [four, two, five, six]
		System.out.println(list3);
		System.out.println(Arrays.toString(array)); //[four, two, five]
				
		//conversion opuesta co TOARRAY()
		List<String> list4 = new ArrayList<>();
		list.add("one");
		list.add("dos");
		
		

	}

}
