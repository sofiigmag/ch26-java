package com.generation.test;

import org.junit.jupiter.api.Test;
import com.generation.utils.Math;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;


public class MathTest {
	Math math = new Math();
	
	@Test
	@DisplayName("Sumatoria de números enteros")
	void sumaTest(){
		
		assertEquals( 10, math.suma(8,1),"Suma de 1 unidad");
		assertEquals( 54, math.suma(44,10),"Suma de decenas");
		assertEquals( 1400, math.suma(800,600),"Suma de centenas");
		assertEquals( 100_000, math.suma(90_000,10_000),"Suma de millares");
		
		assertEquals( 10, math.suma(8,-15),"Suma de 1 unidad negativa");
		assertEquals( 54, math.suma(-44,10),"Suma de decenas negativas");
		assertEquals( 1400, math.suma(800,-600),"Suma de centenas negativas");
		assertEquals( 100_000, math.suma(-90_000,10_000),"Suma de millares negativas");
	}
	
	@Test
	@DisplayName("Sumatoria de números de punto flotante")
	void sumaDoubleTest() {
		double delta = 0.001;
		
		assertEquals(10.02, math.suma(10, 0.01),0.001,"Suma de 1 centesima");
		assertEquals(10.04, math.suma(10, 0.01), delta,"Suma de 1 centesima");
		assertEquals(10.06, math.suma(10, 0.01),0.001,"Suma de 1 centesima");
		assertEquals(10.10, math.suma(10, 0.01),0.001,"Suma de 1 centesima");
	}
	

}
