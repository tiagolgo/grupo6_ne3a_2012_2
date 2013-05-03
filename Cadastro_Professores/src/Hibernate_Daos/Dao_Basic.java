
package Hibernate_Daos;

//import Tarefa.Estoque;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

class Dao_Basic<T> {

    public Session session;

    public Dao_Basic(Session sessão) {
        this.session = sessão;
    }

    public Transaction retornaTransaction() {
        Transaction tx = this.session.beginTransaction();
        return tx;
    }

    //salva ou atualiza objeto
    public void persiste(Object obj) throws Exception {
        this.session.saveOrUpdate(obj);
        retornaTransaction().commit();
    }

    //deleta um objeto
    public void deleta(Object obj) {
        this.session.delete(obj);
        retornaTransaction().commit();
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
