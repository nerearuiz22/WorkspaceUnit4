package iesjandula.unit4project.ejercicios.eningles.exercise24;

public class Exercise24 {
	
	private int getNumEvenNumbersInArray(Integer[] array) {
		int contEven = 0;
		
		for (Integer item:array) {
			if (item%2==0)
				contEven++;
		}
		
		return contEven;
	}

	public Integer[] evenArray(Integer[] array1, Integer[] array2) {
		
		int contEven = 0;
		int tanArrayRes = getNumEvenNumbersInArray(array1) +getNumEvenNumbersInArray(array2);
		Integer [] arrayResult = new Integer [tanArrayRes];
		
		for (Integer item: array1) {
			if (item%2==0)
				arrayResult [contEven] = item;
			contEven++;
		}
		
		return arrayResult;
		
		
	}
	
}
