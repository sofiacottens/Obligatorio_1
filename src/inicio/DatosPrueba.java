package inicio;

import dominio.Sistema;
import dominio.sistema.Llamada;
import dominio.sistema.PuestoDeTrabajo;
import dominio.sistema.Sector;
import dominio.trabajador.Trabajador;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;

public class DatosPrueba {

    public static void cargar() {
        Sistema logica = Sistema.getInstancia();
        Calendar fecha = Calendar.getInstance();
        
        Trabajador t1 = logica.crearTrabajador("123456789", "trabajador1", "Trabajador Uno");
        Trabajador t2 = logica.crearTrabajador("987654321", "trabajador2", "Trabajador Dos");
        Trabajador t3 = logica.crearTrabajador("741852963", "trabajador3", "Trabajador Tres");
        Trabajador t4 = logica.crearTrabajador("369258147", "trabajador4", "Trabajador Cuatro");
        Trabajador t5 = logica.crearTrabajador("147258369", "trabajador5", "Trabajador Cinco");
        Trabajador t6 = logica.crearTrabajador("6547893321", "trabajador6", "Trabajador Seis");
        Trabajador t7 = logica.crearTrabajador("564231897", "trabajador7", "Trabajador Siete");
        Trabajador t8 = logica.crearTrabajador("246351789", "trabajador8", "Trabajador Ocho");
        
        PuestoDeTrabajo pdt1 = logica.crearPuestoDeTrabajo(12, 225);
        PuestoDeTrabajo pdt2 = logica.crearPuestoDeTrabajo(8, 300);
        PuestoDeTrabajo pdt3 = logica.crearPuestoDeTrabajo(11.3, 105);
        PuestoDeTrabajo pdt4 = logica.crearPuestoDeTrabajo(9.25, 150);
        PuestoDeTrabajo pdt5 = logica.crearPuestoDeTrabajo(15, 114);
        PuestoDeTrabajo pdt6 = logica.crearPuestoDeTrabajo(7.8, 98);
        PuestoDeTrabajo pdt7 = logica.crearPuestoDeTrabajo(14.5, 295);
        PuestoDeTrabajo pdt8 = logica.crearPuestoDeTrabajo(13.16, 256);
        PuestoDeTrabajo pdt9 = logica.crearPuestoDeTrabajo(8.78, 198);
        PuestoDeTrabajo pdt10 = logica.crearPuestoDeTrabajo(10, 241);
        PuestoDeTrabajo pdt11 = logica.crearPuestoDeTrabajo(10.1, 302);
        
        pdt1.setTrabajador(t1);
        pdt2.setTrabajador(t2);
        pdt3.setTrabajador(t3);
        pdt4.setTrabajador(t4);
        pdt5.setTrabajador(t5);
        pdt6.setTrabajador(t6);
        pdt7.setTrabajador(t7);
        pdt8.setTrabajador(t8);
        
        Sector sector1 = logica.crearSector("sector1", 01, 5);
        Sector sector2 = logica.crearSector("sector2", 02, 6);
        Sector sector3 = logica.crearSector("sector3", 03, 4);
        Sector sector4 = logica.crearSector("sector4", 04, 5);
        
        logica.agregarTrabajadorEnSector(t1, sector4);
        logica.agregarTrabajadorEnSector(t2, sector4);
        logica.agregarTrabajadorEnSector(t3, sector3);
        logica.agregarTrabajadorEnSector(t4, sector3);
        logica.agregarTrabajadorEnSector(t5, sector2);
        logica.agregarTrabajadorEnSector(t6, sector2);
        logica.agregarTrabajadorEnSector(t7, sector1);
        logica.agregarTrabajadorEnSector(t8, sector1);
        
        logica.agregarPuestoEnSector(pdt1, sector4);
        logica.agregarPuestoEnSector(pdt2, sector4);
        logica.agregarPuestoEnSector(pdt3, sector3);
        logica.agregarPuestoEnSector(pdt4, sector3);
        logica.agregarPuestoEnSector(pdt5, sector2);
        logica.agregarPuestoEnSector(pdt6, sector2);
        logica.agregarPuestoEnSector(pdt7, sector1);
        logica.agregarPuestoEnSector(pdt8, sector1);
        
        LocalDateTime hoy = (LocalDateTime) LocalDateTime.now(); 
        Date fech = new Date();
        
        Llamada ll1 = logica.crearLlamada(fech, sector4);


        
    }
}
