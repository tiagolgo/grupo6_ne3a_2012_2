/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import modelo.Aula;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Grade;
import modelo.Professor;
import modelo.Serie;

/**
 *
 * @author Meus Documentos
 */
public class testes {

    public static void main(String[] args) {
        Curso curso = new Curso(4000, "Ensino Fundamental");
        System.out.println(curso);

        Disciplina d = new Disciplina(01, "Português", "BNC");
        Disciplina d1 = new Disciplina(02, "Matemática", "BNC");
        System.out.println(d);

        Serie s = new Serie();
        s.setCurso(curso);
        s.setSerie(5);
        s.setTurma("A");
        s.setTurno("MANHÃ");

        System.out.println(s.getSerie() + "" + s.getTurma() + "; " + s.getCurso());

        Grade g = new Grade();
        g.setDisciplina(d);
        g.setSerie(s);
        g.setCargaHorária(2);
        System.out.println(g);


        Aula a = new Aula();
        a.setDataDistrib(12022013);
        a.setGrade(g);
        a.setInício(10022013);
        a.setAtribuida(true);
        a.setExtraordinaria(false);
        a.setTipoVinculo("PSS");

        Professor p = new Professor();
        p.setNome("Teste de Souza");
        p.setNascimento(9051985);
        p.setSexo("Masculino");
        p.setFunção("Professor");
        p.setAula(a);
        System.out.println(p);
    }

    public enum t {

        A, B, C, D;

      
    }
}
