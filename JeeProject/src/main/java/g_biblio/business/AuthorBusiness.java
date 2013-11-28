package g_biblio.business;

import java.util.ArrayList;

import g_biblio.hibernate.Auteur;
import g_biblio.hibernate.Ouvrage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AuthorBusiness {

	// recuperer le bean a partir du conf spring et creation d'un bean factory
	static BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
			"applicationContext.xml"));
	// creer une instance de OuvragePersistence
	private static OuvragePersistence bookP = (OuvragePersistence) beanFactory
			.getBean("OuvragePersistence");
	// creer une instance de AuteurPersistence
	private static AuteurPersistence authorP = (AuteurPersistence) beanFactory
			.getBean("AuteurPersistence");

	private static Ouvrage book = new Ouvrage();
	private static Auteur author = new Auteur();

	public static Auteur getAuthorInfo(int id) {
		System.out.println("==> AuthorB");
		author = authorP.findAuteurById(id);
		return author;
	}

	public ArrayList<Auteur> getAllAuthors() {

		return null;
	}

}
