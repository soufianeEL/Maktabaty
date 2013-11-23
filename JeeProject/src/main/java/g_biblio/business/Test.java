package g_biblio.business;

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
		/*
		 * // creer un nouveau Editeur Editeur editeur = new Editeur();
		 * editeur.setNom("dar assalam"); editeur.setEmail("salam@editeur.dar");
		 * editeur.setTel(new Integer("002126525485"));
		 * 
		 * // recuperer le bean a partir du conf spring et creation d'un bean
		 * factory BeanFactory beanFactory = new XmlBeanFactory(new
		 * ClassPathResource("applicationContext.xml"));
		 * 
		 * //creer une instance de EditeurPersistence EditeurPersistence
		 * editeurP = (EditeurPersistence)
		 * beanFactory.getBean("EditeurPersistence");
		 * 
		 * //sauvegarder l'insertion dans la bdd editeurP.addEditeur(editeur);
		 */

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

		//
		// recuperer le bean a partir du conf spring et creation d'un bean
		// factory
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		EditeurPersistence editeurP = (EditeurPersistence) beanFactory.getBean("EditeurPersistence");
		AuteurPersistence auteurP = (AuteurPersistence) beanFactory .getBean("AuteurPersistence");

		// creer un nouveau ouvrage
		Ouvrage o = new Ouvrage();
		o.setTitre("kitabi");
		o.setIsbn("332581NB96");
		Auteur autP = auteurP.findAuteurById(3);
		Editeur editP = editeurP.findEditeurById(2);
		o.setEditeur(editP);
		o.setAuteur(autP);

		// recuperer le bean a partir du conf spring et creation d'un bean
		// factory
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
		//		"applicationContext.xml"));

		// creer une instance de EditeurPersistence
		OuvragePersistence ouvrageP = (OuvragePersistence) beanFactory
				.getBean("OuvragePersistence");

		// sauvegarder l'insertion dans la bdd
		//ouvrageP.addOuvrage(o);

		System.out.println("fiiin !!");
	}

}
