package com.ssa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_lirarato")
public class LiraRato implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private int tipoImovel;
	@Column
	private int situacao;
	@Column
	private int sinaisAtivos;
	@Column
	private int ratanazas;
	@Column
	private int ratoDeTelhado;
	@Column
	private int camundongo;
	@Column
	private int indeterminado;
	@Column
	private int ralos_esgostos_danificados;
	@Column
	private int materialConstrucao;
	@Column
	private int entulho;
	@Column
	private int lixo_mal_acondicionado;
	@Column
	private int alimento_exposto;
	@Column
	private int quintal_sem_capinacao;
	@Column
	private int frestas_em_estruturas;
	@Column
	private int area_alagavel;
	@Column
	private int proximidade_canal;
	@Column
	private int drenagem_inadequada;
	@Column
	private int esgostamento_inadequado;
	@Column
	private int pontos_criticos_lixo;
	@Column
	private int pontos_confinamento;
	@Column
	private int terreno_baldio;
	@Column
	private int imoveis_abandonados;
	@Column
	private int parafinado;
	@Column
	private int po_de_contato;
	@Column
	private int granulado;
	@Column
	private int supervisor;
	
	@ManyToOne
	@JoinColumn (name = "imovelLRato_id")
	private Imovel imovel;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getTipoImovel() {
		return tipoImovel;
	}
	public void setTipoImovel(int tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getSinaisAtivos() {
		return sinaisAtivos;
	}
	public void setSinaisAtivos(int sinaisAtivos) {
		this.sinaisAtivos = sinaisAtivos;
	}
	public int getRatanazas() {
		return ratanazas;
	}
	public void setRatanazas(int ratanazas) {
		this.ratanazas = ratanazas;
	}
	public int getRatoDeTelhado() {
		return ratoDeTelhado;
	}
	public void setRatoDeTelhado(int ratoDeTelhado) {
		this.ratoDeTelhado = ratoDeTelhado;
	}
	public int getCamundongo() {
		return camundongo;
	}
	public void setCamundongo(int camundongo) {
		this.camundongo = camundongo;
	}
	public int getIndeterminado() {
		return indeterminado;
	}
	public void setIndeterminado(int indeterminado) {
		this.indeterminado = indeterminado;
	}
	public int getRalos_esgostos_danificados() {
		return ralos_esgostos_danificados;
	}
	public void setRalos_esgostos_danificados(int ralos_esgostos_danificados) {
		this.ralos_esgostos_danificados = ralos_esgostos_danificados;
	}
	public int getMaterialConstrucao() {
		return materialConstrucao;
	}
	public void setMaterialConstrucao(int materialConstrucao) {
		this.materialConstrucao = materialConstrucao;
	}
	public int getEntulho() {
		return entulho;
	}
	public void setEntulho(int entulho) {
		this.entulho = entulho;
	}
	public int getLixo_mal_acondicionado() {
		return lixo_mal_acondicionado;
	}
	public void setLixo_mal_acondicionado(int lixo_mal_acondicionado) {
		this.lixo_mal_acondicionado = lixo_mal_acondicionado;
	}
	public int getAlimento_exposto() {
		return alimento_exposto;
	}
	public void setAlimento_exposto(int alimento_exposto) {
		this.alimento_exposto = alimento_exposto;
	}
	public int getQuintal_sem_capinacao() {
		return quintal_sem_capinacao;
	}
	public void setQuintal_sem_capinacao(int quintal_sem_capinacao) {
		this.quintal_sem_capinacao = quintal_sem_capinacao;
	}
	public int getFrestas_em_estruturas() {
		return frestas_em_estruturas;
	}
	public void setFrestas_em_estruturas(int frestas_em_estruturas) {
		this.frestas_em_estruturas = frestas_em_estruturas;
	}
	public int getArea_alagavel() {
		return area_alagavel;
	}
	public void setArea_alagavel(int area_alagavel) {
		this.area_alagavel = area_alagavel;
	}
	public int getProximidade_canal() {
		return proximidade_canal;
	}
	public void setProximidade_canal(int proximidade_canal) {
		this.proximidade_canal = proximidade_canal;
	}
	public int getDrenagem_inadequada() {
		return drenagem_inadequada;
	}
	public void setDrenagem_inadequada(int drenagem_inadequada) {
		this.drenagem_inadequada = drenagem_inadequada;
	}
	public int getEsgostamento_inadequado() {
		return esgostamento_inadequado;
	}
	public void setEsgostamento_inadequado(int esgostamento_inadequado) {
		this.esgostamento_inadequado = esgostamento_inadequado;
	}
	public int getPontos_criticos_lixo() {
		return pontos_criticos_lixo;
	}
	public void setPontos_criticos_lixo(int pontos_criticos_lixo) {
		this.pontos_criticos_lixo = pontos_criticos_lixo;
	}
	public int getPontos_confinamento() {
		return pontos_confinamento;
	}
	public void setPontos_confinamento(int pontos_confinamento) {
		this.pontos_confinamento = pontos_confinamento;
	}
	public int getTerreno_baldio() {
		return terreno_baldio;
	}
	public void setTerreno_baldio(int terreno_baldio) {
		this.terreno_baldio = terreno_baldio;
	}
	public int getImoveis_abandonados() {
		return imoveis_abandonados;
	}
	public void setImoveis_abandonados(int imoveis_abandonados) {
		this.imoveis_abandonados = imoveis_abandonados;
	}
	public int getParafinado() {
		return parafinado;
	}
	public void setParafinado(int parafinado) {
		this.parafinado = parafinado;
	}
	public int getPo_de_contato() {
		return po_de_contato;
	}
	public void setPo_de_contato(int po_de_contato) {
		this.po_de_contato = po_de_contato;
	}
	public int getGranulado() {
		return granulado;
	}
	public void setGranulado(int granulado) {
		this.granulado = granulado;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}

	
	
}
