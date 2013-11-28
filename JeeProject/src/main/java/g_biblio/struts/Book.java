package g_biblio.struts;

import g_biblio.business.AuthorBusiness;
import g_biblio.business.BookBusiness;
import g_biblio.business.PublisherBusiness;
import g_biblio.hibernate.Auteur;
import g_biblio.hibernate.Editeur;
import g_biblio.hibernate.Ouvrage;

import com.opensymphony.xwork2.ActionSupport;

public class Book extends ActionSupport {

	private Ouvrage book = new Ouvrage();
	private Auteur author = new Auteur();
	private Editeur publisher = new Editeur();
	
	public Auteur getAuthor() {
		return author;
	}
	
	public Editeur getPublisher() {
		return publisher;
	}

	public Ouvrage getBook() {
		return book;
	}



	/**
	 * @return the book page with the information needed
	 */
	public String view() {
		System.out.println("==> Book Action !! : methode = view");
		book = BookBusiness.getBookInfo(1);
		author = AuthorBusiness.getAuthorInfo(book.getAuteur().getIdauteur());
		publisher = PublisherBusiness.getPublisherInfo(book.getEditeur().getIdediteur());
		System.out.println("==> Book Action !! : editeur = "+publisher.getNom());
		return "view";
	}
}