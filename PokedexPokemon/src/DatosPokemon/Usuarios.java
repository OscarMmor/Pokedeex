
package DatosPokemon;

public class Usuarios {

    private String nombreUsuario;
    private String contrasena;
    private String rol; // "Entrenador" o "Cuidador"

    public Usuarios(String nombreUsuario, String contrasena, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Usuarios() {
    }

 
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

/* En esta parte del código creamos lo que es los getters y setters los cuales nos p
ermiten controlar el acceso y la modificación de los atributos de una clase  y sus constructores*/
