package primerPoo;
//import static iu.MiMenu.*;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//instanciar la clase...declarar miAnimal como un objeto de la clase Animales
				Animales miAnimal=new Animales();
				//id 1
				miAnimal.nombre="Misifu";
			//	miAnimal.iD=1;
				miAnimal.edad=14;
				//miAnimal.mostrarNombre();
				miAnimal.mostrarCaracteristica(miAnimal.nombre, miAnimal.edad, Animales.iD );
			// id 2	
				Animales miMascota=new Animales();
				miMascota.nombre="GUffi";//cambiar nombre
				//miAnimal.mostrarNombre();	
				miMascota.edad=35;
				miMascota.mostrarCaracteristica(miMascota.nombre, miMascota.edad,Animales.iD );
				//mostrarMenu();
				//llamar añ método constructor de solo el nombre
				Animales miMascota2=new Animales("Candela");
				Animales miMascota3=new Animales("Candela2",15);
				System.out.println("El Id de " + miMascota3.nombre + " es "+ Animales.iD);
			}
		      
			
				
			


		
		
		
		
	}


