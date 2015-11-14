package ernesto.app.basketball.dao.impl;

import ernesto.app.basketball.dao.EquipoDAO;
import ernesto.app.basketball.dao.conexion.Conexion;
import ernesto.app.basketball.model.Equipo;
import java.util.ArrayList;
import java.util.List;

public class EquipoDAO_IMPL extends Conexion implements EquipoDAO {

    @Override
    public long addEquipo(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long updateEquipo(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long deleteEquipo(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipo> findAll() {
        List<Equipo> respuesta = new ArrayList<>(0);
        String query = "SELECT * FROM equipo";
        try {
            conectar();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setId_equipo(rs.getInt("id_equipo"));
                equipo.setNombre(rs.getString("nombre"));
                equipo.setFecha_in(rs.getDate("fecha_in"));
                equipo.setFecha_mod(rs.getDate("fecha_mod"));

                respuesta.add(equipo);
            }
        } catch (Exception e) {
        } finally {
            if (conn != null) {
                try {
                    rs.close();
                    pst.close();
                    conn.close();
                } catch (Exception e) {
                }

            }
        }
        return respuesta;
    }

    @Override
    public Equipo findByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
