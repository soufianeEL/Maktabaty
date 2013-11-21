package g_biblio.hibernate;

import java.util.Date;
import java.util.Set;

/**
 * Ouvrage entity. @author MyEclipse Persistence Tools
 */
public class Ouvrage extends AbstractOuvrage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ouvrage() {
	}

	/** minimal constructor */
	public Ouvrage(Editeur editeur, Auteur auteur, String isbn) {
		super(editeur, auteur, isbn);
	}

	/** full constructor */
	public Ouvrage(Editeur editeur, Auteur auteur, String isbn, String titre,
			Date dateEdition, String resume, Float prix, String image,
			Integer enStock, Integer total, String emplacement, Set actions) {
		super(editeur, auteur, isbn, titre, dateEdition, resume, prix, image,
				enStock, total, emplacement, actions);
	}

}
