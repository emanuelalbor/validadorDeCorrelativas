package validadordecorrelativas;

public class Inscripcion {
    private Alumno alumno;
    private Materia[] materias;

    public Inscripcion(Alumno alumno, Materia[] materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada() {
        for (int i = 0; i < materias.length; i++) {
            Materia materia = materias[i];
            Materia[] correlativas = materia.getCorrelativas();

            for (int j = 0; j < correlativas.length; j++) {
                if (!alumnoTieneMateriaAprobada(correlativas[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean alumnoTieneMateriaAprobada(Materia buscada) {
        Materia[] aprobadas = alumno.getMateriasAprobadas();

        for (int i = 0; i < aprobadas.length; i++) {
            if (aprobadas[i] != null && aprobadas[i].esIgualA(buscada)) {
                return true;
            }
        }
        return false;
    }
}
