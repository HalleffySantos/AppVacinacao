package Persistencia.Vacinacao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Negocio.Vacinas;
import Persistencia.Agenda.IPersistenciaAgenda;

public class PersistenciaVacinas implements IPersistenciaVacinas {

	public void SaveVacina(Vacinas vacina)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vacina);
		session.getTransaction().commit();
	}
	
	public List<Vacinas> GetVacinas()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return (List<Vacinas>)session.createSQLQuery("SELECT * FROM VACINAS").addEntity(Vacinas.class).list();
	}
	
}
