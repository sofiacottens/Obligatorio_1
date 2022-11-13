/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Sector;

import dominio.sistema.Llamada;
import dominio.sistema.PuestoDeTrabajo;
import dominio.sistema.Sector;
import dominio.trabajador.Trabajador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sofia
 */
public class SistemaSector {
    private List<PuestoDeTrabajo> puestos = new ArrayList<>();
    private List<Sector> sectores = new ArrayList<>();
    private List<Llamada> llamadas = new ArrayList<>();

    public List<PuestoDeTrabajo> getPuestos() {
        return puestos;
    }

    public List<Sector> getSectores() {
        return sectores;
    }
    
    public List<Llamada> getLlamadas() {
        return llamadas;
    }

    public PuestoDeTrabajo crearPuestoDeTrabajo(double tiempoPromedio, int llamadasAtendidas) {
        PuestoDeTrabajo pdt = new PuestoDeTrabajo(tiempoPromedio, llamadasAtendidas);
        if (!puestos.contains(pdt)) {
            puestos.add(pdt);
        }
        
        return pdt;
    }

    public Llamada crearLlamada(Date fechaInicio, Sector sector){
        Llamada llamada = new Llamada(fechaInicio, sector);
        if (!llamadas.contains(llamada)) {
            llamadas.add(llamada);
        }
        return llamada;
    }
    
    public Sector crearSector(String nombre, int numero, int cantidadPuestos){
        Sector sector = new Sector(nombre, numero, cantidadPuestos);
        if (!sectores.contains(sector)) {
            sectores.add(sector);
        }
        return sector;
    }
    
   public void agregarTrabajadorEnSector(Trabajador trabajador, Sector sector){
       sector.agregarTrabajador(trabajador);

   }

    public void agregarPuestoEnSector(PuestoDeTrabajo p, Sector s) {
        s.agregarPuesto(p);
    }
    
}
