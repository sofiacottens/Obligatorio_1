package uiswing;

import dominio.trabajador.Sesion;
import dominio.Sistema;
import dominio.trabajador.Trabajador;

import java.awt.Frame;

public class LoginTrabajador extends Login {

    public LoginTrabajador(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public Sesion login(String cedula, String password) {
        return Sistema.getInstancia().login(cedula, password);
    }

    @Override
    public void mostrarProximaInterfaz(Sesion sesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
