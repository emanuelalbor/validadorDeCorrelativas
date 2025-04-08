package validadordecorrelativas;

public class Alumno {
    private String nombre;
    private Materia[] materiasAprobadas;

    public Alumno(String nombre, Materia[] materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public Materia[] getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
