
package dominio.sistema;

import dominio.trabajador.Trabajador;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ana
 */
public class SistemaLlamada {
    private List<Llamada> llamadas;

    public List<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(List<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public void finalizarLlamada(Trabajador trabajador, Llamada llamada, String descripcion) {
        llamada.finalizarLlamada(trabajador, llamada, descripcion);
               
    }

    public String costoLlamada(Llamada llamada) {
        if(llamada.calcularCostoLlamada(llamada) > 0){
            return "El costo es de : " + llamada.calcularCostoLlamada(llamada);
        }
        else{
         return "El costo es de : 0" ;   
        }
    }
    
    
}
