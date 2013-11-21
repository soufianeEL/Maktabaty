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
 * Auteur entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see g_biblio.hibernate.Auteur
 * @author MyEclipse Persistence Tools
 */
public class AuteurDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(AuteurDAO.class);
	// property constants
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	public static final String EMAIL = "email";
	public static final String BIOGRAPHIE = "biographie";
	public static final String IMAGE = "image";

	protected void initDao() {
		// do nothing
	}

	public void save(Auteur transientInstance) {
		log.debug("saving Auteur instance");
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

	public void delete(Auteur persistentInstance) {
		log.debug("deleting Auteur instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Auteur findById(java.lang.Integer id) {
		log.debug("getting Auteur instance with id: " + id);
		try {
			Auteur instance = (Auteur) getHibernateTemplate().get(
					"g_biblio.hibernate.Auteur", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Auteur instance) {
		log.debug("finding Auteur instance by example");
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
		log.debug("finding Auteur instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Auteur as model where model."
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

	public List findByPrenom(Object prenom) {
		return findByProperty(PRENOM, prenom);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByBiographie(Object biographie) {
		return findByProperty(BIOGRAPHIE, biographie);
	}

	public List findByImage(Object image) {
		return findByProperty(IMAGE, image);
	}

	public List findAll() {
		log.debug("finding all Auteur instances");
		try {
			String queryString = "from Auteur";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Auteur merge(Auteur detachedInstance) {
		log.debug("merging Auteur instance");
		try {
			Auteur result = (Auteur) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Auteur instance) {
		log.debug("attaching dirty Auteur instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Auteur instance) {
		log.debug("attaching clean Auteur instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AuteurDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AuteurDAO) ctx.getBean("AuteurDAO");
	}
}