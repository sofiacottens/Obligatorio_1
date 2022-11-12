package dominio.trabajador;

import dominio.EventoSistema;
import dominio.Sistema;
import dominio.sistema.Sector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SistemaTrabajador {

    private List<Trabajador> trabajadores = new ArrayList<>();
    private List<Sesion> logueados = new ArrayList<>();
    private Sector sector;

    public Sesion login(String cedula, String password) throws TrabajadorException {
        Sesion sesion = loginTrabajador(cedula, password, trabajadores);
            if (sesion != null) {
            logueados.add(sesion);
            sector.setCantidadConectados();
            sector.asignarPuesto(sesion.getUsuario());
            Sistema.getInstancia().avisar(EventoSistema.LOGIN);
            
        }
        return sesion;
    }

    private void puestosDisponibles()throws TrabajadorException{
        if(!sector.puestoDisponible()){
            throw new TrabajadorException("No hay puestos disponibles");
        } 
    }
    private Sesion loginTrabajador(String cedula, String password, List trabajadoresLista) throws TrabajadorException {
        Trabajador unT = new Trabajador(cedula, password);
        for (Object trabajadorObj : trabajadoresLista) {
            if(trabajadorObj.equals(unT)){
            unT =  (Trabajador)trabajadorObj;
            validarLogin(unT);
            puestosDisponibles();
            Sesion sesion = new Sesion(unT);
            return sesion;
                
            }
        }
        return null;
    }

    private void validarLogin(Trabajador trabajador) throws TrabajadorException{
        if(!trabajador.getCedula().equals(trabajador.getCedula())
                || !trabajador.getPassword().equals(trabajador.getPassword())) {
            throw new TrabajadorException("Acceso denegado");
        }
        
    }

    
    public List<Sesion> getLogueados() {
        return logueados;
    }


    public void registrarUsuario(String cedula, String password, String nombreCompleto, Sector sector) {


        Trabajador usuario = new Trabajador(cedula, nombreCompleto, password, sector);
        if (!trabajadores.contains(usuario)) {
            trabajadores.add(usuario);
        }
        
        return usuario;
    }    
    

}
