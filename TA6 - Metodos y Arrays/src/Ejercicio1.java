import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Calculadora de áreas de figuras (circulo, triangulo o cuadrado)---");
		System.out.print("Introduce una figura: ");
			String figura = sc.nextLine();
			figura=figura.toLowerCase();
			
			
			double resultado=0;
			switch (figura) {
			case "circulo":
				System.out.print("Introduce un radio: ");
					double radio=sc.nextDouble();
				
				resultado=areaCirculo(radio);
				System.err.println("El área es: "+resultado);
				
				break;
			case "triangulo":
				System.out.print("Introduce la altura: ");
					double altura=sc.nextDouble();
				System.out.print("Introduce la base: ");
					double base=sc.nextDouble();
				
				resultado=areaTriangulo(base, altura);
				System.err.println("El área es: "+resultado);
				
				break;
			case "cuadrado":
				System.out.print("Introduce el lado: ");
					double lado=sc.nextDouble();
			
				resultado=areaCuadrado(lado);
				System.err.println("El área es: "+resultado);
		
				break;
			default:
				System.out.println("No has introducido una figura válida.");
				break;
			}
	}
	
	
	public static double areaCirculo(double radio) {
		double resultado=(Math.pow(radio,2)*Math.PI);
		
	return resultado;
	}
	
	public static double areaTriangulo(double base, double altura) {
		double resultado=((base*altura)/2);

	return resultado;
	}
	
	
	public static double areaCuadrado(double lado) {
		double resultado=(lado*lado);

	return resultado;
	}

}
