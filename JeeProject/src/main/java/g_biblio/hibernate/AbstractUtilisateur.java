package g_biblio.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUtilisateur entity provides the base persistence definition of the
 * Utilisateur entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUtilisateur implements java.io.Serializable {

	// Fields

	private Integer idutilisateur;
	private String nom;
	private String prenom;
	private String age;
	private String email;
	private String profession;
	private String type;
	private Double credit;
	private Boolean statut;
	private Timestamp dateInscription;
	private Set actions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUtilisateur() {
	}

	/** minimal constructor */
	public AbstractUtilisateur(String nom, String email, String type,
			Timestamp dateInscription) {
		this.nom = nom;
		this.email = email;
		this.type = type;
		this.dateInscription = dateInscription;
	}

	/** full constructor */
	public AbstractUtilisateur(String nom, String prenom, String age,
			String email, String profession, String type, Double credit,
			Boolean statut, Timestamp dateInscription, Set actions) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.email = email;
		this.profession = profession;
		this.type = type;
		this.credit = credit;
		this.statut = statut;
		this.dateInscription = dateInscription;
		this.actions = actions;
	}

	// Property accessors

	public Integer getIdutilisateur() {
		return this.idutilisateur;
	}

	public void setIdutilisateur(Integer idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getCredit() {
		return this.credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Boolean getStatut() {
		return this.statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public Timestamp getDateInscription() {
		return this.dateInscription;
	}

	public void setDateInscription(Timestamp dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Set getActions() {
		return this.actions;
	}

	public void setActions(Set actions) {
		this.actions = actions;
	}

}