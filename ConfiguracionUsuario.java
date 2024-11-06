
public class ConfiguracionUsuario {
	private static ConfiguracionUsuario instancia;
    private final int maximoUsuarios = 10; 

    private ConfiguracionUsuario() {

    }

    public static ConfiguracionUsuario getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionUsuario();
        }
        return instancia;
    }

    public int getMaximoUsuarios() {
        return maximoUsuarios;
    }
}
