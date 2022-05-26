import java.util.ArrayList;

public class Prerrequisito {
	private ArrayList<Integer> listaAsignaturas;
	private int numeroCreditos;
	private Boolean esPorCreditos;
	
	public Prerrequisito() {
		this.listaAsignaturas = new ArrayList<Integer>();
		this.numeroCreditos = 0;
		this.esPorCreditos = null;
	}
	
	public void addAsignatura(int materia) {
		this.listaAsignaturas.add(materia);
	}
	
	public void setNumeroCreditos(int valor) {
		if(valor > 0) {
			this.esPorCreditos = true;
			this.numeroCreditos = valor;
		}
	}
	
	public void setEsPorCreditos(boolean valor) {
		this.esPorCreditos = valor;
	}
	
	public Object getPrerrequisito(){
		if(this.esPorCreditos == true)
			Integer.valueOf(this.numeroCreditos);
		else
			return this.listaAsignaturas;
		return null;
	}
}
