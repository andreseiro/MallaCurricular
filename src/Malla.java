import java.util.HashMap;
import java.util.Map;

public class Malla {
	private int codigo;
	private String nombre;
	private Map<Integer, Asignatura> mallaCurricular;
	
	public Malla(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.mallaCurricular = new HashMap<Integer, Asignatura>();
	}
	
	public void addAsignatura(Asignatura materia) {
		this.mallaCurricular.put(materia.getCodigo(), materia);
	}
	
	public Asignatura getAsignatura(int codigo) {
		return this.mallaCurricular.get(codigo);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public Map<Integer, Asignatura> getMalla(){
		return this.mallaCurricular;
	}

	public String getNombre() {
		return nombre;
	}

	public void mostrarMalla() {
		System.out.println("MALLA CURRICULAR\n----------------");
		for(Asignatura materia : this.mallaCurricular.values()) {
			System.out.println(materia.toString());
		}
	}
}