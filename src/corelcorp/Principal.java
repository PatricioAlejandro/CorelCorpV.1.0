/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corelcorp;

import java.awt.print.*;
import java.awt.*;
import javax.swing.JOptionPane;


/**
 *
 * @author patriciochavez
 */
public class Principal extends javax.swing.JFrame implements Printable{

    /**
     * Creates new form NewJFrame
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pnlGuia = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblNumGuia = new javax.swing.JLabel();
        txtNumGuia = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtInstrucciones = new javax.swing.JTextField();
        txtBultos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Operaciones = new javax.swing.JMenu();
        Leer = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 24)); // NOI18N
        jLabel2.setText("EMPRESA");

        pnlGuia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pnlGuia.setLayout(null);

        lblLogo.setBackground(new java.awt.Color(255, 0, 51));
        lblLogo.setForeground(new java.awt.Color(255, 0, 51));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgprueba.png"))); // NOI18N
        pnlGuia.add(lblLogo);
        lblLogo.setBounds(10, 10, 130, 90);

        lblNumGuia.setText("Guia Numero:");
        pnlGuia.add(lblNumGuia);
        lblNumGuia.setBounds(470, 10, 90, 16);
        pnlGuia.add(txtNumGuia);
        txtNumGuia.setBounds(450, 30, 130, 26);
        pnlGuia.add(jSeparator1);
        jSeparator1.setBounds(20, 90, 570, 10);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre:");
        pnlGuia.add(jLabel1);
        jLabel1.setBounds(60, 200, 60, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo Gestión:");
        pnlGuia.add(jLabel4);
        jLabel4.setBounds(30, 170, 90, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cliente:");
        pnlGuia.add(jLabel5);
        jLabel5.setBounds(60, 110, 50, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Teléfono:");
        pnlGuia.add(jLabel6);
        jLabel6.setBounds(50, 230, 70, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dirección:");
        pnlGuia.add(jLabel7);
        jLabel7.setBounds(50, 260, 70, 16);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Referencia:");
        pnlGuia.add(jLabel8);
        jLabel8.setBounds(20, 290, 70, 16);

        jLabel9.setText("Instrucciones:");
        pnlGuia.add(jLabel9);
        jLabel9.setBounds(30, 340, 90, 16);

        txtTipo.setEditable(false);
        pnlGuia.add(txtTipo);
        txtTipo.setBounds(130, 170, 190, 26);

        txtCliente.setEditable(false);
        pnlGuia.add(txtCliente);
        txtCliente.setBounds(130, 110, 460, 26);

        txtNombre.setEditable(false);
        pnlGuia.add(txtNombre);
        txtNombre.setBounds(130, 200, 460, 26);

        txtTelefono.setEditable(false);
        pnlGuia.add(txtTelefono);
        txtTelefono.setBounds(130, 230, 220, 26);

        txtInstrucciones.setEditable(false);
        txtInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstruccionesActionPerformed(evt);
            }
        });
        pnlGuia.add(txtInstrucciones);
        txtInstrucciones.setBounds(20, 360, 570, 60);

        txtBultos.setEditable(false);
        txtBultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBultosActionPerformed(evt);
            }
        });
        pnlGuia.add(txtBultos);
        txtBultos.setBounds(130, 140, 190, 26);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Num. Bultos:");
        pnlGuia.add(jLabel10);
        jLabel10.setBounds(30, 140, 90, 20);

        txtDireccion.setEditable(false);
        pnlGuia.add(txtDireccion);
        txtDireccion.setBounds(130, 260, 460, 26);

        txtReferencia.setEditable(false);
        txtReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferenciaActionPerformed(evt);
            }
        });
        pnlGuia.add(txtReferencia);
        txtReferencia.setBounds(20, 310, 570, 26);
        pnlGuia.add(jSeparator2);
        jSeparator2.setBounds(350, 470, 160, 10);
        pnlGuia.add(jSeparator3);
        jSeparator3.setBounds(100, 470, 160, 10);

        jLabel3.setText("Firma 1");
        pnlGuia.add(jLabel3);
        jLabel3.setBounds(410, 490, 50, 16);

        jLabel11.setText("Firma 1");
        pnlGuia.add(jLabel11);
        jLabel11.setBounds(150, 490, 50, 16);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Monto:");
        pnlGuia.add(jLabel12);
        jLabel12.setBounds(340, 170, 90, 20);

        txtMonto.setEditable(false);
        pnlGuia.add(txtMonto);
        txtMonto.setBounds(440, 170, 150, 26);

        txtPeso.setEditable(false);
        pnlGuia.add(txtPeso);
        txtPeso.setBounds(440, 140, 150, 26);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Peso(Kg):");
        pnlGuia.add(jLabel13);
        jLabel13.setBounds(340, 140, 90, 20);

        btnImprimir.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnImprimir.setText("Print");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        Operaciones.setText("Operaciones");

        Leer.setText("Leer Archivo");
        Leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerActionPerformed(evt);
            }
        });
        Operaciones.add(Leer);

        jMenuBar1.add(Operaciones);

        Salir.setText("Salir");
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnImprimir)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ReadFile read = new ReadFile();
        read.setVisible(true);
        
    }//GEN-LAST:event_LeerActionPerformed

    private void txtInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstruccionesActionPerformed

    private void txtReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReferenciaActionPerformed

    private void txtBultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBultosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBultosActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
      try{
          PrinterJob gap = PrinterJob.getPrinterJob();
          gap.setPrintable(this);
          boolean b = gap.printDialog();
          if(b){
              gap.print();
          }
      }catch(PrinterException pex){
          JOptionPane.showMessageDialog(null, "Error del Programa", "Error\n" + pex,JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Leer;
    private javax.swing.JMenu Operaciones;
    private javax.swing.JMenu Salir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNumGuia;
    private javax.swing.JPanel pnlGuia;
    private javax.swing.JTextField txtBultos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtInstrucciones;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumGuia;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex>0){
            return NO_SUCH_PAGE;
        }
        
        Graphics2D hub = (Graphics2D) graphics;
        hub.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        hub.scale(0.92, 0.75);
        
        pnlGuia.printAll(graphics);
        return PAGE_EXISTS;
    }
}
