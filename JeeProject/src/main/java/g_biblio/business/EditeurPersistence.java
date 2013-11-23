package g_biblio.business;

import g_biblio.hibernate.Editeur;
import g_biblio.hibernate.EditeurDAO;

public class EditeurPersistence {
	
	private EditeurDAO editeurDao;

	public EditeurDAO getEditeurDao() {
		return editeurDao;
	}

	public void setEditeurDao(EditeurDAO editeurDao) {
		this.editeurDao = editeurDao;
	}
	
	public void addEditeur(Editeur editeur){
		editeurDao.save(editeur);
	}
	
	public Editeur findEditeurById(Integer id){
		return editeurDao.findById(id);
	}
	
	public void updateEditeur(Editeur editeur){
		editeurDao.merge(editeur);
	}

	public void deleteEditeur(Editeur editeur){
		editeurDao.delete(editeur);
	}
}
