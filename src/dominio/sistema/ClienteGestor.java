/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.sistema;


public class ClienteGestor extends Cliente{

    public ClienteGestor(String cedula, String nombre, double saldo) {
        super(cedula, nombre, saldo);
    }

    @Override
    public double calcularCostosLlamada(Llamada llamada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
