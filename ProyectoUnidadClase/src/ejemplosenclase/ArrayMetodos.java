package ejemplosenclase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class ArrayMetodos {

   public static float[] devuelveEntero() {

       float[] resultado = { 3f, 3.2f, 4.5f };

       // longitud del array 3

       // indice más pequeño 0
       resultado[0] = 5.7f;

       // indice mas grande 2
       resultado[2] = 3.4f;

       return resultado;
   }

   public static void main(String[] args) {

       int[] array = arraynEnteros(42);

       int[] array2 = arraynEnteros(45);

       int[] resultado = sumaArrays(array, array2);

       int[] resultadoOpuestos = sumaOpuestosMejorado(array);

       mostrarArray(resultadoOpuestos);
       rellenaConCeros(resultadoOpuestos);
       mostrarArray(resultadoOpuestos);

   }

   // Devuelve un array de n enteros de 0 a n-1
   public static int[] arraynEnteros(int n) {

       int[] resultado = new int[n];

       for (int i = 0; i < n; i++) {

           resultado[i] = i;

       }

       return resultado;
   }

   public static int[] sumaOpuestos(int[] array) {

       int[] resultado = new int[array.length];

       for (int i = 0; i < resultado.length; i++) {

           ;
           resultado[i] = array[i] + array[resultado.length - 1 - i];

       }

       return resultado;
   }

   public static int[] sumaOpuestosMejorado(int[] array) {

       int[] resultado = new int[array.length];

       int ultimaIteracion = 0;

       // si es par llegamos hasta la mitad
       if (resultado.length % 2 == 0)
           ultimaIteracion = resultado.length / 2;
       else
           // Si es impar la longitud hasta la mitad mas 1
           ultimaIteracion = resultado.length / 2 + 1;

       int suma = 0;

       for (int i = 0; i < ultimaIteracion; i++) {

           // el de delante
           // length 8
           // i=1
           // resultado[1] = array[1] + array[6]

           suma = array[i] + array[resultado.length - 1 - i];
           resultado[i] = suma;

           // el de detras
           // resultado[6] = array[6] + array[1]
           resultado[resultado.length - 1 - i] = suma;
       }

       return resultado;
   }

   // devuelve el array de la serie de fibonacci
   public static int[] arrayFibonacci(int n) {
       int[] resultado = new int[n + 1];

       rellenaConCeros(resultado);
       resultado[0] = 1;
       resultado[1] = 1;

       for (int i = 2; i < resultado.length; i++) {

           // resultado[i]=

       }

       return resultado;
   }

   // rellena el array recibido todo a ceros
   public static void rellenaConCeros(int[] array) {

       for (int i = 0; i < array.length; i++) {

           array[i] = 0;
       }

   }

   // mostrar un array de numeros por pantalla

   public static void mostrarArray(int[] array) {

       for (int i = 0; i < array.length; i++) {
           if (i == array.length - 1)
               System.out.print(array[i]);
           else
               System.out.print(array[i] + ", ");

       }

       System.out.println();

   }
   
   
   // mostrar un array de numeros por pantalla

   public static<T> void mostrarArray(T[] array) {

       for (int i = 0; i < array.length; i++) {
           if (i == array.length - 1)
               System.out.print(array[i]);
           else
               System.out.print(array[i] + ", ");

       }

       System.out.println();

   }
   

   // metodo que sume dos arrays
   // 5 6 7 8 array1
   // 4 8 9 12 34 array2

   // 9 14 16 20 34 suma

   public static int[] sumaArrays(int[] array1, int[] array2) {
       int[] resultado;
       int maxTam = Math.max(array1.length, array2.length);
       int elem1, elem2 = 0;
       resultado = new int[maxTam];

       for (int i = 0; i < maxTam; i++) {
           elem1 = 0;
           elem2 = 0;

           if (i < array1.length) {

               elem1 = array1[i];
           }

           if (i < array2.length) {

               elem2 = array2[i];
           }

           resultado[i] = elem1 + elem2;
       }

       return resultado;
   }

   // llenar un array con l n primeros numeros pares
   // Deberes para casa
   // Haced con un while que cuente sólo los pares
   public static int[] arrayPares(int n) {
       int[] resultado;
       resultado = new int[n];

       return resultado;
   }

   public static double[] rellenaArrayAleatorios(int numElementos, double maxDecimal) {

       double[] resultado = new double[numElementos];
       Random rand = new Random();
       // numero aleatorio entre 0 y maxdecimal que cambiarlo

       // rand.nextDouble() devuelve un decimal entre 0 y 1

       double decimalAleatorio = rand.nextDouble(0, maxDecimal);

       for (int i = 0; i < numElementos; i++) {

           resultado[i] = rand.nextDouble(0, maxDecimal);

       }

       return resultado;

   }

   public static Double[] rellenaArrayAleatoriosWrap(int numElementos, double maxDecimal) {

   
       return rellenaArrayAleatoriosWrap(numElementos, 0, maxDecimal);
   }
   
   public static Double[] rellenaArrayAleatoriosWrap(int numElementos,double minDecimal, double maxDecimal) {

       Double[] resultado = new Double[numElementos];
       Random rand = new Random();
       // numero aleatorio entre 0 y maxdecimal que cambiarlo

       // rand.nextDouble() devuelve un decimal entre 0 y 1

       for (int i = 0; i < numElementos; i++) {

           resultado[i] = rand.nextDouble(minDecimal, maxDecimal);

       }

       return resultado;

   }

   public static int[] rellenaArrayAleatorios(int numElementos, int maxInt) {

       int[] resultado = new int[numElementos];
       Random rand = new Random();
       // numero aleatorio entre 0 y maxdecimal que cambiarlo
       rand.nextInt(0, maxInt);

       for (int i = 0; i < numElementos; i++) {

           resultado[i] = rand.nextInt(0, maxInt);

       }

       return resultado;

   }

   public static Integer[] rellenaArrayAleatoriosWrap(int numElementos, int maxInt) {

       return rellenaArrayAleatoriosWrap(numElementos,0, maxInt);

   }
   
   public static Integer[] rellenaArrayAleatoriosWrap(int numElementos,int minInt, int maxInt) {

       Integer[] resultado = new Integer[numElementos];
       Random rand = new Random();
       // numero aleatorio entre 0 y maxdecimal que cambiarlo
       rand.nextInt(0, maxInt);

       for (int i = 0; i < numElementos; i++) {

           resultado[i] = rand.nextInt(minInt, maxInt);

       }

       return resultado;

   }

   public static int[] revierteArray(int[] arrayParam) {

       int[] arrayResultado = new int[arrayParam.length];

       for (int i = 0; i < arrayParam.length; i++) {

           arrayResultado[arrayResultado.length - 1 - i] = arrayParam[i];

       }

       return arrayResultado;

   }
   
   
   
   

   public static double[] revierteArray(double[] arrayParam) {

       double[] arrayResultado = new double[arrayParam.length];

       for (int i = 0; i < arrayParam.length; i++) {

           arrayResultado[arrayResultado.length - 1 - i] = arrayParam[i];

       }

       return arrayResultado;

   }

   public static <T> void revierteArray(T[] arrayParam) {
       
       T aux;
       
       for (int i=0; i< arrayParam.length/2; i++) {
           
           aux = arrayParam[arrayParam.length-1-i];
           arrayParam[arrayParam.length-1-i]=arrayParam[i];
           arrayParam[i]= aux;
           
       }
       
   }
   
   
   // maximo generico

       public static <T extends Comparable> T maxInArray(T[] arrayParam) {

           T max = arrayParam[0];
           
           for (T item: arrayParam) {
               
               if (item.compareTo(max)>0) {
                   
                   max= item;
               }
               
           }
           
           
           return max;        
           
           

       }
       
       // minimo generico
       public static <T extends Comparable> T minInArray(T[] arrayParam) {
           

           T min = arrayParam[0];
           
           for (T item: arrayParam) {
               
               if (item.compareTo(min)<0) {
                   
                   min= item;
               }
               
           }
           
           
           return min;        
           
       
       }
       
       // metodo que reciba dos arrays de cualquier tipo y devuelva un array de
       // Strings con el formato elem1,elem2 concatene con una coma los elementos
       // de los dos arrays y los ponga en un String
       // suponemos que los dos arrays de entrada tienen la misma longitud
       
       
       public static <T,V> String[] combinaArrays(T[] array1, V[] array2) {
           
           String[] arrayResultado = new String[array1.length];
           
           for (int i=0; i<array1.length ;i ++) {
               
               
               arrayResultado[i] = array1[i].toString() + ";" + array2[i].toString();
               
           }
           
           
           return arrayResultado;
           
           
       }
   
       
       public static <T extends Comparable> void ordenar(T[] array1) {
           
           
           Arrays.sort(array1, (a,b) -> a.compareTo(b)*-1);
           
           Arrays.sort(array1, new Comparator<T>() {

               @Override
               public int compare(T o1, T o2) {
                   // TODO Auto-generated method stub
                   return o1.compareTo(o2)*-1;
               }
               
               
               
           });
           
           
           
       }
       
       /// es una ñapa, a este nivel ya no podemos trabajar con arrays y genericos, lo que hemos anterior
       // su esta bien
       
       public static <T extends Number> T[] sumaArrays(T[]array1, T[] array2) {
           
           Number[] arrayResultado = new Number[array1.length];
           
           for (int i=0 ; i< arrayResultado.length ; i++) {
               
               
               arrayResultado[i] = array1[i].doubleValue() + array2[i].doubleValue();
           }
           
           
           return (T[]) arrayResultado;
           
           
       }

}