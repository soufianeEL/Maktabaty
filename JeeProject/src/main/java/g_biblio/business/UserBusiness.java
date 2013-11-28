package g_biblio.business;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import g_biblio.hibernate.Utilisateur;

public class UserBusiness {

	// recuperer le bean a partir du conf spring et creation d'un bean factory
	static BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
			"applicationContext.xml"));

	// creer une instance de UtilisateurPersistence
	private static UtilisateurPersistence userP = (UtilisateurPersistence) beanFactory
			.getBean("UtilisateurPersistence");

	private static Utilisateur user = new Utilisateur();

	public static Utilisateur getUserInfo() {
		user = userP.findUtilisateurById(1);
		return user;
	}

	public static void updateUser(int id, String nom, String prenom,
			String age, String email, String profession, Boolean statut) {
		user = userP.findUtilisateurById(id);
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setAge(age);
		user.setEmail(email);
		user.setProfession(profession);
		user.setStatut(statut);
		userP.updateUtilisateur(user);
		
	}
	
	public static void addUser(String nom, String prenom,
			String age, String email, String profession, Boolean statut) {
		//Date date = (Date) new java.util.Date();
		//Object now = new java.sql.Timestamp(date.getTime());    
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setAge(age);
		user.setEmail(email);
		user.setProfession(profession);
		user.setStatut(statut);
		//user.setDateInscription((Timestamp) now);
		userP.addUtilisateur(user);
		
	}

	public ArrayList<Utilisateur> getAllUsers() {

		return null;
	}

}
