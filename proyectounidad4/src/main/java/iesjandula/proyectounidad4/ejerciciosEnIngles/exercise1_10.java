package iesjandula.proyectounidad4.ejerciciosEnIngles;

public class exercise1_10 {
	
	public static double average (double []array) {
		double result= 0.0;
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			 sum = sum + i;
			 result=i/array.length;
		}
		return result;
	}
	
	
	//Clase que imita valores primitivos
   public static <T extends Number> double average (T[] array) {
	   double average = 0.0;
	   for (int i=0; i<array.length; i++) {
		   average+=array[i].doubleValue();
	   }
	   return average/array.length;
   }

	public static void main(String[] args) {
		
		double[] array = { 1, 2, 3, 4, 5 };
		Integer [] array2 = { 1, 2, 3, 4, 5 };
		Float [] array3 = { 1.2f, 2.6f, 3.0f, 4.4f, 5.7f };
		
		System.out.println("average of array " + average(array));
		System.out.println("average of array 2 " + average(array2));
		System.out.println("average of array 3 " + average(array3));
	}

}
