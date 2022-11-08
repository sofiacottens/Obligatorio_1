package vista;

import dominio.trabajador.Sesion;

public interface VistaLogin {
    public void mostrarProximaInterfaz(Sesion sesion);
    public void cerrar();
    public void mostrarError(String mensaje);
    public void limpiarDatos();
}
