/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio.sistema;

import java.util.List;
import dominio.trabajador.Trabajador;

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

    public Sector(String nombre, int numero, int cantidadPuestos) {
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
    
    
}
