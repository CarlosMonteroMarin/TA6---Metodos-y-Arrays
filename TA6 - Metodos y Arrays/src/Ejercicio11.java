import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Intoduce el tamaño del array: ");
			int tamaño=sc.nextInt();
		//creamos los arrays
		int[] arrayPrim =new int[tamaño];
		//usamos el .clone para duplicar el conetido del array 1
		int[] arraySeg =arrayPrim.clone();
		int[] multiArray =new int[arrayPrim.length];

	//llamamos a los métodos
	rellenarArray(arrayPrim, arraySeg);
	multiplicacionListas(arrayPrim, arraySeg, multiArray);
	listarArrays(arrayPrim, arraySeg, multiArray);
	
	}
	
	//metodo para generar los números aleatorios en los arrays
	public static void rellenarArray (int[] arrayPrim, int[] arraySeg) {
		
		//bucle para recorrer todo el array e ir introduciendo los valores random
		for (int i = 0; i < arrayPrim.length; i++) {
			int random= (int)(Math.random()*20+1);
			
			arrayPrim[i]=random;

		}
		
		//otro bucle para generar numeros random para el segundo array
		for (int i = 0; i < arraySeg.length; i++) {
			int random= (int)(Math.random()*20+1);
			
			arraySeg[i]=random;
		}	
	}
	
	
	
	
	
	//metodo para multiplicar los datos de las listas
	public static int[] multiplicacionListas (int[]arrayPrim, int[]arraySeg, int[]multiArray) {
				
		for (int i = 0; i < arrayPrim.length; i++) {
			multiArray[i]=arrayPrim[i]*arraySeg[i];
		}
		
	return multiArray;
	}
	
	
	//metodo para listar los tres arrays y con la multiplicación ya hecha
	public static void listarArrays(int[]arrayPrim, int[]arraySeg, int[]muliArray) {
		System.err.println("PRIMER ARRAY");
		for (int i = 0; i < arrayPrim.length; i++) {
			System.err.println("Posición "+i+": "+arrayPrim[i]);
				
		}
		System.err.println("SEGUNDO ARRAY");
		for (int i = 0; i < arraySeg.length; i++) {
			System.err.println("Posición "+i+": "+arraySeg[i]);
				
		}
		System.err.println("TERCER ARRAY (MULTIPLICACIÓN)");
		for (int i = 0; i < muliArray.length; i++) {
			System.err.println("Posición "+i+": "+muliArray[i]);
				
		}
		
	}
		
}
