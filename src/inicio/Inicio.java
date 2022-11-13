/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inicio;
import dominio.Sector.SectorException;
import uiswing.Principal;

public class Inicio {

    /**
     * @param args the command line arguments
     * @throws dominio.Sector.SectorException
     */
    public static void main(String[] args) throws SectorException {
        DatosPrueba.cargar();
        Principal principal = new Principal();
        principal.setVisible(true);
    }

}
