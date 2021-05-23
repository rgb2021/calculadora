package rgb.Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class interfaceCalculadora {

	public static void printMenu ()
	{
		System.out.println("¿Que operación quiere hacer?");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Raiz Cuadrada");
		System.out.println("Introduzca opción: ");
	}
	
	public static int PedirValor(String mensaje)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int valor = 0;
		System.out.println(mensaje);
		
		try
		{
			valor = Integer.valueOf(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println("Valor incorrecto");
			valor = PedirValor(mensaje);
		}
			
		return valor;
	}
	
	public static void main(String[] args)  
	{
		Calculadora calculadora = new Calculadora();
		String respuesta = "S";
		int val1;
		int val2;
		int resultadoInt = 0;
		double resultatoDouble = 0;
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			 printMenu ();			 
			 int opcion = 9;
			try {
				opcion = Integer.valueOf(lector.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 switch (opcion)
			 {
			 	case 1:			 		
			 		val1 = PedirValor("Introduzca el primer valor: ");
			 		val2 = PedirValor("Introduzca el segundo valor: ");
			 		resultadoInt = calculadora.sumar(val1, val2);
			 		System.out.println("El resultado es:" + resultadoInt);
			 		break;
				
			 	case 2:			 		
			 		val1 = PedirValor("Introduzca el primer valor: ");			 		
			 		val2 =PedirValor("Introduzca el segundo valor: ");
			 		resultadoInt = calculadora.restar(val1, val2);
			 		System.out.println("El resultado es:" + resultadoInt);
			 		break;
			 	
			 	case 3:
			 		
			 		val1 = PedirValor("Introduzca el primer valor: ");		
			 		val2 = PedirValor("Introduzca el segundo valor: ");
			 		resultadoInt = calculadora.multiplicar(val1, val2);
			 		System.out.println("El resultado es:" + resultadoInt);
			 		break;
					
			 	case 4:			 		
			 		val1 = PedirValor("Introduzca el primer valor: ");	
			 		val2 = PedirValor("Introduzca el segundo valor: ");
			 		resultatoDouble=calculadora.dividir(val1, val2);
			 		System.out.println("El resultado es:" + resultatoDouble);
			 		break;
				 	
			 	case 5:
			 		
			 		val1 = PedirValor("Introduzca el primer valor: ");
			 		resultatoDouble=calculadora.raizCuadrada(val1);
			 		System.out.println("El resultado es:" + resultatoDouble);
			 		break;
			 		
			 	default:
			 		System.out.println("Opcion no reconocida");
			 		
			 }
			 
			 System.out.println("Desea continuar: [S/N]");
			 try {
				respuesta = lector.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}while (respuesta.equals("s") || respuesta.equals("S") );
		
		System.out.println("Adios!");	

	}

}
