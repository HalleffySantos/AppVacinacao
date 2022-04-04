package Persistencia.Alergias;

import java.util.List;

import Negocio.Agendas;
import Negocio.Alergias;

public interface IPersistenciaAlergias {

	public void SaveAlergia(Alergias alergia);
	public List<Alergias> GetAlergias();
}