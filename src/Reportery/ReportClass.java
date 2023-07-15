/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportery;

import Servicios.MS_SQLServer;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*; 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tania Silva
 */
public class ReportClass {
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
     
    private static final String iTextExampleImage = "UnanManagua.png";
    private MS_SQLServer cnx = null;
    /**
     * We create a PDF document with iText using different elements to learn 
     * to use this library.
     * Creamos un documento PDF con iText usando diferentes elementos para aprender 
     * a usar esta librería.
     * @param pdfNewFile  <code>String</code> 
     *      pdf File we are going to write. 
     *      Fichero pdf en el que vamos a escribir. 
     */
    public void createPDF(File pdfNewFile) {
        // Aquí introduciremos el código para crear el PDF.
        try {
    Document document = new Document();
      document.addTitle("Unan-Managua");
      document.addSubject("Departamento de Computación");
      document.addSubject("Reporte de Pagos de Maestría");
      document.addKeywords("SICOP");
      document.addAuthor("Roberto Solis");
      document.addCreator("SICOP_CorpSystem");
    try {
        PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
    } catch (FileNotFoundException fileNotFoundException) {
        System.out.println("No such file was found to generate the PDF "
                + "(No se encontró el fichero para generar el pdf)" + fileNotFoundException);
    }
    document.open();
 
        Chunk chunk = new Chunk("Unan-Managua", chapterFont);
        chunk.setBackground(BaseColor.GRAY);
// Let's create de first Chapter (Creemos el primer capítulo)
        Chapter chapter = new Chapter(new Paragraph(chunk), 1);
        chapter.setNumberDepth(0);
        chapter.add(new Paragraph("Facultad de Ciencias e Ingeniería", paragraphFont));
        chapter.add(new Paragraph("Departamento de Computación", paragraphFont));
        chapter.add(new Paragraph("Reporte de Pagos de Postgrado", paragraphFont));
// We add an image (Añadimos una imagen)
        Image image;
        try {
            image = Image.getInstance(iTextExampleImage);
            image.setAbsolutePosition(1, 1);
            chapter.add(image);
        } catch (BadElementException ex) {
            System.out.println("Image BadElementException" + ex);
        } catch (IOException ex) {
            System.out.println("Image IOException " + ex);
        }
        document.add(chapter);
        
            PdfPTable table = new PdfPTable(10);
// Now we fill the PDF table 
// Ahora llenamos la tabla del PDF
            PdfPCell columnHeader;
// Fill table rows (rellenamos las filas de la tabla).                
                table.addCell("Numero Carnet");
                table.addCell("Nombres");
                table.addCell("Apellidos");
                table.addCell("Ingresos");
                table.addCell("Beca Otorgada");
                table.addCell("Monto a Pagar");
                table.addCell("Plazos en Meses");
                table.addCell("Pago Pendiente"); 

              String url = "\"SELECT M.NumeroCarnet, M.Nombres, M.Apellidos, M.Ingresos$, B.TotalBeca, D.DeudaTotal, D.PlazosMeses, (D.DeudaTotal - C.Monto) AS DeudaRestante"
              +"FROM Maestrante M"
              + "INNER JOIN Beca B ON M.id = B.ID_Maestrante"                 
              + "INNER JOIN Deuda D ON M.id = D.ID_Maestrante" 
              + "INNER JOIN Comprobante C ON M.id = C.ID_Maestrante";  
                try{
            cnx = new MS_SQLServer();
            cnx.pst = cnx.conexion.prepareStatement(url);
            cnx.resultado = cnx.pst.executeQuery();
            
            if(cnx.resultado.next()){
                
                do{
                    table.addCell(cnx.resultado.getString(1));
                    table.addCell(cnx.resultado.getString(2));
                    table.addCell(cnx.resultado.getString(3));
                    table.addCell(cnx.resultado.getString(4));
                    table.addCell(cnx.resultado.getString(5));
                    table.addCell(cnx.resultado.getString(6));
                    table.addCell(cnx.resultado.getString(7));
                    table.addCell(cnx.resultado.getString(8));
                }while (cnx.resultado.next());
            }
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
         
     }
            document.add(table);    
        document.open();
    System.out.println("Your PDF file has been generated!(¡Se ha generado tu hoja PDF!");
} catch (DocumentException documentException) {
    System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
}
    }}
        
          

