package g_biblio.business;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import g_biblio.hibernate.Auteur;
import g_biblio.hibernate.Editeur;
import g_biblio.hibernate.Ouvrage;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("*********************************");
		System.out.println("debut !!");

		 // creer un nouveau Editeur
//		 Editeur editeur = new Editeur();
//		 editeur.setNom("dar chorok");
//		 editeur.setEmail("char9@editeur.dar");
//		 editeur.setTel(new Integer("002126525485"));
//		
//		 // recuperer le bean a partir du conf spring et creation d'un
//		 // beanfactory
//		 BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
//		 "applicationContext.xml"));
//		
//		 // creer une instance de EditeurPersistence
//		 EditeurPersistence editeurP = (EditeurPersistence) beanFactory
//		 .getBean("EditeurPersistence");
//		
//		 // sauvegarder l'insertion dans la bdd
//		 editeurP.addEditeur(editeur);

		/*
		 * // creer un nouveau Editeur Auteur auteur = new Auteur();
		 * auteur.setNom("soufiane"); auteur.setEmail("salam@editeur.dar");
		 * auteur.setPrenom("el hamchi");
		 * 
		 * 
		 * // recuperer le bean a partir du conf spring et creation d'un bean //
		 * factory BeanFactory beanFactory = new XmlBeanFactory(new
		 * ClassPathResource("applicationContext.xml"));
		 * 
		 * // creer une instance de AuteurPersistence AuteurPersistence auteurP
		 * = (AuteurPersistence) beanFactory .getBean("AuteurPersistence");
		 * 
		 * // sauvegarder l'insertion dans la bdd auteurP.addAuteur(auteur);
		 */

		/*****************************************************************/
		// recuperer le bean a partir du conf spring et creation d'un bean
		// factory
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		OuvragePersistence bookP = (OuvragePersistence) beanFactory
				.getBean("OuvragePersistence");
		EditeurPersistence editeurP = (EditeurPersistence) beanFactory
				.getBean("EditeurPersistence");
		AuteurPersistence auteurP = (AuteurPersistence) beanFactory
				.getBean("AuteurPersistence");

		// creer un nouveau ouvrage
		Ouvrage book = new Ouvrage();
		Auteur auteur = new Auteur();
		
		book = bookP.findOuvrageById(1);
		System.out.println("book total !! : " + book.getTotal());
		auteur = book.getAuteur();
		//auteur.get
		
		System.out.println("auteur  !! : " );
		if (book.getAuteur() == null)
			System.out.println("auteur !! : null");
		else
			System.out.println("auteur !! : " + auteur.getIdauteur());

		System.out.println("fiiin !!");
	}
}
