package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import modelo.Pessoa.Professor;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import modelo.curricular.Disciplina;

@Entity
public class Suprimento implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
//    @Column(length = 8)
    private String data_Suprimento;
//    @Column(length = 8)
    private String dataAssumiu;
    @OneToOne
    @JoinColumn(name="id_professor")
    private Professor professor;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_Suprimento")
    private List<Disciplina> disciplinas;

    public Suprimento() {
        this.disciplinas=new ArrayList();
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data_Suprimento = data;
    }

    public void setDataAssumiu(String dataAssumiu) {
        this.dataAssumiu = dataAssumiu;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void setDisciplina(Disciplina disc){
        this.disciplinas.add(disc);
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getData() {
        return data_Suprimento;
    }

    public String getDataAssumiu() {
        return dataAssumiu;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }  

    
}
