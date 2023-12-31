/*
Crear y guardar nuevas materias con un nombre, año y estado (activo o inactivo).
Actualizar materias existentes.
Eliminar materias.
Buscar materias por su código.

La aplicación también contiene varios controladores de eventos que responden a las 
acciones del usuario, como hacer clic en botones o seleccionar botones de radio. Por ejemplo, 
jBGuardarMateriaActionPerformed maneja la lógica para guardar o actualizar materias según la entrada del usuario.


 */
package guia5grupo81.vistas;

import guia5grupo81.accesoadatos.AlumnoData;
import guia5grupo81.accesoadatos.MateriaData;
import guia5grupo81.entidades.Alumnos;
import guia5grupo81.entidades.Materia;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author joadz
 */
public class MateriasVista extends javax.swing.JInternalFrame {

    private final MateriaData mateData = new MateriaData();
    private Materia materiaActual = null;

    public MateriasVista() {
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

        jPanel1 = new javax.swing.JPanel();
        JLAlumno = new javax.swing.JLabel();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jBLimpiarCampos = new javax.swing.JButton();
        jNombre = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBGuardarMateria = new javax.swing.JButton();
        jBEliminarMateria = new javax.swing.JButton();
        jBSalir3 = new javax.swing.JButton();
        jTextCodigo = new javax.swing.JTextField();
        jTextAñoMateria = new javax.swing.JTextField();
        jTexNombreMateria = new javax.swing.JTextField();
        jButtonBuscarCodigoMateria = new javax.swing.JButton();
        jLAño = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        JLAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(0, 153, 153));
        JLAlumno.setText("Materia");

        jRadioButtonEstado.setBackground(new java.awt.Color(204, 255, 204));
        jRadioButtonEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });

        jBLimpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBLimpiarCampos.setText("Nuevo");
        jBLimpiarCampos.setPreferredSize(new java.awt.Dimension(82, 25));
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jNombre.setText("Nombre:");

        jLCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCodigo.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");

        jBGuardarMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBGuardarMateria.setText("Guardar");
        jBGuardarMateria.setPreferredSize(new java.awt.Dimension(82, 25));
        jBGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarMateriaActionPerformed(evt);
            }
        });

        jBEliminarMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBEliminarMateria.setText("Eliminar");
        jBEliminarMateria.setPreferredSize(new java.awt.Dimension(82, 25));
        jBEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarMateriaActionPerformed(evt);
            }
        });

        jBSalir3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir3.setText("Salir");
        jBSalir3.setPreferredSize(new java.awt.Dimension(82, 25));
        jBSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir3ActionPerformed(evt);
            }
        });

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jButtonBuscarCodigoMateria.setText("Buscar");
        jButtonBuscarCodigoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCodigoMateriaActionPerformed(evt);
            }
        });

        jLAño.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLAño.setText("Año:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(206, 206, 206)
                                    .addComponent(JLAlumno))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(144, 144, 144)
                                    .addComponent(jBEliminarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(jBGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(113, 113, 113)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigo)
                            .addComponent(jLAño)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jNombre))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTexNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButtonBuscarCodigoMateria)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCodigoMateria))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombre))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAño)
                    .addComponent(jTextAñoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonEstado)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed
        limpiarCampos();
        materiaActual = null;
        limpiarCampos();
        materiaActual = null;
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed

    private void jBGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarMateriaActionPerformed

        if (validarCampos()) {
            if (materiaActual == null) {
                // Crear una nueva materia
                String nombre = jTexNombreMateria.getText();
                int año = Integer.parseInt(jTextAñoMateria.getText());
                boolean estado = jRadioButtonEstado.isSelected();

                Materia nuevaMateria = new Materia(nombre, año, estado);
                mateData.guardarMateria(nuevaMateria);

                JOptionPane.showMessageDialog(this, "Materia guardada exitosamente.");
            } else {
                // Actualizar la materia existente
                materiaActual.setNombre(jTexNombreMateria.getText());
                materiaActual.setAño(Integer.parseInt(jTextAñoMateria.getText()));
                materiaActual.setEstado(jRadioButtonEstado.isSelected());

                mateData.actualizarMateria(materiaActual);

                JOptionPane.showMessageDialog(this, "Materia actualizada exitosamente.");
            }
            limpiarCampos();
            materiaActual = null;
        }


    }//GEN-LAST:event_jBGuardarMateriaActionPerformed
    private void limpiarCampos() {
        jTextCodigo.setText("");
        jTexNombreMateria.setText("");
        jTextAñoMateria.setText("");

    }

    private boolean validarCampos() {
        String nombre = jTexNombreMateria.getText();
        String añoText = jTextAñoMateria.getText();

        if (nombre.isEmpty() || añoText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return false;
        }

        try {
            int año = Integer.parseInt(añoText);
            if (año < 0) {
                JOptionPane.showMessageDialog(this, "El año debe ser un número positivo.");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo 'Año' debe ser un número válido.");
            return false;
        }

        // Si llegamos aquí, todos los campos son válidos
        return true;
    }


    private void jBEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarMateriaActionPerformed

        if (materiaActual != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar esta Materia?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Intenta eliminar la materia
                    mateData.eliminarMateria(materiaActual.getIdMateria());

                    // Limpia los campos y establece materiaActual a null
                    limpiarCampos();
                    materiaActual = null;

                    JOptionPane.showMessageDialog(this, "Materia eliminada exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    // Maneja las excepciones específicas que puedan ocurrir durante la eliminación
                    JOptionPane.showMessageDialog(this, "Error al eliminar la materia: " + e.getMessage(), "Error de Eliminación", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Muestra un mensaje de advertencia si no se ha seleccionado una materia
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna materia para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jBEliminarMateriaActionPerformed

    private void jBSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalir3ActionPerformed

    private void jButtonBuscarCodigoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCodigoMateriaActionPerformed

        try {
            int id = Integer.parseInt(jTextCodigo.getText());

            materiaActual = mateData.buscarMateria(id);

            if (materiaActual != null) {
                jTexNombreMateria.setText(materiaActual.getNombre());
                jTextAñoMateria.setText(Integer.toString(materiaActual.getAño()));

                jRadioButtonEstado.setSelected(materiaActual.isEstado());
            } else {
                // Mostrar un mensaje si la materia no se encuentra en la base de datos
                JOptionPane.showMessageDialog(this, "No se encontró ninguna materia con ese código.", "Materia no encontrada", JOptionPane.WARNING_MESSAGE);
                limpiarCampos();
            }
        } catch (NumberFormatException nf) {
            // Mostrar un mensaje si el usuario ingresa un valor no numérico en el campo de código
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de código.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonBuscarCodigoMateriaActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JButton jBEliminarMateria;
    private javax.swing.JButton jBGuardarMateria;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBSalir3;
    private javax.swing.JButton jButtonBuscarCodigoMateria;
    private javax.swing.JLabel jLAño;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JTextField jTexNombreMateria;
    private javax.swing.JTextField jTextAñoMateria;
    private javax.swing.JTextField jTextCodigo;
    // End of variables declaration//GEN-END:variables
}
