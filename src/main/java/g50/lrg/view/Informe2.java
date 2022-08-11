/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g50.lrg.view;

import g50.lrg.controller.InformesController;
import g50.lrg.model.vo.ProyectosCostaAtlanticaVo;
import static g50.lrg.util.JDBCutil.playSound;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Informe2 extends javax.swing.JFrame {
    private static InformesController infCon;
    
    public Informe2() {
        initComponents();
        setLocationRelativeTo(null);
        infCon = new InformesController();
        mostrarLideres();
    }

    
     public void mostrarLideres(){
        DefaultTableModel tbCasa = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tbCasa.addColumn("ID Proyecto");
        tbCasa.addColumn("Constructora");
        tbCasa.addColumn("# Habitaciones");
        tbCasa.addColumn("Ciudad");
        tablaCasas.setModel(tbCasa);
        
        Object []datos = new Object[4];
        try {
            List<ProyectosCostaAtlanticaVo> listRes = infCon.InformeDePrCosAtl();
            for(ProyectosCostaAtlanticaVo reg1:listRes){
                datos[0] = reg1.getId();
                datos[1] = reg1.getConstructora();
                datos[2] = reg1.getId();
                datos[3] = reg1.getCiudad();
                tbCasa.addRow(datos);             
             }
             tablaCasas.setModel(tbCasa);
             tablaCasas.getColumnModel().getColumn(0).setPreferredWidth(5);
             tablaCasas.getColumnModel().getColumn(1).setPreferredWidth(65);
             tablaCasas.getColumnModel().getColumn(2).setPreferredWidth(20);
             tablaCasas.getColumnModel().getColumn(3).setPreferredWidth(30); 
             
        }catch(Exception x){
            System.out.println("Algo ha fallado en InformesView residenciaLider: " + x);

        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        defBoton = new javax.swing.JLabel();
        lblTituloInf2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCasas = new javax.swing.JTable();
        lblFondoInf2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casas Campestres en la Costa Atlántica");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(0, 51, 153));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("REGRESAR");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });
        jPanel1.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 30));

        defBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g50/lrg/Recursos/btnazul2.png"))); // NOI18N
        defBoton.setToolTipText("");
        jPanel1.add(defBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 30));

        lblTituloInf2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblTituloInf2.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloInf2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInf2.setText("PROYECTOS DE CASAS CAMPESTRES EN LA COSTA ATLANTICA");
        jPanel1.add(lblTituloInf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 460, -1));

        tablaCasas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCasas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaCasas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCasas);
        if (tablaCasas.getColumnModel().getColumnCount() > 0) {
            tablaCasas.getColumnModel().getColumn(0).setResizable(false);
            tablaCasas.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaCasas.getColumnModel().getColumn(1).setResizable(false);
            tablaCasas.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaCasas.getColumnModel().getColumn(2).setResizable(false);
            tablaCasas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaCasas.getColumnModel().getColumn(3).setResizable(false);
            tablaCasas.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 420, 231));

        lblFondoInf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g50/lrg/Recursos/fondo.png"))); // NOI18N
        lblFondoInf2.setAlignmentY(0.0F);
        lblFondoInf2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblFondoInf2.setMaximumSize(new java.awt.Dimension(7500, 5000));
        lblFondoInf2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblFondoInf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        playSound("resources/click.wav");
        GUIInformes back1=new GUIInformes();
        back1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        lblRegresar.setForeground(new Color(0, 91, 255));
        lblRegresar.setFont(new java.awt.Font("Lucida Sans", 3, 11));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        lblRegresar.setForeground(new Color(0, 51, 153));
        lblRegresar.setFont(new java.awt.Font("Lucida Sans", 1, 11));
    }//GEN-LAST:event_lblRegresarMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel defBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondoInf2;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblTituloInf2;
    private javax.swing.JTable tablaCasas;
    // End of variables declaration//GEN-END:variables
}
