package validadordecorrelativas;

public class Materia {
    private String nombre;
    private Materia[] correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new Materia[0];
    }

    public void setCorrelativas(Materia[] correlativas) {
        this.correlativas = correlativas;
    }

    public Materia[] getCorrelativas() {
        return correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esIgualA(Materia otra) {
        return otra != null && this.nombre.equals(otra.getNombre());
    }
}
