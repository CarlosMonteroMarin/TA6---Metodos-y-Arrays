import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//llamamos al scanner y pedimos un numero
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
			int num = sc.nextInt();
		//llamamos al metodo
		conversorBinario(num);
	}

		//metodo conversor
		public static String conversorBinario (int num) {
			//parseamos el string a int
			int div=0;
			int resto=0;
			boolean condicion=true;
			String resultado="nose";

			while (condicion==true) {
				//dividimos entre 2
				num=num/2;
				//sacamos el residuo
				resto= num % 2;
				
				//imprimimos el residuo
				System.out.print(resto);
				//condicion fin bucle
				if (num==1) {
					condicion=false;
				}	
			}

			
		return resultado;	
		}
	}


