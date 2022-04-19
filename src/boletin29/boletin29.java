
package boletin29;

import javax.swing.table.DefaultTableModel;

public class boletin29 extends javax.swing.JFrame {
    DefaultTableModel modelo;

    public boletin29() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Apelido");
        modelo.addColumn("Curso");
        this.tabla.setModel(modelo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCursos = new javax.swing.JComboBox<>();
        tApelido = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        bAgregar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        tabla.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "APELIDO", "CURSO"
            }
        ));
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 200, 350, 210);

        jNome.setText("NOME");
        jPanel1.add(jNome);
        jNome.setBounds(70, 80, 40, 20);

        jLabel1.setText("APELIDO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 140, 70, 16);

        jCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dam1", "dam2", "asir1", "asir2" }));
        jPanel1.add(jCursos);
        jCursos.setBounds(320, 72, 100, 40);
        jPanel1.add(tApelido);
        tApelido.setBounds(140, 130, 150, 40);
        jPanel1.add(tNome);
        tNome.setBounds(140, 72, 150, 40);

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(bAgregar);
        bAgregar.setBounds(320, 130, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        String[] info = new String[3];
        
        info[0] = tNome.getText();
        info[1] = tApelido.getText();
        info[2] = (String) jCursos.getSelectedItem();
        
        modelo.addRow(info);
        tNome.setText("");
        tApelido.setText("");
        jCursos.setSelectedIndex(0);
        
    }//GEN-LAST:event_bAgregarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new boletin29().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAgregar;
    private javax.swing.JComboBox<String> jCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tApelido;
    private javax.swing.JTextField tNome;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
