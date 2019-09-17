package model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Sesija {
    static Session session; 
    public static Session kreirajSesiju()
    {
      Configuration c = new Configuration().configure();
      StandardServiceRegistryBuilder builder =
              new StandardServiceRegistryBuilder().applySettings(c.getProperties());
      SessionFactory f = c.buildSessionFactory(builder.build());
      return f.openSession();
    }
}
