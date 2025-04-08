package validadordecorrelativas;



	public class Main {
		public static void main(String[] args) {
			Materia algoritmos = new Materia("Algoritmos");
			Materia paradigmas = new Materia("Paradigmas");
			Materia diseño = new Materia("Diseño de Sistemas");
	
			paradigmas.setCorrelativas(new Materia[] { algoritmos });
			diseño.setCorrelativas(new Materia[] { paradigmas });
	
			Alumno juan = new Alumno("Juan", new Materia[] { algoritmos, paradigmas });
			Inscripcion insc1 = new Inscripcion(juan, new Materia[] { diseño });
			System.out.println("Inscripción 1: " + insc1.aprobada()); // true
	
			Alumno pedro = new Alumno("Pedro", new Materia[] { algoritmos });
			Inscripcion insc2 = new Inscripcion(pedro, new Materia[] { diseño });
			System.out.println("Inscripción 2: " + insc2.aprobada()); // false
		}
	}
	
