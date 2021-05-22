package rgb.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rgb.Calculadora.Calculadora;

class TestCalculadora 
{
	private Calculadora calculadora;
	
	@Test
	void PruebaSuma() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.suma(5, 6);
		
		
		//a
		assertEquals(11,resultado);
		
	}

}
