package Negocio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Vacinas")
public class Vacinas {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "doses")
	private int doses;
	
	@Column(name = "intervalo")
	private int intervalo;
	
	@Column(name = "periodicidade")
	private int periodicidade;
	
	@OneToMany
	@JoinTable(
        name="agendas_vacinas",
        joinColumns = @JoinColumn(name="id_vacina"),
        inverseJoinColumns = @JoinColumn(name="id_agenda")
    )
	private List<Agendas> agendas;
	
	public Vacinas(String titulo, String descricao, int doses, int intervalo, int periodicidade, List<Agendas> agendas)
	{
		this.titulo = titulo;
		this.descricao = descricao;
		this.doses = doses;
		this.intervalo = intervalo;
		this.periodicidade = periodicidade;
		this.agendas = agendas;
	}
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public String getDescricao()
	{
		return descricao;
	}
	
	public int getDoses()
	{
		return doses;
	}
	
	public int getIntervalo()
	{
		return intervalo;
	}
	
	public int getPeriodicidade()
	{
		return periodicidade;
	}
	
	public List<Agendas> getAgendas()
	{
		return agendas;
	}
	
	public void addAgenda(Agendas agenda)
	{
		agendas.add(agenda);
	}
	
}
