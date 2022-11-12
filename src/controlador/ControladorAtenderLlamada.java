/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
public class ControladorAtenderLlamada implements Observador {
    
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
    
    /*@Override
    public void actualizar(Observable origen, Object evento) {
        if (evento.equals(EventoAgenda.NUEVO_CONTACTO)) {
            mostrarContactos();
            mostrarTitulo();
        }
    }*/

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
        int atendidas = Sistema.getInstancia().cantidadLlamadasAtendidas(this.trabajador);
       vista.cantidadLlamadasAtendidas(atendidas);    }
}
