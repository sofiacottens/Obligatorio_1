/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio.sistema;

import java.util.List;
import dominio.trabajador.Trabajador;
import dominio.sistema.PuestoDeTrabajo;
import java.util.HashSet;

/**
 *
 * @author alumnoFI
 */
public class Sector {
    private List<Trabajador> trabajadores;
    private List<PuestoDeTrabajo> puestosDeTrabajo;
    private String nombre;
    private int numero;
    private int cantidadPuestos;
    private int cantidadConectados;

    public Sector(List<Trabajador> trabajadores, List<PuestoDeTrabajo> puestosDeTrabajo, String nombre, int numero, int cantidadPuestos) {
        this.trabajadores = trabajadores;
        this.puestosDeTrabajo = puestosDeTrabajo;
        this.nombre = nombre;
        this.numero = numero;
        this.cantidadPuestos = cantidadPuestos;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public List<PuestoDeTrabajo> getPuestosDeTrabajo() {
        return puestosDeTrabajo;
    }

    public void setPuestosDeTrabajo(List<PuestoDeTrabajo> puestosDeTrabajo) {
        this.puestosDeTrabajo = puestosDeTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadPuestos() {
        return cantidadPuestos;
    }

    public void setCantidadPuestos(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }

    public int getCantidadConectados() {
        return cantidadConectados;
    }

    public void setCantidadConectados() {
        cantidadConectados++;
    }
    
    public boolean puestoDisponible(){
     return this.cantidadConectados < this.cantidadPuestos;
     
    }
    
    public void asignarPuesto(Trabajador unT){
        int i = 0;
        boolean asignado = false;
        PuestoDeTrabajo unPuesto = new PuestoDeTrabajo();
        while(this.puestosDeTrabajo.size()< i || asignado){
            if(puestosDeTrabajo.get(i).getTrabajador() == null){
                unPuesto = puestosDeTrabajo.get(i);
                unPuesto.setTrabajador(unT);
                asignado = true;
                
            }
            i++;
        }
    }
    
}
