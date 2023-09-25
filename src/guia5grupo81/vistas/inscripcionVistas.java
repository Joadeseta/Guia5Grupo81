/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81.vistas;

import guia5grupo81.accesoadatos.AlumnoData;
import guia5grupo81.accesoadatos.InscripcionData;
import guia5grupo81.accesoadatos.MateriaData;
import guia5grupo81.entidades.Alumnos;
import guia5grupo81.entidades.Inscripcion;
import guia5grupo81.entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joadz
 */
public class inscripcionVistas extends javax.swing.JFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumnos> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    public inscripcionVistas() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = (ArrayList<Alumnos>)aData.listarAlumnos();
        modelo = new DefaultTableModel();      
        inscData = new InscripcionData();
        mData = new MateriaData();
        
        cargarAlumnos();
        armarCabeceraTabla();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        JLAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboxAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAInscribir = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        JLAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(0, 153, 153));
        JLAlumno.setText("Formulario de Inscripción");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Listado de Materias");

        radioInscriptas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioNoInscriptas.setText("Materias No Inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        jBInscribir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAInscribir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBAInscribir.setText("Anular Inscripción");
        jBAInscribir.setEnabled(false);

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(141, 142, Short.MAX_VALUE)
                .addComponent(JLAlumno)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBInscribir)
                        .addGap(64, 64, 64)
                        .addComponent(jBAInscribir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(radioInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioNoInscriptas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAInscribir)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

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

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargarDatosInscriptas();
        jBAInscribir.setEnabled(true);
        jBInscribir.setEnabled(false);
        
        
    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        radioInscriptas.setSelected(false);
        cargarDatosNoInscriptas();
        jBAInscribir.setEnabled(false);
        jBInscribir.setEnabled(true);
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtMaterias.getSelectedRow();
        if(filaSeleccionada != -1) {
            Alumnos a = (Alumnos)cboxAlumnos.getSelectedItem();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String)modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);
            
            
            borrarFilaTabla();
        } 
    }//GEN-LAST:event_jBInscribirActionPerformed

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
            java.util.logging.Logger.getLogger(inscripcionVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inscripcionVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inscripcionVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inscripcionVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inscripcionVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JComboBox<Alumnos> cboxAlumnos;
    private javax.swing.JButton jBAInscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() { //Carga al ComboBox
        for (Alumnos item: listaA) {
            cboxAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it: filaCabecera) {
            modelo.addColumn(modelo);
        }
        jtMaterias.setModel(modelo);
    }
    
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice; i >= 0; i --) {
            modelo.removeRow(i);
        }
    }
    
    private void cargarDatosNoInscriptas() {
        //borrarFilasTabla();
        Alumnos selec = (Alumnos)cboxAlumnos.getSelectedItem();
        listaM = (ArrayList) inscData.obtenermateriasNOCursadas(selec.getIdAlumno());
        for (Materia m: listaM) {
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }
    
    private void cargarDatosInscriptas() {
        //BorrarFilasTabla();
        Alumnos selec = (Alumnos) cboxAlumnos.getSelectedItem();
        List <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m: lista) {
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }
}
