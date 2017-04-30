package com.ssa.model;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Past;
import org.hibernate.validator.Size;

@Entity
@Table(name="tb_boletimSupervisor")
@Access(AccessType.FIELD)

public class BoletimSupervisor implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Past
	@Column
	private Calendar horario_inicio;
	
	@NotNull
	@Past
	@Column
	private Calendar horario_termino;
	
	@NotNull
	@Size(max = 5)
	@Column
	private String ds;
	
	@NotNull
	@Size(max = 5)
	@Column
	private int ciclo;
	
	@NotNull
	@Size(max = 15)
	@Column
	private int num_supervisao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	SatisfacaoVisita satisfacao_visita;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String apresentacao;

	@NotNull
	@Size(max = 100)
	@Column
	private String instrumentos;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String qualidade_tecnica_visita;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String dengue_filariose;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String sinantropicos_peconhentos;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String  risco_nao_biologico;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String educacao_saude;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String administrativo;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String info_complementar;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String observacao_agente;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String orientacao;
	
	@NotNull
	@Size(max = 100)
	@Column
	private String info_produtividade;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}
	public Calendar getHorario_inicio() {
	return horario_inicio;
	}
	public void setHorario_inicio(Calendar horario_inicio) {
	this.horario_inicio = horario_inicio;
	}
	public Calendar getHorario_termino() {
	return horario_termino;
	}
	public void setHorario_termino(Calendar horario_termino) {
	this.horario_termino = horario_termino;
	}
	public String getDs() {
	return ds;
	}
	public void setDs(String ds) {
	this.ds = ds;
	}
	public int getCiclo() {
	return ciclo;
	}
	public void setCiclo(int ciclo) {
	this.ciclo = ciclo;
	}
	public int getNum_supervisao() {
	return num_supervisao;
	}
	public enum SatisfacaoVisita{
		Otimo("1"),
		Bom("2"),
		Regular("3");
		private String valor;
		private SatisfacaoVisita(String valor) {
			this.valor = valor;
		}
}
}