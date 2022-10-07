import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//llamamos al scanner y pedimos un numero
		Scanner sc = new Scanner(System.in);
		//creamos un filtro para solo numeros positivos desde el 1
		int num=0;
		for (boolean i = false; i == false;) {
			
			System.out.print("Introduce un número positivo: ");
			num = sc.nextInt();
			
			if (num>0) {
				i=true;
			} 
		}
		//llamamos e imprimimos el metodo
		System.out.println(contadorCifras(num));
	}
	
	
	//metodo para contar las cifras
	public static int contadorCifras(int num) {
		int contador=0;
		int div=num;
		
		//mientras el numero introducido sea mas grande que 0 ira dividiendo entre 10 hasta que el cociente se quede a 0.
		//añadimos contador para ver cuantas veces repite el bucle y saber cuantas divisiones hace
		while (div>0) {
			div=div/10;
			contador++;
		}
	return contador;	
	}

}
