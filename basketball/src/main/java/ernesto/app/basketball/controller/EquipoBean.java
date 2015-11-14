
package ernesto.app.basketball.controller;

import ernesto.app.basketball.dao.EquipoDAO;
import ernesto.app.basketball.dao.impl.EquipoDAO_IMPL;
import ernesto.app.basketball.model.Equipo;
import java.util.List;
import javax.annotation.PostConstruct;


public class EquipoBean {
    private Equipo equipo;
    private EquipoDAO dao = new EquipoDAO_IMPL();
    private List<Equipo> listado;
    public EquipoBean() {
    }
    
    @PostConstruct
    private void init(){
        equipo = new Equipo();
        mostrar();
    }

    public EquipoBean(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Equipo> getListado() {
        return listado;
    }
    
    public void mostrar(){
        listado = dao.findAll();
    }
}
