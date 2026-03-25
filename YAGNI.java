public class NoYAGNI {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "ADMIN");
        usuario.mostrarInformacion();
    }
}

class Usuario {
    private String nombre;
    private String rol;

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);

        // Funcionalidades que NO se necesitan aún
        enviarCorreo();
        validarPermisosAvanzados();
    }

    private void enviarCorreo() {
        System.out.println("Enviando correo...");
    }

    private void validarPermisosAvanzados() {
        System.out.println("Validando permisos avanzados...");
    }
}

public class ConYAGNI {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "ADMIN");
        usuario.mostrarInformacion();
    }
}

class Usuario {
    private String nombre;
    private String rol;

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
    }
}