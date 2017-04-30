package com.ssa.model;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Past;

import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="tb_registro_semanal")
@Access(AccessType.FIELD)

public class RegistroSemanal implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column
	private String Agente;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	DiaSemana diaSemana;
	
	@NotNull
	@Past
	@Column
	private Calendar data;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	Atividade atividade;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	Turno turno;
	
	@ManyToOne
	@JoinColumn (name = "imovelDBoletim_id")
	private Imovel imovel;
	
	public enum DiaSemana {
	    Segunda("1"),
	    Terca("2"),
		Quarta("3"),
		Quinta("4"),
	    Sexta("5");
	    private String valor;
	    private DiaSemana(String valor) {
	        this.valor = valor;
	    }
	}
	
	public enum Atividade{
		Normal("1"),
		AcoesEducativas("2"),
		AtestadoMedico("3"),
		Ferias("4"),
		Roedores("5"),
		LicencaMedicaNojoOuGala("6"),
		Ovitrampas("7"),
		Folga("8"),
		ProvasFaculdade("9"),
		FaltaAbonada("10"),
		Chuvas("11"),
		Escorpiao("12"),
		Feriado("13"),
		AtividadesAdmOuContagemImoveis("14"),
		Reniao("15"),
		FaltaNaoJustificada("16"),
		LicencaPremio("17"),
		ViolenciaNaArea("18"),
		CursoDaGestao("19"),
		TratamentoCanalCanaletas("20"),
		Lira("21");
		private String valor;
	    private Atividade(String valor) {
	        this.valor = valor;
	    }
		
	}
	
	public enum Turno{
		Manha("1"),
		Tarde("2");
		private String valor;
		private Turno(String valor) {
			this.valor = valor;
		}
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAgente() {
		return Agente;
	}

	public void setAgente(String agente) {
		Agente = agente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	
}

