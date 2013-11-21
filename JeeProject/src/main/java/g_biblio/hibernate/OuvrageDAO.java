package g_biblio.hibernate;

import java.util.Date;
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
 * Ouvrage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see g_biblio.hibernate.Ouvrage
 * @author MyEclipse Persistence Tools
 */
public class OuvrageDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(OuvrageDAO.class);
	// property constants
	public static final String ISBN = "isbn";
	public static final String TITRE = "titre";
	public static final String RESUME = "resume";
	public static final String PRIX = "prix";
	public static final String IMAGE = "image";
	public static final String EN_STOCK = "enStock";
	public static final String TOTAL = "total";
	public static final String EMPLACEMENT = "emplacement";

	protected void initDao() {
		// do nothing
	}

	public void save(Ouvrage transientInstance) {
		log.debug("saving Ouvrage instance");
		try {
			//getHibernateTemplate().save(transientInstance);
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

	public void delete(Ouvrage persistentInstance) {
		log.debug("deleting Ouvrage instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ouvrage findById(java.lang.Integer id) {
		log.debug("getting Ouvrage instance with id: " + id);
		try {
			Ouvrage instance = (Ouvrage) getHibernateTemplate().get(
					"g_biblio.hibernate.Ouvrage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ouvrage instance) {
		log.debug("finding Ouvrage instance by example");
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
		log.debug("finding Ouvrage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ouvrage as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIsbn(Object isbn) {
		return findByProperty(ISBN, isbn);
	}

	public List findByTitre(Object titre) {
		return findByProperty(TITRE, titre);
	}

	public List findByResume(Object resume) {
		return findByProperty(RESUME, resume);
	}

	public List findByPrix(Object prix) {
		return findByProperty(PRIX, prix);
	}

	public List findByImage(Object image) {
		return findByProperty(IMAGE, image);
	}

	public List findByEnStock(Object enStock) {
		return findByProperty(EN_STOCK, enStock);
	}

	public List findByTotal(Object total) {
		return findByProperty(TOTAL, total);
	}

	public List findByEmplacement(Object emplacement) {
		return findByProperty(EMPLACEMENT, emplacement);
	}

	public List findAll() {
		log.debug("finding all Ouvrage instances");
		try {
			String queryString = "from Ouvrage";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ouvrage merge(Ouvrage detachedInstance) {
		log.debug("merging Ouvrage instance");
		try {
			Ouvrage result = (Ouvrage) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ouvrage instance) {
		log.debug("attaching dirty Ouvrage instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ouvrage instance) {
		log.debug("attaching clean Ouvrage instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OuvrageDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OuvrageDAO) ctx.getBean("OuvrageDAO");
	}
}