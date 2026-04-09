public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro() {
        super();
    }

    public Libro(int numeroPaginas, int anioPublicacion) {
        super();
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(String titulo, double precio, int numeroPaginas, int anioPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", numeroPaginas=" + numeroPaginas +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
