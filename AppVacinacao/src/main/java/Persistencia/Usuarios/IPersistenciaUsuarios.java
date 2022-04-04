package Persistencia.Usuarios;

import java.util.List;

import Negocio.Usuarios;

public interface IPersistenciaUsuarios {

	public void SaveUsuario (Usuarios usuario);
	public List<Usuarios> GetUsuarios();
}