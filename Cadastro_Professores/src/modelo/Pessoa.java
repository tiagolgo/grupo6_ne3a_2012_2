/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
class Pessoa {

    private int id;
    private String nome, sexo;
    private int nascimento, rg, expedicao;
    private UF uf;
    private long cpf;

    public Pessoa(String nome, String sexo, int nascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getExpedição() {
        return expedicao;
    }

    public void setExpedição(int expedição) {
        this.expedicao = expedição;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder retorno=new StringBuilder();
        retorno.append(nome).append("; ").append(sexo).append("; ").append(nascimento);
        return retorno.toString();
    }
       
}
