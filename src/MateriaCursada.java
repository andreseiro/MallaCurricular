
public class MateriaCursada {
	int codigoAsignatura;
	double nota;
	PeriodoAcademico periodo;
	
	public MateriaCursada(int codigoAsignatura, double nota, PeriodoAcademico periodo) {
		this.codigoAsignatura = codigoAsignatura;
		this.nota = nota;
		this.periodo = periodo;
	}

	public int getCodigoAsignatura() {
		return codigoAsignatura;
	}

	public void setCodigoAsignatura(int codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public PeriodoAcademico getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(PeriodoAcademico periodo) {
		this.periodo = periodo;
	}
}