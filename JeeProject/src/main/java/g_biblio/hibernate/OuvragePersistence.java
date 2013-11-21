package g_biblio.hibernate;

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
}
