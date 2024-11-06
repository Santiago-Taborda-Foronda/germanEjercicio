
public class Principal {

	public static void main(String[] args) {
		  ServicioUsuario servicioUsuario = new ServicioUsuario();


	        for (int i = 1; i <= 12; i++) {
	            servicioUsuario.crearUsuario("Usuario" + i, "usuario" + i + "@ejemplo.com");
	        }

	        System.out.println("\nUsuarios creados:");
	        for (Usuario usuario : servicioUsuario.getUsuarios()) {
	            System.out.println(usuario);
	        }

	}

}
