/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
public class Grade {
    private int id;
    private int cargaHorária;
    private Disciplina disciplina;
    private Serie serie;

    public Grade(){
        
    }
    
    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    public String getDisciplina() {
        StringBuilder d=new StringBuilder();
        d.append(disciplina.getCodigo()).append(" - ").append(disciplina.getNome());
        return d.toString();
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }   

    @Override
    public String toString() {
        return "Carga Horaria=" + cargaHorária + ", disciplina=" + disciplina.getNome() + ", serie=" + serie.getSerie();
    }
    
    
}
