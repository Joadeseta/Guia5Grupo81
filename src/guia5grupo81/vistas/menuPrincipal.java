
package guia5grupo81.vistas;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Alumnos = new javax.swing.JMenu();
        FormAlumno = new javax.swing.JMenuItem();
        Materia = new javax.swing.JMenu();
        FormuMateria = new javax.swing.JMenuItem();
        Administracion = new javax.swing.JMenu();
        ManejInscripciones = new javax.swing.JMenuItem();
        ManiNotas = new javax.swing.JMenuItem();
        Consulta = new javax.swing.JMenu();
        AlumnPorMateria = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        Alumnos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user (2).png"))); // NOI18N
        Alumnos.setText("Alumnos");
        Alumnos.setToolTipText("");
        Alumnos.setPreferredSize(new java.awt.Dimension(130, 50));

        FormAlumno.setText("Formulario Alumno");
        FormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormAlumnoActionPerformed(evt);
            }
        });
        Alumnos.add(FormAlumno);

        jMenuBar1.add(Alumnos);

        Materia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/list.png"))); // NOI18N
        Materia.setText("Materias");
        Materia.setPreferredSize(new java.awt.Dimension(130, 50));

        FormuMateria.setText("Formulario de Materia");
        Materia.add(FormuMateria);

        jMenuBar1.add(Materia);

        Administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit (1).png"))); // NOI18N
        Administracion.setText("Administración");
        Administracion.setPreferredSize(new java.awt.Dimension(130, 50));

        ManejInscripciones.setText("Manejo de inscripciones");
        ManejInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManejInscripcionesActionPerformed(evt);
            }
        });
        Administracion.add(ManejInscripciones);

        ManiNotas.setText("Manipulación de notas");
        Administracion.add(ManiNotas);

        jMenuBar1.add(Administracion);

        Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/search.png"))); // NOI18N
        Consulta.setText("Consulta");
        Consulta.setPreferredSize(new java.awt.Dimension(130, 50));

        AlumnPorMateria.setText("Alumnos por materia");
        Consulta.add(AlumnPorMateria);

        jMenuBar1.add(Consulta);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/arrow-right-to-bracket.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setPreferredSize(new java.awt.Dimension(130, 50));
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormAlumnoActionPerformed

    private void ManejInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManejInscripcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManejInscripcionesActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenuItem AlumnPorMateria;
    private javax.swing.JMenu Alumnos;
    private javax.swing.JMenu Consulta;
    private javax.swing.JMenuItem FormAlumno;
    private javax.swing.JMenuItem FormuMateria;
    private javax.swing.JMenuItem ManejInscripciones;
    private javax.swing.JMenuItem ManiNotas;
    private javax.swing.JMenu Materia;
    private javax.swing.JMenu Salir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
