
import dominio.EventoSistema;
import dominio.Sistema;
import observer.Observable;
import observer.Observador;
import vista.VistaMonitoreo;

public class ControladorUsuario {
    private VistaMonitoreo vista;

    public mostrarTodosLosSectores() {
        vista.mostrarTodosLosSectores(Sistema.getInstancia().getLogueados());
    }

    private void mostrarLista() {
        vista.mostrarUsuariosConectados(Sistema.getInstancia().getLogueados());
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        switch((EventoSistema) evento) {
            case LOGIN:
                mostrarLista();
                break;
            
            case CREAR_CONTACTO:
                mostrarLista();
                break;
        }
    }
}
