
public enum PeriodoAcademico {
	_2020I(2020, "I"), _2020II(2020, "II"), _2021I(2021, "I"), _2021II(2021, "II"), _2022I(2022, "I"), 
	_2022II(2022, "II"), _2023I(2023, "I"), _2023II(2023, "II"), _2024I(2024, "I"), _2024II(2024, "II");
	
	private int anio;
	private String semestre;
	
	private PeriodoAcademico(int anio, String semestre) {
		this.anio = anio;
		this.semestre = semestre;
	}

	public int getAnio() {
		return anio;
	}

	public String getSemestre() {
		return semestre;
	}
	
	@Override
	public String toString() {
		return this.anio + "-" + this.semestre;
	}
}