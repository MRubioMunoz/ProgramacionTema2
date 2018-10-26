import java.util.*;

public class CalculadoraMetodos {
	
	static Scanner sc = new Scanner(System.in);
	
	
	private double valorA;
	private double valorB;
	
	public double getValorA() {
		return valorA;
	}
	
	public double getValorB() {
		return valorB;
	}
	
	public void setValorA() {
		System.out.println("Introduzca el valor del numero a: ");
		double _valor = sc.nextDouble();
		this.valorA=_valor;
	}
	
	public void setValorB() {
		System.out.println("Introduzca el valor del numero b: ");
		double _valor = sc.nextDouble();
		this.valorB=_valor;
	}
	
	public CalculadoraMetodos(double valor, double valorB) {
		this.valorA = valor;
		this.valorB= valorB;
	}
	
	public double suma() {
		return valorA+valorB;
	}
	
	public double resta() {
		return valorA-valorB;
	}
	
	public double multiplicar() {
		return valorA*valorB;
	}
		
	public double division() {
		do {
			System.out.println("No se puede dividir entre 0, cambielo");
			setValorB();
		}while(valorB==0);

		return valorA/valorB;
		
	}

	public static void main(String[] args) {
		
		CalculadoraMetodos numero = new CalculadoraMetodos(0,0);
		numero.setValorA();
		numero.setValorB();
		
		boolean salir = false;
		
		while(!salir){
				
			System.out.println ("Pulse 1 para sumar");
			System.out.println ("Pulse 2 para restar");
			System.out.println ("Pulse 3 para multiplicar");
			System.out.println ("Pulse 4 para dividir");
			System.out.println ("Pulse 5 para cambiar valores");
			System.out.println ("Pulse 6 para salir del la calculadora");
				
			int opcion = sc.nextInt();
				
		switch(opcion){
		
		case 1:
			System.out.println(numero.suma());
			break;
		case 2:
			System.out.println(numero.resta());
			break;
		case 3:
			System.out.println(numero.multiplicar());
			break;
		case 4:
			System.out.println(numero.division());
			break;
		case 5:
			numero.setValorA();
			numero.setValorB();
			break;
		case 6:
			salir = true;
			break;

				}
			}
		}
	}

