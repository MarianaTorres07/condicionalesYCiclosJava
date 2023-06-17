package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int edad = 31; //que esta variable es constante, ya tiene un valor final
		//edad = 55;
		
		//System.out.println("La edad es: " + edad);
		
		double sueldo = 157.8989899d;
		float sueldo2 = 167.8989f;
		long sueldo4 = 1678930202801923948l;
		int sueldo3 = 167;
		
		/*
		 * if
		 * else
		 * else if
		 * switch
		 * */
		
		System.out.println("Programa para calcular la hora");
		
		//Equivalente al prompt en JS se llama Scanner
		
		
		
		//Nenito = new Gatito (parametros);
		//Java, crea un nuevo objeto Scanner, llamalo hora y este sera un nuevo objeto de la clase Scanner, que tiene los argumnetos para guardar la informacion que le pase como entrada.
		
		Scanner valorIngresado = new Scanner(System.in); //declaro objeto y le paso info
		
		System.out.println("Por favor, ingresa una hora en un formato de 24 horas");
		
		//var hora = prompt ("mensaje"); JS en una sola linea (declaro variable, asigno el prompt, y la info del prompt la guardo en esa variable
		
		int hora = valorIngresado.nextInt(); //usar la informacion del objeto
		
		//int hora = 13; declaramos una variable
		
		if(hora >= 0 && hora <= 23) { //true
			System.out.println("Hora ingresada correctamente");
			
			if(hora >= 7  && hora <= 11) {
				System.out.println("Buenos dias solecito");
			}else if(hora >= 12 && hora <=18) {
				System.out.println("Buenas tardes, que calor hace");
			}else if(hora >= 19 && hora < 24) {
				System.out.println("Buenas noches");
			}else {
				System.out.println("Es de madrugada, no es bueno desvelarse");
			}
			
		}else {
			System.out.println("Hora mal ingresada");
		} //ciere del if general
		
		valorIngresado.close();  //cierre del scanner
		
		
		
		/* Condicional switch */
		
		int opcion = 1;
		
		switch (opcion) {

		case 1:
			System.out.println("Bienvenido al servicio de reservas");
			//funcionReservas();
			break;

		case 2:
			System.out.println("Bienvenido al servicio de check-in");
			//funcionReservas();
			break;

		case 3:
			System.out.println("Bienvenido al servicio de check-out");
			//funcionReservas();
			break;

		default:
			System.out.println("Opcion invalida");

		} //cierre del switch
		
		//Ejemplo del switch anidado
//		int entradaDeDato = 5;
//		
//		switch(entradaDeDato) {
//		case 1:
//			switch(otraOpcion) {
//			case 1:
//			System.out.println("Esta es la primera opcion, del primer caso");
//			break;
//			case 2:
//				System.out.println("Esta es la segunda opcion, del primer caso");
//				break;
//			
//			}
	
			
		//}
		
			
	} //cierre del metodo main
} //cierre de la clase Condicionales 



