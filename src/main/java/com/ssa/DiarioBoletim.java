package com.ssa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="tb_boletimdiario")
public class DiarioBoletim implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private int quarteirao_concluido;
	@Column
	private int situacao;
	@Column
	private int motivo;
	@Column
	private int ciclo;
	@Column
	private int numero_planilha;
	@Column
	private int periodo;
	@Column
	private Date data_visita;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getQuarteirao_concluido() {
		return quarteirao_concluido;
	}
	public void setQuarteirao_concluido(int quarteirao_concluido) {
		this.quarteirao_concluido = quarteirao_concluido;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getMotivo() {
		return motivo;
	}
	public void setMotivo(int motivo) {
		this.motivo = motivo;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public int getNumero_planilha() {
		return numero_planilha;
	}
	public void setNumero_planilha(int numero_planilha) {
		this.numero_planilha = numero_planilha;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public Date getData_visita() {
		return data_visita;
	}
	public void setData_visita(Date data_visita) {
		this.data_visita = data_visita;
	}

	
	
	
}
