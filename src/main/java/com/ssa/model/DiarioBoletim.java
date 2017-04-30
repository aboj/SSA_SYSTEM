package com.ssa.model;

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

import org.hibernate.validator.NotNull;

import com.ssa.model.LiraRato.TipoImovel;

import java.util.Date;

@Entity
@Table(name="tb_boletimdiario")
@Access(AccessType.FIELD)

public class DiarioBoletim implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull 
	@Column
	private boolean quarteirao_concluido;
	@NotNull
	@Enumerated(EnumType.STRING)
	Situacao situacao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	Motivo motivo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
    TipoImovel tipoImovel;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	LixoTipo lixoTipo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	LixoAcondicionamento lixoAcondicionamento;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	LixoDestino lixoDestino;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	CloroSolucao cloroSolucao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	Ovitrampas ovitrampas;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	AedesCriadouros aedesCriadouros;
	
	@NotNull
	@Column
	private int aedesPositivo;
	@NotNull
	@Column
	private int aedesMecanico;
	@NotNull
	@Column
	private int aedesBiologico;
	@NotNull
	@Column
	private int aedesQuimico;
	@NotNull
	@Enumerated(EnumType.STRING)
	CulexCriadouros culexCriadouros;
	@NotNull
	@Column
	private int culexPositivo;
	@NotNull
	@Column
	private int culexMecanico;
	@NotNull
	@Column
	private int culexBiologico;
	@NotNull
	@Column
	private int culexQuimico;
	@NotNull
	@Column
	private boolean quarteiraoConcluido;
	@NotNull
	@Column
	private int ciclo;
	@NotNull
	@Column
	private int numero_planilha;
	@NotNull
	@Column
	private int periodo;
	@NotNull
	@Column
	private Date data_visita;
	@NotNull
	@Column
	private int BtiGNumDepositos;
	@NotNull
	@Column
	private long BtiGQtde;
	@NotNull
	@Column
	private int BtiGWDGNumDepositos;
	@NotNull
	@Column
	private long BtiWDGQtde;
	@NotNull
	@Column
	private int BsDNumDepositos;
	@NotNull
	@Column
	private long BSGQtde;
	@NotNull
	@Column
	private int HipocloritoQtde;
	
	@ManyToOne
	@JoinColumn (name = "imovelDBoletim_id")
	private Imovel imovel;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isQuarteirao_concluido() {
		return quarteirao_concluido;
	}
	public void setQuarteirao_concluido(boolean quarteirao_concluido) {
		this.quarteirao_concluido = quarteirao_concluido;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public int getNumero_planilha() {
		return numero_planilha;
	}
	public void setNumero_planilha(int numero_planilha) {
		this.numero_planilha = numero_planilha;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public Date getData_visita() {
		return data_visita;
	}
	public void setData_visita(Date data_visita) {
		this.data_visita = data_visita;
	}
	public void setLixoAcondicionamento(LixoAcondicionamento lixoAconcicionamento){
		this.lixoAcondicionamento = lixoAcondicionamento;
	}
	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}
	public boolean isQuarteiraoConcluido() {
		return quarteiraoConcluido;
	}
	public void setQuarteiraoConcluido(boolean quarteiraoConcluido) {
		this.quarteiraoConcluido = quarteiraoConcluido;
	}
	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public void setLixoDestino(LixoDestino lixoDestino) {
		this.lixoDestino = lixoDestino;
	}
	public int getBtiGNumDepositos() {
		return BtiGNumDepositos;
	}
	public void setBtiGNumDepositos(int btiGNumDepositos) {
		BtiGNumDepositos = btiGNumDepositos;
	}
	public long getBtiGQtde() {
		return BtiGQtde;
	}
	public void setBtiGQtde(long btiGQtde) {
		BtiGQtde = btiGQtde;
	}
	public int getBtiGWDGNumDepositos() {
		return BtiGWDGNumDepositos;
	}
	public void setBtiGWDGNumDepositos(int btiGWDGNumDepositos) {
		BtiGWDGNumDepositos = btiGWDGNumDepositos;
	}
	public long getBtiWDGQtde() {
		return BtiWDGQtde;
	}
	public void setBtiWDGQtde(long btiWDGQtde) {
		BtiWDGQtde = btiWDGQtde;
	}
	public int getBsDNumDepositos() {
		return BsDNumDepositos;
	}
	public void setBsDNumDepositos(int bsDNumDepositos) {
		BsDNumDepositos = bsDNumDepositos;
	}
	public long getBSGQtde() {
		return BSGQtde;
	}
	public void setBSGQtde(long bSGQtde) {
		BSGQtde = bSGQtde;
	}
	public void CloroSolucao(CloroSolucao cloroSolucao) {
		this.cloroSolucao = cloroSolucao;
	}
	public int getHipocloritoQtde() {
		return HipocloritoQtde;
	}
	public void setHipocloritoQtde(int hipocloritoQtde) {
		HipocloritoQtde = hipocloritoQtde;
	}
	public void setOvitrampas(Ovitrampas ovitrampas) {
		this.ovitrampas = ovitrampas;
	}
	public void setAedesCriadouros(AedesCriadouros aedesCriadouros) {
		this.aedesCriadouros = aedesCriadouros;
	}
	public void setCulexCriadouros(CulexCriadouros culexCriadouros) {
		this.culexCriadouros = culexCriadouros;
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
	public enum Situacao {
	    Inspecionado("1"),
	    NaoInspecionado("2"),
		Recuperado("3");
	    private String valor;
	    private Situacao(String valor) {
	        this.valor = valor;
	    }
	}
	public enum Motivo{
		Fechado("1"),
		Desocupado("2"),
		Recusado("3"),
		SemResponsalvel("4");
		private String valor;
		private Motivo(String valor) {
			this.valor = valor;
		}	
		
	}
	public enum LixoTipo{
		Domiciliar("1"),
		Especial("2");
		private String valor;
		private LixoTipo(String valor) {
			this.valor = valor;
		}
		
	}
	public void setLixoTipo(LixoTipo lixoTipo){
		this.lixoTipo = lixoTipo;
	}
	
	public enum LixoAcondicionamento{
		Adequado("1"),
		Inadequado("2");
		private String valor;
		private LixoAcondicionamento(String valor) {
			this.valor = valor;
		}
		
	}
	
	public enum LixoDestino{
		ColetadoDiretamente("1"),
		ColetadoIndiretamente("2"),
		QueimadoOuEnterrado("3"),
		JogadoEmBarreira("4"),
		JogadoEmTerrenoBaldioOuLogradouro("5"),
		JogadoEmRioLagoMarOuMangue("6"),
		JogadoGaleriaCanalCanaleta("7"),
		Outro("8"),
		NaoSeAplica("9");
		private String valor;
			private LixoDestino(String valor) {
			this.valor = valor;
		}
		
	}
	public enum CloroSolucao{
		Individual("1"),
		Coletiva("2");
		private String valor;
			private CloroSolucao(String valor){
			this.valor = valor;
		}
		
	}
	public enum Ovitrampas{
		SimPositiva("1"),
		SimNegativa("2"),
		Nao("3"),
		SimSeca("4");
		private String valor;
			private Ovitrampas(String valor) {
				this.valor = valor;
			}
	}
	public enum AedesCriadouros{
		CaixaDagua("1"),
		DepositoSolo("A2"),
		Vasos("B"),
		Tanques("C"),
		Pneus("D1"),
		Lixo("D2"),
		Folhas("E");
		private String valor;
			private AedesCriadouros(String valor) {
				this.valor = valor;
			}
	}
	public enum CulexCriadouros{
		CaixaDagua("1"),
		DepositoSolo("A2"),
		Vasos("B"),
		Tanques("C"),
		Pneus("D1"),
		Lixo("D2"),
		Folhas("E");
		private String valor;
			private CulexCriadouros(String valor) {
				this.valor = valor;
			}
	}
}
