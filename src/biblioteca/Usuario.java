package biblioteca;

public class Usuario implements Gestionable {

    private int id;
    private String nombre;
    private String correo;

    public Usuario(int id, String nombre, String correo) {

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Usuario: " + nombre);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}