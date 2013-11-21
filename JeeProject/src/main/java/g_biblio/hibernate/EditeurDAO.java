package g_biblio.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Editeur entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see g_biblio.hibernate.Editeur
 * @author MyEclipse Persistence Tools
 */
public class EditeurDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(EditeurDAO.class);
	// property constants
	public static final String NOM = "nom";
	public static final String EMAIL = "email";
	public static final String TEL = "tel";

	protected void initDao() {
		// do nothing
	}

	public void save(Editeur transientInstance) {
		log.debug("saving Editeur instance");
		try {
			// getHibernateTemplate().save(transientInstance);
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			tx.begin();
			session.save(transientInstance);
			tx.commit();

			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Editeur persistentInstance) {
		log.debug("deleting Editeur instance");
		try {
			// getHibernateTemplate().delete(persistentInstance);
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			tx.begin();

			session.delete(persistentInstance);

			tx.commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Editeur findById(java.lang.Integer id) {
		log.debug("getting Editeur instance with id: " + id);
		try {
			Editeur instance = (Editeur) getHibernateTemplate().get(
					"g_biblio.hibernate.Editeur", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Editeur instance) {
		log.debug("finding Editeur instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Editeur instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Editeur as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNom(Object nom) {
		return findByProperty(NOM, nom);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findAll() {
		log.debug("finding all Editeur instances");
		try {
			String queryString = "from Editeur";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Editeur merge(Editeur detachedInstance) {
		log.debug("merging Editeur instance");
		try {
			// Editeur result = (Editeur) getHibernateTemplate().merge(
			// detachedInstance);
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			tx.begin();

			Editeur result = (Editeur) session.merge(detachedInstance);

			tx.commit();
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Editeur instance) {
		log.debug("attaching dirty Editeur instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Editeur instance) {
		log.debug("attaching clean Editeur instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EditeurDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EditeurDAO) ctx.getBean("EditeurDAO");
	}
}