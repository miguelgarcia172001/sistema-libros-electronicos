package biblioteca;

public class Administrador extends Usuario {

    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void generarReporte() {
        System.out.println("Reporte generado correctamente.");
    }
}