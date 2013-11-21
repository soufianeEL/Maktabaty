package g_biblio.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Utilisateur entity. @author MyEclipse Persistence Tools
 */
public class Utilisateur extends AbstractUtilisateur implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Utilisateur() {
	}

	/** minimal constructor */
	public Utilisateur(String nom, String email, String type,
			Timestamp dateInscription) {
		super(nom, email, type, dateInscription);
	}

	/** full constructor */
	public Utilisateur(String nom, String prenom, String age, String email,
			String profession, String type, Double credit, Boolean statut,
			Timestamp dateInscription, Set actions) {
		super(nom, prenom, age, email, profession, type, credit, statut,
				dateInscription, actions);
	}

}
