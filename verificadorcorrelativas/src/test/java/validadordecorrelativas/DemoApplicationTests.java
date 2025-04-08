package validadordecorrelativas;


public class DemoApplicationTests {
    public static void main(String[] args) {
        testInscripcionExitosa();
        testInscripcionFallidaPorFaltaDeCorrelativas();
        testInscripcionSinCorrelativas();
    }

    private static void testInscripcionExitosa() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.setCorrelativas(new Materia[] { algoritmos });

        Alumno alumno = new Alumno("Lucas", new Materia[] { algoritmos });

        Inscripcion insc = new Inscripcion(alumno, new Materia[] { paradigmas });

        System.out.println("[OK] Test inscripción exitosa: " + (insc.aprobada() == true));
    }

    private static void testInscripcionFallidaPorFaltaDeCorrelativas() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.setCorrelativas(new Materia[] { algoritmos });

        Alumno alumno = new Alumno("Lucas", new Materia[] { }); // no aprobó nada

        Inscripcion insc = new Inscripcion(alumno, new Materia[] { paradigmas });

        System.out.println("[OK] Test inscripción fallida por correlativas: " + (insc.aprobada() == false));
    }

    private static void testInscripcionSinCorrelativas() {
        Materia algoritmos = new Materia("Algoritmos");
        // sin correlativas

        Alumno alumno = new Alumno("Lucas", new Materia[] { });

        Inscripcion insc = new Inscripcion(alumno, new Materia[] { algoritmos });

        System.out.println("[OK] Test inscripción sin correlativas: " + (insc.aprobada() == true));
    }
}

