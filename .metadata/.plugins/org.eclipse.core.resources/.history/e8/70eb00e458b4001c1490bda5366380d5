package Persistencia.Alergias;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Negocio.Alergias;
import Persistencia.Agenda.IPersistenciaAgenda;

public class PersistenciaAlergia implements IPersistenciaAlergias {

	public void SaveAlergia(Alergias alergia)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(alergia);
		session.getTransaction().commit();
	}
	
	public List<Alergias> GetAlergias()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return (List<Alergias>)session.createSQLQuery("SELECT * FROM ALERGIAS").addEntity(Alergias.class).list();
	}
	
}