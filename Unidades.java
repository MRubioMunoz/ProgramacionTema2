import java.util.Scanner;


public class Unidades {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduzca el valor de su unidad");
		double valor=sc.nextDouble();
		boolean salir = true;

	while(salir){

		System.out.println ("Pulse 1 para pasar de libras a km");
		System.out.println ("Pulse 2 para pasar de pies a metros");
		System.out.println ("Pulse 3 para pasar de yardas a metros");
		System.out.println ("Pulse 4 para pasar de millas a metros");
		System.out.println ("Pulse 5 para pasar de acres a hectareas");
		System.out.println ("Pulse 6 para pasar de onzas a mililitros");
		System.out.println ("Pulse 7 para pasar de galones a litros");


		int opcion = sc.nextInt();

	switch(opcion){
               case 1:
                   System.out.println(valor*0.453592);
                   salir = false;
                   break;
               case 2:
					System.out.println(valor*0.3048);
                   salir = false;;
                   break;
                case 3:
                  System.out.println(valor*1609.34);
                   salir = false;;
                   break;
                case 4:
                   System.out.println(valor*0.404686);
                   salir = false;;
                   break;
                case 5:
                   System.out.println(valor*29.5735);
                   salir = false;
                   break;
                case 6:
                   System.out.println(valor*29.5735);
                   salir = false;
                   break;
                case 7:
					System.out.println(valor*3.78541);
                   salir = false;;
                   break;

           }

       }
	}
}
