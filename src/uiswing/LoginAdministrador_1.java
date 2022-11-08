package uiswing;

import dominio.usuario.Sesion;
import dominio.Sistema;
import dominio.usuario.UsuarioAdministrador;
import java.awt.Frame;

public class LoginAdministrador extends Login {

    public LoginAdministrador(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public Sesion login(String username, String password) {
        return Sistema.getInstancia().loginAdministrador(username, password);
    }

    @Override
    public void mostrarProximaInterfaz(Sesion sesion) {
        MonitorUsuariosConectados monitorUsuariosConectados =
                new MonitorUsuariosConectados(null, false, (UsuarioAdministrador) sesion.getUsuario());
        monitorUsuariosConectados.setVisible(true);
    }
    
}
