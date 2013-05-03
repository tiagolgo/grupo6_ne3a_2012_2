/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate_Daos;

import java.util.List;
import modelo.curricular.Disciplina;
//import modelo.curricular.MatrizCurricular;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Dao_Disciplina extends Dao_Basic {

    public Dao_Disciplina(Session sessao) {
        super(sessao);
    }

    public List get_DisciplinaNome(String nome) {
        return this.session.createCriteria(Disciplina.class).add(Restrictions.eq("nome", nome)).list();
    }
    
    public List get_DisciplinaTrechoNome(String nome) {
        return this.session.createCriteria(Disciplina.class).add(Restrictions.like("nome", "%"+nome+"%")).list();
    }

    public List get_DisciplinaCodigo(int codigo) {
        return this.session.createCriteria(Disciplina.class).add(Restrictions.eq("codigo", codigo)).list();
    }

    public List get_DisciplinaAtribuida(Boolean cond) {
        return this.session.createCriteria(Disciplina.class).add(Restrictions.eq("atribuida", cond)).list();
    }
    
    public List<Disciplina> get_DisciplinaId(Integer id){
//        return this.session.createSQLQuery("select*from Disciplina where id_Matriz=?").setInteger(0, id).list();
        return this.session.createCriteria(Disciplina.class).add(Restrictions.eq("cargaHoraria", id)).list();
    } 
    
    public void inserirIdProf(int id_Professor){
        this.session.createSQLQuery("UPDATE Turma SET seriacao='b' WHERE id=?")
                .setInteger(0, id_Professor).executeUpdate();
//        System.out.println(executeUpdate);
    }
    
    
}
