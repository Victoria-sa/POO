package segundoPoo;

public class Persona {
	String nombre;
	int edad;
	double estatura;
	public void saludar() {
		System.out.println(" Hola. Mi nombre es :"+ nombre);
		System.out.println(" Encantado de conocerte ");
	}
	public void cumplirAños() {
		edad++;//incrementamos en 1
		
	}
	public void crecer(double incremento) {
		estatura+=incremento;//la estatura aumenta segun el incremento
		
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	public Persona() {
		
		
	}

	}
		// TODO Auto-generated method stub
		


	
	
	
	
	
	

