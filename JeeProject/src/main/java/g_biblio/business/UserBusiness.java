package g_biblio.business;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import g_biblio.hibernate.Utilisateur;

public class UserBusiness {

	// recuperer le bean a partir du conf spring et creation d'un bean factory
	static BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

	//creer une instance de UtilisateurPersistence 
	private static UtilisateurPersistence userP = (UtilisateurPersistence)
	beanFactory.getBean("UtilisateurPersistence");
	
	private static Utilisateur user = new Utilisateur();

	public static Utilisateur getUserInfo() {		
		user = userP.findUtilisateurById(1);
		return user;
	}

	public ArrayList<Utilisateur> getAllUsers() {

		return null;
	}

}
