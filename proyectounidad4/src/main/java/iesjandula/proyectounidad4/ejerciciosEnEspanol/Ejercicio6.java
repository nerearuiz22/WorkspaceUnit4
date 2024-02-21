package iesjandula.proyectounidad4.ejerciciosEnEspanol;

import java.util.Scanner;

import iesjandula.proyectounidad4.arrays.ArrayLiterales;

public class Ejercicio6 {

	//Escribe un programa que lea 10 números, los almacene en un array y los muestre
	
    public static int [] leer10yguardarEnArray () {
    	int[] arr = new int[10];
    	Scanner sc = new Scanner (System.in);
    	
    	for (int i = 0; i< arr.length; i++)  {
    		System.out.println("Inroduce un número: ");
    		arr[i]=sc.nextInt();
    	}
    	
    	ArrayLiterales.pintarArrayEnteros(arr); //Método estático ya creado
    	return arr;
	}
    
    public static int[] leerYguardarEnArray(int n) {
    	int [] arr = new int [n];
    	
    	Scanner sc = new Scanner (System.in);
    	for (int i = 0; i< arr.length; i++)  {
    		System.out.println("Inroduce un número: ");
    		arr[i]=sc.nextInt();
    	}
    	ArrayLiterales.pintarArrayEnteros(arr); 
    	return arr;
    }
    
    public static int[] leerNyGuardarParesArray(int n) {
    	int [] arr = new int [n];
    	int num = 0;
    	Scanner sc = new Scanner (System.in);
    	int posicion = 0;
    	
    	for (int i = 0; i<arr.length; i++) {
    		System.out.println("Inroduce un número: ");
    		
    		if (num%2==0) {
    			arr[posicion]=num;
    			posicion++;
    		
    		}
    	}
    	ArrayLiterales.pintarArrayEnteros(arr, 0);
    	return arr;
    }
    
    public static String[] leerNStringyGuardarEnArray(String n) {
    	String [] arr = new String[n];
    	
    	Scanner sc = new Scanner (System.in);
    	
    	for (int i = 0; i<arr.length; i++) {
    		System.out.println("Inroduce un número: ");
    		arr [i] =sc.nextLine();
    	
    	}
    	ArrayLiterales.pintarArrayCadenas(arr);
    	return arr;
    }
    
	
	public static void main(String[] args) {
		
	}
}
