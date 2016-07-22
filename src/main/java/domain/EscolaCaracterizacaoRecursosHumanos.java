package domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by sergio on 22/07/16.
 */
public class EscolaCaracterizacaoRecursosHumanos extends GenericValidator<EscolaCaracterizacaoRecursosHumanos>{

    @NotNull
    @NotEmpty
    @Length(max = 4, min = 4)
    private String totalFuncionarioEscola;

    public String getTotalFuncionarioEscola() {
        return totalFuncionarioEscola;
    }

    public void setTotalFuncionarioEscola(String totalFuncionarioEscola) {
        this.totalFuncionarioEscola = totalFuncionarioEscola;
    }
}

