package g_biblio.struts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfClass {

//    public static final String RESULT = "pdfs/hello.pdf";
//    public static final String INSPCT = "pdfs/inspect.txt";
//    public static final String STAMPR = "pdfs/stamper.pdf";
//    public static final String COPY = "pdfs//copy.pdf";
//    public static final String BOOTSTRAP = "pdfs//pfe.pdf";
//
//    /**
//     * Creates a PDF file: hello.pdf
//     * @param    args    no arguments needed
//     */
//    public static void main(String[] args)
//        throws DocumentException, IOException {
////        new pdfClass().createPdf(RESULT);
////        
////        // Inspecting PDFs
////        PrintWriter writer = new PrintWriter(new FileOutputStream(INSPCT));
////        inspect(writer, pdfClass.RESULT);
////        writer.close();
//        
//        
//        PdfReader reader = new PdfReader("pdfs/test.pdf");
//        reader.selectPages("1-4");  
////        manipulateWithStamper(reader);
//        manipulateWithCopy(reader);
//        reader.close();
//        
//    }
// 
//    /**
//     * Creates a PDF document.
//     * @param filename the path to the new PDF document
//     * @throws    DocumentException 
//     * @throws    IOException 
//     */
//    public void createPdf(String filename)
//    throws DocumentException, IOException {
//        // step 1
//        Document document = new Document();
//        // step 2
//        PdfWriter.getInstance(document, new FileOutputStream(filename));
//        // step 3
//        document.open();
//        // step 4
//        document.add(new Paragraph("Hello World!"));
//        // step 5
//        
//        document.close();
//
//    }
//    
//    private static void manipulateWithStamper(PdfReader reader)
//            throws IOException, DocumentException {
//;
//            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(STAMPR));
//            stamper.setEncryption("my-owner-password".getBytes(), "my-user-password".getBytes(),
//                    PdfWriter.AllowPrinting | PdfWriter.AllowCopy, PdfWriter.STRENGTH40BITS);   
//            stamper.close();
//        }
//    
//    private static void manipulateWithCopy(PdfReader reader)
//            throws IOException, DocumentException {
//            int n = reader.getNumberOfPages();
//            Document document = new Document();
//            PdfCopy copy = new PdfCopy(document, new FileOutputStream("pdfs/copy.pdf"));
//            document.open();
//            for (int i = 0; i < n;) {
//                copy.addPage(copy.getImportedPage(reader, ++i));
//            }
//            document.close();
//        }
//    
//    public static void inspect(PrintWriter writer, String filename)
//            throws IOException {
//            PdfReader reader = new PdfReader(filename);
//            writer.println(filename);
//            writer.print("Number of pages: ");
//            writer.println(reader.getNumberOfPages());
//            Rectangle mediabox = reader.getPageSize(1);
//            writer.print("Size of page 1: [");
//            writer.print(mediabox.getLeft());
//            writer.print(',');
//            writer.print(mediabox.getBottom());
//            writer.print(',');
//            writer.print(mediabox.getRight());
//            writer.print(',');
//            writer.print(mediabox.getTop());
//            writer.println("]");
//            writer.print("Rotation of page 1: ");
//            writer.println(reader.getPageRotation(1));
//            writer.print("Page size with rotation of page 1: ");
//            writer.println(reader.getPageSizeWithRotation(1));
//            writer.print("Is rebuilt? ");
//            writer.println(reader.isRebuilt());
//            writer.print("Is encrypted? ");
//            writer.println(reader.isEncrypted());
//            writer.println();
//            writer.flush();
//            reader.close();
//        }
}
