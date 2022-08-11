/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g50.lrg.view;

import g50.lrg.controller.InformesController;
import g50.lrg.model.vo.ComprasHcSalentoVo;
import static g50.lrg.util.JDBCutil.playSound;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Informe3 extends javax.swing.JFrame {
    private static InformesController infCon;
    
       public Informe3() {
        initComponents();
        setLocationRelativeTo(null);
        infCon = new InformesController();
        comprasSalento();
    }
       
    
     public void comprasSalento(){
        DefaultTableModel tbCompra = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tbCompra.addColumn("ID Compra");
        tbCompra.addColumn("Constructora");
        tbCompra.addColumn("Banco");
        tablaCompras.setModel(tbCompra);
        
        Object []datos = new Object[4];
        try {
            List<ComprasHcSalentoVo> listRes = infCon.InformeDeComprasHcSalento();
            for(ComprasHcSalentoVo reg1:listRes){
                datos[0] = reg1.getId();
                datos[1] = reg1.getConstructora();
                datos[2] = reg1.getBanco();
                tbCompra.addRow(datos);             
             }
             tablaCompras.setModel(tbCompra);
             tablaCompras.getColumnModel().getColumn(0).setPreferredWidth(5);
             tablaCompras.getColumnModel().getColumn(1).setPreferredWidth(60);
             tablaCompras.getColumnModel().getColumn(2).setPreferredWidth(60);
                          
        }catch(Exception x){
            System.out.println("Algo ha fallado en Compras Salento: " + x);

        }
     }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        defBoton = new javax.swing.JLabel();
        lblTituloInf3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        lblFondoInf3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compras Realizadas en Homecenter");
        setResizable(false);

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
        jPanel1.add(defBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 30));

        lblTituloInf3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblTituloInf3.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloInf3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInf3.setText("COMPRAS REALIZADAS EN HOMECENTER PARA SALENTO");
        lblTituloInf3.setToolTipText("");
        jPanel1.add(lblTituloInf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 460, -1));

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 350, 343));

        lblFondoInf3.setBackground(new java.awt.Color(255, 255, 255));
        lblFondoInf3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoInf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g50/lrg/Recursos/fondo.png"))); // NOI18N
        lblFondoInf3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFondoInf3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblFondoInf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    private javax.swing.JLabel lblFondoInf3;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblTituloInf3;
    private javax.swing.JTable tablaCompras;
    // End of variables declaration//GEN-END:variables
}
