public class Numero {
	
	private double numero;
	
	public Numero(double n){
		numero=n;
	}
	
	public double calcularDoble(){
		return numero*2;
	}		
	
	public double calcularTriple(){
		return numero*3;
	}
	
	public double calcularMitad(){
		return numero/2;
	}
	
	public static void main (String[] args) {
		
		Numero n1 = new Numero(654.654);
				
		System.out.println("Doble: " + n1.calcularDoble());
		System.out.println("Triple: " + n1.calcularTriple());
		System.out.println("Mitad: " + n1.calcularMitad());
		
	}
}
