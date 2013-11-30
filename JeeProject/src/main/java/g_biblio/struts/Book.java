package g_biblio.struts;

import g_biblio.business.AuthorBusiness;
import g_biblio.business.BookBusiness;
import g_biblio.business.PublisherBusiness;
import g_biblio.hibernate.Auteur;
import g_biblio.hibernate.Editeur;
import g_biblio.hibernate.Ouvrage;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Book extends ActionSupport implements ModelDriven{

	private Ouvrage book = new Ouvrage();
	private Auteur auteur ;//= new Auteur();
	private Editeur editeur;// = new Editeur();
	public Ouvrage getBook() {
		return book;
	}
	public void setBook(Ouvrage book) {
		this.book = book;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	/**
	 * @return the book page with the information needed
	 */
	
	public String execute() {
		System.out.println("==> Book Action !! : methode = execute");
		return "view";
	}
	public String view() {
		System.out.println("==> Book Action !! : methode = view");
		book = BookBusiness.getBookInfo(1);
		auteur = AuthorBusiness.getAuthorInfo(book.getAuteur().getIdauteur());
		editeur = PublisherBusiness.getPublisherInfo(book.getEditeur().getIdediteur());
		System.out.println("auteur :"+auteur.getNom());
		System.out.println("editeru : "+editeur.getNom());
		System.out.println("image : "+book.getImage());
		return "success_view";
	}
	
	public String update(){
		System.out.println("==> Book Action !! : methode = update");
		System.out.println("test :==> book id = "+book.getIdouvrage());
		BookBusiness.updateBook(5, book.getEditeur().getIdediteur(), book.getAuteur().getIdauteur(),
				book.getIsbn(), book.getTitre(), book.getDateEdition(), book.getResume(), 
				book.getPrix(), book.getImage(), book.getEnStock(), book.getTotal(),book.getEmplacement());
		return "success_update";
	}
	
	public String create(){
		System.out.println("==> Book Action !! : methode = create");
		BookBusiness.addBook(book.getEditeur().getIdediteur(), book.getAuteur().getIdauteur(),
				book.getIsbn(), book.getTitre(), book.getDateEdition(), book.getResume(), 
				book.getPrix(), book.getImage(), book.getEnStock(), book.getTotal());
		book.toStringg();
		return "success_create";
	}

	//getModel est methode declaré dans l'interface ModelDriven(qui implémenté ici)
	//cette methde nous aide a réccupérer les attributs depuis la forme et les stcker dans l'objet (ici book)
	public Object getModel() {
		// TODO Auto-generated method stub
		return book;
	}
}