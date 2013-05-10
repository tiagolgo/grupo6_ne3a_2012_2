/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate_Daos;

import Sessão.Sessão;
import java.util.List;
import modelo.Afastamento;
import modelo.Pessoa.Professor;
import modelo.Substituicao;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Tiago
 */
public class Dao_Substituicao extends Dao_Basic {

    public Dao_Substituicao(Session sessão) {
        super(sessão);
    }

    public List consultaData(String data) {
        return this.session.createCriteria(Substituicao.class).add(Restrictions.eq("data", data)).list();
    }

    public List consultaInicio(String data) {
        return this.session.createCriteria(Substituicao.class).add(Restrictions.eq("dataInicio", data)).list();
    }

    public List retornaSubstuições() {
        try {
            return this.session.createCriteria(Substituicao.class).list();

        } catch (Exception e) {
            return null;
        }
    }
}
