/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.sistema;

import java.util.List;
import dominio.trabajador.Trabajador;
import java.util.Date;


public class SistemaSector {

    Sector sector = new Sector();
    
    public int numeroDePuestoDeTrabajo(Trabajador trabajador) {
        return sector.numeroDePuestoDeTrabajo(trabajador);
    }

    public String cantidadLlamadasAtendidas(Trabajador trabajador) {
        return sector.cantidadLlamadasAtendidas(trabajador);
    }

    public PuestoDeTrabajo crearPuestoDeTrabajo(double tiempoPromedio, int llamadasAtendidas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Sector crearSector(String nombre, int numero, int cantidadPuestos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarTrabajadorEnSector(Trabajador t, Sector s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Sector> getSectores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarPuestoEnSector(PuestoDeTrabajo p, Sector s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Llamada crearLlamada(Date fechaInicio, Sector s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String tiempoPromedioLlamada(Trabajador trabajador) {
        return sector.tiempoPromedioLlamada(trabajador);
    }

   

    
   
}
