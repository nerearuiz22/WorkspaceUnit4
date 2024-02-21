package arrays;

import java.util.Locale;

public class ArrayTemperaturas {
	
	public static void pintarArray (double[] array) {
		for (int i=0; i<array.length; i++) {
			if (i==array.length-1) 
				System.out.format(Locale.ENGLISH, "(%-6.4f)", array[i] );
			else 
				System.out.format(Locale.ENGLISH, "(%-6.4f)", array[i] );
		}
		System.out.println();
	}
	
	public static void rellenarConUnos (double [] array) {
		
		for (int i=0; i<array.length; i++) {
			array[i]=1.0;
		}
	}
	
	
	public static int [] creaArrayConNumerosAleatorios <(int tna=)
int [ array new array int (tm);]	return array
		
		//Variables de tipo enterp 
		//devuelvo la refenrcia
	
	public static void main(String[] args) {
		
		double [] temperatures = new double [3];
		
		System.out.println("Longitud del array siempre uno más que el índice: " + temperatures.length);
		
		pintarArray(temperatures);
		rellenarConUnos(temperatures);
	}

}
