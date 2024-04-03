package herencias_4superClases_7;

public class App {

	public static void main(String[] args) {
		
		double precioTotalElectrodomestico = 0;
		double precioTotalLavadora = 0;
		double precioTotalTele = 0;
		
		Electrodomestico[] electro = new Electrodomestico[10];
		
		//asigna en cada posicion un electrodomestico como objeto con sus valores
		 electro[0] = new Lavadora(" Azul",'R', 120.0, 45,5);  //// color, char consumoEnergetico, double precio, double peso, double carga
		 electro[1] = new Lavadora(300,20);
		 electro[2] = new Electrodomestico(200,50);
		 electro[3] = new Lavadora(221, 35);
		 electro[4] = new Electrodomestico(180, 30);
		 electro[5] = new Lavadora(400, 50);
		 electro[6] = new Television(400, 50);
		 electro[7] = new Television(400, 50);
		 electro[8] = new Lavadora(" Azul",'R', 120.0, 45,5);
		 electro[9] = new Electrodomestico(400, 50);
		 
		
		for(int i=0; i< electro.length; i++) {

			System.out.println(electro[i].precioFinal());
			if(electro[i] instanceof Television) {
				precioTotalTele += electro[i].precioFinal();
				System.out.println(" precio de la TV: "  );
			}
			if (electro[i] instanceof Lavadora) {
				precioTotalLavadora += electro[i].precioFinal();
				System.out.println("precio de la lavadora: " );
				
			}
			precioTotalElectrodomestico += electro[i].precioFinal();
			
		}
		System.out.println("----------------------------------");
		System.out.println("El total de lavadora es: " + precioTotalLavadora );
		System.out.println("El total de TV es: " + precioTotalTele );
		System.out.println("El total de todos los electrodomesticos es: " + precioTotalElectrodomestico );
		
		

	}

}
