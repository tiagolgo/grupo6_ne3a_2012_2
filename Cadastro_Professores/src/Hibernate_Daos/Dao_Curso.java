/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate_Daos;

import java.util.List;
import modelo.curricular.Curso;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Tiago
 */
public class Dao_Curso extends Dao_Basic {

    public Dao_Curso(Session sessão) {
        super(sessão);
    }

    public List retorna_CursoNome(String nome) {
        return this.session.createCriteria(Curso.class).add(Restrictions.eq("nome", nome)).list();
    }

    public List retorna_CursoCodigo(int codigo) {
        return this.session.createCriteria(Curso.class).add(Restrictions.eq("codigo", codigo)).list();
    }
    
    public List todos(){
        return this.session.createCriteria(Curso.class).list();
    }
    
    public Object consultaDuplicidade(int cod, String nome){
        return this.session.createCriteria(Curso.class)
                .add(Restrictions.eq("codigo", cod))
                .add(Restrictions.eq("nome", nome))
                .list();
//        if(result==null){
//            System.out.println("null");
//            return true;
//        }else{ 
//            System.out.println("not null");
//            return false;
//        }
    }
}
