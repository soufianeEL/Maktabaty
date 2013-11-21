package g_biblio.hibernate;

import java.sql.Timestamp;

/**
 * Action entity. @author MyEclipse Persistence Tools
 */
public class Action extends AbstractAction implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Action() {
	}

	/** minimal constructor */
	public Action(Ouvrage ouvrage, Utilisateur utilisateur) {
		super(ouvrage, utilisateur);
	}

	/** full constructor */
	public Action(Ouvrage ouvrage, Utilisateur utilisateur, Float vote,
			Timestamp dateVote, String commentaire, Timestamp dateComm,
			String statut, Timestamp dateP, Timestamp dateRendre) {
		super(ouvrage, utilisateur, vote, dateVote, commentaire, dateComm,
				statut, dateP, dateRendre);
	}

}
