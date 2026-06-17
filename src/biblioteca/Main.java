package biblioteca;

public class Main {

    public static void main(String[] args) {

        try {

            // Crear categoría
            Categoria categoria =
                    new Categoria(
                            1,
                            "Programación",
                            "Libros de desarrollo"
                    );

            // Crear libro
            Libro libro =
                    new Libro(
                            1,
                            "Java Básico",
                            "Juan Pérez",
                            categoria,
                            "ISBN001"
                    );

            // Crear usuario
            Usuario usuario =
                    new Usuario(
                            1,
                            "Luis",
                            "luis@correo.com"
                    );

            // Crear administrador
            Administrador admin =
                    new Administrador(
                            2,
                            "Administrador",
                            "admin@correo.com"
                    );

            // Crear biblioteca digital
            BibliotecaDigital biblioteca =
                    new BibliotecaDigital();

            // Agregar libro a la biblioteca
            biblioteca.agregarLibro(libro);

            System.out.println("=== LIBROS REGISTRADOS ===");
            biblioteca.mostrarLibros();

            // Crear préstamo
            Prestamo prestamo =
                    new Prestamo(usuario, libro);

            System.out.println("\n=== PRÉSTAMO ===");

            /*
             * Verifica si el libro está disponible
             * antes de realizar el préstamo.
             */
            prestamo.realizarPrestamo();

            System.out.println("\n=== DEVOLUCIÓN ===");

            /*
             * Devuelve el libro y lo marca
             * nuevamente como disponible.
             */
            prestamo.devolverLibro();

            System.out.println("\n=== REPORTE ===");

            /*
             * El administrador puede generar
             * reportes del sistema.
             */
            admin.generarReporte();

        } catch (Exception e) {

            System.out.println("Error detectado: "
                    + e.getMessage());

        }
    }
}