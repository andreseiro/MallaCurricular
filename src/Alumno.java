import java.util.ArrayList;

public class Alumno {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<MateriaCursada> cursadas;
	private Malla planEstudio;
	
	public Alumno(String cedula, String nombre, String apellido, Malla planEstudio) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cursadas = new ArrayList<MateriaCursada>();
		this.planEstudio = planEstudio;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<MateriaCursada> getCursadas() {
		return cursadas;
	}

	public void addMateriaCursada(int codigoMateria, double notaObtenida, PeriodoAcademico periodo) {
		MateriaCursada obj = new MateriaCursada(codigoMateria, notaObtenida, periodo);
		this.cursadas.add(obj);
	}
	
	public String getMateriasVistas() {
		String cadena = "HISTORIAL ACADÉMICO";
		for(MateriaCursada m : this.cursadas) {
			cadena += "\n   Codigo Asignatura: " + m.getCodigoAsignatura() 
					+ "\n   Nombre Asignatura: " +  this.planEstudio.getAsignatura(m.getCodigoAsignatura()).getNombre()
					+ "\n   Nota: " + m.getNota() 
					+ "\n   Periodo: " + m.getPeriodo();
		}
		return cadena;
	}
	
	@Override
	public String toString() {
		String cadena = "Cédula     : " + this.cedula 
			   + "\n" + "Nombres    : " + this.nombre + "\n" 
			   + "Apellidos  : " + this.apellido + "\n" 
			   + getMateriasVistas() + "\n";
		return cadena;

	}
	
}
