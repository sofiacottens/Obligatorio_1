package dominio;


import dominio.sistema.Sector;
import dominio.sistema.SistemaSector;
import dominio.trabajador.Sesion;
import dominio.trabajador.SistemaTrabajador;
import dominio.trabajador.Trabajador;
import dominio.trabajador.TrabajadorException;
import java.util.List;
import observer.Observable;

public class Sistema extends Observable {

    private static Sistema instancia = new Sistema();
    private SistemaTrabajador st = new SistemaTrabajador();
    private SistemaSector ss = new SistemaSector();


    public static Sistema getInstancia() {
        return instancia;
    }

    public Sesion loginTrabajador(String usuario, String password) throws TrabajadorException {
        return st.login(usuario, password);
    }
    
    public void registrarUsuario(
            String cedula,
            String password,
            String nombreCompleto, 
            Sector sector) {
        st.registrarUsuario(cedula, password, nombreCompleto, sector);
    }
   
    public List<Sesion> getLogueados() {
        return st.getLogueados();
    }

    public int numeroDePuestoDeTrabajo(Trabajador trabajador) {
        return ss.numeroDePuestoDeTrabajo(trabajador);
    }

    public int cantidadLlamadasAtendidas(Trabajador trabajador) {
        return ss.cantidadLlamadasAtendidas(trabajador);
    }
}
