public class Variables {
	
	static final double CONSTANTE = 5;
	
	public static void main (String[] args) {
		 
		double n = 5;
		double km = CONSTANTE*n;
		System.out.println(km);
		System.out.println(a);
		
		
		
		int variableMetodo = 12; //Atributo del metodo MAIN!!
		variableMetodo++;
		System.out.println("El valor de la cosntante es: " + CONSTANTE + " y el de la variable es: " + variableMetodo);
		
		{
		int variableAmbito = 14;	
		System.out.println("El valor de la cosntante es: " + CONSTANTE + " el de la variable es: " + variableMetodo + " . El valor de la variable de ambito es: " + variableAmbito);
			}
			
		{
		int variableAmbito = 14;	
			}
		
	}
}
