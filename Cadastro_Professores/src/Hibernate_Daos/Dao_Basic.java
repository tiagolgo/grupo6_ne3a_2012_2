
package Hibernate_Daos;

//import Tarefa.Estoque;
import java.util.List;
import org.hibernate.Session;

class Dao_Basic<T> {

    public Session session;

    public Dao_Basic(Session sessão) {
        this.session = sessão;
    }

    //salva ou atualiza objeto
    public void persiste(Object obj) {
        this.session.saveOrUpdate(obj);
    }

    //deleta um objeto
    public void deleta(Object obj) {
        this.session.delete(obj);
    }

    //retorna lista de objetos
    public List retornaObjetos() {
        List list = session.createCriteria(this.getClass()).list();
        return list;
    }

    //retorna um objeto pelo ID
    public Object retornaObjetoId(Integer id) {
        Object estoque = session.get(this.getClass(), id);
        return estoque;
    }

    public void fechaSessão() {
        this.session.close();
    }
    
    public String retornaTipo(){
        return this.getClass().toString();
    }
}
