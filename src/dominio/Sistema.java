package dominio;


import dominio.trabajador.Sesion;
import dominio.trabajador.SistemaTrabajador;
import dominio.trabajador.TrabajadorException;
import java.util.List;
import observer.Observable;

public class Sistema extends Observable {

    private static Sistema instancia = new Sistema();
    private SistemaTrabajador st = new SistemaTrabajador();

    public static Sistema getInstancia() {
        return instancia;
    }

    public Sesion login(String usuario, String password) throws TrabajadorException {
        return st.login(usuario, password);
    }
    
    public void registrarUsuario(
            String cedula,
            String password,
            String nombreCompleto) {
        st.registrarUsuario(cedula, password, nombreCompleto);
    }
   
    public List<Sesion> getLogueados() {
        return st.getLogueados();
    }
}
