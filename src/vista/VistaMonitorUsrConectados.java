package vista;

import dominio.trabajador.Sesion;
import java.util.List;

public interface VistaMonitorUsrConectados {
    public void mostrarUsuariosConectados(List<Sesion> usuariosLogueados);
    public void mostrarTitulo(String mensaje);
}
