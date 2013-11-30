package g_biblio.struts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BadPdfFormatException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.opensymphony.xwork2.ActionSupport;

public class ShowPage extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InputStream fileStream;

	/**
	 * @return
	 */

	public String execute() {
		System.out.println("==> ShowPage.execute()");
		return SUCCESS;
	}

	public String openPdf() {
		try {
			fileStream = new FileInputStream("pdfs/test.pdf");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return "success";
	}

	// public String newPdf() {
	// // TODO Auto-generated method stub
	// PdfReader reader = null;
	//
	// try {
	// reader = new PdfReader("pdfs/test.pdf");//lu
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// reader.selectPages("1-3");
	//
	// int n = reader.getNumberOfPages();
	// Document document = new Document();
	// PdfCopy copy = null;
	// try {
	// copy = new PdfCopy(document, new
	// FileOutputStream("pdf/copy5.pdf"));//genérer
	// } catch (FileNotFoundException e) {
	//
	// e.printStackTrace();
	// } catch (DocumentException e) {
	//
	// e.printStackTrace();
	// }
	// document.open();
	// for (int i = 0; i < n;) {
	// try {
	// copy.addPage(copy.getImportedPage(reader, ++i));
	// } catch (BadPdfFormatException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// document.close();
	// return "success";
	// }

	public InputStream getFileStream() {
		return fileStream;
	}

	public void setFileStream(InputStream fileStream) {
		this.fileStream = fileStream;
	}

}
