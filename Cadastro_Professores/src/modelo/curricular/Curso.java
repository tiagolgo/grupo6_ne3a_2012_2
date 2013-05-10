package modelo.curricular;

import java.io.Serializable;
import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String nome;
    @Column(unique = true)
    private int codigo;

    public Curso() {
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo + "-" + nome;
    }
}
