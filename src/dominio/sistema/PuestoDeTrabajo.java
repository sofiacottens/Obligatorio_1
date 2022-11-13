/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio.sistema;
import dominio.trabajador.Trabajador;


public class PuestoDeTrabajo {
    private double tiempoPromedio;
    private int llamadasAtendidas;
    private Trabajador trabajador;
    private Llamada llamadaEnCurso;

    public PuestoDeTrabajo(){
        
    }
    public PuestoDeTrabajo(double tiempoPromedio, int llamadasAtendidas, Trabajador trabajador, Llamada llamadaEnCurso) {
   
        this.tiempoPromedio = tiempoPromedio;
        this.llamadasAtendidas = llamadasAtendidas;
        this.tiempoPromedio = calcularTiempoPromedio();
        
    }

    public PuestoDeTrabajo(double tiempoPromedio, int llamadasAtendidas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(double tiempoPromedio) {
        this.tiempoPromedio = calcularTiempoPromedio();
    }

    public int getLlamadasAtendidas() {
        return llamadasAtendidas;
    }

    public void setLlamadasAtendidas(int llamadasAtendidas) {
        this.llamadasAtendidas = llamadasAtendidas;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Llamada getLlamadaEnCurso() {
        return llamadaEnCurso;
    }

    public void setLlamadaEnCurso(Llamada llamadaEnCurso) {
        this.llamadaEnCurso = llamadaEnCurso;
    }

    
    private double calcularTiempoPromedio() {
        double llamadaInicio = (double) this.llamadaEnCurso.getFechaFin().getTime();
        double llamadaFin = (double) this.llamadaEnCurso.getFechaFin().getTime();
        double tiempoLlamadaActual =  llamadaFin - llamadaInicio;
        double promedio = (this.tiempoPromedio + tiempoLlamadaActual) / this.llamadasAtendidas;
        return promedio;
    }
    
}
