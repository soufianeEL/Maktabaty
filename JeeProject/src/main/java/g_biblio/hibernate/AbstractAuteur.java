package g_biblio.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAuteur entity provides the base persistence definition of the Auteur
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAuteur implements java.io.Serializable {

	// Fields

	private Integer idauteur;
	private String nom;
	private String prenom;
	private String email;
	private String biographie;
	private String image;
	private Set ouvrages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAuteur() {
	}

	/** full constructor */
	public AbstractAuteur(String nom, String prenom, String email,
			String biographie, String image, Set ouvrages) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.biographie = biographie;
		this.image = image;
		this.ouvrages = ouvrages;
	}

	// Property accessors

	public Integer getIdauteur() {
		return this.idauteur;
	}

	public void setIdauteur(Integer idauteur) {
		this.idauteur = idauteur;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBiographie() {
		return this.biographie;
	}

	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set getOuvrages() {
		return this.ouvrages;
	}

	public void setOuvrages(Set ouvrages) {
		this.ouvrages = ouvrages;
	}

}