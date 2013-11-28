package g_biblio.business;

import g_biblio.hibernate.Editeur;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PublisherBusiness {

	// recuperer le bean a partir du conf spring et creation d'un bean factory
		static BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		// creer une instance de EditeurPersistence
		private static EditeurPersistence publisherP = (EditeurPersistence) beanFactory.getBean("EditeurPersistence");
		
		private static Editeur publisher = new Editeur();
		
		public static Editeur getPublisherInfo(int id){
			publisher = publisherP.findEditeurById(id);
			return publisher;
		}
}
