
public class Usuario {
	  private String nombre;
	    private String correo;

	    public Usuario(String nombre, String correo) {
	        this.nombre = nombre;
	        this.correo = correo;
	    }

	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }

	    public String getCorreo() {
	        return correo;
	    }

	    @Override
	    public String toString() {
	        return "Usuario{nombre='" + nombre + "', correo='" + correo + "'}";
	    }
}
