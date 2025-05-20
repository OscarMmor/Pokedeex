
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnRegresarPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPokedexActionPerformed(evt);
            }
        });

        btnActualizarPokemon.setBackground(new java.awt.Color(0, 153, 204));
        btnActualizarPokemon.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btnActualizarPokemon.setText("Actualizar");
        btnActualizarPokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizarPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPokemonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombreEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        txtTipoEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTipoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoEditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Habilidad 1:");

        txtHabilidad1Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHabilidad1Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilidad1EditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Habilidad 2:");

        txtHabilidad2Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHabilidad2Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilidad2EditarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Naturaleza:");

        txtNaturalezaEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNaturalezaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaturalezaEditarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Genero:");

        txtGeneroEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGeneroEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroEditarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Peso:");

        txtPesoEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPesoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoEditarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel9.setText("ID:");

        txtIdEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEditarActionPerformed(evt);
            }
        });

        TablaEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jScrollPane1.setViewportView(TablaEditar);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Editar Pokemones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnActualizarPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresarPokedex)
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
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
                                .addComponent(txtPesoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(btnActualizarPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnRegresarPokedex, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
