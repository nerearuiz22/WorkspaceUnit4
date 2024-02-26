package iesjandula.unit4project.matrices.exercises;

public class Problem49 {

	public static void main(String[] args) {
		
		//Tamaño filas arrayInt.length
		//Tamaño columnas arrayInt[0].length
		
		
		
		//RECORRIDO POR FILAS
		
		int[][] arrayInt = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Recorrido por filas");
		
		for(int i=0; i<arrayInt.length; i++) {
			
			for(int j=0; j<arrayInt[i].length; j++) {
				
				System.out.format("%1$4d %2$s", arrayInt[i][j], "|");
				
				System.out.flush();
				
			}
			
			System.out.println();
		}
		
		
		//RECORRIDO POR COLUMNAS
		
		System.out.println("Recorrido por columnas");
		
		for(int i=0; i<arrayInt[0].length; i++) {
			
			for(int j=0; j<arrayInt.length; j++) {
				
				System.out.format("%1$4d %2$s", arrayInt[j][i], "|");
				
				System.out.flush();
				
			}
			
			System.out.println();
		}

}
}
