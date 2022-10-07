import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		//inicializamos el scanner
		System.out.println("-----Generador de números aleatorios-----");
		Scanner sc= new Scanner(System.in);
		
		//pedimos los datos por pantalla
		System.out.println("Introduce el rango mínimo: ");
			int min=sc.nextInt();
		
		System.out.println("Introduce el rango máximo: ");
			int max=sc.nextInt();

		//llamamos al método
		int resultado = generador(min, max);
		System.out.println("El número aleatorio creado es: "+resultado);
		
	}

	//método que genera aleatoriamente un número y devuelve el resultado
	public static int generador(int min, int max) {
		int resultado= (int)(Math.random()*max+min);
		
	return resultado;
	}
}
