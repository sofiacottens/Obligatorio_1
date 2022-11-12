package uiswing;

import dominio.trabajador.Sesion;
import dominio.Sistema;
import dominio.trabajador.Trabajador;
import dominio.trabajador.TrabajadorException;
import uiswing.AtenderLlamada;

import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginTrabajador extends Login {

    public LoginTrabajador(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public Sesion login(String cedula, String password) {
        try {
            return Sistema.getInstancia().loginTrabajador(cedula, password);
        } catch (TrabajadorException ex) {
            Logger.getLogger(LoginTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      }

    @Override
    public void mostrarProximaInterfaz(Sesion sesion) {
        AtenderLlamada atender;
    }

  

}
