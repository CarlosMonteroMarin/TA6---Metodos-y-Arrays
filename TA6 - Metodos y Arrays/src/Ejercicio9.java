import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		String tamañoLista = JOptionPane.showInputDialog("Introduce el tamaño de la lista: ");
			int tamañoListaNum=Integer.parseInt(tamañoLista);
			
		int listaNumeros[]= new int [tamañoListaNum];
		
		//llamamos los metodos
		rellenarArray(listaNumeros);
		contenidoSumaArray(listaNumeros);
		

	}
	
	
	public static void rellenarArray (int[] listaNumeros) {
		
		//bucle para recorrer todo el array e ir introduciendo los valores random
		for (int i = 0; i < listaNumeros.length; i++) {
			int random= (int)(Math.random()*10+0);
			
			listaNumeros[i]=random;
				
		}
		
		
		
		
		
		
	}
	
	//bucle para imprimir las posiciones y a la vez va sumando todos los numeros generados para luego imprimirlos fuera del for
	public static void contenidoSumaArray (int[] listaNumeros) {
		int suma=0;
		for (int i = 0; i < listaNumeros.length; i++) {
			
			System.out.println("Posición "+i+ ": "+listaNumeros[i]);
			suma=suma+listaNumeros[i];
			
		}
		
		System.out.println("Suma de todos los valores de la lista: "+suma);
		
	}

}
