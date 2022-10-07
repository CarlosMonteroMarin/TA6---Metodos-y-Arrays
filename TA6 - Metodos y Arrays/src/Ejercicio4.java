import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class Ejercicio4 {

	public static void main(String[] args) {
		//llamamos al scanner y pedimos un numero
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
			int num = sc.nextInt();
			System.out.println(metodoFactorial(num));	
		
	}
	//creamos metodo
	public static int metodoFactorial(int num) {
		int i=1;
		int multi=num;
		
		//mientras que num sea mas grande que i se ejecute. inicio con una resta de num para que empiece a multiplicar
		//sobre si mismo pero con un numero menos.
		while (num>i) {
			num--;
			multi=multi*num;
		}
		
		
	return multi;
	}

}
