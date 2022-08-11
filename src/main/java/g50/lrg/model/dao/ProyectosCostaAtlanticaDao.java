package g50.lrg.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import g50.lrg.model.vo.ProyectosCostaAtlanticaVo;
import g50.lrg.util.JDBCutil;

public class ProyectosCostaAtlanticaDao {
    
    public List<ProyectosCostaAtlanticaVo> crearLista() throws SQLException {
        List<ProyectosCostaAtlanticaVo> listaRegistros = new ArrayList<ProyectosCostaAtlanticaVo>();
        Connection conn = JDBCutil.getConnection();
        Statement stam = null;
        ResultSet resSet = null;
    try {

            stam=conn.createStatement();
            resSet=stam.executeQuery("SELECT ID_Proyecto AS id, Constructora, Numero_Habitaciones AS nhab, Ciudad "
                                    + "FROM Proyecto "
                                    + "WHERE Clasificacion LIKE 'Casa Campestre' " 
                                    + "AND (Ciudad LIKE 'Santa Marta' OR Ciudad LIKE 'Cartagena' OR Ciudad LIKE 'Barranquilla') ");
            while (resSet.next()) {
                ProyectosCostaAtlanticaVo registro = new ProyectosCostaAtlanticaVo();
                registro.setId(resSet.getInt("id"));
                registro.setConstructora(resSet.getString("constructora"));
                registro.setNhab(resSet.getInt("nhab"));
                registro.setCiudad(resSet.getString("ciudad"));

                listaRegistros.add(registro);
            }

            resSet.close();
            stam.close();
            conn.close();
            } catch (Exception x) {
                System.out.println("Algo ha salido terriblemente mal en ProyectosCostaAtlanticaDao: " + x);
            }


        return listaRegistros;
    }
}
