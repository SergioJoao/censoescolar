package domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by sergio on 18/07/16.
 */
public class EscolaCaracterizacao extends GenericValidator<EscolaCaracterizacao> {
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaPE;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaTI;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaSE;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaCP;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaSalasOE;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaGRPB;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaUAS;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaUnidadePetrolina;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String localFuncionamentoEscolaOutros;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-3]")
    private String formaOcupacaoPredio; // Ver questão 1-Propria, 2- Alugado, 3-Cedido
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")
    private String predioCompartilhadoOutraEscola;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codEscolaComQualcompartilha1;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codEscolaComQualcompartilha2;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codEscolaComQualcompartilha3;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codEscolaComQualcompartilha4;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codEscolaComQualcompartilha5;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codEscolaComQualcompartilha6;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-2]")
    private String aguaConsumidaAlunos; // ver se coloca mensagem 1- não filtrada 2 - filtrada
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoAguaRedePublica;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoAguaPocoArtesiano;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoAguaCCP;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoAguaFRIRC;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoAguaInexistente;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoEnergiaEletricaRedePublica;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoEnergiaEletricaGerador;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoEnergiaEletricaOutros;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String abastecimentoEnergiaEletricaInexistente;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String esgotoSanitarioRedePublica;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String esgotoSanitarioFossa;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String esgotoSanitarioInexistente;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String destinacaoLixoColetaPeriodica;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String destinacaoLixoQueima;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String destinacaoLixoJogaOutraArea;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String destinacaoLixoRecicla;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String destinacaoLixoEnterra;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String destinacaoLixoOutros;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaSalaDiretoria;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaSalaProfessores;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaSalaSecretaria;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaLaboratorioInformatica;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaLaboratorioCiencias;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaSalaRecursosAtendimentoAEE;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaQuadraEsporteCoberta;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaQuadraEsporteDescoberta;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaCozinha;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBiblioteca;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaSalaLeitura;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaParqueInfantil;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBercario;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBanheiroForaPredio;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBanheiroDentroPredio;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaBanheiroChuveiro;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaRefeitorio;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaDespensa;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaAlmoxarifado;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaAuditorio;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaPatioCoberto;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaAlojamentoAluno;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaAlojamentoProfessor;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaAreaVerde;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaLavanderia;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String dependenciasExistenteEscolaNenhumaRelacionada;
    @Length(max = 4, min = 4)
    private String numeroSalasAulasExistenteEscola;
    @Length(max = 4, min = 4)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String numeroSalasUtilizadasComoSalaAulasDentroForaPredio;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaAparelhoTelevisao;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaVideocassete;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaAparelhoDVD;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaAntenaParabolica;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaCopiadora;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaRetroprojetor;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaImpressora;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaAparelhoSom;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaProjetorMultimidia;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesFax;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaComputadores;
    @Length(max = 4, min = 4)
    private String quantidadeEquipamentosExistentesEscolaImpressoraMultifuncional;
    @Length(max = 4, min = 4)
    private String quantidadeComputadoresUsoAdministrativo;
    @Length(max = 4, min = 4)
    private String quantidadeComputadoresUsoAluno;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String acessoInternet;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String bandaLarga;

    public String getLocalFuncionamentoEscolaPE() {
        return localFuncionamentoEscolaPE;
    }

    public void setLocalFuncionamentoEscolaPE(String localFuncionamentoEscolaPE) {
        this.localFuncionamentoEscolaPE = localFuncionamentoEscolaPE;
    }

    public String getLocalFuncionamentoEscolaTI() {
        return localFuncionamentoEscolaTI;
    }

    public void setLocalFuncionamentoEscolaTI(String localFuncionamentoEscolaTI) {
        this.localFuncionamentoEscolaTI = localFuncionamentoEscolaTI;
    }

    public String getLocalFuncionamentoEscolaSE() {
        return localFuncionamentoEscolaSE;
    }

    public void setLocalFuncionamentoEscolaSE(String localFuncionamentoEscolaSE) {
        this.localFuncionamentoEscolaSE = localFuncionamentoEscolaSE;
    }

    public String getLocalFuncionamentoEscolaCP() {
        return localFuncionamentoEscolaCP;
    }

    public void setLocalFuncionamentoEscolaCP(String localFuncionamentoEscolaCP) {
        this.localFuncionamentoEscolaCP = localFuncionamentoEscolaCP;
    }

    public String getLocalFuncionamentoEscolaSalasOE() {
        return localFuncionamentoEscolaSalasOE;
    }

    public void setLocalFuncionamentoEscolaSalasOE(String localFuncionamentoEscolaSalasOE) {
        this.localFuncionamentoEscolaSalasOE = localFuncionamentoEscolaSalasOE;
    }

    public String getLocalFuncionamentoEscolaGRPB() {
        return localFuncionamentoEscolaGRPB;
    }

    public void setLocalFuncionamentoEscolaGRPB(String localFuncionamentoEscolaGRPB) {
        this.localFuncionamentoEscolaGRPB = localFuncionamentoEscolaGRPB;
    }

    public String getLocalFuncionamentoEscolaUAS() {
        return localFuncionamentoEscolaUAS;
    }

    public void setLocalFuncionamentoEscolaUAS(String localFuncionamentoEscolaUAS) {
        this.localFuncionamentoEscolaUAS = localFuncionamentoEscolaUAS;
    }

    public String getLocalFuncionamentoEscolaUnidadePetrolina() {
        return localFuncionamentoEscolaUnidadePetrolina;
    }

    public void setLocalFuncionamentoEscolaUnidadePetrolina(String localFuncionamentoEscolaUnidadePetrolina) {
        this.localFuncionamentoEscolaUnidadePetrolina = localFuncionamentoEscolaUnidadePetrolina;
    }

    public String getLocalFuncionamentoEscolaOutros() {
        return localFuncionamentoEscolaOutros;
    }

    public void setLocalFuncionamentoEscolaOutros(String localFuncionamentoEscolaOutros) {
        this.localFuncionamentoEscolaOutros = localFuncionamentoEscolaOutros;
    }

    public String getFormaOcupacaoPredio() {
        return formaOcupacaoPredio;
    }

    public void setFormaOcupacaoPredio(String formaOcupacaoPredio) {
        this.formaOcupacaoPredio = formaOcupacaoPredio;
    }

    public String getPredioCompartilhadoOutraEscola() {
        return predioCompartilhadoOutraEscola;
    }

    public void setPredioCompartilhadoOutraEscola(String predioCompartilhadoOutraEscola) {
        this.predioCompartilhadoOutraEscola = predioCompartilhadoOutraEscola;
    }

    public String getCodEscolaComQualcompartilha1() {
        return codEscolaComQualcompartilha1;
    }

    public void setCodEscolaComQualcompartilha1(String codEscolaComQualcompartilha1) {
        this.codEscolaComQualcompartilha1 = codEscolaComQualcompartilha1;
    }

    public String getCodEscolaComQualcompartilha2() {
        return codEscolaComQualcompartilha2;
    }

    public void setCodEscolaComQualcompartilha2(String codEscolaComQualcompartilha2) {
        this.codEscolaComQualcompartilha2 = codEscolaComQualcompartilha2;
    }

    public String getCodEscolaComQualcompartilha3() {
        return codEscolaComQualcompartilha3;
    }

    public void setCodEscolaComQualcompartilha3(String codEscolaComQualcompartilha3) {
        this.codEscolaComQualcompartilha3 = codEscolaComQualcompartilha3;
    }

    public String getCodEscolaComQualcompartilha4() {
        return codEscolaComQualcompartilha4;
    }

    public void setCodEscolaComQualcompartilha4(String codEscolaComQualcompartilha4) {
        this.codEscolaComQualcompartilha4 = codEscolaComQualcompartilha4;
    }

    public String getCodEscolaComQualcompartilha5() {
        return codEscolaComQualcompartilha5;
    }

    public void setCodEscolaComQualcompartilha5(String codEscolaComQualcompartilha5) {
        this.codEscolaComQualcompartilha5 = codEscolaComQualcompartilha5;
    }

    public String getCodEscolaComQualcompartilha6() {
        return codEscolaComQualcompartilha6;
    }

    public void setCodEscolaComQualcompartilha6(String codEscolaComQualcompartilha6) {
        this.codEscolaComQualcompartilha6 = codEscolaComQualcompartilha6;
    }

    public String getAguaConsumidaAlunos() {
        return aguaConsumidaAlunos;
    }

    public void setAguaConsumidaAlunos(String aguaConsumidaAlunos) {
        this.aguaConsumidaAlunos = aguaConsumidaAlunos;
    }

    public String getAbastecimentoAguaRedePublica() {
        return abastecimentoAguaRedePublica;
    }

    public void setAbastecimentoAguaRedePublica(String abastecimentoAguaRedePublica) {
        this.abastecimentoAguaRedePublica = abastecimentoAguaRedePublica;
    }

    public String getAbastecimentoAguaPocoArtesiano() {
        return abastecimentoAguaPocoArtesiano;
    }

    public void setAbastecimentoAguaPocoArtesiano(String abastecimentoAguaPocoArtesiano) {
        this.abastecimentoAguaPocoArtesiano = abastecimentoAguaPocoArtesiano;
    }

    public String getAbastecimentoAguaCCP() {
        return abastecimentoAguaCCP;
    }

    public void setAbastecimentoAguaCCP(String abastecimentoAguaCCP) {
        this.abastecimentoAguaCCP = abastecimentoAguaCCP;
    }

    public String getAbastecimentoAguaFRIRC() {
        return abastecimentoAguaFRIRC;
    }

    public void setAbastecimentoAguaFRIRC(String abastecimentoAguaFRIRC) {
        this.abastecimentoAguaFRIRC = abastecimentoAguaFRIRC;
    }

    public String getAbastecimentoAguaInexistente() {
        return abastecimentoAguaInexistente;
    }

    public void setAbastecimentoAguaInexistente(String abastecimentoAguaInexistente) {
        this.abastecimentoAguaInexistente = abastecimentoAguaInexistente;
    }

    public String getAbastecimentoEnergiaEletricaRedePublica() {
        return abastecimentoEnergiaEletricaRedePublica;
    }

    public void setAbastecimentoEnergiaEletricaRedePublica(String abastecimentoEnergiaEletricaRedePublica) {
        this.abastecimentoEnergiaEletricaRedePublica = abastecimentoEnergiaEletricaRedePublica;
    }

    public String getAbastecimentoEnergiaEletricaGerador() {
        return abastecimentoEnergiaEletricaGerador;
    }

    public void setAbastecimentoEnergiaEletricaGerador(String abastecimentoEnergiaEletricaGerador) {
        this.abastecimentoEnergiaEletricaGerador = abastecimentoEnergiaEletricaGerador;
    }

    public String getAbastecimentoEnergiaEletricaOutros() {
        return abastecimentoEnergiaEletricaOutros;
    }

    public void setAbastecimentoEnergiaEletricaOutros(String abastecimentoEnergiaEletricaOutros) {
        this.abastecimentoEnergiaEletricaOutros = abastecimentoEnergiaEletricaOutros;
    }

    public String getAbastecimentoEnergiaEletricaInexistente() {
        return abastecimentoEnergiaEletricaInexistente;
    }

    public void setAbastecimentoEnergiaEletricaInexistente(String abastecimentoEnergiaEletricaInexistente) {
        this.abastecimentoEnergiaEletricaInexistente = abastecimentoEnergiaEletricaInexistente;
    }

    public String getEsgotoSanitarioRedePublica() {
        return esgotoSanitarioRedePublica;
    }

    public void setEsgotoSanitarioRedePublica(String esgotoSanitarioRedePublica) {
        this.esgotoSanitarioRedePublica = esgotoSanitarioRedePublica;
    }

    public String getEsgotoSanitarioFossa() {
        return esgotoSanitarioFossa;
    }

    public void setEsgotoSanitarioFossa(String esgotoSanitarioFossa) {
        this.esgotoSanitarioFossa = esgotoSanitarioFossa;
    }

    public String getEsgotoSanitarioInexistente() {
        return esgotoSanitarioInexistente;
    }

    public void setEsgotoSanitarioInexistente(String esgotoSanitarioInexistente) {
        this.esgotoSanitarioInexistente = esgotoSanitarioInexistente;
    }

    public String getDestinacaoLixoColetaPeriodica() {
        return destinacaoLixoColetaPeriodica;
    }

    public void setDestinacaoLixoColetaPeriodica(String destinacaoLixoColetaPeriodica) {
        this.destinacaoLixoColetaPeriodica = destinacaoLixoColetaPeriodica;
    }

    public String getDestinacaoLixoQueima() {
        return destinacaoLixoQueima;
    }

    public void setDestinacaoLixoQueima(String destinacaoLixoQueima) {
        this.destinacaoLixoQueima = destinacaoLixoQueima;
    }

    public String getDestinacaoLixoJogaOutraArea() {
        return destinacaoLixoJogaOutraArea;
    }

    public void setDestinacaoLixoJogaOutraArea(String destinacaoLixoJogaOutraArea) {
        this.destinacaoLixoJogaOutraArea = destinacaoLixoJogaOutraArea;
    }

    public String getDestinacaoLixoRecicla() {
        return destinacaoLixoRecicla;
    }

    public void setDestinacaoLixoRecicla(String destinacaoLixoRecicla) {
        this.destinacaoLixoRecicla = destinacaoLixoRecicla;
    }

    public String getDestinacaoLixoEnterra() {
        return destinacaoLixoEnterra;
    }

    public void setDestinacaoLixoEnterra(String destinacaoLixoEnterra) {
        this.destinacaoLixoEnterra = destinacaoLixoEnterra;
    }

    public String getDestinacaoLixoOutros() {
        return destinacaoLixoOutros;
    }

    public void setDestinacaoLixoOutros(String destinacaoLixoOutros) {
        this.destinacaoLixoOutros = destinacaoLixoOutros;
    }

    public String getDependenciasExistenteEscolaSalaDiretoria() {
        return dependenciasExistenteEscolaSalaDiretoria;
    }

    public void setDependenciasExistenteEscolaSalaDiretoria(String dependenciasExistenteEscolaSalaDiretoria) {
        this.dependenciasExistenteEscolaSalaDiretoria = dependenciasExistenteEscolaSalaDiretoria;
    }

    public String getDependenciasExistenteEscolaSalaProfessores() {
        return dependenciasExistenteEscolaSalaProfessores;
    }

    public void setDependenciasExistenteEscolaSalaProfessores(String dependenciasExistenteEscolaSalaProfessores) {
        this.dependenciasExistenteEscolaSalaProfessores = dependenciasExistenteEscolaSalaProfessores;
    }

    public String getDependenciasExistenteEscolaSalaSecretaria() {
        return dependenciasExistenteEscolaSalaSecretaria;
    }

    public void setDependenciasExistenteEscolaSalaSecretaria(String dependenciasExistenteEscolaSalaSecretaria) {
        this.dependenciasExistenteEscolaSalaSecretaria = dependenciasExistenteEscolaSalaSecretaria;
    }

    public String getDependenciasExistenteEscolaLaboratorioInformatica() {
        return dependenciasExistenteEscolaLaboratorioInformatica;
    }

    public void setDependenciasExistenteEscolaLaboratorioInformatica(String dependenciasExistenteEscolaLaboratorioInformatica) {
        this.dependenciasExistenteEscolaLaboratorioInformatica = dependenciasExistenteEscolaLaboratorioInformatica;
    }

    public String getDependenciasExistenteEscolaLaboratorioCiencias() {
        return dependenciasExistenteEscolaLaboratorioCiencias;
    }

    public void setDependenciasExistenteEscolaLaboratorioCiencias(String dependenciasExistenteEscolaLaboratorioCiencias) {
        this.dependenciasExistenteEscolaLaboratorioCiencias = dependenciasExistenteEscolaLaboratorioCiencias;
    }

    public String getDependenciasExistenteEscolaSalaRecursosAtendimentoAEE() {
        return dependenciasExistenteEscolaSalaRecursosAtendimentoAEE;
    }

    public void setDependenciasExistenteEscolaSalaRecursosAtendimentoAEE(String dependenciasExistenteEscolaSalaRecursosAtendimentoAEE) {
        this.dependenciasExistenteEscolaSalaRecursosAtendimentoAEE = dependenciasExistenteEscolaSalaRecursosAtendimentoAEE;
    }

    public String getDependenciasExistenteEscolaQuadraEsporteCoberta() {
        return dependenciasExistenteEscolaQuadraEsporteCoberta;
    }

    public void setDependenciasExistenteEscolaQuadraEsporteCoberta(String dependenciasExistenteEscolaQuadraEsporteCoberta) {
        this.dependenciasExistenteEscolaQuadraEsporteCoberta = dependenciasExistenteEscolaQuadraEsporteCoberta;
    }

    public String getDependenciasExistenteEscolaQuadraEsporteDescoberta() {
        return dependenciasExistenteEscolaQuadraEsporteDescoberta;
    }

    public void setDependenciasExistenteEscolaQuadraEsporteDescoberta(String dependenciasExistenteEscolaQuadraEsporteDescoberta) {
        this.dependenciasExistenteEscolaQuadraEsporteDescoberta = dependenciasExistenteEscolaQuadraEsporteDescoberta;
    }

    public String getDependenciasExistenteEscolaCozinha() {
        return dependenciasExistenteEscolaCozinha;
    }

    public void setDependenciasExistenteEscolaCozinha(String dependenciasExistenteEscolaCozinha) {
        this.dependenciasExistenteEscolaCozinha = dependenciasExistenteEscolaCozinha;
    }

    public String getDependenciasExistenteEscolaBiblioteca() {
        return dependenciasExistenteEscolaBiblioteca;
    }

    public void setDependenciasExistenteEscolaBiblioteca(String dependenciasExistenteEscolaBiblioteca) {
        this.dependenciasExistenteEscolaBiblioteca = dependenciasExistenteEscolaBiblioteca;
    }

    public String getDependenciasExistenteEscolaSalaLeitura() {
        return dependenciasExistenteEscolaSalaLeitura;
    }

    public void setDependenciasExistenteEscolaSalaLeitura(String dependenciasExistenteEscolaSalaLeitura) {
        this.dependenciasExistenteEscolaSalaLeitura = dependenciasExistenteEscolaSalaLeitura;
    }

    public String getDependenciasExistenteEscolaParqueInfantil() {
        return dependenciasExistenteEscolaParqueInfantil;
    }

    public void setDependenciasExistenteEscolaParqueInfantil(String dependenciasExistenteEscolaParqueInfantil) {
        this.dependenciasExistenteEscolaParqueInfantil = dependenciasExistenteEscolaParqueInfantil;
    }

    public String getDependenciasExistenteEscolaBercario() {
        return dependenciasExistenteEscolaBercario;
    }

    public void setDependenciasExistenteEscolaBercario(String dependenciasExistenteEscolaBercario) {
        this.dependenciasExistenteEscolaBercario = dependenciasExistenteEscolaBercario;
    }

    public String getDependenciasExistenteEscolaBanheiroForaPredio() {
        return dependenciasExistenteEscolaBanheiroForaPredio;
    }

    public void setDependenciasExistenteEscolaBanheiroForaPredio(String dependenciasExistenteEscolaBanheiroForaPredio) {
        this.dependenciasExistenteEscolaBanheiroForaPredio = dependenciasExistenteEscolaBanheiroForaPredio;
    }

    public String getDependenciasExistenteEscolaBanheiroDentroPredio() {
        return dependenciasExistenteEscolaBanheiroDentroPredio;
    }

    public void setDependenciasExistenteEscolaBanheiroDentroPredio(String dependenciasExistenteEscolaBanheiroDentroPredio) {
        this.dependenciasExistenteEscolaBanheiroDentroPredio = dependenciasExistenteEscolaBanheiroDentroPredio;
    }

    public String getDependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil() {
        return dependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil;
    }

    public void setDependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil(String dependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil) {
        this.dependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil = dependenciasExistenteEscolaBanheiroAdequadoEducacaoInfantil;
    }

    public String getDependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia() {
        return dependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia;
    }

    public void setDependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia(String dependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia) {
        this.dependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia = dependenciasExistenteEscolaBanheiroAdequadoAlunosDeficiencia;
    }

    public String getDependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia() {
        return dependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia;
    }

    public void setDependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia(String dependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia) {
        this.dependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia = dependenciasExistenteEscolaDependenciasViasAdequadoAlunosDeficiencia;
    }

    public String getDependenciasExistenteEscolaBanheiroChuveiro() {
        return dependenciasExistenteEscolaBanheiroChuveiro;
    }

    public void setDependenciasExistenteEscolaBanheiroChuveiro(String dependenciasExistenteEscolaBanheiroChuveiro) {
        this.dependenciasExistenteEscolaBanheiroChuveiro = dependenciasExistenteEscolaBanheiroChuveiro;
    }

    public String getDependenciasExistenteEscolaRefeitorio() {
        return dependenciasExistenteEscolaRefeitorio;
    }

    public void setDependenciasExistenteEscolaRefeitorio(String dependenciasExistenteEscolaRefeitorio) {
        this.dependenciasExistenteEscolaRefeitorio = dependenciasExistenteEscolaRefeitorio;
    }

    public String getDependenciasExistenteEscolaDespensa() {
        return dependenciasExistenteEscolaDespensa;
    }

    public void setDependenciasExistenteEscolaDespensa(String dependenciasExistenteEscolaDespensa) {
        this.dependenciasExistenteEscolaDespensa = dependenciasExistenteEscolaDespensa;
    }

    public String getDependenciasExistenteEscolaAlmoxarifado() {
        return dependenciasExistenteEscolaAlmoxarifado;
    }

    public void setDependenciasExistenteEscolaAlmoxarifado(String dependenciasExistenteEscolaAlmoxarifado) {
        this.dependenciasExistenteEscolaAlmoxarifado = dependenciasExistenteEscolaAlmoxarifado;
    }

    public String getDependenciasExistenteEscolaAuditorio() {
        return dependenciasExistenteEscolaAuditorio;
    }

    public void setDependenciasExistenteEscolaAuditorio(String dependenciasExistenteEscolaAuditorio) {
        this.dependenciasExistenteEscolaAuditorio = dependenciasExistenteEscolaAuditorio;
    }

    public String getDependenciasExistenteEscolaPatioCoberto() {
        return dependenciasExistenteEscolaPatioCoberto;
    }

    public void setDependenciasExistenteEscolaPatioCoberto(String dependenciasExistenteEscolaPatioCoberto) {
        this.dependenciasExistenteEscolaPatioCoberto = dependenciasExistenteEscolaPatioCoberto;
    }

    public String getDependenciasExistenteEscolaAlojamentoAluno() {
        return dependenciasExistenteEscolaAlojamentoAluno;
    }

    public void setDependenciasExistenteEscolaAlojamentoAluno(String dependenciasExistenteEscolaAlojamentoAluno) {
        this.dependenciasExistenteEscolaAlojamentoAluno = dependenciasExistenteEscolaAlojamentoAluno;
    }

    public String getDependenciasExistenteEscolaAlojamentoProfessor() {
        return dependenciasExistenteEscolaAlojamentoProfessor;
    }

    public void setDependenciasExistenteEscolaAlojamentoProfessor(String dependenciasExistenteEscolaAlojamentoProfessor) {
        this.dependenciasExistenteEscolaAlojamentoProfessor = dependenciasExistenteEscolaAlojamentoProfessor;
    }

    public String getDependenciasExistenteEscolaAreaVerde() {
        return dependenciasExistenteEscolaAreaVerde;
    }

    public void setDependenciasExistenteEscolaAreaVerde(String dependenciasExistenteEscolaAreaVerde) {
        this.dependenciasExistenteEscolaAreaVerde = dependenciasExistenteEscolaAreaVerde;
    }

    public String getDependenciasExistenteEscolaLavanderia() {
        return dependenciasExistenteEscolaLavanderia;
    }

    public void setDependenciasExistenteEscolaLavanderia(String dependenciasExistenteEscolaLavanderia) {
        this.dependenciasExistenteEscolaLavanderia = dependenciasExistenteEscolaLavanderia;
    }

    public String getDependenciasExistenteEscolaNenhumaRelacionada() {
        return dependenciasExistenteEscolaNenhumaRelacionada;
    }

    public void setDependenciasExistenteEscolaNenhumaRelacionada(String dependenciasExistenteEscolaNenhumaRelacionada) {
        this.dependenciasExistenteEscolaNenhumaRelacionada = dependenciasExistenteEscolaNenhumaRelacionada;
    }

    public String getNumeroSalasAulasExistenteEscola() {
        return numeroSalasAulasExistenteEscola;
    }

    public void setNumeroSalasAulasExistenteEscola(String numeroSalasAulasExistenteEscola) {
        this.numeroSalasAulasExistenteEscola = numeroSalasAulasExistenteEscola;
    }

    public String getNumeroSalasUtilizadasComoSalaAulasDentroForaPredio() {
        return numeroSalasUtilizadasComoSalaAulasDentroForaPredio;
    }

    public void setNumeroSalasUtilizadasComoSalaAulasDentroForaPredio(String numeroSalasUtilizadasComoSalaAulasDentroForaPredio) {
        this.numeroSalasUtilizadasComoSalaAulasDentroForaPredio = numeroSalasUtilizadasComoSalaAulasDentroForaPredio;
    }

    public String getQuantidadeEquipamentosExistentesEscolaAparelhoTelevisao() {
        return quantidadeEquipamentosExistentesEscolaAparelhoTelevisao;
    }

    public void setQuantidadeEquipamentosExistentesEscolaAparelhoTelevisao(String quantidadeEquipamentosExistentesEscolaAparelhoTelevisao) {
        this.quantidadeEquipamentosExistentesEscolaAparelhoTelevisao = quantidadeEquipamentosExistentesEscolaAparelhoTelevisao;
    }

    public String getQuantidadeEquipamentosExistentesEscolaVideocassete() {
        return quantidadeEquipamentosExistentesEscolaVideocassete;
    }

    public void setQuantidadeEquipamentosExistentesEscolaVideocassete(String quantidadeEquipamentosExistentesEscolaVideocassete) {
        this.quantidadeEquipamentosExistentesEscolaVideocassete = quantidadeEquipamentosExistentesEscolaVideocassete;
    }

    public String getQuantidadeEquipamentosExistentesEscolaAparelhoDVD() {
        return quantidadeEquipamentosExistentesEscolaAparelhoDVD;
    }

    public void setQuantidadeEquipamentosExistentesEscolaAparelhoDVD(String quantidadeEquipamentosExistentesEscolaAparelhoDVD) {
        this.quantidadeEquipamentosExistentesEscolaAparelhoDVD = quantidadeEquipamentosExistentesEscolaAparelhoDVD;
    }

    public String getQuantidadeEquipamentosExistentesEscolaAntenaParabolica() {
        return quantidadeEquipamentosExistentesEscolaAntenaParabolica;
    }

    public void setQuantidadeEquipamentosExistentesEscolaAntenaParabolica(String quantidadeEquipamentosExistentesEscolaAntenaParabolica) {
        this.quantidadeEquipamentosExistentesEscolaAntenaParabolica = quantidadeEquipamentosExistentesEscolaAntenaParabolica;
    }

    public String getQuantidadeEquipamentosExistentesEscolaCopiadora() {
        return quantidadeEquipamentosExistentesEscolaCopiadora;
    }

    public void setQuantidadeEquipamentosExistentesEscolaCopiadora(String quantidadeEquipamentosExistentesEscolaCopiadora) {
        this.quantidadeEquipamentosExistentesEscolaCopiadora = quantidadeEquipamentosExistentesEscolaCopiadora;
    }

    public String getQuantidadeEquipamentosExistentesEscolaRetroprojetor() {
        return quantidadeEquipamentosExistentesEscolaRetroprojetor;
    }

    public void setQuantidadeEquipamentosExistentesEscolaRetroprojetor(String quantidadeEquipamentosExistentesEscolaRetroprojetor) {
        this.quantidadeEquipamentosExistentesEscolaRetroprojetor = quantidadeEquipamentosExistentesEscolaRetroprojetor;
    }

    public String getQuantidadeEquipamentosExistentesEscolaImpressora() {
        return quantidadeEquipamentosExistentesEscolaImpressora;
    }

    public void setQuantidadeEquipamentosExistentesEscolaImpressora(String quantidadeEquipamentosExistentesEscolaImpressora) {
        this.quantidadeEquipamentosExistentesEscolaImpressora = quantidadeEquipamentosExistentesEscolaImpressora;
    }

    public String getQuantidadeEquipamentosExistentesEscolaAparelhoSom() {
        return quantidadeEquipamentosExistentesEscolaAparelhoSom;
    }

    public void setQuantidadeEquipamentosExistentesEscolaAparelhoSom(String quantidadeEquipamentosExistentesEscolaAparelhoSom) {
        this.quantidadeEquipamentosExistentesEscolaAparelhoSom = quantidadeEquipamentosExistentesEscolaAparelhoSom;
    }

    public String getQuantidadeEquipamentosExistentesEscolaProjetorMultimidia() {
        return quantidadeEquipamentosExistentesEscolaProjetorMultimidia;
    }

    public void setQuantidadeEquipamentosExistentesEscolaProjetorMultimidia(String quantidadeEquipamentosExistentesEscolaProjetorMultimidia) {
        this.quantidadeEquipamentosExistentesEscolaProjetorMultimidia = quantidadeEquipamentosExistentesEscolaProjetorMultimidia;
    }

    public String getQuantidadeEquipamentosExistentesFax() {
        return quantidadeEquipamentosExistentesFax;
    }

    public void setQuantidadeEquipamentosExistentesFax(String quantidadeEquipamentosExistentesFax) {
        this.quantidadeEquipamentosExistentesFax = quantidadeEquipamentosExistentesFax;
    }

    public String getQuantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora() {
        return quantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora;
    }

    public void setQuantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora(String quantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora) {
        this.quantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora = quantidadeEquipamentosExistentesEscolaMaquinaFotograficaFilmadora;
    }

    public String getQuantidadeEquipamentosExistentesEscolaComputadores() {
        return quantidadeEquipamentosExistentesEscolaComputadores;
    }

    public void setQuantidadeEquipamentosExistentesEscolaComputadores(String quantidadeEquipamentosExistentesEscolaComputadores) {
        this.quantidadeEquipamentosExistentesEscolaComputadores = quantidadeEquipamentosExistentesEscolaComputadores;
    }

    public String getQuantidadeEquipamentosExistentesEscolaImpressoraMultifuncional() {
        return quantidadeEquipamentosExistentesEscolaImpressoraMultifuncional;
    }

    public void setQuantidadeEquipamentosExistentesEscolaImpressoraMultifuncional(String quantidadeEquipamentosExistentesEscolaImpressoraMultifuncional) {
        this.quantidadeEquipamentosExistentesEscolaImpressoraMultifuncional = quantidadeEquipamentosExistentesEscolaImpressoraMultifuncional;
    }

    public String getQuantidadeComputadoresUsoAdministrativo() {
        return quantidadeComputadoresUsoAdministrativo;
    }

    public void setQuantidadeComputadoresUsoAdministrativo(String quantidadeComputadoresUsoAdministrativo) {
        this.quantidadeComputadoresUsoAdministrativo = quantidadeComputadoresUsoAdministrativo;
    }

    public String getQuantidadeComputadoresUsoAluno() {
        return quantidadeComputadoresUsoAluno;
    }

    public void setQuantidadeComputadoresUsoAluno(String quantidadeComputadoresUsoAluno) {
        this.quantidadeComputadoresUsoAluno = quantidadeComputadoresUsoAluno;
    }

    public String getAcessoInternet() {
        return acessoInternet;
    }

    public void setAcessoInternet(String acessoInternet) {
        this.acessoInternet = acessoInternet;
    }

    public String getBandaLarga() {
        return bandaLarga;
    }

    public void setBandaLarga(String bandaLarga) {
        this.bandaLarga = bandaLarga;
    }
}