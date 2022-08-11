package g50.lrg.controller;

import java.sql.SQLException;
import java.util.List;

import g50.lrg.model.dao.ComprasHcSalentoDao;
import g50.lrg.model.dao.ProyectosCostaAtlanticaDao;
import g50.lrg.model.dao.ResidenciaLiderDao;
import g50.lrg.model.vo.ComprasHcSalentoVo;
import g50.lrg.model.vo.ProyectosCostaAtlanticaVo;
import g50.lrg.model.vo.ResidenciaLiderVo;

public class InformesController {
    private ComprasHcSalentoDao comprasHcSalentoDao;
    private ProyectosCostaAtlanticaDao proyectosCostaAtlanticaDao;
    private ResidenciaLiderDao residenciaLiderDao;

    public InformesController() {
        comprasHcSalentoDao = new ComprasHcSalentoDao();
        proyectosCostaAtlanticaDao = new ProyectosCostaAtlanticaDao();
        residenciaLiderDao = new ResidenciaLiderDao();
    }

    public List<ComprasHcSalentoVo> InformeDeComprasHcSalento() throws SQLException{
        return comprasHcSalentoDao.crearLista();
    }

    public List<ProyectosCostaAtlanticaVo> InformeDePrCosAtl() throws SQLException{
        return proyectosCostaAtlanticaDao.crearLista();
    }
    
    public List<ResidenciaLiderVo> InformeDeResidenciaLider() throws SQLException{
        return residenciaLiderDao.crearLista();
    }
}
