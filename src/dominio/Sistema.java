package dominio;

import dominio.Sector.SistemaSector;
import dominio.trabajador.SistemaTrabajador;
import dominio.sistema.Llamada;
import dominio.sistema.PuestoDeTrabajo;
import dominio.sistema.Sector;
import dominio.trabajador.Trabajador;
import java.util.Date;
import java.util.List;
import observer.Observable;

public class Sistema extends Observable {

    private static Sistema instancia = new Sistema();
    private SistemaTrabajador st = new SistemaTrabajador();
    private SistemaSector ss = new SistemaSector();

    public static Sistema getInstancia() {
        return instancia;
    }
    
    public Trabajador crearTrabajador(String cedula, String password, String nombreCompleto) {
        return st.crearTrabajador(cedula, password, nombreCompleto);
    }
    
    public PuestoDeTrabajo crearPuestoDeTrabajo(double tiempoPromedio, int llamadasAtendidas){
        return ss.crearPuestoDeTrabajo(tiempoPromedio, llamadasAtendidas);
    }
    
    public Sector crearSector(String nombre, int numero, int cantidadPuestos){
        return ss.crearSector(nombre, numero, cantidadPuestos);
    }
    
    public void agregarTrabajadorEnSector(Trabajador t, Sector s){
        ss.agregarTrabajadorEnSector(t,s);
    }
    
    public List<Sector> getSectores() {
        return ss.getSectores();
    }

    public void agregarPuestoEnSector(PuestoDeTrabajo p, Sector s) {
        ss.agregarPuestoEnSector(p,s);
    }

    public Llamada crearLlamada(Date fechaInicio, Sector s) {
        return ss.crearLlamada(fechaInicio, s);
    }
}
