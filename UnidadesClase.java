/**
 * Clase que sirve para convertir distintos tipos de datos
 * @author  Miguel rubio
 * @version  1.0
 * 
*/

public class UnidadesClase {
	/** Constante */
	public static final double LIBRAS_A_KILOGRAMOS = 0.465495; //no estan bien son al azar
	/** Constante */
	public static final double ACRES_A_HECTAREAS = 0.13654;
	
/**
 * Metodo convertirLibrasAKilogramos que convierte las libras a kilogramos
 * @return  return in type double libras*LIBRAS_A_KILOGRAMOS
 * @param  libras a convertir
*/
	public static double convertirLibrasAKilogramos(double libras){
		return libras*LIBRAS_A_KILOGRAMOS;
	}
	
	/**
 * Metodo convertirAcresAHectareas que convierte las acres a hectareas
 * @return  return in type double acres*ACRES_A_HECTAREAS
 * @param  acres a convertir
*/
	public static double convertirAcresAHectareas(double acres){
		return acres * ACRES_A_HECTAREAS;
	}
		
	}
