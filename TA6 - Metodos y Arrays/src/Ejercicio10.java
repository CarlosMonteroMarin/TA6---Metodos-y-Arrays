import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
		int tamaño=sc.nextInt();
		
		int listaNumeros[]=new int[tamaño];
		
		rellenarArray(listaNumeros, sc);
		contenidoMayorArray(listaNumeros);
		
	}
	
	public static void rellenarArray (int[] listaNumeros, Scanner sc) {
		
		System.out.print("Rango mínimo aleatorio: ");
			int min=sc.nextInt();		
			System.out.print("Rango máximo aleatorio: ");
			int max=sc.nextInt()+1;
		
		//bucle para recorrer todo el array e ir introduciendo los valores random
		for (int i = 0; i < listaNumeros.length; i++) {
			int random= (int)(Math.random()*max+min);
			
			//con el este metodo enviamos el numero aleatorio creado para que compruebe si es primo o no
			esPrimo(random);
			
			//seguno lo que devuelva escribira en la lista o no, y se mantendra en la misma posición para volver a 
			//generar un numero primo aleatorio
			
			if(esPrimo(random)==true){
				listaNumeros[i]=random;
			}else {
				i--;
			}
		}	
	}
	
	public static boolean esPrimo(int random) {
		  //el 0, 1 y 4 no son primos
		  if (random == 0 || random == 1 || random == 4) {
		    return false;
		  }
		  for (int x = 2; x < random / 2; x++) {
		    //si es divisible por cualquiera de estos números, no es primo
		    if (random % x == 0)
		      return false;
		  }
		  //si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
		}
	
	//metodo para imprimir todas las posiciones y va acumulando el número más alto
	public static void contenidoMayorArray (int[] listaNumeros) {
		int mayor=0;
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Posición "+i+ ": "+listaNumeros[i]);

			if (listaNumeros[i]>mayor) {
				mayor=listaNumeros[i];
			}
		}
		System.out.println("El número primo más grande es: "+mayor);
	}
	
}
