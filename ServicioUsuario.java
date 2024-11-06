import java.util.ArrayList;
import java.util.List;
public class ServicioUsuario {
	  private List<Usuario> usuarios = new ArrayList<>();

	    public Usuario crearUsuario(String nombre, String correo) {
	        ConfiguracionUsuario config = ConfiguracionUsuario.getInstance(); // Accede a la configuración

	        if (usuarios.size() >= config.getMaximoUsuarios()) {
	            System.out.println("Límite de usuarios alcanzado. No se puede crear más usuarios.");
	            return null;
	        }

	        Usuario usuario = new Usuario(nombre, correo);
	        usuarios.add(usuario);
	        System.out.println("Usuario creado: " + usuario);
	        return usuario;
	    }

	    public List<Usuario> getUsuarios() {
	        return usuarios;
	    }
}
