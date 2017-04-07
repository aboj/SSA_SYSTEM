package com.ssa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	
	
	
}
