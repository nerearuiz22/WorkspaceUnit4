package iesjandula.unit4project.ejercicios.eningles.exercise16_17_18_19;

import java.util.Arrays;

import iesjandula.proyectounidad4.ejemplosenclase.ArrayMetodos;



public class Exercise16_17 {

    private static int numberOfPositivesInArray(Integer[] arrayParam) {

        int cont = 0;

        for (Integer num : arrayParam) {

            if (num > 0)
                cont++;
        }

        // return (int) Arrays.stream(arrayParam).filter((num) -> num>0).count();

        return cont;
    }

    private static int numberOfNegativesInArray(Integer[] arrayParam) {

        int cont = 0;

        for (Integer num : arrayParam) {

            if (num < 0)
                cont++;
        }

        // return (int) Arrays.stream(arrayParam).filter((num) -> num<0).count();

        return cont;
    }

    public static Integer[] returnArrayWithPositives(Integer[] arrayParam) {

        Integer[] arrayRes = new Integer[numberOfPositivesInArray(arrayParam)];
        int cont = 0;

        for (int i = 0; i < arrayParam.length; i++) {

            if (arrayParam[i] > 0) {

                arrayRes[cont] = arrayParam[i];
                cont++;
            }

        }

        return arrayRes;
    }

    public static Integer[] returnArrayWithNegatives(Integer[] arrayParam) {

        Integer[] arrayRes = new Integer[numberOfNegativesInArray(arrayParam)];
        int cont = 0;

        for (int i = 0; i < arrayParam.length; i++) {

            if (arrayParam[i] < 0) {

                arrayRes[cont] = arrayParam[i];
                cont++;
            }

        }

        return arrayRes;
    }
    public static Integer sumPositiveNumbers(Integer[] arrayParam) {
       
        Integer sum=0;
       
        for (Integer num: arrayParam) {
           
            sum+=num;
        }
       
        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer[] arrayInt = ArrayMetodos.rellenaArrayAleatoriosWrap(20, -50, 50);

        ArrayMetodos.mostrarArray(arrayInt);

        Integer[] arrayRes = returnArrayWithPositives(arrayInt);

        ArrayMetodos.mostrarArray(arrayRes);

    }

}