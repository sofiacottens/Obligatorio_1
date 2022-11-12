package dominio.monitor;

import dominio.sistema.Sector;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sofia
 */
public class SistemaMonitor {
    private List<Sector> sectores = new ArrayList<>();
    
    public List<Sector> getSectores(){
        return sectores;
    }
}
