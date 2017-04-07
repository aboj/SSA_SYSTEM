package com.ssa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_quarteirao")
public class Quarteirao implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idQuarteirao;
	
	int sdasdf;
	@Column
	private String descricaoQuarteirao;

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
