package Persistencia.Agenda;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Negocio.Agendas;

public class PersistenciaAgendas implements IPersistenciaAgenda {

	public void SaveAgenda(Agendas agenda)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(agenda);
		session.getTransaction().commit();
	}
	
	public List<Agendas> GetAgendas()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return (List<Agendas>)session.createSQLQuery("SELECT * FROM AGENDAS").addEntity(Agendas.class).list();
	}
	
}