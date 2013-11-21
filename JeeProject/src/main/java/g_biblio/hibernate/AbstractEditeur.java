package g_biblio.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractEditeur entity provides the base persistence definition of the
 * Editeur entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEditeur implements java.io.Serializable {

	// Fields

	private Integer idediteur;
	private String nom;
	private String email;
	private Integer tel;
	private Set ouvrages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractEditeur() {
	}

	/** minimal constructor */
	public AbstractEditeur(String nom) {
		this.nom = nom;
	}

	/** full constructor */
	public AbstractEditeur(String nom, String email, Integer tel, Set ouvrages) {
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		this.ouvrages = ouvrages;
	}

	// Property accessors

	public Integer getIdediteur() {
		return this.idediteur;
	}

	public void setIdediteur(Integer idediteur) {
		this.idediteur = idediteur;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public Set getOuvrages() {
		return this.ouvrages;
	}

	public void setOuvrages(Set ouvrages) {
		this.ouvrages = ouvrages;
	}

}