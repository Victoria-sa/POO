package segundoPoo;

import java.util.Scanner;

public class Controller2 {
	
	
	public static void main(String[] args, Object a) {
		// TODO Auto-generated method stub

		
		
		
		Persona p=new Persona();
		double incremento=new Scanner(System.in).nextDouble();
		p.crecer(incremento);
		p.edad=18;
		p.nombre=" Carmen  Alicia";
		p.estatura=1.56;
		p.cumplirAños();
		p.saludar();
		System.out.println(" Cuando cumplas años tendras " + p.edad);
		System.out.println(" Cuanto has crecido ? -> ");
	
	
		System.out.printf(" Tu estatura ahora es ->  %.2f"+p.estatura);
		Persona a1=new Persona("Pepe", 15,1.90);
		System.out.println(a1.nombre+ " " + a1.edad + " "+ a1.estatura);
	//	Persona c=new Persona("VIctoria",53,1.60);
		//System.out.println(c.nombre+ " " + c.edad + " "+ c.estatura);
	}

	private static Object nextDouble() {
		// TODO Auto-generated method stub
		return null;
	



	}
		
}
		
		
	


