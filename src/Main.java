public class Main {	
	
	public static void main(String[] args) {
		Programa ingenieria = new Programa(123, "Ingenieria de Sistemas y Computación");
		
		//Llenado de  con todas las asignaturas
		ingenieria.addAsignatura(new Asignatura(12301, "Matematicas Generales", 2,Componentes.FACULTAD,Area.AB, 4, 1, true, true));
	    ingenieria.addAsignatura(new Asignatura(12302, "Introduccion a la Ingenieria de Sistemas y Computacion", 3,Componentes.PROFESIONAL,Area.IA, 4, 1, true, true));
	    ingenieria.addAsignatura(new Asignatura(12303, "Uniquindianidad", 2, Componentes.GENERAL,Area.FC, 2, 1, false, true));
		ingenieria.addAsignatura(new Asignatura(12304, "Logica de programacion", 3, Componentes.PROFESIONAL, Area.ABI, 4, 1, true, true));
		ingenieria.addAsignatura(new Asignatura(12305, "Lectura y escritura en ingenieria", 2,Componentes.FACULTAD,Area.FC, 4, 1, true, true));
		ingenieria.addAsignatura(new Asignatura(12306, "Electiva de formacion personal 1 ", 2,Componentes.PERSONAL, Area.FC, 4, 1, true, true));
		ingenieria.addAsignatura(new Asignatura(12307, "Calculo diferencial", 4, Componentes.PROFESIONAL,Area.AB, 6, 2, true, true));
		ingenieria.addAsignatura(new Asignatura(12308, "Algebra lineal", 3, Componentes.PROFESIONAL, Area.AB, 4, 2, true, true));
		ingenieria.addAsignatura(new Asignatura(12309, "Programacion I", 3, Componentes.PROFESIONAL, Area.IA , 4, 2, false, true));
		ingenieria.addAsignatura(new Asignatura(12310, "Pensamiento Sistémico", 3, Componentes.PROFESIONAL, Area.IA, 4, 2, true, true));
		ingenieria.addAsignatura(new Asignatura(12311, "Fundamentos de electrícidad", 3, Componentes.PROFESIONAL, Area.ABI, 4, 2, true, true));
		ingenieria.addAsignatura(new Asignatura(12312, "Calculo Integral", 4, Componentes.PROFESIONAL, Area.AB, 5, 3, true, true));
		ingenieria.addAsignatura(new Asignatura(12313, "Fisica general", 4, Componentes.PROFESIONAL, Area.ABI, 5, 3, true, true));
		ingenieria.addAsignatura(new Asignatura(12314, "Matematicas discretas", 3, Componentes.PROFESIONAL, Area.ABI, 4, 3, true, true));
		ingenieria.addAsignatura(new Asignatura(12315, "Programacion II", 3, Componentes.PROFESIONAL, Area.IA, 4, 3, false , true));
		ingenieria.addAsignatura(new Asignatura(12316, "Teoria y diseño organizacional", 3, Componentes.PROFESIONAL, Area.IA, 4, 3, true, true));
		ingenieria.addAsignatura(new Asignatura(12317, "Calculo Vectorial Multivariado", 4, Componentes.PROFESIONAL, Area.AB, 5, 4, false, true));
		ingenieria.addAsignatura(new Asignatura(12318, "Ecuaciones diferenciales", 3, Componentes.PROFESIONAL, Area.AB, 4, 4, true, true));
		ingenieria.addAsignatura(new Asignatura(12319, "Segunda lengua 1", 2, Componentes.GENERAL, Area.FC, 2, 4, true, true));
		ingenieria.addAsignatura(new Asignatura(12320, "Programacion III", 3, Componentes.PROFESIONAL, Area.IA, 4, 4, false, true));
		ingenieria.addAsignatura(new Asignatura(12321, "Fundamentos de infraestructura computacional", 3, Componentes.PROFESIONAL, Area.IA, 4, 4, true, true));
		ingenieria.addAsignatura(new Asignatura(12322, "Estadística y probabilidad", 3,Componentes.PROFESIONAL, Area.ABI, 4, 5, true, true));
		ingenieria.addAsignatura(new Asignatura(12323, "Teoria de grafos", 3, Componentes.PROFESIONAL, Area.ABI, 4, 5, true, true));
		ingenieria.addAsignatura(new Asignatura(12324, "Segunda lengua 2", 2, Componentes.GENERAL, Area.FC, 2, 5, true, true));
		ingenieria.addAsignatura(new Asignatura(12325, "Estructura de datos", 3, Componentes.PROFESIONAL, Area.IA, 4, 5, false, true));
		ingenieria.addAsignatura(new Asignatura(12326, "Sistemas de informacion", 3, Componentes.PROFESIONAL, Area.IA, 4, 5, true, true));
		ingenieria.addAsignatura(new Asignatura(12327, "Dirección estratégica de TI", 3, Componentes.PROFESIONAL, Area.IA, 4, 6, true, true));
		ingenieria.addAsignatura(new Asignatura(12328, "Análisis numérico", 3, Componentes.PROFESIONAL, Area.ABI, 4, 6, true, true));
		ingenieria.addAsignatura(new Asignatura(12329, "Base de datos I", 3, Componentes.PROFESIONAL, Area.IA, 4, 6, false, true));
		ingenieria.addAsignatura(new Asignatura(12330, "Ingenieria de software I", 3, Componentes.PROFESIONAL, Area.IA, 4, 6, false, true));
		ingenieria.addAsignatura(new Asignatura(12331, "Infraestructura computacional", 4,Componentes.PROFESIONAL, Area.IA, 6, 6, true, true));
		ingenieria.addAsignatura(new Asignatura(12332, "Teoria de lenguajes formales",3, Componentes.PROFESIONAL, Area.ABI, 4, 7, true, true));
		ingenieria.addAsignatura(new Asignatura(12333, "Base de datos II", 3, Componentes.PROFESIONAL, Area.IA, 4, 7, false, true));
		ingenieria.addAsignatura(new Asignatura(12334, "Programacion avanzada", 3, Componentes.PROFESIONAL, Area.IA, 4, 7, false, true));
		ingenieria.addAsignatura(new Asignatura(12335, "Ingenieria de software II", 3, Componentes.PROFESIONAL,Area.IA, 4, 7, false, true));
		ingenieria.addAsignatura(new Asignatura(12336, "Infraestructura de comunicaciones", 4, Componentes.PROFESIONAL, Area.IA, 6, 7, true, true));
		ingenieria.addAsignatura(new Asignatura(12337, "Ingenieria economica", 3, Componentes.PROFESIONAL, Area.IA, 4, 8, true, true));
		ingenieria.addAsignatura(new Asignatura(12338, "Fundamentos de HCI", 3, Componentes.PROFESIONAL, Area.IA, 4, 8, true, true));
		ingenieria.addAsignatura(new Asignatura(12339, "Análisis de algoritmos", 3, Componentes.PROFESIONAL,Area.IA, 4, 8, false, true));
		ingenieria.addAsignatura(new Asignatura(12340, "Seminario de investigacion", 3, Componentes.PROFESIONAL, Area.ABI, 4, 8, true, true));
		ingenieria.addAsignatura(new Asignatura(12341, "Ingenieria de software III", 3, Componentes.PROFESIONAL, Area.IA, 4, 8, false , true));
		ingenieria.addAsignatura(new Asignatura(12342, "Formulacion y evaluacion de proyectos", 2, Componentes.PROFESIONAL, Area.IA, 2, 9, true, true));
		ingenieria.addAsignatura(new Asignatura(12343, "Administracion", 2, Componentes.FACULTAD, Area.FC, 4, 9, true, true));
		ingenieria.addAsignatura(new Asignatura(12344, "Profundizacion 1", 3, Componentes.PROFESIONAL, Area.IA, 4, 9, false, true));
		ingenieria.addAsignatura(new Asignatura(12345, "Profundizacion 2", 3, Componentes.PROFESIONAL, Area.IA, 4, 9, false, true));
		ingenieria.addAsignatura(new Asignatura(12346, "Administracion de infraestructura de TI", 3, Componentes.PROFESIONAL, Area.IA, 4, 9, true, true));
		ingenieria.addAsignatura(new Asignatura(12347, "Administracion de proyectos", 2, Componentes.PROFESIONAL, Area.IA, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12348, "Inteligencia Artificial", 3,Componentes.PROFESIONAL, Area.IA, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12349, "Legislacion laboral y Propiedad intelectual", 2, Componentes.PROFESIONAL, Area.IA, 2, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12350, "Profundizacion  3", 3, Componentes.PROFESIONAL, Area.IA, 4, 10, false, true));
		ingenieria.addAsignatura(new Asignatura(12351, "Profundizacion 4", 3,Componentes.PROFESIONAL, Area.IA, 4, 10, false, true));
		ingenieria.addAsignatura(new Asignatura(12352, "Seminario de Ingenieria ", 2, Componentes.FACULTAD, Area.FC, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12353, "Trabajo de grado", 2, Componentes.PROFESIONAL, Area.IA, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12354, "Electiva formacion personal 2 ", 2, Componentes.PERSONAL,Area.FC, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12355, "Electiva formacion personal 3", 2,Componentes.PERSONAL,Area.FC, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12356, "Catedra multidisciplinar", 0, Componentes.FACULTAD, Area.FC, 4, 10, true, true));
		ingenieria.addAsignatura(new Asignatura(12357, "Etica profesional", 2, Componentes.FACULTAD, Area.FC, 4, 10, true, true));
		
		//Llenado de prerrequisitos
		ingenieria.addPrerrequisito(12307, 12301);
		ingenieria.addPrerrequisito(12308, 12301);
		ingenieria.addPrerrequisito(12309, 12304);
		
		ingenieria.addPrerrequisito(12312, 12307);
		ingenieria.addPrerrequisito(12313, 12307);
		ingenieria.addPrerrequisito(12314, 12308);
		ingenieria.addPrerrequisito(12315, 12309);
		ingenieria.addPrerrequisito(12316, 12310);
		
		ingenieria.addPrerrequisito(12317, 12312);
		ingenieria.addPrerrequisito(12318, 12312);
		ingenieria.addPrerrequisito(12320, 12315);
		ingenieria.addPrerrequisito(12321, 12311);
		
		ingenieria.addPrerrequisito(12322, 12317);
		ingenieria.addPrerrequisito(12323, 12314);
		ingenieria.addPrerrequisito(12324, 12319);
		ingenieria.addPrerrequisito(12325, 12320);
		ingenieria.addPrerrequisito(12326, 12316);
		
		ingenieria.addPrerrequisito(12327, 12326);
		ingenieria.addPrerrequisito(12328, 12318);
		ingenieria.addPrerrequisito(12329, 12322);
		ingenieria.addPrerrequisito(12329, 12325);
		ingenieria.addPrerrequisito(12330, 12320);
		ingenieria.addPrerrequisito(12331, 12321);
		
		ingenieria.addPrerrequisito(12332, 12323);
		ingenieria.addPrerrequisito(12333, 12329);
		ingenieria.addPrerrequisito(12333, 12327);
		ingenieria.addPrerrequisito(12334, 12325);
		ingenieria.addPrerrequisito(12335, 12330);
		ingenieria.addPrerrequisito(12336, 12331);
		
		ingenieria.addPrerrequisito(12337, 12322);
		ingenieria.addPrerrequisito(12338, 12330);
		ingenieria.addPrerrequisito(12339, 12325);
		ingenieria.addPrerrequisito(12341, 12335);
		
		ingenieria.addPrerrequisito(12342, 12337);
		ingenieria.addPrerrequisito(12341, 12340);
		ingenieria.addPrerrequisito(12346, 12336);
		
		ingenieria.addPrerrequisito(12347, 12342);
		ingenieria.addPrerrequisito(12348, 12317);
		ingenieria.addPrerrequisito(12348, 12339);
		
		ingenieria.addPrerrequisito(12353, 12344);
		ingenieria.addPrerrequisito(12353, 12345);
		
		ingenieria.addPrerrequisito(12343, 120);
		ingenieria.addPrerrequisito(12344, 120);
		ingenieria.addPrerrequisito(12345, 120);
		
		ingenieria.addPrerrequisito(12350, 130);
		ingenieria.addPrerrequisito(12351, 130);
	
		ingenieria.mostrarMalla();
		
		//Creacion de Alumnos

		ingenieria.addAlumno("1088123123", "Juan Camilo","Perez Garcia");
		ingenieria.addAlumno("98765432", "Camila Maria", "Suarez Mendoza");
		ingenieria.addAlumno("42987987", "Sofia", "Moralez Abad");
		
		//Agregar Materias a alumnos
		ingenieria.getAlumno("1088123123").addMateriaCursada(12301, 3.8, PeriodoAcademico._2020I);
		ingenieria.getAlumno("1088123123").addMateriaCursada(12302, 4.0, PeriodoAcademico._2020I);
		ingenieria.getAlumno("1088123123").addMateriaCursada(12303, 3.8, PeriodoAcademico._2020I);
		ingenieria.getAlumno("1088123123").addMateriaCursada(12304, 2.0, PeriodoAcademico._2020I);
		ingenieria.getAlumno("1088123123").addMateriaCursada(12305, 4.0, PeriodoAcademico._2020I);
		ingenieria.getAlumno("1088123123").addMateriaCursada(12306, 3.5, PeriodoAcademico._2020I);
		
		ingenieria.getAlumno("98765432").addMateriaCursada(12301, 3.0, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12302, 3.6, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12303, 4.1, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12304, 4.6, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12305, 3.9, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12306, 3.1, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12307, 3.6, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12308, 3.2, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12309, 2.0, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12310, 4.1, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12311, 3.9, PeriodoAcademico._2020II);
		ingenieria.getAlumno("98765432").addMateriaCursada(12309, 4.0, PeriodoAcademico._2021I);
		
		ingenieria.mostrarAlumnos();	
	}

}
