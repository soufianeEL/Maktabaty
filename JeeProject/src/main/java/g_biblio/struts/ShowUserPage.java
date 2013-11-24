package g_biblio.struts;

import g_biblio.business.UserBusiness;
import g_biblio.hibernate.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class ShowUserPage extends ActionSupport {
	
	private Utilisateur user = new Utilisateur();

	/**
	 * @return
	 */
	public String execute() {
		System.out.println("==> showUserPage action");
		user = UserBusiness.getUserInfo();
		if(user != null){
			System.out.println("not null !! ");
			System.out.println("name : "+ user.getNom());
		}
		return SUCCESS;
	}
	
	public Utilisateur getUser(){
		return user;
	}
}