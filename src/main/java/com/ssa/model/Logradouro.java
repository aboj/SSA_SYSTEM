package com.ssa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
import org.hibernate.validator.Size;

import com.ssa.model.DiarioBoletim.LixoAcondicionamento;

@Entity
@Table(name="tb_logradouro")
@Access(AccessType.FIELD)

public class Logradouro{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(max = 60)
	@Column
	private String nomeLogradouro;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	TipoLogradouro TipoLogradouro;
	
	@ManyToOne 
	@JoinColumn (name = "quarteirao_id")
	private Quarteirao quarteirao;
	
	@OneToMany (mappedBy = "logradouro", targetEntity = Imovel.class, fetch = FetchType.LAZY)
	private List<Imovel> imoveis;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	
	public enum TipoLogradouro {
	    Rua("1"),
	    Avenida("2"),
		Travessa("3"),
		Praca("4");
	    private String valor;
	    private TipoLogradouro(String valor) {
	        this.valor = valor;
	    }
	}
	
	
	
}