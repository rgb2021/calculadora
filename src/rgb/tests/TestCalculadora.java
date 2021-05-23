package rgb.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

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
		double resultado =  calculadora.sumar(5, 6);
				
		//a
		assertEquals(11,resultado);
		
	}
	
	@Test
	void PruebaResta() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double resultado =  calculadora.restar(20, 5);
				
		//a
		assertEquals(15,resultado);
		
	}
	
	@Test
	void PruebaRestaNegativa() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double resultado =  calculadora.restar(5, 6);
				
		//a
		assertEquals(-1,resultado);
		
	}
	
	@Test
	void PruebaMultiplicacion() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double resultado =  calculadora.multiplicar(5, 6);
				
		//a
		assertEquals(30,resultado);
		
	}
	
	@Test
	void PruebaMultiplicacionPorCero() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double resultado =  calculadora.multiplicar(5, 6);
				
		//a
		assertEquals(30,resultado);
		
	}
	
	@Test
	void PruebaDivision() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double  resultado =  calculadora.dividir(60, 6);
				
		//a
		assertEquals(10,resultado);
		
	}
	
	@Test
	void PruebaDivisionPorCero() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double  resultado =  calculadora.dividir(60,0);
		//Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(60, 0));
				
		//a		
		//assertEquals("/ by zero", exception.getMessage());
		assertEquals(Double.POSITIVE_INFINITY,resultado);
		
	}
	
	@Test
	void PruebaRaiz() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double  resultado =  calculadora.raizCuadrada(25);
				
		//a
		assertEquals(5,resultado);
		
	}
	
	@Test
	void PruebaRaizComplicada() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double  resultado =  calculadora.raizCuadrada(13);
				
		//a
		DecimalFormat df = new DecimalFormat("###.#######");
		
		assertEquals(df.format(3.605551275463989),df.format(resultado));
		
	}
	
	@Test
	void PruebaRaizNegativa() 
	{
		//a
		calculadora = new Calculadora();
		
		//a
		double   resultado =  calculadora.raizCuadrada(-3);
				
		//a
		assertEquals(Double.NaN,resultado);
		
	}

}
