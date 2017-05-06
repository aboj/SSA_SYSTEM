package com.ssa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
@Table(name="tb_quarteirao")
@Access(AccessType.FIELD)

public class Quarteirao implements Serializable{
	
	@Id
	@Column(name = "id_quarteirao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idQuarteirao;
	
	@Column(name = "descricao_quarteirao")
	private String descricaoQuarteirao;
	
	@ManyToOne
	@JoinColumn(name = "area_id")
	private Area area;
	
	@OneToMany (mappedBy = "quarteirao", targetEntity = Logradouro.class, fetch = FetchType.LAZY)
	private List<Logradouro> logradouros;
	

	public long getIdQuarteirao() {
		
		return idQuarteirao;
	}
	
	
	public void setIdQuarteirao(long idQuarteirao) {
		
		this.idQuarteirao = idQuarteirao;
	}
	
	public String getDescricaoQuarteirao() {
		
		return descricaoQuarteirao;
	}
	
	public void setDescricaoQuarteirao(String descricaoQuarteirao) {
		
		this.descricaoQuarteirao = descricaoQuarteirao;
	}

	@Override
	public String toString() {
		return "Quarteirao [idQuarteirao=" + idQuarteirao + ", descricaoQuarteirao=" + descricaoQuarteirao
				+ ", getIdQuarteirao()=" + getIdQuarteirao() + ", getDescricaoQuarteirao()=" + getDescricaoQuarteirao()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
