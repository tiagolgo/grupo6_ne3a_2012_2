/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import Hibernate_Daos.Dao_Afastamento;
import Hibernate_Daos.Dao_Curso;
import Hibernate_Daos.Dao_Disciplina;
import Hibernate_Daos.Dao_Professor;
import Hibernate_Daos.Dao_Substituicao;
import Hibernate_Daos.Dao_Turma;
import Sessão.Sessão;
import java.util.List;
import modelo.Afastamento;
import modelo.Pessoa.Professor;
import modelo.Substituicao;
import modelo.curricular.Disciplina;
import modelo.curricular.Turma;
import org.hibernate.Session;

/**
 *
 * @author Meus Documentos
 */
public class testes {

    public static void main(String[] args) throws Exception {
        Session sessão = new Sessão().retornaSession();

        Dao_Disciplina dc = new Dao_Disciplina(sessão);
        Dao_Turma dt = new Dao_Turma(sessão);
        Dao_Curso dcurso = new Dao_Curso(sessão);

        Disciplina a = new Disciplina();
        Disciplina b = new Disciplina();
        Disciplina c = new Disciplina();
        //
        a.setNome("história");
        a.setAtribuida(false);
        b.setNome("geografia");
        b.setAtribuida(false);
        c.setNome("matemática");
        c.setAtribuida(false);
        //
        Turma t = dt.turmaID(2);
        t.setSerie(1);
        t.setSeriacao("a");
        t.setTurno("manhã");

        t.setDisciplina(a);
        a.setTurma(t);
        t.setDisciplina(b);
        b.setTurma(t);
        t.setDisciplina(c);
        c.setTurma(t);
        //
        dc.persiste(t);
        dt.fechaSessão();
        List<Disciplina> atri = dc.get_DisciplinaAtribuida(false);
        for (Disciplina disciplina : atri) {
            System.out.println(disciplina.getTurma().getId());
        }
        Turma turmaID = dt.turmaID(2);
        System.out.println(turmaID.getDisciplinas());
//        Professor p = d.consultaCPF(Long.parseLong("05277403906"));
//        Professor p = (Professor) d.consultaRG(Long.parseLong("91661195"));
//        Professor p = d.consultaNome("tiago");
//        List result = d.professor_NomeRgCpf();

        int s = 3;
        String v = String.valueOf(s);
        System.out.println(v.getClass());

    }
}
