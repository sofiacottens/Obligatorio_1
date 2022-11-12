/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.sistema;

import java.util.List;
import dominio.trabajador.Trabajador;


public class SistemaSector {

    public Sector sector = new Sector();
    
    public int numeroDePuestoDeTrabajo(Trabajador trabajador) {
        return sector.numeroDePuestoDeTrabajo(trabajador);
    }

    public int cantidadLlamadasAtendidas(Trabajador trabajador) {
        return sector.cantidadLlamadasAtendidas(trabajador);
    }

    
   
}
