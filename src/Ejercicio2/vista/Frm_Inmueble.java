/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.vista;

import Ejercicio2.controlador.Inmueble.InmuebleController;
import controlador.utiles.Utilidades;
import javax.swing.JOptionPane;
import Ejercicio2.vista.modeloTablas.ModeloTablaBienes;
import Ejercicio2.vista.modeloTablas.ModeloTablaBienesA;

/**
 *
 * @author jona
 */
public class Frm_Inmueble extends javax.swing.JDialog {

     private ModeloTablaBienesA mc = new ModeloTablaBienesA();
     private InmuebleController ic = new InmuebleController();

     boolean estado = false;
     private Integer id_inmueble;
     private Integer fila = -1;

     /**
      * Creates new form Frm_Inmueble
      */
     public Frm_Inmueble(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
          this.cbxtipo.removeAllItems();
          for (String aux : Utilidades.tipos()) {
               this.cbxtipo.addItem(aux);
          }
          cbxtipo.updateUI();
          CargarTabla();
          txtregistro.setText(String.valueOf(ic.getListainmueble().getSize() + 1));

     }

     Frm_Inmueble() {
     }

     public void CargarTabla() {
          mc.setLista(ic.listado());
          tbl_bienes.setModel(mc);
          tbl_bienes.updateUI();
     }

     public void Limpiar() {
          txtdescrp.setText("");
          txtregistro.setText(String.valueOf(ic.getListainmueble().getSize() + 1));
          txtubi.setText("");
          txtdescrp.setText("");
          txtvalor.setText("");
     }

     private Boolean validar() {
          txtregistro.getText().trim().isEmpty();
          txtubi.getText().trim().isEmpty();
          txtvalor.getText().trim().isEmpty();
          txtdescrp.getText().trim().isEmpty();
          cbxclasif.getSelectedItem().toString().trim().isEmpty();
          cbxservici.getSelectedItem().toString().trim().isEmpty();
          cbxtipo.getSelectedItem().toString().trim().isEmpty();

          return true;

     }

     public void guardar() throws ExceptionInInitializerError {

         
               ic.getInmueble().setId(id_inmueble);
               ic.getInmueble().setNro_Registro(txtregistro.getText());
               ic.getInmueble().setUbicacion(txtubi.getText());
               ic.getInmueble().setValor(txtvalor.getText());
               ic.getInmueble().setClasificacion(cbxclasif.getSelectedItem().toString());
               ic.getInmueble().setServicios(cbxservici.getSelectedItem().toString());
               ic.getInmueble().setTipo(cbxtipo.getSelectedItem().toString());
               ic.getInmueble().setDescripcion(txtdescrp.getText());
               ic.guardar();
               JOptionPane.showMessageDialog(null, "Se ha guardadao correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
               CargarTabla();
               Limpiar();

          

     }

     private void modificar() {

          ic.getInmueble().setId(id_inmueble);
          ic.getInmueble().setNro_Registro(txtregistro.getText());
          ic.getInmueble().setUbicacion(txtubi.getText());
          ic.getInmueble().setValor(txtvalor.getText());
          ic.getInmueble().setClasificacion(cbxclasif.getSelectedItem().toString());
          ic.getInmueble().setServicios(cbxservici.getSelectedItem().toString());
          ic.getInmueble().setTipo(cbxtipo.getSelectedItem().toString());
          ic.getInmueble().setDescripcion(txtdescrp.getText());
          ic.modificar(fila);

          JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
          CargarTabla();

     }

     private void seleccionar() {

          fila = tbl_bienes.getSelectedRow();

          if (fila >= 0) {
               ic.setAuto(ic.listado().obtenerDato(fila));
               txtdescrp.setText(ic.getInmueble().getDescripcion());
               txtregistro.setText(ic.getInmueble().getNro_Registro());
               txtubi.setText(ic.getInmueble().getUbicacion());
               txtvalor.setText(ic.getInmueble().getValor());
               cbxclasif.setSelectedItem(ic.getInmueble().getClasificacion());
               cbxservici.setSelectedItem(ic.getInmueble().getServicios());
               cbxtipo.setSelectedItem(ic.getInmueble().getTipo());
          } else {

               System.out.println("Selccionado");
          }
     }

     private void eliminar() {
          fila = tbl_bienes.getSelectedRow();
          try {
               if (fila >= 0) {
                    ic.eliminars(fila);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente", "Listo", JOptionPane.INFORMATION_MESSAGE);
                    CargarTabla();
               } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
               }
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error del sistema", "Error", JOptionPane.ERROR_MESSAGE);
          }
     }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdescrp = new javax.swing.JTextField();
        txtregistro = new javax.swing.JTextField();
        txtubi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxclasif = new javax.swing.JComboBox<>();
        cbxservici = new javax.swing.JComboBox<>();
        cbxtipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnNuev = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bienes = new javax.swing.JTable();
        BtnNuevo = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion Bienes Inmuebles");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setText("Descripcion");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 120, 90, 16);

