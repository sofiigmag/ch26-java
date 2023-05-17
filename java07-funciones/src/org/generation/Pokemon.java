package org.generation;

public class Pokemon {
	// atributos de isntancia(non-static fields)
	String nombre;
	int alturaCm;
	double pesoKg;
	// Atributos de clase (static fields)
	static String nacimiento = "Ovíparos";
	
	// Métodos constructores
	// Debe tener el mismo nombre de mi Clase
	// Los métodos constructores no tienen retorno (return)
	Pokemon(String nombrePokemon, int alturaCmPk, double pesoPk){
	System.out.println("Has creado un pokemon llamado " + nombrePokemon);
		nombre = nombrePokemon;
		alturaCm = alturaCmPk;
		pesoKg = pesoPk; 
    }
	// Métodos de instancia
	// Métodos de clase

}
