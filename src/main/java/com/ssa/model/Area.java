package com.ssa.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tb_area")
@Access(AccessType.FIELD)
public class Area implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idArea;
	
	@Column
	private String nomeArea;
	
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