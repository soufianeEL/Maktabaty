package g_biblio.business;

import g_biblio.hibernate.Utilisateur;
import g_biblio.hibernate.UtilisateurDAO;

import java.util.List;

public class UtilisateurPersistence {

	private UtilisateurDAO utilisateurDao;

	public UtilisateurDAO getUtilisateurDao() {
		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDAO utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	public void addUtilisateur(Utilisateur utilisateur) {
		utilisateurDao.save(utilisateur);
	}

	public Utilisateur findUtilisateurById(Integer id) {
		return utilisateurDao.findById(id);
	}

	public void updateUtilisateur(Utilisateur utilisateur) {
		utilisateurDao.merge(utilisateur);
	}

	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateurDao.delete(utilisateur);
	}

	public List<Utilisateur> findAllUtilisateur(){
		return utilisateurDao.findAll();
		
	}
}
