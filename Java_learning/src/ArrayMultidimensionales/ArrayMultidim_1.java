package ArrayMultidimensionales;

import java.util.Arrays;

public class ArrayMultidim_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ARRAY DE ARRAYS DEL MISMO TIPO EN UNA CLASE SE PUEDE DEFINIR CAMPOS DE LOS TIPOS REQUERIDOS
		
		float[][] matriz = new float[3][3]; //inicializamos la matriz
		
		for(int i=0; i < matriz.length; i++) {
			matriz[i]= new float[3];
			//System.out.println("matriz: " + i);
		}
		
		float [][] triangulo = new float[10][];
		for(int i=0; i <triangulo.length; i++) {
			triangulo[i] = new float[i + 1  ];
			//System.out.println("triangulo: " + i );
		}
		
		
		
		float[][][] valor ={
				{{1,2,3},{4,5,6},{7,8,9}},
				{{10,11,12},{13,14,15},{16,17,18}},
				{{19,20,21},{22,23,24},{25,26,27}},
		
		};
		
		String[][] text = {{"Hello", "World"}, {}, null};
		
		
		// EJERCICIO 1
		//1º declaro
		float [][] matriz2 = {{1,2,3},{4,5,6,},{7,8,9}};
		
		//*****   2º ACCEDER A LOS ELEMENTOS **************************************************************
		
		//System.out.println("------------ agarra el segundo array{} de matriz2 y el valor del index 2: ------------ " + matriz2[1][2]);  //agarra el segundo array{} de matriz2 y el index 3
		
		//imprimir 
		for(int i=0; i < 3;i++ ) {
			for(int j=0; j < 3;j++ ) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
			
			
		System.out.println(" //forma simplificada de FOR");	
		//forma simplificada de FOR
			for( float[] a: matriz2) {
				for(float element: a) {
					System.out.print(element + " ");
				}
				System.out.println();
				
			}
			
		}
		
		// EJERCICIO 2. 
		String[] text2 = {"Hello", "World"};
		System.out.println(Arrays.toString(text2)); 
		
		//para pasar matrices multidimensionales hay otro metodo array: deepToString()
		System.out.println("---------para pasar multidimensionales usar metodo array: deepToString() ----------");
		
		String[][] sentences = {{"Hello", "bye"}, {"World"}};
		System.out.println(Arrays.deepToString(sentences));
		
		//metodo equals no valido en dimensionales, usar deepEquals
		String[][] sentences2 = {{"Hello", "bye"}, {"World", "you"}};
		System.out.println("--------//metodo equals no valido en dimensionales, usando deepEquals()  ---------");
		System.out.println(Arrays.deepEquals(sentences, sentences2));
		System.out.println("----------------------------------------------------------------");
		
		
		//EJERCICIO 3 : crear una copia de arrays superficial y profunda
		int [][] clonar1 = {{1,2,3},{4,5}};
		int [][] clonar2 = clonar1.clone();  //copia superficial
		
		//  *la variable que no sea de tipo primitivo es una REFERENCIA A UN OBJETO Y ESTA UNA MATRIZ DE OBJETOS
		clonar2[0][1] = 7;
		System.out.println(Arrays.deepToString(clonar1 ));
		
		int[][] clonar3 = new int [clonar1.length][];  //copia profunda en objetos
		
		//recorrer los indices
		for(int i=0; i<clonar1.length; i++) {
			clonar3[i] = new int [clonar1[i].length];
			for(int j=0; j< clonar1[i].length; j++) {
				clonar3[i][j] = clonar1[i][j];
		}
		}
		System.out.println("--------------------------------");
		clonar3[0][1]= 8;  //modifico clonar3
		System.out.println(Arrays.deepToString(clonar1));
		System.out.println(Arrays.deepToString(clonar3));
		
		
		
		
		
		
	}

}
