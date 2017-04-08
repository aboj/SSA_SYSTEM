package com.ssa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_imovel")
public class Imovel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private int numero;
	
	@ManyToOne
	@JoinColumn (name = "logradouro_id")
	private Logradouro logradouro;
	
	@OneToMany (mappedBy = "imovel", targetEntity = DiarioBoletim.class, fetch =FetchType.LAZY)
	private List<DiarioBoletim> dboletim;
	
	@OneToMany (mappedBy = "imovel", targetEntity = LiraRato.class, fetch =FetchType.LAZY)
	private List<LiraRato> lRato;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	@Column
	private String complemento;
	@Column
	private String responsavel;
	//vai ficar faltando as colunas de DiarioBoletim, LiraRato, LiraEscorpiao e LiraLarva 
	//pq na tabela vão ser fk 


	

}