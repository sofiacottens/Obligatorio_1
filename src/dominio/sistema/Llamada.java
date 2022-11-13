/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio.sistema;

import dominio.trabajador.Trabajador;
import java.util.Date;

/**
 *
 * @author alumnoFI
 */
public class Llamada {
    private Date fechaInicio;
    private Date fechaFin;
    private double costo;
    private Sector sector;
    String descripcion;
    private Trabajador trabajador;
    private Cliente cliente;

    public Llamada(Date fechaInicio, Sector sector, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.sector = sector;
        this.descripcion = descripcion;
        this.fechaInicio = new Date();
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.trabajador = trabajador;
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    private double calcularCostoLlamada() {
        return 0;
    }
    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    void finalizarLlamada(Trabajador trabajador, Llamada llamada, String descrpcionLlamada) {
        llamada.setTrabajador(trabajador);
        llamada.setFechaFin(new Date());
        llamada.setDescripcion(descrpcionLlamada);
        llamada.setCosto(calcularCostoLlamada(llamada));
    }

    public double calcularCostoLlamada(Llamada llamada) {
        return cliente.calcularCostosLlamada(llamada);
    }
    
}
