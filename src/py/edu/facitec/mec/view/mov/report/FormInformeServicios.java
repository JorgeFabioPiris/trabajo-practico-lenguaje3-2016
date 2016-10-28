/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.view.mov.report;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import py.edu.facitec.mec.controller.ClienteController;
import py.edu.facitec.mec.controller.ClienteControllerImpl;
import py.edu.facitec.mec.controller.MantenimientoController;
import py.edu.facitec.mec.controller.MantenimientoControllerImp;
import py.edu.facitec.mec.model.Cliente;
import py.edu.facitec.mec.model.Mantenimiento;
import py.edu.facitec.mec.util.Utilidad;

/**
 *
  * @author: Parte grafica: Rosalino Cabral 
 * Logica de programacion: Jorge Fabio
*/
public class FormInformeServicios extends javax.swing.JFrame {

    /**
     * Creates new form FormInformeServicios
     */
    
    MantenimientoController controller;
    ClienteController clieController;
    static DefaultTableModel modelo;

    String dateString1; 
    String dateString2;
    
    Calendar hoy;
    
    public FormInformeServicios() {
        initComponents();
        this.setLocationRelativeTo(null);
        jrFecha.setSelected(true);
        controller = new MantenimientoControllerImp();
        clieController = new ClienteControllerImpl();
        modelo = (DefaultTableModel) jTable1.getModel();
        
        hoy = new GregorianCalendar();
        fechaDesde.setCalendar(hoy);
        fechaHasta.setCalendar(hoy);
        
        tfClienteDesde.requestFocus();
        
        soloNumeros(tfClienteDesde);
        soloNumeros(tfClienteHasta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jrCliente = new javax.swing.JRadioButton();
        jrFecha = new javax.swing.JRadioButton();
        fechaDesde = new com.toedter.calendar.JDateChooser();
        fechaHasta = new com.toedter.calendar.JDateChooser();
        tfClienteDesde = new javax.swing.JTextField();
        tfClienteHasta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        btnImprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnImprimirKeyPressed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnImprimir)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("Seleccione rango de clientes:");

        jLabel2.setText("Desde:");

        jLabel3.setText("Hasta:");

        jLabel4.setText("Periodo de fecha:");

        jLabel5.setText("Desde:");

        jLabel6.setText("Hasta:");

        jLabel7.setText("Ordenar por Codigo:");

        buttonGroup1.add(jrCliente);
        jrCliente.setText("Cliente");
        jrCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrClienteKeyPressed(evt);
            }
        });

        buttonGroup1.add(jrFecha);
        jrFecha.setText("Fecha");
        jrFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrFechaKeyPressed(evt);
            }
        });

        fechaDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaDesdeKeyPressed(evt);
            }
        });

        fechaHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaHastaKeyPressed(evt);
            }
        });

        tfClienteDesde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfClienteDesdeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfClienteDesdeFocusLost(evt);
            }
        });
        tfClienteDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfClienteDesdeKeyPressed(evt);
            }
        });

        tfClienteHasta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfClienteHastaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfClienteHastaFocusLost(evt);
            }
        });
        tfClienteHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfClienteHastaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrFecha))
                    .addComponent(jLabel4)
                    .addComponent(tfClienteDesde)
                    .addComponent(tfClienteHasta, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(fechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(fechaDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfClienteDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfClienteHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrCliente)
                    .addComponent(jrFecha))
                .addContainerGap())
        );

        jTabbedPane4.addTab("Parametros", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Informe", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        cargarTabla();
        jTabbedPane4.setSelectedIndex(1);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tfClienteDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteDesdeKeyPressed
        moverConEnter(evt, tfClienteHasta);
    }//GEN-LAST:event_tfClienteDesdeKeyPressed

    private void tfClienteHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteHastaKeyPressed
        moverConEnter(evt, fechaDesde);
    }//GEN-LAST:event_tfClienteHastaKeyPressed

    private void fechaDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaDesdeKeyPressed
        moverConEnter(evt, fechaHasta);
    }//GEN-LAST:event_fechaDesdeKeyPressed

    private void fechaHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaHastaKeyPressed
        moverConEnter(evt, jrCliente);
    }//GEN-LAST:event_fechaHastaKeyPressed

    private void jrClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrClienteKeyPressed
        moverConEnter(evt, jrFecha);
    }//GEN-LAST:event_jrClienteKeyPressed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAceptarKeyPressed
        hacerClicConEnter(evt, btnAceptar);
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void btnImprimirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnImprimirKeyPressed
        hacerClicConEnter(evt, btnImprimir);
    }//GEN-LAST:event_btnImprimirKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        hacerClicConEnter(evt, btnCancelar);
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyPressed
        hacerClicConEnter(evt, btnSalir);
    }//GEN-LAST:event_btnSalirKeyPressed

    private void tfClienteDesdeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteDesdeFocusGained
        tfClienteDesde.selectAll();
    }//GEN-LAST:event_tfClienteDesdeFocusGained

    private void tfClienteHastaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteHastaFocusGained
        tfClienteHasta.selectAll();
    }//GEN-LAST:event_tfClienteHastaFocusGained

    private void tfClienteDesdeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteDesdeFocusLost
        if (tfClienteDesde.getText().isEmpty()) {
            tfClienteDesde.setText("1");
        }
    }//GEN-LAST:event_tfClienteDesdeFocusLost

    private void tfClienteHastaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteHastaFocusLost
        if (tfClienteHasta.getText().isEmpty()) {
            tfClienteHasta.setText(tfClienteDesde.getText());
        }
    }//GEN-LAST:event_tfClienteHastaFocusLost

    private void jrFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrFechaKeyPressed
        moverConEnter(evt, btnAceptar);
    }//GEN-LAST:event_jrFechaKeyPressed

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
            java.util.logging.Logger.getLogger(FormInformeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInformeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInformeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInformeServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInformeServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser fechaDesde;
    private com.toedter.calendar.JDateChooser fechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jrCliente;
    private javax.swing.JRadioButton jrFecha;
    private javax.swing.JTextField tfClienteDesde;
    private javax.swing.JTextField tfClienteHasta;
    // End of variables declaration//GEN-END:variables

            
    private void cargarTabla() {

        String orden = "fecha";
        if(jrCliente.isSelected()){
                orden = "apellidos";
            }
        Date date1 = fechaDesde.getDate();
        Date date2 = fechaHasta.getDate();
        
        DateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
	dateString1 = fecha.format(date1);
	dateString2 = fecha.format(date2);

        String [] nombreColumnas = {"Mov", "Fecha", "Codigo", "Nombre", "Total", "Condicion"};
            
        List<Mantenimiento> mant = controller.reporteMantenimiento(
                dateString1, 
                dateString2, 
                Integer.parseInt(tfClienteDesde.getText()), 
                Integer.parseInt(tfClienteHasta.getText()), 
                orden);
        
        Object[][] datos = new Object[mant.size()][nombreColumnas.length];
        for (int i=0; i< mant.size(); i++){
            datos[i][0]=mant.get(i).getCodigo();
            datos[i][1]=mant.get(i).getFecha();
            datos[i][2]=mant.get(i).getCliente_codigo();
            Cliente clie = clieController.recuperarPorCodigo(mant.get(i).getCliente_codigo());
            datos[i][3]=clie.getApellidos()+", "+clie.getNombres();
            datos[i][4]=Utilidad.formatoValorS(mant.get(i).getImporte_total());
            datos[i][5]=mant.get(i).getCondicion();
        }
        modelo = new DefaultTableModel(datos, nombreColumnas);
        this.jTable1.setModel(modelo);
    }

    private void imprimir() {
        List lista = new ArrayList();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            MantenimientoReport reporte = new MantenimientoReport(
                    jTable1.getValueAt(i, 0).toString(), 
                    jTable1.getValueAt(i, 1).toString(), 
                    jTable1.getValueAt(i, 2).toString(), 
                    jTable1.getValueAt(i, 3).toString(), 
                    jTable1.getValueAt(i, 4).toString(), 
                    jTable1.getValueAt(i, 5).toString());
            lista.add(reporte);
        }
        try {
            JasperReport informe = (JasperReport)JRLoader.loadObject("ReporteMovimiento.jasper");
//            JasperReport informe = (JasperReport)JRLoader.loadObject("C:\\Users\\Jorge Fabio\\Desktop\\ProyectoSoftwareMec\\src\\py\\edu\\facitec\\mec\\view\\mov\\report\\ReporteMovimiento.jasper");
            Map parametro = new HashMap();
            
            
            parametro.put("FechaDesde", dateString1);
            parametro.put("FechaHasta", dateString2);
            parametro.put("ClienteDesde", tfClienteDesde.getText().toString());
            parametro.put("ClienteHasta", tfClienteHasta.getText().toString());
            JasperPrint print = JasperFillManager.fillReport(informe, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(print,false);
        } catch (JRException ex) {
            Logger.getLogger(FormInformeServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        private void moverConEnter(java.awt.event.KeyEvent evt, JComponent source) {
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            source.requestFocus();
        }
    }
    
    private void hacerClicConEnter(java.awt.event.KeyEvent evt, JButton buttom){
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            buttom.doClick();
        }
    }
    
    public static final void soloNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isLetter(c)){
//                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    private void limpiar() {
        //ciclo para limpiar la tabla
        for (int i = 0; i < jTable1.getRowCount(); i++) {
           modelo.removeRow(i);
           i-=1;
        }
        tfClienteDesde.requestFocus();
        tfClienteDesde.setText("");
        tfClienteHasta.setText("");
        fechaDesde.setCalendar(hoy);
        fechaHasta.setCalendar(hoy);
        jrFecha.setSelected(true);
        jTabbedPane4.setSelectedIndex(0);
    }
}
