package g_biblio.hibernate;

public class AuteurPersistence {
	
	private AuteurDAO auteurDao;
	
	public AuteurDAO getAuteurDao() {
		return auteurDao;
	}

	public void setAuteurDao(AuteurDAO auteurDao) {
		this.auteurDao = auteurDao;
	}

	public void addAuteur(Auteur auteur){
		auteurDao.save(auteur);
	}
	
	public Auteur findAuteurById(Integer id){
		return auteurDao.findById(id);
	}
	
	public void updateAuteur(Auteur auteur){
		auteurDao.merge(auteur);
	}
	
	public void deleteAuteur(Auteur auteur){
		auteurDao.delete(auteur);
	}

}
