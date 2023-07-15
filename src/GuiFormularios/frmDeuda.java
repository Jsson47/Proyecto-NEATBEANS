/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiFormularios;

import Controlador.Ctr_Deuda;
import Negocio.Deuda;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tania Silva
 */
public class frmDeuda extends javax.swing.JInternalFrame {


    /**
     * Creates new form frmDeuda
     */
    public frmDeuda() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBtnGuardar = new javax.swing.JButton();
        jBtnbuscar = new javax.swing.JButton();
        jBtnactualizar = new javax.swing.JButton();
        jBtnListar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCmbPlazos = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTxtdeuda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCmbMestrante = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Txtcodigo = new javax.swing.JTextField();
        pnlPaginar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDeuda = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/beca.png"))); // NOI18N
        jLabel6.setText("Registro de la Deuda");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtnGuardar.setBackground(new java.awt.Color(0, 51, 90));
        jBtnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/guardar_24.gif"))); // NOI18N
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.setBorder(null);
        jBtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnGuardarMouseExited(evt);
            }
        });
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnbuscar.setBackground(new java.awt.Color(0, 51, 90));
        jBtnbuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/buscar_24.gif"))); // NOI18N
        jBtnbuscar.setText("Buscar");
        jBtnbuscar.setBorder(null);
        jBtnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnbuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnbuscarMouseExited(evt);
            }
        });
        jBtnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnbuscarActionPerformed(evt);
            }
        });

        jBtnactualizar.setBackground(new java.awt.Color(0, 51, 90));
        jBtnactualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/chk_24.png"))); // NOI18N
        jBtnactualizar.setText("Actualizar");
        jBtnactualizar.setBorder(null);
        jBtnactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnactualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnactualizarMouseExited(evt);
            }
        });
        jBtnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnactualizarActionPerformed(evt);
            }
        });

        jBtnListar.setBackground(new java.awt.Color(0, 51, 90));
        jBtnListar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnListar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/listar_24.jpg"))); // NOI18N
        jBtnListar.setText("Listar");
        jBtnListar.setBorder(null);
        jBtnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnListarMouseExited(evt);
            }
        });
        jBtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnListarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 90));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/limpieza-de-datos.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jBtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setFocusable(false);

        jCmbPlazos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "12-Meses", "24-Meses" }));
        jCmbPlazos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Total Deuda");

        jTxtdeuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtdeuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtdeudaMouseClicked(evt);
            }
        });
        jTxtdeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtdeudaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Maestrante");

        jCmbMestrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCmbMestrante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Plazos");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Código");

        Txtcodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel10))
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtdeuda, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCmbPlazos, javax.swing.GroupLayout.Alignment.TRAILING, 0, 230, Short.MAX_VALUE)
                    .addComponent(Txtcodigo)
                    .addComponent(jCmbMestrante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCmbPlazos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbMestrante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlPaginar.setBackground(new java.awt.Color(0, 51, 90));

        javax.swing.GroupLayout pnlPaginarLayout = new javax.swing.GroupLayout(pnlPaginar);
        pnlPaginar.setLayout(pnlPaginarLayout);
        pnlPaginarLayout.setHorizontalGroup(
            pnlPaginarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        pnlPaginarLayout.setVerticalGroup(
            pnlPaginarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jTblDeuda.setAutoCreateRowSorter(true);
        jTblDeuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Plazos", "Total de la deuda"
            }
        ));
        jTblDeuda.setSelectionBackground(new java.awt.Color(0, 204, 0));
        jTblDeuda.setShowGrid(true);
        jScrollPane1.setViewportView(jTblDeuda);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPaginar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(pnlPaginar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtdeudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtdeudaMouseClicked

       
//        int Beca = Integer.parseInt(jTxttotalbeca.getText());
//
//        double totaldeuda = 4200-(4200*Beca/100);
//        
//        jTxtdeuda.setText(Double.toString(totaldeuda));
    }//GEN-LAST:event_jTxtdeudaMouseClicked

    private void jTxtdeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtdeudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtdeudaActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed

        try {
                        int rst = Ctr_Deuda.agregar(
                                Integer.parseInt(this.Txtcodigo.getText()),
                                this.jCmbPlazos.getSelectedItem().toString(),
                                Double.parseDouble(this.jTxtdeuda.getText()),
                                this.jCmbMestrante.getSelectedIndex());

                        limpiarRregistro();
                        if (rst > 0 ) {
                                JOptionPane.showMessageDialog(this, "Registro grabado con exito"
                                        , "Grabar Registro", JOptionPane.INFORMATION_MESSAGE);
                            }//Fin de la instrucción if
                    } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                                + "el \n registro, no se encuentra una librería"+ex.toString(),
                                "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
                    } catch (InstantiationException ex) {
                        JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                                + "hacer referencia \n de una instancia"+ex.toString(),
                                "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
                    } catch (IllegalAccessException ex) {
                        JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
                                + "intentar utilizar \n la librería o instancia para guardar"+ex.toString(),
                                "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                                + "el manejo de la solicitud \n en recurso de Base de Datos"+ex.toString(),
                                "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_jBtnGuardarActionPerformed
 public void limpiarRregistro() 
        {
        this.Txtcodigo.setText("");
        this.jCmbPlazos.setSelectedIndex(0);
        this.jTxtdeuda.setText("");
        this.jCmbMestrante.setSelectedIndex(0);
        }
 
 public boolean validacion(){
            boolean valido = true;  
        if (Txtcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La caja de texto  Número de carnet esta vacia.",
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
         return valido;
    }
    private void jBtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnbuscarActionPerformed
        if (validacion() == true) {
                        try {
                                int val = Integer.parseInt(this.Txtcodigo.getText());
                                Deuda p = Ctr_Deuda.leerRegistro(val);

                                if (p != null) {
                                        this.Txtcodigo.setText(Integer.toString(p.getCodigo()));
                                        this.jCmbPlazos.setSelectedItem(p.getPlazospago());
                                        this.jTxtdeuda.setText(Double.toString(p.getTotalDeuda()));
                                        this.jCmbMestrante.setSelectedIndex(p.getId_Maestrante());
                                    }
                
                            } catch (ClassNotFoundException ex) {
                                JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                                        + "el \n registro, no se encuentra una librería", "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
                            } catch (InstantiationException ex) {
                                JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                                        + "hacer referencia \n de una instancia",
                                        "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
                            } catch (IllegalAccessException ex) {
                                JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al "
                                        + "intentar utilizar \n la librería o instancia para guardar", "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                                        + "el manejo de la solicitud \n en recurso de Base de Datos"
                                        + ex.getMessage(),
                                        "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
                            }
                    }
                else
                {
                        JOptionPane.showMessageDialog(null, "La caja de texto  Numero de carnet esta vacia.",
                                "Error de validación", JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_jBtnbuscarActionPerformed

    private void jBtnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnactualizarActionPerformed
        try {
            
            int val = Integer.parseInt(this.Txtcodigo.getText());
            Ctr_Deuda Cpt = new Ctr_Deuda();
            int id = Cpt.buscarId(val);

            if (id > 0) {
               int rst;
                rst = Ctr_Deuda.actualizar(
                        Integer.parseInt(this.Txtcodigo.getText()),                       
                        this.jCmbPlazos.getSelectedItem().toString(),
                        Double.parseDouble(this.jTxtdeuda.getText()),                
                        this.jCmbMestrante.getSelectedIndex(),id);
                if (rst > 0) {
                    JOptionPane.showMessageDialog(this, "Registro actualizado con exito",
                             "Actualizar Registro", JOptionPane.INFORMATION_MESSAGE);

                      limpiarRregistro();

                }
            }  
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                    + "el \n registro, no se encuentra una librería"+ex.toString(), 
                    "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                    + "hacer referencia \n de una instancia"+ex.toString(), 
                    "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
                  + "intentar utilizar \n la librería o instancia para guardar"+ex.toString(), 
                  "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                  + "el manejo de la solicitud \n en recurso de Base de Datos"+ex.toString(), 
                  "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBtnactualizarActionPerformed

    private void jBtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnListarActionPerformed

        try {
            Ctr_Deuda.listar(jTblDeuda);
        }
         catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al intentar guardar "
                    + "el \n registro, no se encuentra una librería"+ex.toString(), 
                    "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
                    + "hacer referencia \n de una instancia"+ex.toString(), 
                    "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
                  + "intentar utilizar \n la librería o instancia para guardar"+ex.toString(), 
                  "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
                  + "el manejo de la solicitud \n al intentar registrar datos "+ex.toString()
                  + ex.getSQLState(), 
                  "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnListarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        
//        try{int num = Ctr_Deuda.generarNumActa();
//        this.Txtcodigo.setText(Integer.toString(num));
//        }catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(this, "Error al intentar guardar "
//                    + "el \n registro, no se encuentra una librería"+ex.toString(), 
//                    "Librería no Encontrada", JOptionPane.ERROR_MESSAGE);
//        } catch (InstantiationException ex) {
//            JOptionPane.showMessageDialog(this, "Se ha producido una falla al "
//                    + "hacer referencia \n de una instancia"+ex.toString(), 
//                    "Instancia no Encontrada", JOptionPane.ERROR_MESSAGE);
//        } catch (IllegalAccessException ex) {
//            JOptionPane.showMessageDialog(this, "Se ha denegado el acceso al  "
//                  + "intentar utilizar \n la librería o instancia para guardar"+ex.toString(), 
//                  "Acceso Ilegal a un Recurso", JOptionPane.ERROR_MESSAGE);
//        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(this, "Se ha producido una falla con "
//                  + "el manejo de la solicitud \n al intentar registrar datos "+ex.toString()
//                  + ex.getSQLState(), 
//                  "Error al Procesar Datos", JOptionPane.ERROR_MESSAGE);
//        }
         try {
           
            for (String name : Ctr_Deuda.CargarCombobox()){
                this.jCmbMestrante.addItem(name);
            }//Fin de for        
        }
        catch (ClassNotFoundException | InstantiationException | 
                     IllegalAccessException | SQLException ex){
                JOptionPane.showMessageDialog(null, "Se ha provocado una falla"
                        + "al tratar de listar los numeros de carnet de los Coordinadores\n "
                        + " registrados actualmente", "Error al cargar"
                                + "listado",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTblDeuda.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcodigoActionPerformed

    private void jBtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGuardarMouseEntered
        // TODO add your handling code here:
        jBtnGuardar.setBackground(Color.white);
        jBtnGuardar.setForeground(Color.black);
    }//GEN-LAST:event_jBtnGuardarMouseEntered

    private void jBtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGuardarMouseExited
        // TODO add your handling code here:
        jBtnGuardar.setBackground(new Color (0,51,90));
        jBtnGuardar.setForeground(Color.white);
    }//GEN-LAST:event_jBtnGuardarMouseExited

    private void jBtnbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnbuscarMouseEntered
        // TODO add your handling code here:
        jBtnbuscar.setBackground(Color.white);
        jBtnbuscar.setForeground(Color.black);
    }//GEN-LAST:event_jBtnbuscarMouseEntered

    private void jBtnbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnbuscarMouseExited
        // TODO add your handling code here:
        jBtnbuscar.setBackground(new Color (0,51,90));
        jBtnbuscar.setForeground(Color.white);
    }//GEN-LAST:event_jBtnbuscarMouseExited

    private void jBtnactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnactualizarMouseEntered
        // TODO add your handling code here:
        jBtnactualizar.setBackground(Color.white);
        jBtnactualizar.setForeground(Color.black);
    }//GEN-LAST:event_jBtnactualizarMouseEntered

    private void jBtnactualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnactualizarMouseExited
        // TODO add your handling code here:
        jBtnactualizar.setBackground(new Color (0,51,90));
        jBtnactualizar.setForeground(Color.white);
    }//GEN-LAST:event_jBtnactualizarMouseExited

    private void jBtnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnListarMouseEntered
        // TODO add your handling code here:
        jBtnListar.setBackground(Color.white);
        jBtnListar.setForeground(Color.black);
    }//GEN-LAST:event_jBtnListarMouseEntered

    private void jBtnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnListarMouseExited
        // TODO add your handling code here:
        jBtnListar.setBackground(new Color (0,51,90));
        jBtnListar.setForeground(Color.white);
    }//GEN-LAST:event_jBtnListarMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(Color.white);
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new Color (0,51,90));
        jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txtcodigo;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnListar;
    private javax.swing.JButton jBtnactualizar;
    private javax.swing.JButton jBtnbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCmbMestrante;
    private javax.swing.JComboBox<String> jCmbPlazos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblDeuda;
    private javax.swing.JTextField jTxtdeuda;
    private javax.swing.JPanel pnlPaginar;
    // End of variables declaration//GEN-END:variables
}
