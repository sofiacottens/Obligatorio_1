                                                                                                                                                /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio.trabajador;

import dominio.sistema.Sector;
import java.util.Objects;

public class Trabajador {
    private String cedula;
    private String nombre;
    private String password;
    private Sector sector;

    public Trabajador(String cedula, String nombre ,String password){
        this.cedula = cedula;
        this.password = password;
        this.nombre = nombre;
        this.sector = null;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
    
     @Override
    public boolean equals(Object obj) {
        Boolean ret = false;
        Trabajador t = (Trabajador) obj;
        if (Objects.equals(this.cedula, t.cedula) && Objects.equals(this.password, t.password)) {
            ret = true;
        }
        return ret;
    }

    public boolean agregarSector(Sector sector) {
        if (this.sector == null){
            this.sector = sector;
            return true;
        } else {
            return false;
        }
    }
    
}
