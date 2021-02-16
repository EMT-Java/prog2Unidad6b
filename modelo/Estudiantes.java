package modelo;

import java.util.ArrayList;

public class Estudiantes {
	
	private ArrayList<Alumno> lista;

	public Estudiantes() {
		lista=new ArrayList<>();
	}
	
	public void agregar(Alumno a) {
		lista.add(a);
	}
	
	public void eliminar(Alumno a) {
		lista.remove(a);
	}
	
	public boolean contiene(Alumno a) {
		boolean esta=false;
		
		if (lista.contains(a))
			esta=true;
		return esta;
	}
	
	public Alumno devolver(int i) {
		return lista.get(i);
	}
	
	public int cantidad() {
		return lista.size();
	}
	
	public double totalCuotas() {
		double suma=0;
		for(Alumno actual:lista) {
			suma=suma+actual.cuotaNeta();
		}
		
		return suma;
	}
	
	public double totalCuotas1() {
		double suma=0;
		for(int x=0; x<=lista.size(); x++) {
			suma=suma+lista.get(x).cuotaNeta();
		}		
		return suma;
	}
	
	public int totalBecados() {
		int cantidad = 0;
		for (Alumno actual : lista) {
			if (actual instanceof Becado)
				cantidad++;
			}
		return cantidad;
		}

	@Override
	public String toString() {
		return  lista + "\n";
	}
	//+"Suma de cuotas netas = " + totalCuotas()
	//+ "\nTotal de estudiantes becados = " + totalBecados();
	//}
	
	
}
