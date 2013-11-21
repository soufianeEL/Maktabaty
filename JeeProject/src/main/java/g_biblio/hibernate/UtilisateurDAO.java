package g_biblio.hibernate;

import java.sql.Timestamp;
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
 * Utilisateur entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see g_biblio.hibernate.Utilisateur
 * @author MyEclipse Persistence Tools
 */
public class UtilisateurDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(UtilisateurDAO.class);
	// property constants
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	public static final String AGE = "age";
	public static final String EMAIL = "email";
	public static final String PROFESSION = "profession";
	public static final String TYPE = "type";
	public static final String CREDIT = "credit";
	public static final String STATUT = "statut";

	protected void initDao() {
		// do nothing
	}

	public void save(Utilisateur transientInstance) {
		log.debug("saving Utilisateur instance");
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

	public void delete(Utilisateur persistentInstance) {
		log.debug("deleting Utilisateur instance");
		try {
			//getHibernateTemplate().delete(persistentInstance);
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

	public Utilisateur findById(java.lang.Integer id) {
		log.debug("getting Utilisateur instance with id: " + id);
		try {
			Utilisateur instance = (Utilisateur) getHibernateTemplate().get(
					"g_biblio.hibernate.Utilisateur", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Utilisateur instance) {
		log.debug("finding Utilisateur instance by example");
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
		log.debug("finding Utilisateur instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Utilisateur as model where model."
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

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByProfession(Object profession) {
		return findByProperty(PROFESSION, profession);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByCredit(Object credit) {
		return findByProperty(CREDIT, credit);
	}

	public List findByStatut(Object statut) {
		return findByProperty(STATUT, statut);
	}

	public List findAll() {
		log.debug("finding all Utilisateur instances");
		try {
			String queryString = "from Utilisateur";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Utilisateur merge(Utilisateur detachedInstance) {
		log.debug("merging Utilisateur instance");
		try {
			Utilisateur result = (Utilisateur) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Utilisateur instance) {
		log.debug("attaching dirty Utilisateur instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Utilisateur instance) {
		log.debug("attaching clean Utilisateur instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UtilisateurDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (UtilisateurDAO) ctx.getBean("UtilisateurDAO");
	}
}