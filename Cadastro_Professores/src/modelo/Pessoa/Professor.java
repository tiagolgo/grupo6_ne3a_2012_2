package modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import modelo.curricular.Disciplina;
import org.hibernate.annotations.Cascade;

@Entity
@DiscriminatorValue(value = "P")
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"cpf"}))
public class Professor extends Servidor {

    private String vinculo;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "id_professor")
    private List<Disciplina> disciplina;

    public Professor() {
        disciplina=new ArrayList();
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina d) {
        this.disciplina.add(d);
    }
    
    public void setDisciplinas(List<Disciplina> d){
        this.disciplina=d;
    }

    public boolean removeAula(Disciplina d) {
        if (this.disciplina.remove(d)) {
            return true;
        }
        return false;
    }

    @Override
    public int getCargaHorária() {
        int ch = 0;
        for (Disciplina a : disciplina) {
            ch = +a.getCargaHorária();
        }
        return ch;
    }
}
