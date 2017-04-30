package com.ssa.model;

import java.beans.ConstructorProperties;
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
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
@Table(name="tb_usuario")
@Access(AccessType.FIELD)

public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(max = 60)
	@Column
	private String nome;
	
	@NotNull
	@Size(max = 60)
	@Column
	private String login;
	
	@NotBlank
	@Pattern(regexp = "((?=.*\\p{Digit})(?=.*\\p{Lower})(?=.*\\{Upper})(?=.\\p{Punct}).{6,20})", message = "{com.ssa.model.Usuario.senha}")
	@Column
	private String senha;
	
	@NotNull
	@Size(max = 15)
	@Column
	private int matricula;
	
	@NotNull
	@CPF
	@Column
	private long cpf;
	
	@ManyToOne
	@JoinColumn(name="tipousuario_id")
	private TipoUsuario tipoUsuario;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<Area> areas;
	
	@OneToMany(mappedBy = "usuario", targetEntity = BoletimSupervisor.class, fetch = FetchType.LAZY)
	private List<BoletimSupervisor> bsupervisor;
	
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
