package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Coche renault=new Coche();//Instaciar una clase

//	System.out.println(renault.Dime_Largo());	
		Coche miCoche=new Coche();
	miCoche.establece_color("amarillo");
	System.out.println(miCoche.Dime_datos_generales());
		System.out.println(miCoche.dime_color());
		miCoche.configura_asientos("NO");
		System.out.println(miCoche.dime_asientos());
		miCoche.configura_climatizador("SI");
		System.out.println(miCoche.dime_climatizador());
		System.out.println(miCoche.dime_peso_coche());
		System.out.println("EL precio final del coche es"+miCoche.precio_coche());
		
		
		
		
	}

}
