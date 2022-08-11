package g50.lrg.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import g50.lrg.model.vo.ComprasHcSalentoVo;
import g50.lrg.util.JDBCutil;

public class ComprasHcSalentoDao {
    
    public List<ComprasHcSalentoVo> crearLista() throws SQLException {
        List<ComprasHcSalentoVo> listaRegistros = new ArrayList<ComprasHcSalentoVo>();
        Connection conn = JDBCutil.getConnection();
        Statement stam = null;
        ResultSet resSet = null;
    try {

            stam=conn.createStatement();
            resSet=stam.executeQuery("SELECT c.ID_Compra AS id, Constructora, Banco_Vinculado AS banco "
                                    + "FROM Proyecto p "
                                    + "JOIN Compra c " 
                                    + "ON c.ID_Proyecto = p.ID_Proyecto "
                                    + "WHERE c.Proveedor LIKE 'Homecenter' AND Ciudad LIKE 'Salento' ");
            while (resSet.next()) {
                ComprasHcSalentoVo registro = new ComprasHcSalentoVo();
                registro.setId(resSet.getInt("id"));
                registro.setConstructora(resSet.getString("constructora"));
                registro.setBanco(resSet.getString("banco"));

                listaRegistros.add(registro);
            }

            resSet.close();
            stam.close();
            conn.close();
            } catch (Exception x) {
                System.out.println("Algo ha salido terriblemente mal en ComprasHcSalentoDao: " + x);
            }


        return listaRegistros;
    }
}
