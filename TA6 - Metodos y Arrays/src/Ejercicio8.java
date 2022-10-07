import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//creamos un array de 10 posiciones
		int arrayNum[] = new int [10];

		//llamamos los metodos para llenar el array y luego imprimirlo
		rellenarArray(arrayNum);
		imprimirArray(arrayNum);
		
	}
	
	
	public static int[] rellenarArray(int[] arrayNum) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce 10 numero para definir el array");
		int valor=0;
		
		//bucle para recorrer todo el array e ir introduciendo los valores
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print("Posición "+i+" :");
			valor=sc.nextInt();
			arrayNum[i]=valor;
			
		}
		System.out.println("LISTA LLENA.");
	
		
		sc.close();
	return arrayNum;	
	}
	
	
	
	public static int[] imprimirArray(int[] arrayNum) {
		System.out.println("----------------");
		System.out.println("IMPRIMIENDO LISTA...");
		
		//bucle para ir imprimiendo todas las posiciones
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Posición "+i+" :"+arrayNum[i]);
		}
		
		
		
	return arrayNum;		
	}

}
