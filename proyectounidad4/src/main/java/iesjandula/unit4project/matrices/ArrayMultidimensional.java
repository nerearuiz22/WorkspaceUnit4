package iesjandula.unit4project.matrices;

import java.util.Arrays;

 enum DiasSemana {

	LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
	
}

public class ArrayMultidimensional {

	public static void print(double[][] grid) {

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {

				System.out.print(grid[i][j] + " ");

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {


            


            


             double[][] temps = new double[3][5];


             temps[0][3] = 98.3; // cuarto valor de la primera fila


             temps[2][0] = 99.4; // primer valor de la tercera fila


 


             System.out.println(temps);


             System.out.println(Arrays.deepToString(temps));


            


            


             ArrayMultidimensional.print(temps);


            


             double [][] tempsCuatroSemanas = {{30,28,27,20,25,26,27},


                          {20,21,24,25,26,23,24},


                          {20,21,24,25,26,23,24},


                          {20,21,24,25,26,23,24}};


            
           //RECORRIDO POR COLUMNAS

            


             for (int i=0; i<tempsCuatroSemanas.length ; i++) {


                   


                    double media=0.0;


                   


                    for (int j=0; j<tempsCuatroSemanas[i].length;j++) {


                         


                          media= media+ tempsCuatroSemanas[i][j];


                         


                         


                    }


                   


                    media= media/7;


                   


                    System.out.println("La media de la semana " + i + " es " + media);


                   


             }
             
             
           //RECORRIDO DE LA MATRIZ POR COLUMNAS, primero columnas, luego filas

             for (int i=0; i<tempsCuatroSemanas[0].length ; i++) {


                   


                    double media=0.0;


                   


                    for (int j=0; j<tempsCuatroSemanas.length;j++) {


                         


                          media= media+ tempsCuatroSemanas[j][i];


                         


                         


                    }


                   


                    media= media/7;


                   


                    System.out.println("La media de la semana " +  DiasSemana.values()[i] + i + " es " + media);


                   


             }

                         


       }

}