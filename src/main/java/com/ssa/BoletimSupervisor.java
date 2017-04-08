package com.ssa;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_boletimSupervisor")

public class BoletimSupervisor implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column
private int horario_inicio;
@Column
private int horario_termino;
@Column
private Date data_boletim;
@Column
private String ds;
@Column
private int ciclo;
@Column
private int num_supervisao;
@Column
private String satisfacao_visita;
@Column
private String apresentacao;
@Column
private String instrumentos;
@Column
private String qualidade_tecnica_visita;
@Column
private String dengue_filariose;
@Column
private String sinantropicos_peconhentos;
@Column
private String  risco_nao_biologico;
@Column
private String educacao_saude;
@Column
private String administrativo;
@Column
private String info_complementar;
@Column
private String observacao_agente;
@Column
private String orientacao;
@Column
private String info_produtividade;
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public int getHorario_inicio() {
return horario_inicio;
}
public void setHorario_inicio(int horario_inicio) {
this.horario_inicio = horario_inicio;
}
public int getHorario_termino() {
return horario_termino;
}
public void setHorario_termino(int horario_termino) {
this.horario_termino = horario_termino;
}
public Date getData_boletim() {
return data_boletim;
}
public void setData_boletim(Date data_boletim) {
this.data_boletim = data_boletim;
}
public String getDs() {
return ds;
}
public void setDs(String ds) {
this.ds = ds;
}
public int getCiclo() {
return ciclo;
}
public void setCiclo(int ciclo) {
this.ciclo = ciclo;
}
public int getNum_supervisao() {
return num_supervisao;
}

}