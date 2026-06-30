package biblioteca;

public class ServicioWeb {

    // Servicio 1
    public void registrarUsuarioAPI() {
        System.out.println("POST /usuarios");
        System.out.println("Servicio web para registrar usuario ejecutado.");
    }

    // Servicio 2
    public void mostrarUsuariosAPI() {
        System.out.println("GET /usuarios");
        System.out.println("Servicio web para mostrar usuarios ejecutado.");
    }

    // Servicio 3
    public void registrarLibroAPI() {
        System.out.println("POST /libros");
        System.out.println("Servicio web para registrar libro ejecutado.");
    }

    // Servicio 4
    public void mostrarLibrosAPI() {
        System.out.println("GET /libros");
        System.out.println("Servicio web para mostrar libros ejecutado.");
    }

    // Servicio 5
    public void buscarLibroAPI() {
        System.out.println("GET /libros/busqueda");
        System.out.println("Servicio web para buscar libro ejecutado.");
    }

    // Servicio 6
    public void registrarPrestamoAPI() {
        System.out.println("POST /prestamos");
        System.out.println("Servicio web para registrar préstamo ejecutado.");
    }

    // Servicio 7
    public void devolverLibroAPI() {
        System.out.println("PUT /prestamos/devolver");
        System.out.println("Servicio web para devolver libro ejecutado.");
    }

    // Servicio 8
    public void eliminarLibroAPI() {
        System.out.println("DELETE /libros");
        System.out.println("Servicio web para eliminar libro ejecutado.");
    }
}