        jLabel3.setText("Tipo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(290, 100, 90, 16);

        jLabel4.setText("Ubicacion");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 80, 90, 16);

        txtdescrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescrpActionPerformed(evt);
            }
        });
        jPanel2.add(txtdescrp);
        txtdescrp.setBounds(100, 110, 130, 50);

        txtregistro.setEditable(false);
        jPanel2.add(txtregistro);
        txtregistro.setBounds(100, 30, 130, 30);
        jPanel2.add(txtubi);
        txtubi.setBounds(100, 70, 130, 30);

        jLabel5.setText("Nro Registro");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 40, 90, 16);

        jLabel6.setText("Clacificacion");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(290, 30, 90, 16);

        jLabel7.setText("Servicios");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(290, 70, 90, 16);

        cbxclasif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RURAL", "URBANO" }));
        jPanel2.add(cbxclasif);
        cbxclasif.setBounds(390, 20, 120, 30);

        cbxservici.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUZ - AGUA", "AGUA -ALUMBRADO PUBLICO", "AGUA - ALCANTARILLADO", "TODOS" }));
        jPanel2.add(cbxservici);
        cbxservici.setBounds(390, 60, 120, 30);

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxtipo);
        cbxtipo.setBounds(390, 100, 120, 30);

        jLabel8.setText("Valor");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(290, 150, 90, 16);
        jPanel2.add(txtvalor);
        txtvalor.setBounds(390, 140, 120, 30);

        BtnGuardar.setBackground(new java.awt.Color(204, 255, 255));
        BtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnGuardar);
        BtnGuardar.setBounds(540, 100, 130, 40);

        BtnNuev.setBackground(new java.awt.Color(204, 255, 255));
        BtnNuev.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnNuev.setText("NUEVO");
        BtnNuev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevActionPerformed(evt);
            }
        });
        jPanel2.add(BtnNuev);
        BtnNuev.setBounds(540, 40, 130, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 690, 180);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bien Inmueble");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 0, 147, 30);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 40, 710, 10);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 0, 50, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Bienes Inmuebles"));
        jPanel3.setLayout(null);

        tbl_bienes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_bienes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_bienesMouseReleased(evt);
            }
        });
        tbl_bienes.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tbl_bienesCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbl_bienesInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bienes);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 670, 180);

        BtnNuevo.setBackground(new java.awt.Color(204, 255, 255));
        BtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnNuevo.setText("MODIFICAR");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(BtnNuevo);
        BtnNuevo.setBounds(360, 20, 140, 40);

        BtnCancel.setBackground(new java.awt.Color(204, 255, 255));
        BtnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCancel.setText("ELIMINAR");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(BtnCancel);
        BtnCancel.setBounds(520, 20, 150, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 240, 690, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 550);

        setSize(new java.awt.Dimension(719, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
          guardar();
     }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
         modificar(); //TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void tbl_bienesInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbl_bienesInputMethodTextChanged
         // TODO add your handling code here:
    }//GEN-LAST:event_tbl_bienesInputMethodTextChanged

    private void tbl_bienesCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbl_bienesCaretPositionChanged
         // TODO add your handling code here:
    }//GEN-LAST:event_tbl_bienesCaretPositionChanged

    private void tbl_bienesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bienesMouseReleased
         seleccionar();        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_bienesMouseReleased

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
         eliminar();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnNuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevActionPerformed
         // TODO add your handling code here:
         Limpiar();
    }//GEN-LAST:event_BtnNuevActionPerformed

    private void txtdescrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescrpActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtdescrpActionPerformed

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
               java.util.logging.Logger.getLogger(Frm_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(Frm_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(Frm_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(Frm_Inmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the dialog */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    Frm_Inmueble dialog = new Frm_Inmueble(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                         @Override
                         public void windowClosing(java.awt.event.WindowEvent e) {
                              System.exit(0);
                         }
                    });
                    dialog.setVisible(true);
               }
          });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuev;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> cbxclasif;
    private javax.swing.JComboBox<String> cbxservici;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbl_bienes;
    private javax.swing.JTextField txtdescrp;
    private javax.swing.JTextField txtregistro;
    private javax.swing.JTextField txtubi;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
