package estructura_Almacenamiento_Arrays_3;

import java.util.Arrays;
import java.util.Scanner;

public class Array1_funciones {
	
	//funcion para pasar la media
	public static int calcularMedia(int[] a) {
    	int media =0;
    	
    	for(int i =0; i<a.length; i++) {
    		media += a[i];
    	}
    	
    	return media/a.length;
    }
	
	//funcion para el pasar el numero mas alto
	public static int numAlto (int [] b) {
		int numeroAlto = b[0];
		
		for(int i=0; i<b.length; i++) {
			if(b[i]>numeroAlto) {
				numeroAlto = b[i];
			}
		}
		return numeroAlto;
	}

	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //array objeto //declaramos el array y reservamos las posiciones
        int[] array = new int[10];  
        
        Scanner scanner = new Scanner(System.in);
        
        
        //bucle for recorre los array
        for(int i=0; i <array.length; i++) {
            System.out.println("ingresa 1 numero:");
            array[i] = scanner.nextInt();
        }
        
        System.out.println(Arrays.toString(array));
        
        //llamar a las funcion calcularMedia:
        System.out.println("La media es: " + calcularMedia(array ));
       
        //llamar a las funcion numAlto:
        System.out.println("El nº mas alto es: " + numAlto(array));
        
        
        scanner.close();
        
        
        
        
    }
}

