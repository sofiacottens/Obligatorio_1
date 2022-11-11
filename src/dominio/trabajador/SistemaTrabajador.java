package dominio.trabajador;

import dominio.EventoSistema;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.List;

public class SistemaTrabajador {

    private List<Trabajador> trabajadores = new ArrayList<>();
    private List<Sesion> logueados = new ArrayList<>();

    public Sesion login(String usuario, String password) {
        Sesion sesion = login(usuario, password, trabajadores);
        if (sesion != null) {
            logueados.add(sesion);
            Sistema.getInstancia().avisar(EventoSistema.LOGIN);
        }
        return sesion;
    }

       
    private Sesion login(String cedula, String password, List trabajadoresLista) {
        Trabajador trabajador;
        for (Object trabajadorObj : trabajadoresLista) {
            trabajador = (Trabajador) trabajadorObj;
            if (validarLogin(trabajador, cedula, password)) {
                Sesion sesion = new Sesion(trabajador);
                return sesion;
            }
        }
        return null;
    }

    private boolean validarLogin(Trabajador trabajador, String cedula, String password) {
        return trabajador.getCedula().equals(cedula)
                && trabajador.getPassword().equals(password);
    }

    public List<Sesion> getLogueados() {
        return logueados;
    }

    public Trabajador  crearTrabajador(String cedula, String password, String nombreCompleto) {

        Trabajador usuario = new Trabajador(cedula, nombreCompleto, password);
        if (!trabajadores.contains(usuario)) {
            trabajadores.add(usuario);
        }
        
        return usuario;
    }    

}
