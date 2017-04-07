package com.ssa;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_area")
public class Area implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idArea;
	
	@Column
	private String nomeArea;
	
	@Column
	private int qtdQuarteirao;
	
	
	public long getIdArea() {
		return idArea;
	}
	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}
	public String getNomeArea() {
		return nomeArea;
	}
	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}
	public int getQtdQuarteirao() {
		return qtdQuarteirao;
	}
	public void setQtdQuarteirao(int qtdQuarteirao) {
		this.qtdQuarteirao = qtdQuarteirao;
	}
	
	
}