package org.generation;

import java.util.Scanner;

public class PokemonTest {

	public static void main(String[] args) {
		System.out.println("Los pokemones son: " + Pokemon.nacimiento);
		
		Scanner sc = new Scanner( System.in);
		
		Pokemon pikachu = new Pokemon("Pikachu", 41, 6);
		Pokemon vamoACalmarnos = new Pokemon("Piakchu de agua", 50,9);
		 
		
		
		
		System.out.println(pikachu.nombre);
		System.out.println(vamoACalmarnos.nombre);

	}

}
