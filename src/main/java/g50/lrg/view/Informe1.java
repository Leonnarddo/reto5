
package g50.lrg.view;

import g50.lrg.controller.InformesController;
import g50.lrg.model.vo.ResidenciaLiderVo;
import static g50.lrg.util.JDBCutil.playSound;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public class Informe1 extends javax.swing.JFrame {
    private static InformesController infCon;
   
    public Informe1() {
        initComponents();
        setLocationRelativeTo(null);
        infCon = new InformesController();
        mostrarLideres();      
    }
    
    public void mostrarLideres(){
        DefaultTableModel tbLider = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tbLider.addColumn("ID Lider");
        tbLider.addColumn("Nombre");
        tbLider.addColumn("Apellido");
        tbLider.addColumn("Ciudad");
        tablaLider.setModel(tbLider);
        
        Object []datos = new Object [4];
        
        try {
            List<ResidenciaLiderVo> listRes = infCon.InformeDeResidenciaLider();
            for(ResidenciaLiderVo reg1:listRes){
                datos[0] = reg1.getId();
                datos[1] = reg1.getLiderN();
                datos[2] = reg1.getLiderA();
                datos[3] = reg1.getCiudad();
                tbLider.addRow(datos);             
             }
                          
             tablaLider.setModel(tbLider);

             tablaLider.getColumnModel().getColumn(0).setPreferredWidth(5);
             tablaLider.getColumnModel().getColumn(1).setPreferredWidth(50);
             tablaLider.getColumnModel().getColumn(2).setPreferredWidth(50);
             tablaLider.getColumnModel().getColumn(3).setPreferredWidth(50);
                    
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
        lblTituloInf1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLider = new javax.swing.JTable();
        lblFondoInf1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de Lideres por Ciudad");
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

        lblTituloInf1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        lblTituloInf1.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloInf1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInf1.setText("LISTADO DE LIDERES POR CIUDAD");
        jPanel1.add(lblTituloInf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 280, 30));

        tablaLider.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLider.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaLider);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 350, 340));

        lblFondoInf1.setBackground(java.awt.Color.white);
        lblFondoInf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g50/lrg/Recursos/fondo.png"))); // NOI18N
        lblFondoInf1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFondoInf1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblFondoInf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseEntered
        lblRegresar.setForeground(new Color(0, 91, 255));
        lblRegresar.setFont(new java.awt.Font("Lucida Sans", 3, 11));
    }//GEN-LAST:event_lblRegresarMouseEntered

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        playSound("resources/click.wav");
        GUIInformes back1=new GUIInformes();
        back1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        lblRegresar.setForeground(new Color(0, 51, 153));
        lblRegresar.setFont(new java.awt.Font("Lucida Sans", 1, 11));
    }//GEN-LAST:event_lblRegresarMouseExited

    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel defBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondoInf1;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblTituloInf1;
    private javax.swing.JTable tablaLider;
    // End of variables declaration//GEN-END:variables
}
