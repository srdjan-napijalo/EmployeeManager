package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Usluge {

    public static List<Zaposleni> vratiSve(){
     Session session = Sesija.kreirajSesiju();
    try
    {
        Query q = session.createQuery("select z from Zaposleni z");
        return q.list();
        
        
    }catch(HibernateException e)
    {
        e.printStackTrace();
    }
    finally
    {
    session.close();
    }   
    return null;
    }
    
    
    public static Zaposleni vratiPoId(int id)
    {
     Session session = Sesija.kreirajSesiju();
    try
    {
        Query q = session.createQuery("select z from Zaposleni z WHERE zaposleni_id ="+id+"");
        return (Zaposleni) q.uniqueResult();
    }catch(HibernateException e)
    {
        e.printStackTrace();
    }
    finally
    {
    session.close();
    }   
    return null;
    }

        public static Zaposleni vratiPoImenu(String ime)
    {
    Session session = Sesija.kreirajSesiju();
    try
    {
        Query q = session.createQuery("select z from Zaposleni z WHERE ime ='"+ime+"'");
        return (Zaposleni) q.uniqueResult();
    }catch(HibernateException e)
    {
        e.printStackTrace();
    }
    finally
    {
    session.close();
    }   
    return null;
    }

        
public static void unesi(Zaposleni z) // insert
    {
    Session session = Sesija.kreirajSesiju();
    Transaction tr = null;
    try
    {
    tr = session.beginTransaction();
    session.persist(z);
    tr.commit();
    }
    catch(HibernateException e)
        {
    tr.rollback();
        }
    finally
        {
        session.close();
        }
    }
 
     
    
    public static void izmeni(Zaposleni z)
            {
    int zaposleni_id = z.getZaposleniId();
    int godine = z.getGodine();
    int plata = z.getPlata();
    String ime = z.getIme();
    String adresa = z.getAdresa();
    Session session = Sesija.kreirajSesiju();
    Transaction tr = null;
    try
    {
    tr = session.beginTransaction();
    Query query = session.createQuery("update Zaposleni set ime ='"+ime+"',godine="+godine+",adresa='"+adresa+"',plata="+plata+" where zaposleni_id= "+zaposleni_id+"");
    query.executeUpdate();
    tr.commit();
    }
    catch(HibernateException e)
        {
    tr.rollback();
        }
    finally
        {
        session.close();
        }
    }
    
    public static void obrisi(Zaposleni z)
        {
    Session session = Sesija.kreirajSesiju();
    Transaction tr = null;
    try
    {
    tr = session.beginTransaction();
    session.delete(z);
    tr.commit();
    }
    catch(HibernateException e)
        {
    tr.rollback();
        }
    finally
        {
        session.close();
        }
    }
}