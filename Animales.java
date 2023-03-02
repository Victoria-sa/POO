package primerPoo;


//Programacion orientada a objetos
public class Animales {
String nombre;//ATRIBUTOS
static int iD;//aATRIBUTOS
int edad;//ATRIBUTOS

//METODOS
public void mostrarNombre() {
	System.out.println(nombre);
}
public void mostrarCaracteristica(String nombreString, int edad, int iD) {
	System.out.println("Mi animal se llama " +  nombreString  + " tiene " + edad + " años y su ID es "+ iD);
	
}	
public Animales() {//es un método constructor
	iD++;
}
public Animales( String nombre) {
this.nombre=nombre;
//incrementarId();
System.out.println("El nombr es: "+ this.nombre );
	
}
public Animales(String nombre, int edad) {
	iD++;
	this.nombre=nombre;
	this.edad=edad;
	System.out.println("El nombre es " +this.nombre+ "y tiene " + this.edad +" de edad y su iD es " +iD);
}

}
