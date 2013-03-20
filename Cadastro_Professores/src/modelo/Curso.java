/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
public class Curso {
    private int id;
    private int codigo;
    private String nome;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        StringBuilder retorno=new StringBuilder();
        retorno.append(codigo).append("-").append(nome);
        return retorno.toString();
    }
    
}
