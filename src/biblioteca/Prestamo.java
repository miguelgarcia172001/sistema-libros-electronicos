package biblioteca;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    // Verifica si el libro está disponible antes de prestarlo
    public void realizarPrestamo() {

        try {

            if (libro.isDisponible()) {

                libro.prestar();

                System.out.println("Préstamo realizado correctamente.");

            } else {

                throw new Exception("El libro no está disponible.");

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    // Devuelve el libro y lo marca como disponible nuevamente
    public void devolverLibro() {

        libro.devolver();

        System.out.println("Libro devuelto correctamente.");
    }
}