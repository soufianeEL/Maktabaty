package g_biblio.hibernate;

import java.util.Set;

/**
 * Editeur entity. @author MyEclipse Persistence Tools
 */
public class Editeur extends AbstractEditeur implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Editeur() {
	}

	/** minimal constructor */
	public Editeur(String nom) {
		super(nom);
	}

	/** full constructor */
	public Editeur(String nom, String email, Integer tel, Set ouvrages) {
		super(nom, email, tel, ouvrages);
	}

}
