package g_biblio.struts;

import g_biblio.business.UserBusiness;
import g_biblio.hibernate.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class ShowUserPage extends ActionSupport {
	
	private Utilisateur user = new Utilisateur();
	private String s = "test name";

	/**
	 * @return
	 */
	public String execute() {
		s="salammm";
		System.out.println("==> showUserPage");
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