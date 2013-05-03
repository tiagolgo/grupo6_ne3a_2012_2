/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate_Daos;

import java.util.List;
import modelo.Pessoa.Professor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Tiago
 */
public class Dao_Professor extends Dao_Basic<Professor> {

    public Dao_Professor(Session sessão) {
        super(sessão);
    }

    public Professor consultaNome(String nome) {
        return (Professor) this.session.createCriteria(Professor.class).add(Restrictions.eq("nome", nome)).uniqueResult();
    }

    public Professor consultaTrechoNome(String nome) {
        return (Professor) this.session.createCriteria(Professor.class).add(Restrictions.like("nome", "%"+nome+"%")).uniqueResult();
    }

    public Professor consultaRG(Long rg) {
     return (Professor) this.session.createQuery(
                "from Professor where id_Rg = (select id from RG where número = :rg)")
                .setParameter("rg", rg).uniqueResult();
    }

    public Professor consultaCPF(Long cpf) {
        return (Professor) this.session.createCriteria(Professor.class).add(Restrictions.eq("cpf", cpf)).uniqueResult();
    }

    public List consultaNascimento(String nascimento) {
        return this.session.createCriteria(Professor.class).add(Restrictions.eq("data_Nascimento", nascimento)).list();
    }
    
    public List todosProfessores() {
        return this.session.createCriteria(Professor.class).list();
    }

    public boolean deletaNome(String nome) {
        org.hibernate.Query cq = this.session.createQuery("delete from Professor where nome=:nome").setString("nome", nome);
        int eu = cq.executeUpdate();
        if (eu == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean deletaRg(Long rg) {
        Query cq = this.session.createQuery("delete from Professor where id=(select id from Rg where id_professor=?)").setLong("rg", rg);
        int eu = cq.executeUpdate();
        if (eu == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public List listaNomes(){
        return this.session.createSQLQuery("SELECT nome FROM Pessoa where tipo=?").setParameter(0, "P").list();
    }
}
