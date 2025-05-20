
package GUI;

import DatosPokemon.Pokemones;
import Metodos.Metodos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class Registrar_1 extends javax.swing.JFrame {
     Metodos metodos = new Metodos();
    DefaultTableModel mdlTabla;

    public Registrar_1() {
        initComponents();
        this.setLocationRelativeTo(null);
        configurarTabla();
    }
 private void configurarTabla() {
        // Reutiliza el método listaPokemones que ya devuelve el modelo con las cabeceras correctas
        mdlTabla = metodos.listaPokemones();
        TablaRegistros.setModel(mdlTabla); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresarPokedex = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePokemon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipoPokemon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHabilidad1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHabilidad2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNaturaleza = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPesoPokemon = new javax.swing.JTextField();
        btnRegistrarPokemon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        TablaRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaRegistros.setGridColor(new java.awt.Color(255, 255, 255));
        TablaRegistros.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TablaRegistros);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Regsitrar Pokemones");

        btnRegresarPokedex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPokedexActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombrePokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePokemonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        txtTipoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoPokemonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Habilidad 1:");

        txtHabilidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilidad1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Habilidad 2:");

        txtHabilidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilidad2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Naturaleza:");

        txtNaturaleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNaturalezaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Genero:");

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Peso:");

        txtPesoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoPokemonActionPerformed(evt);
            }
        });

        btnRegistrarPokemon.setBackground(new java.awt.Color(255, 204, 0));
        btnRegistrarPokemon.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        btnRegistrarPokemon.setText("Registrar");
        btnRegistrarPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPokemonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombrePokemon)
                                .addComponent(txtTipoPokemon)
                                .addComponent(txtHabilidad1)
                                .addComponent(txtHabilidad2)
                                .addComponent(txtNaturaleza)
                                .addComponent(txtGenero)
                                .addComponent(txtPesoPokemon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnRegistrarPokemon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombrePokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHabilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHabilidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNaturaleza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarPokemon)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresarPokedex)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresarPokedex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnRegistrarPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPokemonActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombrePokemon.getText();
        String tipo = txtTipoPokemon.getText();
        String habilidad1 = txtHabilidad1.getText();
        String habilidad2 = txtHabilidad2.getText(); 
        String naturaleza = txtNaturaleza.getText(); 
        String genero = txtGenero.getText();         
        String pesoStr = txtPesoPokemon.getText();

        if (nombre.isEmpty() || tipo.isEmpty() || habilidad1.isEmpty() || pesoStr.isEmpty() /* Agrega validaciones para los nuevos campos si son obligatorios */) {
            JOptionPane.showMessageDialog(this, "Nombre, Tipo, Habilidad 1 y Peso son obligatorios.", 
                    "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double peso;
        try {
            peso = Double.parseDouble(pesoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Peso inválido. Debe ser un número.", 
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String idPokemon = metodos.generarIdPokemon(); // Generar ID único

        Pokemones nuevoPokemon = new Pokemones(idPokemon, nombre, tipo, habilidad1, habilidad2, naturaleza, genero, peso);

        
       
        metodos.guardarPokemonEnArchivo(nuevoPokemon); // Este es el importante para persistencia

        JOptionPane.showMessageDialog(this, "¡Pokémon registrado exitosamente con ID: " + idPokemon + "!", 
                "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar campos
        txtNombrePokemon.setText("");
        txtTipoPokemon.setText("");
        txtHabilidad1.setText("");
        txtHabilidad2.setText("");
        txtNaturaleza.setText("");
        txtGenero.setText("");
        txtPesoPokemon.setText("");

        // Actualizar la tabla
        configurarTabla(); 

    }//GEN-LAST:event_btnRegistrarPokemonActionPerformed

    private void btnRegresarPokedexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPokedexActionPerformed
        // TODO add your handling code here:
        PokedexPrincipal principal = new PokedexPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarPokedexActionPerformed

    private void txtNombrePokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePokemonActionPerformed

    private void txtTipoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoPokemonActionPerformed

    private void txtHabilidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabilidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabilidad1ActionPerformed

    private void txtHabilidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabilidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabilidad2ActionPerformed

    private void txtNaturalezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNaturalezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNaturalezaActionPerformed

    private void txtPesoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoPokemonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRegistros;
    private javax.swing.JButton btnRegistrarPokemon;
    private javax.swing.JButton btnRegresarPokedex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtHabilidad1;
    private javax.swing.JTextField txtHabilidad2;
    private javax.swing.JTextField txtNaturaleza;
    private javax.swing.JTextField txtNombrePokemon;
    private javax.swing.JTextField txtPesoPokemon;
    private javax.swing.JTextField txtTipoPokemon;
    // End of variables declaration//GEN-END:variables
}
