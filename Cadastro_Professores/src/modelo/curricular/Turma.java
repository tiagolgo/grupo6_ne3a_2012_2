package modelo.curricular;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Tiago
 */
@Entity
@Table(name = "turma")
public class Turma implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 1)
    private int serie;
    private String seriacao;
    private String turno;
    
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "id_Curso")
    private Curso curso;
    
    @OneToMany(mappedBy = "turma", fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id_Turma")
    private List<Disciplina> disciplina;

    public Turma() {
        this.disciplina = new ArrayList();
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void setSeriacao(String seriacao) {
        this.seriacao = seriacao;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setDisciplina(Disciplina d) {
        this.disciplina.add(d);
    }

    public void setDisciplinas(List<Disciplina> d) {
        this.disciplina = d;
    }

    //Getters
    public int getId() {
        return id;
    }

    public int getSerie() {
        return serie;
    }

    public String getSeriacao() {
        return seriacao;
    }

    public String getTurno() {
        return turno;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplina;
    }

    @Override
    public String toString() {
        return serie + seriacao + " - " + turno;
    }
}
