package g_biblio.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sun.jdi.Method;

import g_biblio.hibernate.Auteur;
import g_biblio.hibernate.Editeur;
import g_biblio.hibernate.Ouvrage;

public class BookBusiness {

	// recuperer le bean a partir du conf spring et creation d'un bean factory
	static BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
			"applicationContext.xml"));
	// creer une instance de OuvragePersistence
	private static OuvragePersistence bookP = (OuvragePersistence) beanFactory.getBean("OuvragePersistence");
	
	private static Ouvrage book = new Ouvrage();
	private static Auteur author = new Auteur();
	private static Editeur publisher = new Editeur();

	public static Ouvrage getBookInfo(int id) {
		System.out.println("==> bookB");
		book = bookP.findOuvrageById(id);
		//author = book.getAuteur();
		//publisher = book.getEditeur();
		return book;
	}
	
	public static void updateBook(int id, int editeur, int auteur, String isbn, String titre,
			Date dateEdition, String resume, Float prix, String image,
			int enStock, int total, String emplacement){
		
		book = bookP.findOuvrageById(id);
		
		book.setAuteur(AuthorBusiness.getAuthorInfo(auteur));
		book.setEditeur(PublisherBusiness.getPublisherInfo(editeur));
		book.setTitre(titre);
		book.setEnStock(enStock);
		book.setIsbn(isbn);
		//book.setImage(image);
		//book.setDateEdition(dateEdition);
		//book.setEmplacement(emplacement);
		book.setTotal(total);
		book.setPrix(prix);
		book.setResume(resume);
		
		bookP.updateOuvrage(book);
	}
	
	public static void updateBook(Ouvrage bookU){
	
		book = bookP.findOuvrageById(bookU.getIdouvrage());
		book.setAuteur(AuthorBusiness.getAuthorInfo(bookU.getAuteur().getIdauteur()));
		book.setEditeur(PublisherBusiness.getPublisherInfo(bookU.getEditeur().getIdediteur()));
		book.setTitre(bookU.getTitre());
		book.setEnStock(bookU.getEnStock());
		book.setIsbn(bookU.getIsbn());
		book.setImage(bookU.getImage());
		//book.setDateEdition(bookU.getDateEdition());
		book.setEmplacement(bookU.getEmplacement());
		book.setTotal(bookU.getTotal());
		book.setPrix(bookU.getPrix());
		book.setResume(bookU.getResume());
		
		bookP.updateOuvrage(book);
	}
	
	public static void addBook(int editeur, int auteur, String isbn, String titre,
			Date dateEdition, String resume, Float prix, String image,
			int enStock, int total/*, String emplacement*/){
		
		book.setTitre(titre);
		book.setIsbn(isbn);
		book.setResume(resume);
		book.setDateEdition(dateEdition);
		book.setEnStock(enStock);
		book.setTotal(total);
		book.setPrix(prix);
		book.setImage(image);
		//book.setEmplacement(emplacement);
		book.setAuteur(AuthorBusiness.getAuthorInfo(auteur));
		book.setEditeur(PublisherBusiness.getPublisherInfo(editeur));
		
		bookP.addOuvrage(book);
	}

	public ArrayList<Ouvrage> getAllBooks() {

		return null;
	}

}
