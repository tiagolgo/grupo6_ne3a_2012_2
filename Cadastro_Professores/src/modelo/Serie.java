/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
public class Serie {

    private int id;
    private int serie;
    private Turma turma;
    private Curso curso;
    private Turno turno;

    public Serie() {
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = Turma.valueOf(turma);
    }

    public String getCurso() {
        StringBuilder c=new StringBuilder();
        c.append(curso.getCodigo()).append("-").append(curso.getNome());
        return c.toString();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = Turno.valueOf(turno);
    }
    
    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append(serie).append(turma).append("; ").append(curso).append("; ").append(turno);
        return s.toString();
    }
    
    
}
