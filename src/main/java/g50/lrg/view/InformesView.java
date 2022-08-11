package g50.lrg.view;

import java.util.List;

import g50.lrg.controller.InformesController;
import g50.lrg.model.vo.ComprasHcSalentoVo;
import g50.lrg.model.vo.ProyectosCostaAtlanticaVo;
import g50.lrg.model.vo.ResidenciaLiderVo;


public class InformesView {
    
    private static InformesController infCon;

    public InformesView() {
        infCon = new InformesController();
    }
    
    public void residenciaLider() {
        System.out.println("\n" +  "---------- INFORME RESIDENCIA DE LIDERES ----------" + "\n");
        try {
            List<ResidenciaLiderVo> listRes = infCon.InformeDeResidenciaLider();
            for(ResidenciaLiderVo reg1:listRes){
                System.out.println(String.format("%4d %-12s %-13s %-15s", reg1.getId(), reg1.getLiderN(), reg1.getLiderA(),reg1.getCiudad()));
             }
             
        }catch(Exception x){
            System.out.println("Algo ha fallado en InformesView residenciaLider: " + x);

        }
    }

    public void proyCostaAtlan() {
        System.out.println("\n" +  "---------- PROYECTOS COSTA ATLANTICA ----------" + "\n");
        try {
            List<ProyectosCostaAtlanticaVo> listProy = infCon.InformeDePrCosAtl();
            for(ProyectosCostaAtlanticaVo reg2:listProy){
                System.out.println(String.format("%4d %-25s %4d %-20s", reg2.getId(), reg2.getConstructora(), reg2.getNhab(), reg2.getCiudad()));
             }
             
        }catch(Exception x){
            System.out.println("Algo ha fallado en InformesView proyCostaAtlan: " + x);

        }
    }
    
    public void comprasHcSalento() {
        System.out.println("\n" +  "---------- COMPRAS HOMECENTER SALENTO ----------" + "\n");
        try {
            List<ComprasHcSalentoVo> listCompr = infCon.InformeDeComprasHcSalento();
            for(ComprasHcSalentoVo reg3:listCompr){
                System.out.println(String.format("%4d %-25s %-15s", reg3.getId(), reg3.getConstructora(), reg3.getBanco()));
             }
             
        }catch(Exception x){
            System.out.println("Algo ha fallado en InformesView comprasHcSalento: " + x);

        }
    }

}
