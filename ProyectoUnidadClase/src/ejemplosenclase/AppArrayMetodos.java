package ejemplosenclase;

public class AppArrayMetodos {
public static void main (String []args) {
	int [] arrayInteger = ArrayMetodos.rellenaArrayAleatorios(20,50);
	ArrayMetodos.mostrarArray(arrayInteger);
	int [] arrayRevertido = ArrayMetodos.revierteArray(arrayInteger);
	ArrayMetodos.mostrarArray(arrayRevertido);
	
	Double [] arrayWrapDouble = ArrayMetodos.rellenaArrayAleatoriosWrap(20, 0.55);
	
	ArrayMetodos.mostrarArray(arrayWrapDouble);
	
	ArrayMetodos.revierteArray(arrayWrapDouble);
	
	ArrayMetodos.mostrarArray(arrayWrapDouble);
	
	Double max = ArrayMetodos.maxInArray(arrayWrapDouble);
	
	System.out.println ("Máximo: " + max);
	
	Integer [] arrayWrapInteger = ArrayMetodos.rellenaArrayAleatoriosWrap(20, 30);
	Integer min = arrayWrapInteger = ArrayM
	System.out.println ("Mínimo: " + min);
			
			
	String [] arrayString = ArrayMetodos.combinarArrays(arrayWrapDouble, arrayWrapInteger);
}
}
