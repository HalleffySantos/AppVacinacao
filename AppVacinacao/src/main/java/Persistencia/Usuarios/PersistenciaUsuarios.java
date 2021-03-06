package Persistencia.Usuarios;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Negocio.Usuarios;
import Persistencia.Agenda.IPersistenciaAgenda;

public class PersistenciaUsuarios implements IPersistenciaUsuarios {

	public void SaveUsuario(Usuarios usuario)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(usuario);
		session.getTransaction().commit();
	}
	
	public List<Usuarios> GetUsuarios()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return (List<Usuarios>)session.createSQLQuery("SELECT * FROM USUARIOS").addEntity(Usuarios.class).list();
	}
	
}