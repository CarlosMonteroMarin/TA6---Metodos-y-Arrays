import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//llamamos al scanner y pedimos un numero
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
			int num = sc.nextInt();
			
			//creamos una condicion que si sale true imprima una respuesta u otra
			if (metodoPrimo(num)==true) {
				System.out.println("El número introducido es primo.");
			} else {
				System.out.println("El número introducido no es primo.");
			}
	}
	
	public static boolean metodoPrimo (int num) {
		//el 0, 1 y 4 no son primos
		  if (num == 0 || num == 1 || num == 4) {
		    return false;
		  }
		  
		  for (int i = 2; i < num / 2; i++) {
		//si es divisible por cualquiera de estos números, no es primo
		  
			 if (num % i == 0)
		      return false;
		  }
		//si no se pudo dividir por ninguno de los de arriba es primo
	
	return true;
	}
	
}
