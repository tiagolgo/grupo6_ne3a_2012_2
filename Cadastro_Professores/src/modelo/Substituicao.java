package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import modelo.Pessoa.Professor;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import modelo.curricular.Disciplina;
import org.hibernate.annotations.Cascade;

@Entity
public class Substituicao implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 8)
    private String dataSubstituicao;
    @Column(length = 8)
    private String dataInicio;
//    @Column(length = 30)
//    private String motivo;
    
    @OneToOne(cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name="id_Afastado")
    private Professor afastado;
    
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "id_Substituto")
    private Professor substituto;
    
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name="id_Substituicao")
    private List<Disciplina> disciplinas;
    
    public Substituicao() {
        this.disciplinas=new ArrayList();
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDataSubstituicao(String dataSubstituicao) {
        this.dataSubstituicao = dataSubstituicao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

//    public void setMotivo(String motivo) {
//        this.motivo = motivo;
//    }

    public void setAfastado(Professor prof) {
        this.afastado = prof;
    }
    
    public void setDisciplina(Disciplina d){
        this.disciplinas.add(d);
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public void setSubstituto(Professor substituto) {
        this.substituto=substituto;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getDataSubstituicao() {
        return dataSubstituicao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

//    public String getMotivo() {
//        return motivo;
//    }

    public Professor getAfastado() {
        return afastado;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public Professor getSubstituto() {
        return substituto;
    }   
}
