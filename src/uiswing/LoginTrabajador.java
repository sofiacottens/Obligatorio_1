/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiswing;

import dominio.Sistema;
import dominio.trabajador.Sesion;
import java.awt.Frame;

public class LoginTrabajador extends Login {

    public LoginTrabajador(Frame parent, boolean modal) {
        super(parent, modal);
    }

    @Override
    public Sesion login(String username, String password) {
        return Sistema.getInstancia().login(username, password);
    }

    @Override
    public void mostrarProximaInterfaz(Sesion sesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

}

