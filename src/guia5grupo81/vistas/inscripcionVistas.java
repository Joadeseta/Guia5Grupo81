/*
Este código Java Swing crea una aplicación de gestión de inscripciones académicas.:


Selección de Alumno: El usuario puede seleccionar un alumno de una lista desplegable.

Listado de Materias: La aplicación muestra un listado de materias en una tabla. 
El usuario puede ver las materias en las que está inscrito el alumno seleccionado 
o las materias en las que no está inscrito, según la opción seleccionada (radioInscriptas o radioNoInscriptas).

Inscripción y Anulación de Inscripción: El usuario puede inscribir al alumno en una 
materia seleccionada haciendo clic en el botón "Inscribir". También puede anular una 
inscripción existente haciendo clic en el botón "Anular Inscripción". La inscripción y 
la anulación se reflejan en la base de datos.

Salir de la Aplicación: Hay un botón "Salir" que permite cerrar la ventana de la aplicación.

La aplicación carga inicialmente la lista de alumnos y muestra las materias en las que están 
inscritos o no, dependiendo de la opción seleccionada. El usuario puede interactuar con la 
tabla de materias y realizar inscripciones o anulaciones.

El código también incluye funciones para cargar la lista de alumnos, configurar la tabla de 
materias, borrar filas de la tabla y cargar datos de materias inscritas o no inscritas según
la elección del usuario.
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
 * @author WachiPato
 */
public class inscripcionVistas extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumnos> listaA;

    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;

    private DefaultTableModel modelo;

    public inscripcionVistas() {
        initComponents();

        aData = new AlumnoData();
        listaA = (ArrayList<Alumnos>) aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();

        cargarAlumnos();
        armarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        JLAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(0, 153, 153));
        JLAlumno.setText("Formulario de Inscripción");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Listado de Materias");

        radioInscriptas.setBackground(new java.awt.Color(204, 255, 204));
        radioInscriptas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setBackground(new java.awt.Color(204, 255, 204));
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
        jBInscribir.setPreferredSize(new java.awt.Dimension(82, 25));
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAInscribir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBAInscribir.setText("Anular Inscripción");
        jBAInscribir.setEnabled(false);
        jBAInscribir.setPreferredSize(new java.awt.Dimension(144, 25));
        jBAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscribirActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setPreferredSize(new java.awt.Dimension(82, 25));
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
                .addGap(115, 115, 115)
                .addComponent(JLAlumno)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(radioInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {

            Alumnos a = (Alumnos) cboxAlumnos.getSelectedItem();

            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);

            Inscripcion i = new Inscripcion(0, a, m);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtMaterias.getSelectedRow();

        if (filaSeleccionada != -1) {

            Alumnos a = (Alumnos) cboxAlumnos.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);

            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();

        } else {
            System.out.println("Usted debe seleccionar una fila de la tabla.");
        }
    }//GEN-LAST:event_jBAInscribirActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JComboBox<Alumnos> cboxAlumnos;
    private javax.swing.JButton jBAInscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumnos() { //Carga al ComboBox
        for (Alumnos item : listaA) {
            cboxAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarDatosNoInscriptas() {
        //borrarFilasTabla();
        Alumnos selec = (Alumnos) cboxAlumnos.getSelectedItem();
        listaM = (ArrayList) inscData.obtenermateriasNOCursadas(selec.getIdAlumno());
        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }

    private void cargarDatosInscriptas() {
        //BorrarFilasTabla();
        Alumnos selec = (Alumnos) cboxAlumnos.getSelectedItem();
        List<Materia> lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }
}
