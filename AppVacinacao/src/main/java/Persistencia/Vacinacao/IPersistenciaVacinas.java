package Persistencia.Vacinacao;

import java.util.List;

import Negocio.Vacinas;

public interface IPersistenciaVacinas {

	public void SaveVacina (Vacinas vacina);
	public List<Vacinas> GetVacinas();
}