package rgb.Calculadora;

public class Calculadora 
{
	public double sumar (double a , double b)
	{
		return a + b;
	}
	
	public double restar (double a , double b)
	{
		return a - b;
	}
	
	public double multiplicar (double a , double b)
	{
		return a * b;
	}
	
	public double dividir (double a , double aux)
	{
		return a / aux;
	}
	
	public double raizCuadrada (double a )
	{
		double aux;

		double resultado = dividir(a,2); //a / 2;
		
		if (resultado > 0)
		{
			do {
				aux = resultado;
				resultado = dividir(sumar(aux,dividir(a,aux)),2);
			} while (restar(aux, resultado) != 0);
	
			return resultado;
		}
		else
		{
			return Double.NaN;
		}
	}
	

}
