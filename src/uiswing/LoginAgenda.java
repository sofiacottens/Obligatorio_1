package uiswing;

import dominio.trabajador.Sesion;
import dominio.Sistema;
import dominio.trabajador.UsuarioAgenda;
import java.awt.Frame;

public class LoginAgenda extends Login {

    public LoginAgenda(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public Sesion login(String username, String password) {
        return Sistema.getInstancia().loginAgenda(username, password);
    }

    @Override
    public void mostrarProximaInterfaz(Sesion sesion) {
        CrearContacto crearContacto = new CrearContacto(null, false, (UsuarioAgenda) sesion.getUsuario());
        crearContacto.setVisible(true);
    }

}
