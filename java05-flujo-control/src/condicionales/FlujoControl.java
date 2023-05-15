package condicionales;

public class FlujoControl {

	public static void main(String[] args) {
		/**
		 * Java 05
		 * Sintaxis de la condiciónal if
		 * Si la condicional es verdadera, se ejecuta la instrucción del if
		 * 
		 * if (condicional) sentencias;
		 * 
		 * if (condicional) {
		 * 	sentencias;
		 * }
		 * 
		 * if (condicional)
		 * 	 sentencia;
		 * else 
		 *   sentencia_si_condicional_es_falsa;
		 * ---------------------------------------------
		 * 
		 * if ( condicional )
		 *  sentencia;
		 * else if (nueva_condicional)
		 *  sentencia;
		 *  
		 *  
		 *  else if ( n_condición)
		 *   sentencia;
		 *  else;
		 *   sentencia;
		 */
           
		 boolean condicion = true;
		 if (condicion)
			 System.out.println("La condición es verdadera");
		 else System.out.println("La condición es false");
		 
		 int edad = 17;
		 
		 if (edad >= 18)
			 System.out.println("La persona es mayor de edad");
		 else
			 System.out.println("La persona es menor de edad");
		 
		 //----------------------------------------
		 /* De una varriable tipo int, evaluar si está  en el rango de 1 a 10,
		  * si ess así desplegar en consola "la selección está en el rango"
		  * En caso contrario "la selección está fuera del rango"
		  * 
		  */
		 
		int numero = -2;
		 if ( numero > 1 && numero <11 ) {
			 System.out.println("La selección está en el rango");
			
		} else {
			System.out.println("La selección está fuera del rango");

		}
	}

}
