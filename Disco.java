public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco() {
        super();
    }

    public Disco(float duracionMinutos) {
        super();
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(String titulo, double precio, float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }
}
