
package guia5grupo81.vistas;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
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

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        Alumnos.setText("Alumno");
        Alumnos.setToolTipText("");

        FormAlumno.setText("Formulario Alumno");
        FormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormAlumnoActionPerformed(evt);
            }
        });
        Alumnos.add(FormAlumno);

        jMenuBar1.add(Alumnos);

        Materia.setText("Materia");

        FormuMateria.setText("Formulario de Materia");
        Materia.add(FormuMateria);

        jMenuBar1.add(Materia);

        Administracion.setText("Administración");

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

        Consulta.setText("Consulta");

        AlumnPorMateria.setText("Alumnos por materia");
        Consulta.add(AlumnPorMateria);

        jMenuBar1.add(Consulta);

        Salir.setText("Salir");
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
