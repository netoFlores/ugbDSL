
package ernesto.app.basketball.dao;

import ernesto.app.basketball.model.Equipo;
import java.util.List;

public interface EquipoDAO {
    public long addEquipo(Equipo equipo);
    public long updateEquipo(Equipo equipo);
    public long deleteEquipo(Equipo equipo);
    public List<Equipo> findAll();
    public Equipo findByName();
}
