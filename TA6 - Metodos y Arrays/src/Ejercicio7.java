import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {

		//pedimos por panel cantidad de diner y moneda
		String cantidad = JOptionPane.showInputDialog("Introduce una cantidad de dinero");
			double cantidadDinero=Double.parseDouble(cantidad);
			
		String moneda = JOptionPane.showInputDialog("Introduce una moneda a convertir (dolares, yenes o libras)");
		//la pasamos a minusculas
			moneda.toLowerCase();
			
			//llamamos al metodo
			conversorMoneda(cantidadDinero, moneda);
				
	}
	
	
	
	//creamos el metodo void
	public static void conversorMoneda(double cantidadDinero, String moneda) {
		double total=0;
		
		//sw, segun la moneda que pide hace una operacion u otra
		switch (moneda) {
		case "dolares":
			total=cantidadDinero*0.86;
			
			JOptionPane.showMessageDialog(null, cantidadDinero+ " € equivalen a "+total+" dolares.");
			
			break;
		case "yenes":
			total=cantidadDinero*129.852;
			
			JOptionPane.showMessageDialog(null, cantidadDinero+ " € equivalen a "+total+" yenes.");
			
			
			break;
		case "libras":
			total=cantidadDinero*1.28611;
			
			JOptionPane.showMessageDialog(null, cantidadDinero+ " € equivalen a "+total+" libras.");
			
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Moneda incorrecta.");
			break;
		}
		
		
	
		
		
		
		
	}

}
