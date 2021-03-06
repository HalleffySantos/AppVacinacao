package Negocio;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@Column(name = "sexo")
	private char sexo;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "setor")
	private String setor;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "uf")
	private String uf;
	
	@ManyToMany
	@JoinTable(
        name="usuarios_alergias",
        joinColumns = @JoinColumn(name="id_usuario"),
        inverseJoinColumns = @JoinColumn(name="id_alergia")
    )
	private List<Alergias> alergias;
	
	@OneToMany
	@JoinTable(
        name="usuarios_agendas",
        joinColumns = @JoinColumn(name="id_usuario"),
        inverseJoinColumns = @JoinColumn(name="id_agenda")
    )
	private List<Agendas> agendas;
	
	Usuarios(String nome, Date dataNascimento, char sexo, String logradouro, int numero, String setor, String cidade, String uf, List<Agendas> agendas, List<Alergias> alergias)
	{
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.setor = setor;
		this.cidade = cidade;
		this.uf = uf;
		this.agendas = agendas;
		this.alergias = alergias;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public Date getDataNascimento()
	{
		return dataNascimento;
	}
	
	public char getSexo()
	{
		return sexo;
	}
	
	public String getLogradouro()
	{
		return logradouro;
	}
	
	public String getSetor()
	{
		return setor;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public String getCidade()
	{
		return cidade;
	}
	
	public String getUf()
	{
		return uf;
	}
	
	public List<Alergias> getAlergias()
	{
		return alergias;
	}
	
	public List<Agendas> getAgendas()
	{
		return agendas;
	}
}
