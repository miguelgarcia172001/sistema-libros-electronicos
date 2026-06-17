package biblioteca;

public class Libro implements Gestionable {

    private int id;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private String isbn;
    private boolean disponible;

    public Libro(int id, String titulo, String autor,
                 Categoria categoria, String isbn) {

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                titulo + " - " + autor +
                        " (" + categoria.getNombre() + ")");
    }
}