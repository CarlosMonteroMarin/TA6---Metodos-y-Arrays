import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Intoduce el tamaño del array: ");
			int tamaño=sc.nextInt();
		//creamos los arrays
			int[] lista =new int[tamaño];
		
		//llamamos los metodos y preguntamos por pantalla el parametro del digito
		rellenarArray(lista);
		System.out.print("Introduce un dígito para buscar los números acabados con ese dígito: ");
			int digito=sc.nextInt();
		mostrarNumeros(lista, digito, lista);
			int[] listaDigitos =new int[tamaño];

		
	}
	
	public static void rellenarArray (int[] lista) {
		System.out.println("LISTA CON LOS VALORES ALEATORIOS:");

		//bucle para recorrer todo el array e ir introduciendo los valores random
		for (int i = 0; i < lista.length; i++) {
			int random= (int)(Math.random()*300+1);
			
			lista[i]=random;
			System.out.println("Posición "+i+": "+lista[i]);
		}
	}
	
	//Metodo para buscar numeros acabados con el digito que introducimos por pantalla
	public static void mostrarNumeros (int[] lista, int digito, int[]listaDigitos) {
		int ultimoDigito;
		int a=0;
		System.out.println("LISTA DE LOS NÚMEROS ACABADOS EL DIGITO:");
		//creamos un for para recorrer toda la lista
		for (int i = 0; i < lista.length; i++) {
			//lo usamos para extraer el ultimo digito del numero
			ultimoDigito=lista[i]%10;
			
			//condicion de si el digito es igual al que hemos introducido que lo imprima por pantalla
			if (ultimoDigito==digito) {
				listaDigitos[a]=lista[i];
				
				System.out.println("Posición "+a+": "+listaDigitos[a]);
				a++;
			}
			
		}
			
	}

}		
		


	
	