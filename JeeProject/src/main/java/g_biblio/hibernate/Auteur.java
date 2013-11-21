package g_biblio.hibernate;

import java.util.Set;

/**
 * Auteur entity. @author MyEclipse Persistence Tools
 */
public class Auteur extends AbstractAuteur implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Auteur() {
	}

	/** full constructor */
	public Auteur(String nom, String prenom, String email, String biographie,
			String image, Set ouvrages) {
		super(nom, prenom, email, biographie, image, ouvrages);
	}

}
