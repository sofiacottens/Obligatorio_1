/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio.sistema;

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

    public Llamada(Date fechaInicio, Sector sector) {
        this.fechaInicio = fechaInicio;
        this.sector = sector;
        this.descripcion = descripcion;
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.costo = calcularCostoLlamada();
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
    
}
