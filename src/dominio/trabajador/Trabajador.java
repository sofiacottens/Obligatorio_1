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

    public Trabajador(String cedula, String nombre, String password, Sector sector) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
        this.sector = sector;
    }

    public Trabajador(String cedula, String password){
        this.cedula = cedula;
        this.password = password;
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
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        return Objects.equals(this.cedula, other.cedula);
    }
    
}
