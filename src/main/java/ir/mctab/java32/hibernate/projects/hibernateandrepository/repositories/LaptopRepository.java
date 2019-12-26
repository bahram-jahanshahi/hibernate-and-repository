package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.config.hibernate.HibernateUtil;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Laptop;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LaptopRepository {

    private static LaptopRepository laptopRepository;

    private LaptopRepository() {

    }

    public static LaptopRepository getInstance() {
        if (laptopRepository == null) {
            laptopRepository = new LaptopRepository();
        }
        return laptopRepository;
    }

    private Session getSession() {
        return HibernateUtil.getSession();
    }

    public Laptop save(Laptop laptop) {
        getSession().beginTransaction();
        getSession().save(laptop);
        getSession().getTransaction().commit();
        return laptop;
    }

    public Laptop update(Laptop laptop) {
        getSession().beginTransaction();
        getSession().update(laptop);
        getSession().getTransaction().commit();
        return laptop;
    }

    public void remove(Laptop laptop) {
        getSession().beginTransaction();
        getSession().remove(laptop);
        getSession().getTransaction().commit();
    }

    public void removeById(Long id) {
        Laptop laptop = findById(id);
        if (laptop != null) {
            getSession().beginTransaction();
            getSession().remove(laptop);
            getSession().getTransaction().commit();
        }
    }

    public List<Laptop> findAll() {
        getSession().beginTransaction();
        Query<Laptop> query = getSession()
                .createQuery("from Laptop", Laptop.class);
        List<Laptop> laptops = query.list();
        getSession().getTransaction().commit();
        return laptops;
    }

    public List<Laptop> findAll(int start, int row) {
        getSession().beginTransaction();
        Query<Laptop> query = getSession()
                .createQuery("from Laptop", Laptop.class);
        query.setFirstResult(start);
        query.setMaxResults(row);
        List<Laptop> laptops = query.list();
        getSession().getTransaction().commit();
        return laptops;
    }

    public Laptop findById(Long id) {
        getSession().beginTransaction();
        Laptop laptop = getSession().get(Laptop.class, id);
        getSession().getTransaction().commit();
        return laptop;
    }

}
