/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.Sistema;
import dominio.sistema.Sector;
import java.util.List;
import vista.VistaMonitoreo;

/**
 *
 * @author sofia
 */
public class ControladorMonitor {
    
    private VistaMonitoreo vista;
    private List<Sector> sectores;
    private Sistema logica = Sistema.getInstancia();
    
    public void iniciarMonitoreo() {
        sectores = logica.getSectores();
        vista.mostrarTodosLosSectores(sectores);
    }
    
}
