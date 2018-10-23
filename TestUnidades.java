public class TestUnidades {
	
	public static void main (String[] args) {
		
		double libras = 100;
		double kilogramos= UnidadesClase.convertirLibrasAKilogramos(libras);
		System.out.println(kilogramos);
	
		double acres = 10;
		double hectareas=UnidadesClase.convertirAcresAHectareas(acres);
		System.out.println(hectareas);
		
	}
}
