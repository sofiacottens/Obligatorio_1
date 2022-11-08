package inicio;

import dominio.Sistema;

public class DatosPrueba {

    public static void cargar() {
        Sistema logica = Sistema.getInstancia();



        logica.registrarUsuario("48981670", "u1", "12345678");
        logica.registrarUsuario("48851578", "u2", "12345678");
        logica.registrarUsuario("usuario3", "u3", "12345678");
        
    }
}
