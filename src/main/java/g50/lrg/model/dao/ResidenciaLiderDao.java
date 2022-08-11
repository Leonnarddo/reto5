package g50.lrg.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import g50.lrg.model.vo.ResidenciaLiderVo;
import g50.lrg.util.JDBCutil;

public class ResidenciaLiderDao {
    public List<ResidenciaLiderVo> crearLista() throws SQLException {
        List<ResidenciaLiderVo> listaRegistros = new ArrayList<ResidenciaLiderVo>();
        Connection conn = JDBCutil.getConnection();
        Statement stam = null;
        ResultSet resSet = null;
    try {

            stam=conn.createStatement();
            resSet=stam.executeQuery("SELECT ID_Lider as id, Nombre, Primer_Apellido, Ciudad_Residencia AS ciudad "
                                    + "FROM Lider "
                                    + "ORDER BY ciudad ");
            while (resSet.next()) {
                ResidenciaLiderVo registro = new ResidenciaLiderVo();
                registro.setId(resSet.getInt("id"));
                registro.setLiderN(resSet.getString("Nombre"));
                registro.setLiderA(resSet.getString("Primer_Apellido"));
                registro.setCiudad(resSet.getString("ciudad"));

                listaRegistros.add(registro);
            }

            resSet.close();
            stam.close();
            conn.close();
            } catch (Exception x) {
                System.out.println("Algo ha salido terriblemente mal en ResidenciaLiderDao: " + x);
            }


        return listaRegistros;
    }
}
