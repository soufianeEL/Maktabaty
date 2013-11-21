package g_biblio.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOuvrage entity provides the base persistence definition of the
 * Ouvrage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOuvrage implements java.io.Serializable {

	// Fields

	private Integer idouvrage;
	private Editeur editeur;
	private Auteur auteur;
	private String isbn;
	private String titre;
	private Date dateEdition;
	private String resume;
	private Float prix;
	private String image;
	private Integer enStock;
	private Integer total;
	private String emplacement;
	private Set actions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOuvrage() {
	}

	/** minimal constructor */
	public AbstractOuvrage(Editeur editeur, Auteur auteur, String isbn) {
		this.editeur = editeur;
		this.auteur = auteur;
		this.isbn = isbn;
	}

	/** full constructor */
	public AbstractOuvrage(Editeur editeur, Auteur auteur, String isbn,
			String titre, Date dateEdition, String resume, Float prix,
			String image, Integer enStock, Integer total, String emplacement,
			Set actions) {
		this.editeur = editeur;
		this.auteur = auteur;
		this.isbn = isbn;
		this.titre = titre;
		this.dateEdition = dateEdition;
		this.resume = resume;
		this.prix = prix;
		this.image = image;
		this.enStock = enStock;
		this.total = total;
		this.emplacement = emplacement;
		this.actions = actions;
	}

	// Property accessors

	public Integer getIdouvrage() {
		return this.idouvrage;
	}

	public void setIdouvrage(Integer idouvrage) {
		this.idouvrage = idouvrage;
	}

	public Editeur getEditeur() {
		return this.editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public Auteur getAuteur() {
		return this.auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateEdition() {
		return this.dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	public String getResume() {
		return this.resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Float getPrix() {
		return this.prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getEnStock() {
		return this.enStock;
	}

	public void setEnStock(Integer enStock) {
		this.enStock = enStock;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getEmplacement() {
		return this.emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public Set getActions() {
		return this.actions;
	}

	public void setActions(Set actions) {
		this.actions = actions;
	}

}