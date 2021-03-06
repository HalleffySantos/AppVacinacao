package Negocio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Alergias")
public class Alergias {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@ManyToMany
	@JoinTable(
        name="usuarios_alergias",
        joinColumns = @JoinColumn(name="id_alergia"),
        inverseJoinColumns = @JoinColumn(name="id_usuario")
    )
	private List<Usuarios> usuarios;
	
	Alergias(String nome, List<Usuarios> usuarios)
	{
		this.nome = nome;
		this.usuarios = usuarios;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public List<Usuarios> getUsuarios()
	{
		return usuarios;
	}

}
