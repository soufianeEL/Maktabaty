package g_biblio.hibernate;

public class ActionPersistence {
	
	private ActionDAO actionDao;

	public ActionDAO getActionDao() {
		return actionDao;
	}

	public void setActionDao(ActionDAO actionDao) {
		this.actionDao = actionDao;
	}
	
	public void addAction(Action action){
		actionDao.save(action);
	}
	
	public Action findActionById(Integer id){
		return actionDao.findById(id);
	}
	
	public void updateAction(Action action){
		actionDao.merge(action);
	}
	
	public void deleteAction(Action action){
		actionDao.delete(action);
	}
}
