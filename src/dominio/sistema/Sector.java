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

    public Sector(String nombre, int numero, int cantidadPuestos) {
        this.nombre = nombre;
        this.numero = numero;
        this.cantidadPuestos = cantidadPuestos;
    }

    Sector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void agregarTrabajador(Trabajador trabajador) {
        if(trabajadores.size() > 0){
            if (!trabajadores.contains(trabajador)) {
                trabajadores.add(trabajador);
           }
        } else {
            trabajadores.add(trabajador);
        }
    }

    public void agregarPuesto(PuestoDeTrabajo p) {
        if(puestosDeTrabajo.size() > 0 && puestosDeTrabajo.size() <= cantidadPuestos){
            if (!puestosDeTrabajo.contains(p)) {
                puestosDeTrabajo.add(p);
           }
        } else {
            puestosDeTrabajo.add(p);
        }
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

    public int numeroDePuestoDeTrabajo(Trabajador trabajador) {
        int i = 0;
        boolean encontre = false;
        while(i < puestosDeTrabajo.size() && !encontre){
            if(puestosDeTrabajo.get(i).getTrabajador().equals(trabajador)){
                encontre = true;
                return i;
            }
            i++;
        }return 0;
    }

    public int cantidadLlamadasAtendidas(Trabajador trabajador) {
        int i = 0;
        boolean encontre = false;
        PuestoDeTrabajo unPuesto = new PuestoDeTrabajo();
        while(i < puestosDeTrabajo.size() && !encontre){
            if(puestosDeTrabajo.get(i).getTrabajador().equals(trabajador)){
                encontre = true;
                unPuesto = puestosDeTrabajo.get(i);
            }
            i++;
        }
        return unPuesto.getLlamadasAtendidas();
    }
    
}
