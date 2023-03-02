package poo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Coche {
	
	private int ruedas;//modificador de acceso private(encpsular)
	private	int largo;//metodo getters pubkic dato_a_devolver nombre_metdo(){codigo+return}
	private	int ancho;//Averigua la propiedad del objeto
	private int motor;
	public int peso_plataforma;
	
	public String color;//estas propiedadades pueden cambiar
	public int peso_total;
	public boolean asientos_cuero,climatizador;
	
	
	public Coche() {
	ruedas=4;
	largo=2000;
	ancho=300;
	motor=1000;
	peso_plataforma=300;
		
	}
	public String Dime_datos_generales(){//Metodo GETTER ,lleva la instruccion return
		
		return "La plataforma tiene " + ruedas + "ruedas"+
		" mide"+ largo/1000 +"metros de ancho" + ancho + "cm y un peso de plataforma de "+ peso_plataforma + "Kg";
	}
		
	public void establece_color(String color_coche) {//SETTER lleva void y no lleva return
		color=color_coche;
		
	}
	public String dime_color() {
		return " El color del coche es " + color;
	}
	//setter asientos
	public void configura_asientos(String asientos_cuero) {
	//	this.asientos_cuero=asientos_cuero;
		if (asientos_cuero=="si") {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public String dime_asientos(){
		
		if (asientos_cuero==true){
			
		
			return "EL coche tiene asientos de cuero";
		}else {
			return " El coche tiene asientos de serie";
		}
		
	}
		public void configura_climatizador(String climatizador){//setter
			if (climatizador=="si") {
				this.climatizador=true;
				
			}else {
				this.climatizador=false;
			}
		}
		public String dime_climatizador() {//getter
			if(climatizador==true) {
				return"EL coche incorpa climatizador";
				
			}else {
				return "EL covhe lleva aire acondicionado";
			}
		}
		//metodo stter y getter juntos no  es etica
		public String dime_peso_coche() {
		int peso_carroceria=500;
	
		peso_total=peso_plataforma+peso_carroceria;
		if (asientos_cuero==true) {
			peso_total=peso_total+50;
		
	}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "EL peso del coche es"+peso_total;
		}
		public int precio_coche() {
		int precio_final=10000;
		if (asientos_cuero==true) {
			precio_final+=20000;
		}
			if (climatizador==true) {
				precio_final+=1500;
				
			}
			return precio_final;
		
	

}
}
