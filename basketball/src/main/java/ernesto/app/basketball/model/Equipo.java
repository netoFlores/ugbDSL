
package ernesto.app.basketball.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Equipo implements Serializable {
    private Integer id_equipo;
    private String nombre;
    private Date fecha_in;
    private Date fecha_mod;
    
    public Equipo(){
        
    }
    
    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public Integer getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Integer id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_in() {
        return fecha_in;
    }

    public void setFecha_in(Date fecha_in) {
        this.fecha_in = fecha_in;
    }

    public Date getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(Date fecha_mod) {
        this.fecha_mod = fecha_mod;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id_equipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.id_equipo, other.id_equipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_equipo=" + id_equipo + ", nombre=" + nombre + ", fecha_in=" + fecha_in + ", fecha_mod=" + fecha_mod + '}';
    }
    
    
    
}
