package g_biblio.struts;

import g_biblio.business.UserBusiness;
import g_biblio.hibernate.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

	private String nom;
	private String prenom;
	private String age;
	private String email;
	private String profession;
	private Boolean statut;

	private Utilisateur user = new Utilisateur();

	public String update() {
		System.out.println("==> User Action !! : methode = update");
	
		UserBusiness.updateUser(1, nom, prenom, age, email, profession, statut);

		return SUCCESS;
	}

	public String create() {
		System.out.println("==> User Action !! : methode = create");
		
		UserBusiness.addUser(nom, prenom, age, email, profession, statut);

		return "success_create";
	}


	
	//getters & setters
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getProfession() {
		return profession;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setStatut(String statut) {
		if(Integer.parseInt(statut) == 1){
			this.statut = true;
		}
		else
			this.statut = false;
	}
}