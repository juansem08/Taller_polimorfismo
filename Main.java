public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Libro
        Libro libro = new Libro("Cien años de soledad", 45000.0, 496, 1967);
        
        // Crear un objeto de tipo Disco
        Disco disco = new Disco("The Dark Side of the Moon", 55000.0, 42.5f);
        
        // Crear un objeto de tipo Video
        Video video = new Video("Inception", 30000.0, 2.48f, Idioma.ESPANOL);

        // Imprimir los objetos en consola
        System.out.println("--- Sistema de Gestion de Publicaciones ---");
        System.out.println(libro.toString());
        System.out.println(disco.toString());
        System.out.println(video.toString());
    }
}
