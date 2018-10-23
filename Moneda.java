//Orientado a Objetos

public class Moneda {
	
	private double valor;
	
	private final double EURO_A_DOLAR = 1.6;
	private final double DOLAR_A_EURO = 0.86;
	
	
	public Moneda(double _valor){
		valor=_valor;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void cambioEurosADolares(double _valor){
		System.out.println("De euros a dolares: " +  _valor*EURO_A_DOLAR);
	}
	
	public double cambioDolaresAEuros(double _valor){
		return _valor*DOLAR_A_EURO;
	}
	
	public static void main (String[] args) {
		
		Moneda euro = new Moneda(651.52);
		
		euro.cambioEurosADolares(euro.getValor());
		
		Moneda dolar = new Moneda(544.22);
		
		System.out.println("De dolares a euros: " + dolar.cambioDolaresAEuros(dolar.getValor()));
			
	}
}

