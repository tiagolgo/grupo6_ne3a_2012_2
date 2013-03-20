/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Meus Documentos
 */
public class Professor extends Pessoa {

    private int id;
    private int lf;
    private String vinculo, função;
    private boolean status;
    private ArrayList <Aula> aula;

    public Professor(String nome, String sexo, int nascimento) {
        super(nome, sexo, nascimento);
    }

    public Professor() {
        this.aula=new ArrayList();
    }

    @Override
    public void setUf(UF uf) {
        super.setUf(uf); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRg(int rg) {
        super.setRg(rg); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNascimento(int nascimento) {
        super.setNascimento(nascimento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setExpedição(int expedição) {
        super.setExpedição(expedição); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCpf(long cpf) {
        super.setCpf(cpf); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UF getUf() {
        return super.getUf(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSexo() {
        return super.getSexo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRg() {
        return super.getRg(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNascimento() {
        return super.getNascimento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getExpedição() {
        return super.getExpedição(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getCpf() {
        return super.getCpf(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLf() {
        return lf;
    }

    public void setLf(int lf) {
        this.lf = lf;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Aula getAula(Aula a) {
        for (Aula x: aula) {
            if (x.equals(a)) {
                return x;
            }
        }
        return null;
    }
    
    public String retornaAula(){
        StringBuilder aulas = new StringBuilder();
        for (Aula x: aula) {
           
           aulas.append(x.getGrade().getDisciplina());
           aulas.append("; ");
        }
        return aulas.toString();
        
    }

    public void setAula(Aula aula) {
        this.aula.add(aula);
    }

    @Override
    public String toString() {
        return super.toString()+", função=" + função+", aulas="+retornaAula();
    }
    
}
