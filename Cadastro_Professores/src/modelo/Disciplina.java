/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
public class Disciplina {
    private int id;
    private int codigo;
    private String nome;
    private String compCurricular;

    public Disciplina(int codigo, String nome, String compCurricular) {
        this.codigo = codigo;
        this.nome = nome;
        this.compCurricular = compCurricular;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCompCurricular() {
        return compCurricular;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Código: ").append(codigo).append(", Nome: ").append(nome).append(", Comp. Curricular: ").append(compCurricular);
        return sb.toString();
    }
    
    
}
