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
		int resultado =  calculadora.sumar(5, 6);
				
		//a
		assertEquals(11,resultado);
		
	}
	
	@Test
	void PruebaResta() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.restar(20, 5);
				
		//a
		assertEquals(15,resultado);
		
	}
	
	@Test
	void PruebaRestaNegativa() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.restar(5, 6);
				
		//a
		assertEquals(-1,resultado);
		
	}
	
	@Test
	void PruebaMultiplicacion() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.multiplicar(5, 6);
				
		//a
		assertEquals(30,resultado);
		
	}
	
	@Test
	void PruebaMultiplicacionPorCero() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.multiplicar(5, 6);
				
		//a
		assertEquals(30,resultado);
		
	}
	
	@Test
	void PruebaDivision() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.dividir(60, 6);
				
		//a
		assertEquals(10,resultado);
		
	}
	
	@Test
	void PruebaDivisionPorCero() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(60, 0));
				
		//a		
		assertEquals("/ by zero", exception.getMessage());
		
	}
	
	@Test
	void PruebaRaiz() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		int resultado =  calculadora.raizCuadrada(25);
				
		//a
		assertEquals(5,resultado);
		
	}
	

}
