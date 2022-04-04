package Negocio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agendas")
public class Agendas {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "date")
	private Date data;
	
	@Column(name = "hora")
	private String hora;
	
	@Column(name = "situacao")
	private String situacao;
	
	@Column(name = "data_situacao")
	private Date dataSituacao ;
	
	@Column(name = "observacoes")
	private String observacoes;
	
	@ManyToOne
	private Vacinas vacina;
	
	public Agendas(Date data, String hora, String situacao, Date dataSituacao, String observacoes, Vacinas vacina)
	{
		this.data = data;
		this.hora = hora;
		this.situacao = situacao;
		this.observacoes = observacoes;
		this.dataSituacao = dataSituacao;
		this.vacina = vacina;
	}
	
	public Date getData()
	{
		return data;
	}
	
	public String getHora()
	{
		return hora;
	}
	
	public String getSituacao()
	{
		return situacao;
	}
	
	public Date getDataSituacao()
	{
		return dataSituacao;
	}
	
	public Vacinas getVacina()
	{
		return vacina;
	}

}
