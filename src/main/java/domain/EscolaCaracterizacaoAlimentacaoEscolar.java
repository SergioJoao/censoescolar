package domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by sergio on 22/07/16.
 */
public class EscolaCaracterizacaoAlimentacaoEscolar extends GenericValidator<EscolaCaracterizacaoAlimentacaoEscolar>{

    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-1]")// ver questão 0-não 1-sim
    private String alimentacaoEscolarParaAlunos;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-2]")// ver questão 0-não 1-sim
    private String atendimentoEscolarParaAlunosAEE;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[0-2]")// ver questão 0-não 1-sim
    private String AtividadeComplementar;


}
