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

            // Crear libros
            Libro libro1 =
                    new Libro(
                            1,
                            "Java Básico",
                            "Juan Pérez",
                            categoria,
                            "ISBN001"
                    );

            Libro libro2 =
                    new Libro(
                            2,
                            "POO Avanzada",
                            "Carlos Gómez",
                            categoria,
                            "ISBN002"
                    );

            // Crear usuarios
            Usuario usuario1 =
                    new Usuario(
                            1,
                            "Luis",
                            "luis@correo.com"
                    );

            Usuario usuario2 =
                    new Usuario(
                            2,
                            "Miguel",
                            "miguel@correo.com"
                    );

            // Crear administrador
            Administrador admin =
                    new Administrador(
                            3,
                            "Administrador",
                            "admin@correo.com"
                    );

            // Crear biblioteca
            BibliotecaDigital biblioteca =
                    new BibliotecaDigital();

            // Registrar usuarios
            biblioteca.registrarUsuario(usuario1);
            biblioteca.registrarUsuario(usuario2);

            // Registrar libros
            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);

            System.out.println("\n=== USUARIOS REGISTRADOS ===");
            biblioteca.mostrarUsuarios();

            System.out.println("\n=== LIBROS REGISTRADOS ===");
            biblioteca.mostrarLibros();

            // Mostrar JSON
            System.out.println("\n=== LIBRO EN FORMATO JSON ===");
            System.out.println(libro1.convertirJSON());

            // Buscar libro
            System.out.println("\n=== BUSCAR LIBRO ===");
            biblioteca.buscarLibro("Java Básico");

            // Crear préstamo
            Prestamo prestamo =
                    new Prestamo(usuario1, libro1);

            System.out.println("\n=== REALIZAR PRÉSTAMO ===");
            prestamo.realizarPrestamo();

            biblioteca.registrarPrestamo(prestamo);

            System.out.println("\n=== PRÉSTAMOS ===");
            biblioteca.mostrarPrestamos();

            // Concurrencia
            System.out.println("\n=== CONCURRENCIA ===");

            Thread usuarioA = new Thread(() -> {
                System.out.println("Usuario 1 accediendo al sistema...");
            });

            Thread usuarioB = new Thread(() -> {
                System.out.println("Usuario 2 accediendo al sistema...");
            });

            usuarioA.start();
            usuarioB.start();

            // Devolución
            System.out.println("\n=== DEVOLUCIÓN ===");
            prestamo.devolverLibro();

            biblioteca.devolverLibro("Java Básico");

            // Eliminar libro
            System.out.println("\n=== ELIMINAR LIBRO ===");
            biblioteca.eliminarLibro("POO Avanzada");

            System.out.println("\n=== LIBROS ACTUALIZADOS ===");
            biblioteca.mostrarLibros();

            // Reporte
            System.out.println("\n=== REPORTE ADMINISTRADOR ===");
            admin.generarReporte();

            // Servicios web simulados
            System.out.println("\n=== SERVICIOS WEB ===");

            ServicioWeb api = new ServicioWeb();

            api.registrarUsuarioAPI();
            api.mostrarUsuariosAPI();
            api.registrarLibroAPI();
            api.mostrarLibrosAPI();
            api.buscarLibroAPI();
            api.registrarPrestamoAPI();
            api.devolverLibroAPI();
            api.eliminarLibroAPI();

        } catch (Exception e) {

            System.out.println("Error detectado: "
                    + e.getMessage());

        }
    }
}