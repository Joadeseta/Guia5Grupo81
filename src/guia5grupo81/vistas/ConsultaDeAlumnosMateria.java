/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package guia5grupo81.vistas;

import guia5grupo81.accesoadatos.AlumnoData;
import guia5grupo81.accesoadatos.InscripcionData;
import guia5grupo81.accesoadatos.MateriaData;
import guia5grupo81.entidades.Alumnos;
import guia5grupo81.entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan
 */
public class ConsultaDeAlumnosMateria extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumnos> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    public ConsultaDeAlumnosMateria() {
        initComponents();
        
        aData = new AlumnoData();
        mData = new MateriaData();
        listaM = (ArrayList<Materia>)mData.listarMaterias();
        modelo = new DefaultTableModel();      
        inscData = new InscripcionData();
        
        cargarMaterias();
        armarCabeceraTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboxMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jRAlumInsc = new javax.swing.JRadioButton();
        jRAlumNoInsc = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        JLAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(0, 153, 153));
        JLAlumno.setText("Listado de alumnos por materia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Seleccione una materia:");

        cboxMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMateriasActionPerformed(evt);
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

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setPreferredSize(new java.awt.Dimension(82, 25));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jRAlumInsc.setBackground(new java.awt.Color(204, 255, 204));
        jRAlumInsc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRAlumInsc.setForeground(new java.awt.Color(0, 153, 153));
        jRAlumInsc.setText("Alumnos Inscriptos");
        jRAlumInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRAlumInscActionPerformed(evt);
            }
        });

        jRAlumNoInsc.setBackground(new java.awt.Color(204, 255, 204));
        jRAlumNoInsc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRAlumNoInsc.setForeground(new java.awt.Color(0, 153, 153));
        jRAlumNoInsc.setText("Alumnos No Inscriptos");
        jRAlumNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRAlumNoInscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(JLAlumno)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRAlumInsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRAlumNoInsc))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRAlumInsc)
                    .addComponent(jRAlumNoInsc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void cboxMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMateriasActionPerformed

    private void jRAlumInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRAlumInscActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jRAlumNoInsc.setSelected(false);
        cargarDatosAlumnosInscriptos();
    }//GEN-LAST:event_jRAlumInscActionPerformed

    private void jRAlumNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRAlumNoInscActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jRAlumInsc.setSelected(false);
        cargarDatosAlumnosNoInscriptos();
    }//GEN-LAST:event_jRAlumNoInscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JComboBox<Materia> cboxMaterias;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRAlumInsc;
    private javax.swing.JRadioButton jRAlumNoInsc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarMaterias() {
        for (Materia item: listaM) {
            cboxMaterias.addItem(item);
        }        
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        for (Object it: filaCabecera) {
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);
    }
    
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice; i >= 0; i --) {
            modelo.removeRow(i);
        }
    }
    
    private void cargarDatosAlumnosInscriptos() {
        //BorrarFilasTabla();
        Materia selec = (Materia) cboxMaterias.getSelectedItem();
        listaA = (ArrayList) inscData.obtenerAlumnosXMateria(selec.getIdMateria());
        for (Alumnos a: listaA) {
            modelo.addRow(new Object[] {a.getIdAlumno(), a.getDni(), a.getApellido(), a.getNombre()});
        }
    }
    
    private void cargarDatosAlumnosNoInscriptos() {
        //BorrarFilasTabla();
        Materia selec = (Materia) cboxMaterias.getSelectedItem();
        List <Alumnos> lista = inscData.obtenerAlumnosXNoMateria(selec.getIdMateria());
        for (Alumnos a: lista) {
            modelo.addRow(new Object[] {a.getIdAlumno(), a.getDni(), a.getApellido(), a.getNombre()});
        }
    }
}
