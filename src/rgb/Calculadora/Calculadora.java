package rgb.Calculadora;

public class Calculadora 
{
	public int sumar (int a , int b)
	{
		return a + b;
	}
	
	public int restar (int a , int b)
	{
		return a - b;
	}
	
	public int multiplicar (int a , int b)
	{
		return a * b;
	}
	
	public double dividir (int a , int b)
	{
		return a / b;
	}
	
	public double raizCuadrada (int a )
	{
		double aux = Double.NaN;

		double resultado = a / 2;
		
		if (resultado > 0)
		{

			do {
				aux = resultado;
				resultado = (aux + (a / aux)) / 2;
			} while ((aux - resultado) != 0);
	
			return resultado;
		}
		else
		{
			return Double.NaN;
		}
	}
	

}
