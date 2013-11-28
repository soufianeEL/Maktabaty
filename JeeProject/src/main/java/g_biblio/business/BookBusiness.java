package g_biblio.business;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

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

	public ArrayList<Ouvrage> getAllBooks() {

		return null;
	}

}
