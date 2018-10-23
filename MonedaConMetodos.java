//SIN OBJETOS

public class MonedaConMetodos {
	
	private static final  double EURO_A_DOLAR = 1.6;
	private final static double DOLAR_A_EURO = 0.86;
	
	//Salida por cabecera:
	
	public static double cambioDolaresAEuros(double valor){
		return valor*DOLAR_A_EURO;
	}
	//Salida por impresion en pantalla:
	
	public static void cambioEurosADolares(double valor){
		System.out.println(valor*EURO_A_DOLAR);
	}
	
	public static void main (String[] args) {
			 
	 double monedaACambiar= 5.2;
	 
	 System.out.println(cambioDolaresAEuros(monedaACambiar));
	 cambioEurosADolares(monedaACambiar);
	 
	}
}
