package com.ssa;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ssa.DiarioBoletim.TipoImovel;

@Entity
@Table(name="tb_lirarato")
@Access(AccessType.FIELD)

public class LiraRato implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
    TipoImovel tipoImovel;
	@Column
	private boolean trabalhado;
	@Column
	private boolean sinaisAtivos;
	@Column
	private boolean ratanazas;
	@Column
	private boolean ratoDeTelhado;
	@Column
	private boolean camundongo;
	@Column
	private boolean indeterminado;
	@Column
	private boolean ralos_esgostos_danificados;
	@Column
	private boolean materialConstrucao;
	@Column
	private boolean entulho;
	@Column
	private boolean lixo_mal_acondicionado;
	@Column
	private boolean alimento_exposto;
	@Column
	private boolean quintal_sem_capinacao;
	@Column
	private boolean frestas_em_estruturas;
	@Column
	private boolean area_alagavel;
	@Column
	private boolean proximidade_canal;
	@Column
	private boolean drenagem_inadequada;
	@Column
	private boolean esgostamento_inadequado;
	@Column
	private boolean pontos_criticos_lixo;
	@Column
	private boolean pontos_confinamento;
	@Column
	private boolean terreno_baldio;
	@Column
	private boolean imoveis_abandonados;
	@Column
	private long parafinado;
	@Column
	private long po_de_contato;
	@Column
	private long granulado;
	@Column
	private long supervisor;
	
	
	@ManyToOne
	@JoinColumn (name = "imovelLRato_id")
	private Imovel imovel;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isTrabalhado() {
		return trabalhado;
	}
	public void setTrabalhado(boolean trabalhado) {
		this.trabalhado = trabalhado;
	}
	public boolean isSinaisAtivos() {
		return sinaisAtivos;
	}
	public void setSinaisAtivos(boolean sinaisAtivos) {
		this.sinaisAtivos = sinaisAtivos;
	}
	public boolean isRatanazas() {
		return ratanazas;
	}
	public void setRatanazas(boolean ratanazas) {
		this.ratanazas = ratanazas;
	}
	public boolean isRatoDeTelhado() {
		return ratoDeTelhado;
	}
	public void setRatoDeTelhado(boolean ratoDeTelhado) {
		this.ratoDeTelhado = ratoDeTelhado;
	}
	public boolean isCamundongo() {
		return camundongo;
	}
	public void setCamundongo(boolean camundongo) {
		this.camundongo = camundongo;
	}
	public boolean isIndeterminado() {
		return indeterminado;
	}
	public void setIndeterminado(boolean indeterminado) {
		this.indeterminado = indeterminado;
	}
	public boolean isRalos_esgostos_danificados() {
		return ralos_esgostos_danificados;
	}
	public void setRalos_esgostos_danificados(boolean ralos_esgostos_danificados) {
		this.ralos_esgostos_danificados = ralos_esgostos_danificados;
	}
	public boolean isMaterialConstrucao() {
		return materialConstrucao;
	}
	public void setMaterialConstrucao(boolean materialConstrucao) {
		this.materialConstrucao = materialConstrucao;
	}
	public boolean isEntulho() {
		return entulho;
	}
	public void setEntulho(boolean entulho) {
		this.entulho = entulho;
	}
	public boolean isLixo_mal_acondicionado() {
		return lixo_mal_acondicionado;
	}
	public void setLixo_mal_acondicionado(boolean lixo_mal_acondicionado) {
		this.lixo_mal_acondicionado = lixo_mal_acondicionado;
	}
	public boolean isAlimento_exposto() {
		return alimento_exposto;
	}
	public void setAlimento_exposto(boolean alimento_exposto) {
		this.alimento_exposto = alimento_exposto;
	}
	public boolean isQuintal_sem_capinacao() {
		return quintal_sem_capinacao;
	}
	public void setQuintal_sem_capinacao(boolean quintal_sem_capinacao) {
		this.quintal_sem_capinacao = quintal_sem_capinacao;
	}
	public boolean isFrestas_em_estruturas() {
		return frestas_em_estruturas;
	}
	public void setFrestas_em_estruturas(boolean frestas_em_estruturas) {
		this.frestas_em_estruturas = frestas_em_estruturas;
	}
	public boolean isArea_alagavel() {
		return area_alagavel;
	}
	public void setArea_alagavel(boolean area_alagavel) {
		this.area_alagavel = area_alagavel;
	}
	public boolean isProximidade_canal() {
		return proximidade_canal;
	}
	public void setProximidade_canal(boolean proximidade_canal) {
		this.proximidade_canal = proximidade_canal;
	}
	public boolean isDrenagem_inadequada() {
		return drenagem_inadequada;
	}
	public void setDrenagem_inadequada(boolean drenagem_inadequada) {
		this.drenagem_inadequada = drenagem_inadequada;
	}
	public boolean isEsgostamento_inadequado() {
		return esgostamento_inadequado;
	}
	public void setEsgostamento_inadequado(boolean esgostamento_inadequado) {
		this.esgostamento_inadequado = esgostamento_inadequado;
	}
	public boolean isPontos_criticos_lixo() {
		return pontos_criticos_lixo;
	}
	public void setPontos_criticos_lixo(boolean pontos_criticos_lixo) {
		this.pontos_criticos_lixo = pontos_criticos_lixo;
	}
	public boolean isPontos_confinamento() {
		return pontos_confinamento;
	}
	public void setPontos_confinamento(boolean pontos_confinamento) {
		this.pontos_confinamento = pontos_confinamento;
	}
	public boolean isTerreno_baldio() {
		return terreno_baldio;
	}
	public void setTerreno_baldio(boolean terreno_baldio) {
		this.terreno_baldio = terreno_baldio;
	}
	public boolean isImoveis_abandonados() {
		return imoveis_abandonados;
	}
	public void setImoveis_abandonados(boolean imoveis_abandonados) {
		this.imoveis_abandonados = imoveis_abandonados;
	}
	public long getParafinado() {
		return parafinado;
	}
	public void setParafinado(long parafinado) {
		this.parafinado = parafinado;
	}
	public long getPo_de_contato() {
		return po_de_contato;
	}
	public void setPo_de_contato(long po_de_contato) {
		this.po_de_contato = po_de_contato;
	}
	public long getGranulado() {
		return granulado;
	}
	public void setGranulado(long granulado) {
		this.granulado = granulado;
	}
	public long getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(long supervisor) {
		this.supervisor = supervisor;
	}
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	public enum TipoImovel {
	    Residencia("1"),
	    Comercio("2"),
		ServicosPrivadosOuAdmPublica("3"),
		Industria("4"),
		ResidenciasComComercio("5"),
		TerrenoBaldio("6"),
		PontoEstrategico("7"),
		Outro("8");
	    private String valor;
	    private TipoImovel(String valor) {
	        this.valor = valor;
	    }
	}
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	
}
}
