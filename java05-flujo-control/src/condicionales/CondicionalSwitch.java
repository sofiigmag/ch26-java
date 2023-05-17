package condicionales;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * switch( expresión ){ case valor1 : expresión; break; case valor2 : expresión;
		 * break; default: expresión; break; }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */

		// -------------------------------------------------------
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 salida-> Naciste en
		 * diciembre.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Mes de nacimiento ******");
		System.out.print("Introduce el mes de nacimiento (1-12) :");
		if (sc.hasNextInt()) {
			String mesTxt;
			int mesNacimiento = sc.nextInt();
			sc.nextLine();
			// Switch para encontrar el mes
			switch (mesNacimiento) {
			case 1:
				mesTxt = "Enero";
				break;
			case 2:
				mesTxt = "Febrero";
				break;
			case 3:
				mesTxt = "Marzo";
				break;
			case 4:
				mesTxt = "Abril";
				break;
			case 5:
				mesTxt = "Mayo";
				break;
			case 6:
				mesTxt = "Junio";
				break;
			case 7, 8, 9, 10, 11:
				mesTxt = "Falta incluir el mes";
				break;
			// TODO agregar los meses 7-11
			case 12:
				mesTxt = "Diciembre";
				break;
			default:
				mesTxt = "mes no existe";
			}

			System.out.println("Naciste en el mes de " + mesTxt);

			// La estación correspondiente al mes de nacimiento.
			// ej: La estación es invierno.
			// 12, 1, 2 : invierno
			// 3, 4, 5 : primavera
			// 6, 7, 8 : verano
			// 9, 10, 11 : otoño
			String estacion;
			switch (mesTxt.toLowerCase()) {
			// ToDo dic, enero, feb = Invierto
			case "diciembre":
			case "enero":
			case "febrero":
				estacion = "Invierno";
				break;
			case "marzo", "abril", "mayo":
				estacion = "primavera";
				break;
			case "junio", "julio", "agosto":
				estacion = "verano";
				break;
			case "septiembre", "octubre", "noviembre":
				estacion = "otoño";
				break;
			default:
				estacion = "La estación no existe";
			}
			System.out.println("La estación corresponde a " + estacion);

		} else {
			System.out.println("Error en el mes introducido, hasta pronto");
		}
		sc.close();
		
		/**
         * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
         * El usuario proporcionará un valor entre 0 y 10 (usando Scanner). 
         * Si está entre 9 y 10: imprimir una A 
         * Si está entre 8 y menor a 9: imprimir una B 
         * Si está entre 7 y menor a 8: imprimir una C 
         * Si está entre 6 y menor a 7: imprimir una D 
         * Si está entre 0 y menor a 6: imprimir una F 
         * Cualquier otro valor debe imprimir: Valor desconocido.
         */
		
		/*
		Scanner scannerCal = new Scanner(System.in);
		System.out.println("***** Sistema de calificaciones ******");
		System.out.print("Introduce la calificación en número (1-10) :");
		if (sc.hasNextDouble()) {
			String calificacionTxt;
			double calificacion = scannerCal.nextDouble();
			sc.nextLine();
			// Switch para encontrar el mes
			switch (calificacion) {
			case calificacion > 0 && calificacion < 6:
				calificacionTxt = "F";
				break;
			case calificacion > 6 && calificacion < 7:
				calificacionTxt = "F";
				break;
			case calificacion > 7 && calificacion < 8:
				calificacionTxt = "F";
				break;
			case calificacion > 8 && calificacion < 9:
				calificacionTxt = "F";
				break;
			case calificacion > 9 && calificacion < 10:
				calificacionTxt = "F";
				break;
			default:
				calificacionTxT = "Valor desconocido";
			}

			System.out.println("Tu calificación equivale a " + calificacionTxt);
			
			*/


	}

}