import java.util.HashMap;
import java.util.Map;

public class Programa {
	private Map<String, Alumno> listadoAlumnos;
	private Malla malla;
	
	public Programa(int codigo, String nombre) {
		listadoAlumnos = new HashMap<String, Alumno>();
		 malla = new Malla(codigo, nombre);
	}
	
	public void addAsignatura(Asignatura nuevaAsignatura) {
		this.malla.addAsignatura(nuevaAsignatura);
	}
	
	public void addPrerrequisito(int materia, int prerrequisito) {
		this.malla.getAsignatura(materia).addPrerrequisito(prerrequisito);
	}
	
	public void mostrarMalla() {
		this.malla.mostrarMalla();
	}
	
	public void addAlumno(String cedula, String nombre, String apellido) {
		this.listadoAlumnos.put(cedula, new Alumno(cedula, nombre, apellido, this.malla));
	}
	
	public Map<String, Alumno> getListadoAlumnos(){
		return this.listadoAlumnos;
	}
	
	public Alumno getAlumno(String cedula) {
		return this.listadoAlumnos.get(cedula);
	}
	
	public void mostrarAlumnos() {
		System.out.println("LISTADO ALUMNOS\n----------------");
		for(Alumno alumno : this.listadoAlumnos.values()) {
			System.out.println(alumno.toString());
		}
	}
}
