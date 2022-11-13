package dominio.trabajador;

import dominio.EventoSistema;
import dominio.Sistema;
import dominio.sistema.Sector;
import java.util.ArrayList;
import java.util.List;

public class SistemaTrabajador {

    private List<Trabajador> trabajadores = new ArrayList<>();
    private List<Sesion> logueados = new ArrayList<>();
    private Sector sector;

    public Sesion login(String cedula, String password) throws TrabajadorException {
        Sesion sesion = loginTrabajador(cedula, password);
            if (sesion != null) {
            logueados.add(sesion);
            sector.setCantidadConectados();
            sector.asignarPuesto(sesion.getUsuario());
            Sistema.getInstancia().avisar(EventoSistema.LOGIN);
            return sesion;
            } else {
             throw new TrabajadorException("Acceso denegado");          
            }
    }

    private void puestosDisponibles()throws TrabajadorException{
        if(!sector.puestoDisponible()){
            throw new TrabajadorException("No hay puestos disponibles");
        } 
    }
    private Sesion loginTrabajador(String cedula, String password) throws TrabajadorException {
        Trabajador unT = new Trabajador(cedula, password, "");
        for (Trabajador t : trabajadores) {
            if(t.equals(unT)){
                unT = t;
                puestosDisponibles();
                Sesion sesion = new Sesion(unT);
                return sesion;
                
            }
        }
        return null;
    }
    
    public List<Sesion> getLogueados() {
        return logueados;
    }


    public Trabajador crearTrabajador(String cedula, String password, String nombreCompleto, Sector sector) throws TrabajadorException {

        Trabajador usuario = new Trabajador(cedula, nombreCompleto, password);
        if (!trabajadores.contains(usuario)) {
            trabajadores.add(usuario);
        } else {
            throw new TrabajadorException("El trabajador ya existe");
        }
        
        return usuario;
    }    

    
    

}
