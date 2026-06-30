package biblioteca;

import java.util.ArrayList;

public class BibliotecaDigital {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;

    public BibliotecaDigital() {

        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    // Servicio 1 - Registrar libro
    public void agregarLibro(Libro libro) {

        libros.add(libro);

        System.out.println("Libro agregado correctamente.");
    }

    // Servicio 2 - Mostrar libros
    public void mostrarLibros() {

        if (libros.isEmpty()) {

            System.out.println("No existen libros registrados.");
            return;
        }

        for (Libro libro : libros) {

            libro.mostrarInformacion();
        }
    }

    // Servicio 3 - Registrar usuario
    public void registrarUsuario(Usuario usuario) {

        usuarios.add(usuario);

        System.out.println("Usuario registrado correctamente.");
    }

    // Servicio 4 - Mostrar usuarios
    public void mostrarUsuarios() {

        if (usuarios.isEmpty()) {

            System.out.println("No existen usuarios registrados.");
            return;
        }

        for (Usuario usuario : usuarios) {

            usuario.mostrarInformacion();
        }
    }

    // Servicio 5 - Buscar libro por titulo
    public void buscarLibro(String titulo) {

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                System.out.println("Libro encontrado:");
                libro.mostrarInformacion();
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    // Servicio 6 - Eliminar libro
    public void eliminarLibro(String titulo) {

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                libros.remove(libro);

                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró el libro.");
    }

    // Servicio 7 - Registrar prestamo
    public void registrarPrestamo(Prestamo prestamo) {

        prestamos.add(prestamo);

        System.out.println("Prestamo registrado correctamente.");
    }

    // Servicio 8 - Mostrar prestamos
    public void mostrarPrestamos() {

        if (prestamos.isEmpty()) {

            System.out.println("No existen prestamos registrados.");
            return;
        }

        for (Prestamo prestamo : prestamos) {

            prestamo.mostrarInformacion();
        }
    }

    // Servicio 9 - Devolver libro
    public void devolverLibro(String titulo) {

        System.out.println("Libro devuelto correctamente: " + titulo);
    }
}