package biblioteca;

import java.util.ArrayList;

public class BibliotecaDigital {

    private ArrayList<Libro> libros;

    public BibliotecaDigital() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {

        libros.add(libro);

        System.out.println("Libro agregado correctamente.");
    }

    public void mostrarLibros() {

        if (libros.isEmpty()) {

            System.out.println("No existen libros registrados.");
            return;
        }

        // Recorre todos los libros almacenados en la colección ArrayList
        for (Libro libro : libros) {

            libro.mostrarInformacion();
        }
    }
}