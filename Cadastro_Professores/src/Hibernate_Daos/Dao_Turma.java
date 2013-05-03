/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate_Daos;

import java.util.List;
import modelo.curricular.Turma;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Dao_Turma extends Dao_Basic {

    public Dao_Turma(Session sessão) {
        super(sessão);
    }

    public void getTurma_Serie() {
    }

    public void getTurma_Curso() {
    }

    public void getTurma_Turno() {
    }

    public Turma verificaExistência(int serie, String seriação, String turno) {

        return (Turma) this.session.createCriteria(
                Turma.class)
                .add(Restrictions.eq("serie", serie))
                .add(Restrictions.eq("seriacao", seriação))
                .add(Restrictions.eq("turno", turno))
//                .add(Restrictions.eq("id_Curso", turno))
                .uniqueResult();
    }
    
    public Turma verifica(int serie, String seriacao, String turno, String curso){
        return (Turma) this.session.createSQLQuery(
                "select*from Turma where (serie=? and seriacao=? and turno=? and id_Curso=(select id from Curso where nome=?))")
                .setInteger(0, serie)
                .setString(1, seriacao)
                .setString(2, turno)
                .setString(3, curso)
                .uniqueResult();
    }
    
    public Turma turmaID(int id){
        return (Turma) this.session.createCriteria(Turma.class).add(Restrictions.eq("id", id)).uniqueResult();
    }
    
    public List todasTurmas(){
        return this.session.createCriteria(Turma.class).list();
    }
    
    public List turma_NomeCurso(String curso){
        Query cq = this.session.createQuery("from Turma where id_Curso =(select id from Curso where nome= :curso)");
        cq.setParameter("curso", curso);
        return cq.list();            
    }
}
