package g_biblio.hibernate;

import java.sql.Timestamp;

/**
 * AbstractAction entity provides the base persistence definition of the Action
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAction implements java.io.Serializable {

	// Fields

	private Integer idaction;
	private Ouvrage ouvrage;
	private Utilisateur utilisateur;
	private Float vote;
	private Timestamp dateVote;
	private String commentaire;
	private Timestamp dateComm;
	private String statut;
	private Timestamp dateP;
	private Timestamp dateRendre;

	// Constructors

	/** default constructor */
	public AbstractAction() {
	}

	/** minimal constructor */
	public AbstractAction(Ouvrage ouvrage, Utilisateur utilisateur) {
		this.ouvrage = ouvrage;
		this.utilisateur = utilisateur;
	}

	/** full constructor */
	public AbstractAction(Ouvrage ouvrage, Utilisateur utilisateur, Float vote,
			Timestamp dateVote, String commentaire, Timestamp dateComm,
			String statut, Timestamp dateP, Timestamp dateRendre) {
		this.ouvrage = ouvrage;
		this.utilisateur = utilisateur;
		this.vote = vote;
		this.dateVote = dateVote;
		this.commentaire = commentaire;
		this.dateComm = dateComm;
		this.statut = statut;
		this.dateP = dateP;
		this.dateRendre = dateRendre;
	}

	// Property accessors

	public Integer getIdaction() {
		return this.idaction;
	}

	public void setIdaction(Integer idaction) {
		this.idaction = idaction;
	}

	public Ouvrage getOuvrage() {
		return this.ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Float getVote() {
		return this.vote;
	}

	public void setVote(Float vote) {
		this.vote = vote;
	}

	public Timestamp getDateVote() {
		return this.dateVote;
	}

	public void setDateVote(Timestamp dateVote) {
		this.dateVote = dateVote;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Timestamp getDateComm() {
		return this.dateComm;
	}

	public void setDateComm(Timestamp dateComm) {
		this.dateComm = dateComm;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Timestamp getDateP() {
		return this.dateP;
	}

	public void setDateP(Timestamp dateP) {
		this.dateP = dateP;
	}

	public Timestamp getDateRendre() {
		return this.dateRendre;
	}

	public void setDateRendre(Timestamp dateRendre) {
		this.dateRendre = dateRendre;
	}

}