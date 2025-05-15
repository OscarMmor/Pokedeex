
package GUI;

import Metodos.Metodos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Editar_1 extends javax.swing.JFrame {
    
    Metodos metodos = new Metodos();
    DefaultTableModel mdlTabla;
    int filaSeleccionadaParaEdicion = -1;

    public Editar_1() {
        initComponents();
         this.setLocationRelativeTo(null);
        cargarPokemonesEnTabla();
        // Deshabilitar campos de texto hasta que se seleccione un Pokémon
        habilitarCamposEdicion(false);
    }
     private void cargarPokemonesEnTabla() {
        mdlTabla = metodos.listaPokemones();
        TablaEditar.setModel(mdlTabla); 
    }

    private void habilitarCamposEdicion(boolean habilitar) {
        txtNombreEditar.setEnabled(habilitar);
        txtTipoEditar.setEnabled(habilitar);
        txtHabilidad1Editar.setEnabled(habilitar);
        txtHabilidad2Editar.setEnabled(habilitar);
        txtNaturalezaEditar.setEnabled(habilitar);
        txtGeneroEditar.setEnabled(habilitar);
        txtPesoEditar.setEnabled(habilitar);
        btnActualizarPokemon.setEnabled(habilitar); // Habilitar/deshabilitar botón de actualizar
        txtIdEditar.setEnabled(false); // El ID no es editable ya que es único en su especie como mi amigo chorrylan
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresarPokedex = new javax.swing.JButton();
        btnActualizarPokemon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipoEditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHabilidad1Editar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHabilidad2Editar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNaturalezaEditar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGeneroEditar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPesoEditar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtIdEditar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEditar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegresarPokedex.setIcon(new javax.swing.ImageIcon("C:\\Users\\oscar\\Downloads\\izquierda.png")); // NOI18N
        btnRegresarPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPokedexActionPerformed(evt);
            }
        });

        btnActualizarPokemon.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btnActualizarPokemon.setText("Actualizar");
        btnActualizarPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPokemonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombreEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        txtTipoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoEditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Habilidad 1:");

        txtHabilidad1Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilidad1EditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Habilidad 2:");

        txtHabilidad2Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilidad2EditarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Naturaleza:");

        txtNaturalezaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaturalezaEditarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Genero:");

        txtGeneroEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroEditarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Peso:");

        txtPesoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoEditarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel9.setText("ID:");

        txtIdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegresarPokedex)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtIdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreEditar)
                                .addComponent(txtTipoEditar)
                                .addComponent(txtHabilidad1Editar)
                                .addComponent(txtHabilidad2Editar)
                                .addComponent(txtNaturalezaEditar)
                                .addComponent(txtGeneroEditar)
                                .addComponent(txtPesoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnActualizarPokemon)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresarPokedex, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtTipoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHabilidad1Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHabilidad2Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNaturalezaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGeneroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addComponent(txtPesoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizarPokemon)
                .addGap(52, 52, 52))
        );

        TablaEditar.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEditarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEditar);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Editar Pokemon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEditarMouseClicked
        // TODO add your handling code here:
         filaSeleccionadaParaEdicion = TablaEditar.getSelectedRow();
        if (filaSeleccionadaParaEdicion >= 0) {
            // Cargar datos de la fila seleccionada 
            // Columna 0: ID, Columna 1: Nombre, etc.
            txtIdEditar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 0).toString());
            txtNombreEditar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 1).toString());
            txtTipoEditar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 2).toString());
            txtHabilidad1Editar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 3).toString());
            txtHabilidad2Editar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 4).toString());
            txtNaturalezaEditar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 5).toString());
            txtGeneroEditar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 6).toString());
            txtPesoEditar.setText(mdlTabla.getValueAt(filaSeleccionadaParaEdicion, 7).toString());

            habilitarCamposEdicion(true);
        } else {
            habilitarCamposEdicion(false);
        }
    }//GEN-LAST:event_TablaEditarMouseClicked

    private void txtNombreEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditarActionPerformed

    private void txtTipoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoEditarActionPerformed

    private void txtHabilidad1EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabilidad1EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabilidad1EditarActionPerformed

    private void txtHabilidad2EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabilidad2EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabilidad2EditarActionPerformed

    private void txtNaturalezaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaturalezaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNaturalezaEditarActionPerformed

    private void txtGeneroEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroEditarActionPerformed

    private void txtPesoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoEditarActionPerformed

    private void txtIdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEditarActionPerformed

    private void btnActualizarPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPokemonActionPerformed
        // TODO add your handling code here:
        if (filaSeleccionadaParaEdicion >= 0) {
            // Validar campos (similar a como se hace en Registrar_1)
            String nombre = txtNombreEditar.getText();
            String tipo = txtTipoEditar.getText();
            String habilidad1 = txtHabilidad1Editar.getText();
            String habilidad2 = txtHabilidad2Editar.getText();
            String naturaleza = txtNaturalezaEditar.getText();
            String genero = txtGeneroEditar.getText();
            String pesoStr = txtPesoEditar.getText();
            // El ID no se actualiza desde el campo de texto, se mantiene el original.
            String id = txtIdEditar.getText();

            if (nombre.isEmpty() || tipo.isEmpty() || habilidad1.isEmpty() || pesoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Los campos principales no pueden estar vacíos.", 
                        "Error de Edición", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double peso;
            try {
                peso = Double.parseDouble(pesoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Peso inválido.", 
                        "Error de Formato", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Actualizar los valores en el DefaultTableModel
            mdlTabla.setValueAt(nombre, filaSeleccionadaParaEdicion, 1);
            mdlTabla.setValueAt(tipo, filaSeleccionadaParaEdicion, 2);
            mdlTabla.setValueAt(habilidad1, filaSeleccionadaParaEdicion, 3);
            mdlTabla.setValueAt(habilidad2, filaSeleccionadaParaEdicion, 4);
            mdlTabla.setValueAt(naturaleza, filaSeleccionadaParaEdicion, 5);
            mdlTabla.setValueAt(genero, filaSeleccionadaParaEdicion, 6);
            mdlTabla.setValueAt(peso, filaSeleccionadaParaEdicion, 7);
            // El ID (columna 0) no se cambia.

            // Reescribir el archivo con los datos del modelo actualizado
            metodos.reescribirArchivoPokemones(mdlTabla);

            JOptionPane.showMessageDialog(this, "Pokémon actualizado exitosamente.", 
                    "Edición Exitosa", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar campos y deshabilitarlos, resetear selección
            limpiarCamposEdicion();
            habilitarCamposEdicion(false);
            filaSeleccionadaParaEdicion = -1;
            TablaEditar.clearSelection();

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un Pokémon de la tabla para editar.", 
                    "Ninguna Selección", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarPokemonActionPerformed

    private void btnRegresarPokedexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPokedexActionPerformed
        // TODO add your handling code here:
         PokedexPrincipal principal = new PokedexPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarPokedexActionPerformed
 private void limpiarCamposEdicion() {
        txtIdEditar.setText("");
        txtNombreEditar.setText("");
        txtTipoEditar.setText("");
        txtHabilidad1Editar.setText("");
        txtHabilidad2Editar.setText("");
        txtNaturalezaEditar.setText("");
        txtGeneroEditar.setText("");
        txtPesoEditar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEditar;
    private javax.swing.JButton btnActualizarPokemon;
    private javax.swing.JButton btnRegresarPokedex;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGeneroEditar;
    private javax.swing.JTextField txtHabilidad1Editar;
    private javax.swing.JTextField txtHabilidad2Editar;
    private javax.swing.JTextField txtIdEditar;
    private javax.swing.JTextField txtNaturalezaEditar;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtPesoEditar;
    private javax.swing.JTextField txtTipoEditar;
    // End of variables declaration//GEN-END:variables
}
