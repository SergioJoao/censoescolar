package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by marcus on 14/07/16.
 */
public class EscolaIdentificacao extends GenericValidator<EscolaIdentificacao>{
    @NotNull
    @NotEmpty // String Vazia
    @Length(max = 1, min = 1)  // Tamanho
    @Pattern(regexp = "^[1-3]", message = "1 - em atividade; 2 - paralisada; 3 - extinta")
    private String situacaofuncionamento;
    @Length(max = 10, min = 10)
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)")
    private String dataInicioAanoLetivo;
    @Length(max = 10, min = 10)
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)")
    private String dataTerminoAnoLetivo;
    @NotNull
    @NotEmpty
    @Length(max = 100)
    @Pattern(regexp = "^[A-Z ]*$")
    private String nomeEscola;
    @Length(max = 20)
    @Pattern(regexp = "^[0-9.-]*$")
    private String latitude;
    @Length(max = 20)
    @Pattern(regexp = "^[0-9.-]*$")
    private String longitude;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    @Pattern(regexp = "^[0-9]*$")
    private String cep;
    @NotNull
    @NotEmpty
    @Length(max = 100)
    @Pattern(regexp = "[0-9 A-Zªº./,-]*")
    private String endereco;
    @Length(max = 10)
    @Pattern(regexp = "[0-9 A-Zªº./,-]*")
    private String enderecoNumero;
    @Length(max = 20)
    @Pattern(regexp = "[0-9 A-Zªº./,-]*")
    private String complemento;
    @Length(max = 50)
    @Pattern(regexp = "[0-9 A-Zªº./,-]*")
    private String bairro;
    @NotNull
    @NotEmpty
    @Length(max = 2, min = 2)
    @Pattern(regexp = "^[0-9]")
    private String uf;
    @NotNull
    @NotEmpty
    @Length(max = 7, min = 7)
    @Pattern(regexp = "^[0-9]")
    private String minicipio;
    @NotNull
    @NotEmpty
    @Length(max = 2)
    @Pattern(regexp = "^[0-9]")
    private String distrito;
    @Length(max = 2, min = 2)
    @Pattern(regexp = "^[0-9]")
    private String ddd;
    @Length(max = 9)
    @Pattern(regexp = "^[0-9]")
    private String telefone;
    @Length(max = 8, min = 8)
    @Pattern(regexp = "^[0-9]")
    private String telefonePublico;
    @Length(max = 9)
    @Pattern(regexp = "^[0-9]")
    private String outroTelefone;
    @Length(max = 8, min = 8)
    @Pattern(regexp = "^[0-9]")
    private String fax;
    @Length(max = 50)
    @Email
    private String email;
    @Length(max = 5, min = 5)
    private String codOrgaoRegEnsino;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-4]")
    private String dependenciaAdministrativa;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-2]")
    private String localizacaoZonaEscola;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-4]")
    private String categoriaEscolaPrivada;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-3]")
    private String conveniadaPoderPublico;
    @Length(max = 1, min = 1,message = "0 - Não ou 1 - Sim")
    private String mantenedoraEscolaPrivadaEmpresas;
    @Length(max = 1, min = 1,message = "0 - Não ou 1 - Sim")
    private String mantenedoraEscolaPrivadaSindicatos;
    @Length(max = 1, min = 1,message = "0 - Não ou 1 - Sim")
    private String mantenedoraEscolaPrivadaOng;
    @Length(max = 1, min = 1,message = "0 - Não ou 1 - Sim")
    private String mantenedoraEscolaPrivadaInstituicoessemfinsLucrativos;
    @Length(max = 1, min = 1,message = "0 - Não ou 1 - Sim")
    private String sistemaS;
    @NotNull
    @NotEmpty
    @Length (max = 14, min = 14)
    private String cnpjMantenedoraPrincipalEscPrivada;
    @NotNull
    @NotEmpty
    @Length (max = 14, min = 14)
    private String cnpjEscolaPrivada;
    @NotNull
    @NotEmpty // String Vazia
    @Length(max = 1, min = 1)  // Tamanho
    @Pattern(regexp = "^[1-3]", message = "0 - Não; 1 - Sim; 3 - Em tramitacao")
    private String regulamentacaoConselhoMunicipalEstadualFederal;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)  // Tamanho
    @Pattern(regexp = "^[1-3]", message = "0 - Não; 1 - Unidade vinculada a escola de Educação Básica; 2 - Unidade ofertante de Ensino Superior")
    private String unidadeVinculadaEscolaEducacaoBasicaouSuperior;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    private String codigoEscolaSede;
    @NotNull
    @NotEmpty
    @Length (max = 14, min = 14)
    private String codigoIES;

    public String getSituacaofuncionamento() {
        return situacaofuncionamento;
    }

    public void setSituacaofuncionamento(String situacaofuncionamento) {
        this.situacaofuncionamento = situacaofuncionamento;
    }

    public String getDataInicioAanoLetivo() {
        return dataInicioAanoLetivo;
    }

    public void setDataInicioAanoLetivo(String dataInicioAanoLetivo) {
        this.dataInicioAanoLetivo = dataInicioAanoLetivo;
    }

    public String getDataTerminoAnoLetivo() {
        return dataTerminoAnoLetivo;
    }

    public void setDataTerminoAnoLetivo(String dataTerminoAnoLetivo) {
        this.dataTerminoAnoLetivo = dataTerminoAnoLetivo;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMinicipio() {
        return minicipio;
    }

    public void setMinicipio(String minicipio) {
        this.minicipio = minicipio;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefonePublico() {
        return telefonePublico;
    }

    public void setTelefonePublico(String telefonePublico) {
        this.telefonePublico = telefonePublico;
    }

    public String getOutroTelefone() {
        return outroTelefone;
    }

    public void setOutroTelefone(String outroTelefone) {
        this.outroTelefone = outroTelefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodOrgaoRegEnsino() {
        return codOrgaoRegEnsino;
    }

    public void setCodOrgaoRegEnsino(String codOrgaoRegEnsino) {
        this.codOrgaoRegEnsino = codOrgaoRegEnsino;
    }

    public String getDependenciaAdministrativa() {
        return dependenciaAdministrativa;
    }

    public void setDependenciaAdministrativa(String dependenciaAdministrativa) {
        this.dependenciaAdministrativa = dependenciaAdministrativa;
    }

    public String getLocalizacaoZonaEscola() {
        return localizacaoZonaEscola;
    }

    public void setLocalizacaoZonaEscola(String localizacaoZonaEscola) {
        this.localizacaoZonaEscola = localizacaoZonaEscola;
    }

    public String getCategoriaEscolaPrivada() {
        return categoriaEscolaPrivada;
    }

    public void setCategoriaEscolaPrivada(String categoriaEscolaPrivada) {
        this.categoriaEscolaPrivada = categoriaEscolaPrivada;
    }

    public String getConveniadaPoderPublico() {
        return conveniadaPoderPublico;
    }

    public void setConveniadaPoderPublico(String conveniadaPoderPublico) {
        this.conveniadaPoderPublico = conveniadaPoderPublico;
    }

    public String getMantenedoraEscolaPrivadaEmpresas() {
        return mantenedoraEscolaPrivadaEmpresas;
    }

    public void setMantenedoraEscolaPrivadaEmpresas(String mantenedoraEscolaPrivadaEmpresas) {
        this.mantenedoraEscolaPrivadaEmpresas = mantenedoraEscolaPrivadaEmpresas;
    }

    public String getMantenedoraEscolaPrivadaSindicatos() {
        return mantenedoraEscolaPrivadaSindicatos;
    }

    public void setMantenedoraEscolaPrivadaSindicatos(String mantenedoraEscolaPrivadaSindicatos) {
        this.mantenedoraEscolaPrivadaSindicatos = mantenedoraEscolaPrivadaSindicatos;
    }

    public String getMantenedoraEscolaPrivadaOng() {
        return mantenedoraEscolaPrivadaOng;
    }

    public void setMantenedoraEscolaPrivadaOng(String mantenedoraEscolaPrivadaOng) {
        this.mantenedoraEscolaPrivadaOng = mantenedoraEscolaPrivadaOng;
    }

    public String getMantenedoraEscolaPrivadaInstituicoessemfinsLucrativos() {
        return mantenedoraEscolaPrivadaInstituicoessemfinsLucrativos;
    }

    public void setMantenedoraEscolaPrivadaInstituicoessemfinsLucrativos(String mantenedoraEscolaPrivadaInstituicoessemfinsLucrativos) {
        this.mantenedoraEscolaPrivadaInstituicoessemfinsLucrativos = mantenedoraEscolaPrivadaInstituicoessemfinsLucrativos;
    }

    public String getSistemaS() {
        return sistemaS;
    }

    public void setSistemaS(String sistemaS) {
        this.sistemaS = sistemaS;
    }

    public String getCnpjMantenedoraPrincipalEscPrivada() {
        return cnpjMantenedoraPrincipalEscPrivada;
    }

    public void setCnpjMantenedoraPrincipalEscPrivada(String cnpjMantenedoraPrincipalEscPrivada) {
        this.cnpjMantenedoraPrincipalEscPrivada = cnpjMantenedoraPrincipalEscPrivada;
    }

    public String getCnpjEscolaPrivada() {
        return cnpjEscolaPrivada;
    }

    public void setCnpjEscolaPrivada(String cnpjEscolaPrivada) {
        this.cnpjEscolaPrivada = cnpjEscolaPrivada;
    }

    public String getRegulamentacaoConselhoMunicipalEstadualFederal() {
        return regulamentacaoConselhoMunicipalEstadualFederal;
    }

    public void setRegulamentacaoConselhoMunicipalEstadualFederal(String regulamentacaoConselhoMunicipalEstadualFederal) {
        this.regulamentacaoConselhoMunicipalEstadualFederal = regulamentacaoConselhoMunicipalEstadualFederal;
    }

    public String getUnidadeVinculadaEscolaEducacaoBasicaouSuperior() {
        return unidadeVinculadaEscolaEducacaoBasicaouSuperior;
    }

    public void setUnidadeVinculadaEscolaEducacaoBasicaouSuperior(String unidadeVinculadaEscolaEducacaoBasicaouSuperior) {
        this.unidadeVinculadaEscolaEducacaoBasicaouSuperior = unidadeVinculadaEscolaEducacaoBasicaouSuperior;
    }

    public String getCodigoEscolaSede() {
        return codigoEscolaSede;
    }

    public void setCodigoEscolaSede(String codigoEscolaSede) {
        this.codigoEscolaSede = codigoEscolaSede;
    }

    public String getCodigoIES() {
        return codigoIES;
    }

    public void setCodigoIES(String codigoIES) {
        this.codigoIES = codigoIES;
    }
}
