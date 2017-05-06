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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;

@Entity
@Table(name="tb_area")
@Access(AccessType.FIELD)
public class Area implements Serializable{
	
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idArea;
	
	@NotNull
	@Size(max = 15)
	@Column
	private String nomeArea;

	@NotNull
	@Size(max = 15)
	@Column
	private int qtdQuarteirao;
	
	@ManyToMany
	@JoinTable(name = "Area_Usuario",
			joinColumns = @JoinColumn(name = "area_id"),
			inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy = "area", targetEntity = Quarteirao.class, fetch = FetchType.LAZY)
	private List<Quarteirao> quarteirao;
	
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