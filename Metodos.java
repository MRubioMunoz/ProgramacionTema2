public class Metodos {
	
	private int edad;
	private String nombre;
	
	private static int _edad;
	private static int mayor;
	private static final  int TAM= 10;
	
	private static int []v = new int[10]; 
	
	
	public Metodos(int edad, String nombre){
		edad=0;
		nombre = "a";	
	}
	
	 public int getEdad(){
		return edad;
	}
		
	public void setEdad(int edad){
		this.edad=edad;
	}
			
	public void getNombre(){
		System.out.println(nombre);
	}
		
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
			
	public void setEdadAComparar( int _edad){
		this._edad=_edad;
	}
	
	public int getEdadAComparar(){
		return _edad;		
	}
		
	public void compararEdad(int _edad, int edad){
		if(_edad>edad){
			System.out.println("La edad con la que comparamos edad es mayor");
		}else{ if(_edad<edad){
			System.out.println("La edad con la que comparamos edad es mayor");
		}else{
			System.out.println("Las edades son iguales");
			}
		}
	}
	
	public static void mayorVector(int[] v, int TAM){
		
		mayor=v[0];
		for (int i = 1;i<TAM;i++){
			if(mayor<v[i]){
				mayor=v[i];
			}
		}	
		System.out.println(mayor);
	}
	
	public static int[] rellenarArrayDesde(int a){
		 for(int i=0;i<v.length;i++){
            v[i]=a;
            a++;
        }
        return v;
    }

public static void main (String[] args) {
		
	Metodos m = new Metodos(1,"-");
	System.out.println("Los datos de la clase Metodos son:");
	
	m.setNombre("Pedro");
	m.getNombre();
	m.setEdad(10);
	m.getEdad();
	m.setNombre("Peter");
	m.getNombre();
	m.setEdadAComparar(10);	
	m.compararEdad(m.getEdadAComparar(),m.getEdad());
	
	System.out.println("Los metodos sobre el vector: ");
	m.rellenarArrayDesde(0);		
	m.mayorVector(v,TAM);
			
	
	
	}
}

