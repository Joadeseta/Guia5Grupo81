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
 
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabelNumneroAlumno1 = new javax.swing.JLabel();
        jLabelNumneroAlumno2 = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jLabelEstado1 = new javax.swing.JLabel();
        jRadioButtonEstado1 = new javax.swing.JRadioButton();
        jLabelNumneroAlumno3 = new javax.swing.JLabel();
        jcRubro = new javax.swing.JComboBox<>();
        jLabelNumneroAlumno = new javax.swing.JLabel();

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
        jBAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscribirActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        jLabelNumneroAlumno1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumneroAlumno1.setText("Listado de materias");

        jLabelNumneroAlumno2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelNumneroAlumno2.setText("Formulario de incripciones");

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEstado.setText("Materias inscritas");

        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });

        jLabelEstado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEstado1.setText("Materias no inscritas");

        jRadioButtonEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstado1ActionPerformed(evt);
            }
        });

        jLabelNumneroAlumno3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumneroAlumno3.setText("Listado de materias");

        jcRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcRubroItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
 
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumneroAlumno2)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumneroAlumno1)
                        .addGap(229, 229, 229))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNumneroAlumno3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonEstado)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEstado)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jRadioButtonEstado1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEstado1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))

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
                        .addComponent(radioNoInscriptas)))
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
 
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
 
                .addGap(21, 21, 21)
                .addComponent(jLabelNumneroAlumno2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumneroAlumno3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabelNumneroAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelEstado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonEstado1)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))

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

        jLabelNumneroAlumno.setText("Nº Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(JLAlumno)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(292, 292, 292)
                    .addComponent(jLabelNumneroAlumno)
                    .addContainerGap(296, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(jLabelNumneroAlumno)
                    .addContainerGap(351, Short.MAX_VALUE)))

            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jRadioButtonEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstado1ActionPerformed

    private void jcRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcRubroItemStateChanged
        borrarFilas();

        // Ahora cargo los datos del ArrayList en la Tabla mediante un ciclo for
        for (Producto prod : Menu.listaProductos) {
            // Si los primeros caracteres coinciden, entonces los agrego a la lista
            if (prod.getRubro().toString().startsWith(jcRubro.getSelectedItem().toString())) {
                modelo.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getPrecio(),
                    prod.getStock()
                });
            }
        }
    }//GEN-LAST:event_jcRubroItemStateChanged

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

    private void jBAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtMaterias.getSelectedRow();
        if(filaSeleccionada != -1) {
            Alumnos a = (Alumnos)cboxAlumnos.getSelectedItem();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
                        
        } else {
            System.out.println("Usted debe seleccionar una fila de la tabla.");
        }
    }//GEN-LAST:event_jBAInscribirActionPerformed
 

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
 
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstado1;
    private javax.swing.JLabel jLabelNumneroAlumno;
    private javax.swing.JLabel jLabelNumneroAlumno1;
    private javax.swing.JLabel jLabelNumneroAlumno2;
    private javax.swing.JLabel jLabelNumneroAlumno3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JRadioButton jRadioButtonEstado1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcRubro;
    private javax.swing.JTable jtProductos;

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
