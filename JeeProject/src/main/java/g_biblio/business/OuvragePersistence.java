package g_biblio.business;

import g_biblio.hibernate.Ouvrage;
import g_biblio.hibernate.OuvrageDAO;

import java.util.List;

public class OuvragePersistence {
	
	private OuvrageDAO ouvrageDao;
	
	public OuvrageDAO getOuvrageDao() {
		return ouvrageDao;
	}

	public void setOuvrageDao(OuvrageDAO ouvrageDao) {
		this.ouvrageDao = ouvrageDao;
	}

	public void addOuvrage(Ouvrage ouvrage){
		ouvrageDao.save(ouvrage);
	}
	
	public Ouvrage findOuvrageById(Integer id){
		return ouvrageDao.findById(id);
	}
	
	public void updateOuvrage(Ouvrage ouvrage){
		ouvrageDao.merge(ouvrage);
	}

	public void deleteOuvrage(Ouvrage ouvrage){
		ouvrageDao.delete(ouvrage);
	}
	
	public List<Ouvrage> findAllOuvrage(){
		return ouvrageDao.findAll();
		
	}
}
