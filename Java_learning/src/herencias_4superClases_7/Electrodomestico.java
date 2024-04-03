package herencias_4superClases_7;

public class Electrodomestico {
	
	
	private String color;
	private char consumoEnergetico;
	private double precio, peso;
	
	//VALORES POR DEFECTO
	public static String COLOR = "blanco";
	public static char CONSUMOENERGETICO = 'F';
	public static double PRECIO = 100;
	public static double PESO = 5;
	
	//VALORES DISPONIBLES
	public final static String[] COLORES_DISPONIBLES = {"Negro", "Rojo", "Azul", "Gris"};
	public final static char[] CONSUMOENERGETICO_DISPONIBLE ={'A', 'B', 'C', 'D', 'E', 'F'};
	public final static double[] PRECIO_SEGUN = {100, 80, 60, 50, 30, 10};
	
	
	
	
	
	public Electrodomestico(String color, char consumoEnergetico, double precio, double peso) {
		this.color = ComprobarColor(color.toLowerCase());
		this.consumoEnergetico = ComprobarConsumoEnerg(Character.toUpperCase(consumoEnergetico));
		this.precio = precio;
		this.peso = peso;
	}


	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
	}
	
	

//METODO QUE PASAMOS CAMPOS POR DEFECTOS(CONSTANTES)
	public Electrodomestico() {
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.precio = PRECIO;
		this.peso = PESO;
	}


	@Override
	public String toString() {
		return "Electrodomestico [color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", precio=" + precio
				+ ", peso=" + peso + "]";
	}


	public String getColor() {
		return color;
	}


	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public double getPrecio() {
		return precio;
	}


	public double getPeso() {
		return peso;
	}
	
	
	
	 public char ComprobarConsumoEnerg(char letra ) {
		 for (char c : CONSUMOENERGETICO_DISPONIBLE) {
			 if(c == letra) 
				 return letra;
			 }
			 return CONSUMOENERGETICO;
	 }
		
		
	 
		public String ComprobarColor(String color) {
			for(String co: COLORES_DISPONIBLES ) {
				if(co.equals(color))
					return color;
			}
			return COLOR;
			

		}
		public double precioFinal() {
			int indice = 0;
			for(int i=0; i< CONSUMOENERGETICO_DISPONIBLE.length; i++) {
				if(CONSUMOENERGETICO_DISPONIBLE[i]== consumoEnergetico) {
					indice = i;
					break;
				}
				
			}
			//tabla de precios segun peso
			double precioFinal = precio + PRECIO_SEGUN[indice];
			if(peso >= 0 && peso < 19) {
				precioFinal += 10;
			}else if (peso >= 20 && peso < 49) {
				precioFinal += 50;
			}else if (peso >= 50 && peso < 79) {
				precioFinal += 80;
			}else if (peso >= 80) {
				precioFinal += 100;
			}
			return precioFinal;
			
			
			
			
		}


		


		
			
			
		
		
	}
	
	
	
	
	
	
	


