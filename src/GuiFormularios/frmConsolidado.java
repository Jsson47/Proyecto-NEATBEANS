/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiFormularios;

import Controlador.Ctr_Consolidado;
import Gui.frmFormularios;
import Servicios.MS_SQLServer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.*;
import static com.itextpdf.text.Element.ALIGN_CENTER;
import static com.itextpdf.text.Element.ALIGN_LEFT;
import static com.itextpdf.text.Element.ALIGN_MIDDLE;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Element;
/**
 *
 * @author Tania Silva
 */
public class frmConsolidado extends javax.swing.JInternalFrame {
private MS_SQLServer cnx = null; 
    /**
     * Creates new form frmConsolidado
     */
    public frmConsolidado()throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        jLabel9.setText(fecha());
    }

     public static  String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MMMM-yyyy");
        return formatofecha.format(fecha);
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblConsolidado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLblconso = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBorder(null);
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

        jPanel1.setBackground(new java.awt.Color(0, 51, 90));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha :");

        jTblConsolidado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Carnet", "Nombres", "Apellidos", "Ingresos $", "Beca Otorgada %", "Monto a Pagar", "Plazos en Meses", "Pago Pendiente"
            }
        ));
        jScrollPane1.setViewportView(jTblConsolidado);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/doc_24.jpg"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/unanazulchiquito.PNG"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Unan-Managua");

        jLblconso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLblconso.setForeground(new java.awt.Color(255, 255, 255));
        jLblconso.setText("Consolidado de Pagos de Postgrado");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Departamento de Computación");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jLblconso))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(211, 211, 211)
                                        .addComponent(jLabel8)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblconso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void pdf()throws BadElementException, IOException{
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            try {
                // poner en horizontal
                Document document = new Document();
                document.setPageSize(PageSize.A4.rotate());
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // logo
                String logoPath = "UnanManagua.png";
                Image logo = Image.getInstance(logoPath);
                logo.scaleAbsolute(260, 143);
                logo.setAlignment(ALIGN_CENTER);
                document.add(logo);

                // contenido del pdf
                Font font = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD);
                Font font2 = new Font (Font.FontFamily.HELVETICA, 18, Font.BOLD);

                Paragraph centeredParagraph = new Paragraph();
                centeredParagraph.setAlignment(ALIGN_CENTER);
                // una forma
                Chunk chunk = new Chunk("Control de Pagos de Postgrado", font2);
                centeredParagraph.add(chunk);
                // segunda forma
                Paragraph centeredParagraph1 = new Paragraph("Facultad: Ciencias e Ingeniería", font);
                centeredParagraph1.setAlignment(ALIGN_LEFT);

                Paragraph centeredParagraph2 = new Paragraph("Departamento de Computación", font);
                centeredParagraph1.setAlignment(ALIGN_LEFT);
                
                Paragraph centeredParagraph3 = new Paragraph("Elaborado en el Pabellón 16"
                        + "    Fecha: " + jLabel9.getText(), font);
                centeredParagraph3.setAlignment(ALIGN_LEFT);

                Paragraph centeredParagraph4 = new Paragraph("TIPO DE REPORTE: Reporte de Pagos de Postgrado", font);
                centeredParagraph4.setAlignment(ALIGN_CENTER);

                frmFormularios obb = new frmFormularios();
                obb.repaint();
                Paragraph centeredParagraph5 = new Paragraph("Creado por el Pr.Roberto Solis",font);
                centeredParagraph5.setAlignment(ALIGN_LEFT);

                // agregar
                document.add(centeredParagraph);
                document.add(new Chunk("\n"));
                document.add(centeredParagraph2);
                document.add(new Chunk("\n"));
                document.add(centeredParagraph1);
                document.add(new Chunk("\n"));
                document.add(centeredParagraph3);
                document.add(new Chunk("\n"));
                document.add(centeredParagraph5);
                document.add(new Chunk("\n"));
                document.add(centeredParagraph4);

                // crea una tabla en el documento pdf
                PdfPTable table = new PdfPTable(jTblConsolidado.getColumnCount());
                // configura el diseño de la tabla
                table.setHeaderRows(1);
                table.setWidthPercentage(100);
                table.setSpacingBefore(10f);
                table.setSpacingAfter(10f);

                // agrega los encabezados de columna a la tabla
                for (int i = 0; i < jTblConsolidado.getColumnCount(); i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(jTblConsolidado.getColumnName(i)));
                    headerCell.setBackgroundColor(new BaseColor(32, 136, 203));
                    headerCell.setHorizontalAlignment(ALIGN_CENTER);
                    headerCell.setVerticalAlignment(ALIGN_MIDDLE);
                    table.addCell(headerCell);
                }

                // agrega los datos de la tabla al pdf
                for (int row = 0; row < jTblConsolidado.getRowCount(); row++) {
                    for (int column = 0; column < jTblConsolidado.getColumnCount(); column++) {
                        table.addCell(jTblConsolidado.getValueAt(row, column).toString());
                    }
                }
                // agregar tabla
                document.add(table);

                document.close();

                JOptionPane.showMessageDialog(this, "El reporte se ha creado con exito \n"
                        + "El archivo PDF se ha generado correctamente en: " + filePath,
                        "Reporte", JOptionPane.INFORMATION_MESSAGE);

            } catch (DocumentException | FileNotFoundException ex) {
                ex.printStackTrace();
            }
            // abrir el pdf
            File pdfFile = new File(filePath);
            if (pdfFile.exists()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontro el PDF", "PDF no encontrado",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        // TODO add your handling code here:
        pdf();
    } catch (BadElementException ex) {
        java.util.logging.Logger.getLogger(frmConsolidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IOException ex) {
        java.util.logging.Logger.getLogger(frmConsolidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
           try {
            Ctr_Consolidado.listarConsolidado(jTblConsolidado);
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
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblconso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblConsolidado;
    // End of variables declaration//GEN-END:variables
}