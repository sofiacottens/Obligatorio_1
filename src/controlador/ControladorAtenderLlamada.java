/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.EventoSistema;
import dominio.sistema.Llamada;
import dominio.trabajador.Trabajador;
import observer.Observable;
import observer.Observador;
import vista.VistaAtender;
import dominio.Sistema;

/**
 *
 * @author ana
 */
public  class ControladorAtenderLlamada implements Observador {
    
    private Trabajador trabajador;
    private Llamada llamada;
    private VistaAtender vista;

    public ControladorAtenderLlamada(Trabajador trabajador, Llamada llamada) {
        this.trabajador = trabajador;
        this.llamada = llamada;
    }

    public ControladorAtenderLlamada(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public ControladorAtenderLlamada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void actualizar(Observable origen, Object evento) {
        if (evento.equals(EventoSistema.FINALIZAR_LLAMADA)) {
            cantidadLlamadasAtendidas();
            tiempoPromedioLlamada();
            costoLlamada();
            
        }
    }

    public void mostrarNombreTrabajador() {
        String nombre = this.trabajador.getNombre();
        vista.mostrarNombreTrabajador(nombre);
    }

    public void mostrarSector() {
        String sector = "Sector: " + 
                        this.trabajador.getSector() + 
                        this.trabajador.getSector().getNombre() + 
                        " | Puesto Nro. #" +
                        numeroDePuestoDeTrabajo();
        vista.mostrarSector(sector);
    }
    
    public int numeroDePuestoDeTrabajo(){
       return Sistema.getInstancia().numeroDePuestoDeTrabajo(this.trabajador);
    }

   

    public void cantidadLlamadasAtendidas() {
        String atendidas = Sistema.getInstancia().cantidadLlamadasAtendidas(this.trabajador);
       vista.cantidadLlamadasAtendidas(atendidas);    
    }

    public void tiempoPromedioLlamada() {
       String atendidas = Sistema.getInstancia().tiempoPromedioLlamada(this.trabajador);
       vista.tiempoPromedioLlamada(atendidas);
    }

    public void finalizarLlamada(String descripcion) {
        Sistema.getInstancia().finalizarLlamada(this.trabajador, this.llamada, descripcion);
        vista.finalizarLlamada(descripcion);
    }

    public String costoLlamada() {
        vista.costoLlamada();
        return Sistema.getInstancia().costoLlamada(this.llamada);
        
    }

   
}
