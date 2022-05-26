
public class Asignatura {
	private int codigo;
	private String nombre;
	private int credito;
	private Componentes componente;
	private Area area;
	private int horas;
	private int semestre;
	private Boolean homologable;
	private Boolean habilitable;
	private Prerrequisito prerrequisito;

	public Asignatura(int codigo, String nombre, int credito, Componentes componente, 
			Area area, int horas, int semestre, Boolean homologable, Boolean habilitable) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.credito = credito;
		this.componente = componente;
		this.area = area;
		this.horas = horas;
		this.semestre = semestre;
		this.homologable = homologable;
		this.habilitable = habilitable;
		this.prerrequisito = new Prerrequisito();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public Componentes getComponente() {
		return componente;
	}

	public void setComponente(Componentes componente) {
		this.componente = componente;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Boolean getHomologable() {
		return homologable;
	}

	public void setHomologable(Boolean homologable) {
		this.homologable = homologable;
	}

	public Boolean getHabilitable() {
		return habilitable;
	}

	public void setHabilitable(Boolean habilitable) {
		this.habilitable = habilitable;
	}

	
	public void addPrerrequisito(int valor) {
		if(valor > 12300) {
			this.prerrequisito.addAsignatura(valor);
			this.prerrequisito.setEsPorCreditos(false);
		}
		else {
			this.prerrequisito.setNumeroCreditos(valor);
			this.prerrequisito.setEsPorCreditos(true);	
		}		
	}
	
	public Object getPrerrequisito() {
		return this.prerrequisito.getPrerrequisito();
	}
	
	@Override
	public String toString() {
		String cadena = "Codigo     : " + this.codigo + "\n" + "Asignatura : " + this.nombre + "\n" 
				+ "Creditos   : " + this.credito + "\n" + "Semestre   : " + this.semestre + "\n";
		return cadena;
	}

}
