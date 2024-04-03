package Herencia_polimorfismo_1_class_Abstracta_7;

public class main {

	public static void main(String[] args) {
		
		Luz l1 = new Luz("salon");
		Luz l2 = new Luz("cocina");
		
		Termostato t1 = new Termostato("estufa1");
		Termostato t2 = new Termostato("estufa2");
		
		//dispositivo electronico es abstrato y no se puede instanciar como objeto NEW
		
		
		l1.encender();
		l1.setIntensidad(300);
		
		//generar toString() en clase luz para mostrar l1.toString()
		System.out.println(l1.toString());
		
		l1.setIntensidad(0);
		System.out.println(l1.toString());
		l1.apagar();
		System.out.println("--------------");
		
		t1.encender();
		t1.setTemperatura(33.0);
		//generar toString() en clase termostato
		System.out.println(t1.toString()); 
		t1.apagar();

	}

	

	
	

}
