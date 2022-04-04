package Persistencia.Agenda;

import java.util.List;

import Negocio.Agendas;

public interface IPersistenciaAgenda {

	public void SaveAgenda(Agendas agenda);
	public List<Agendas> GetAgendas();
}
