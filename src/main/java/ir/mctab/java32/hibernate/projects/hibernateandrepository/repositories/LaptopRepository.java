package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.config.hibernate.HibernateUtil;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.config.hibernate.repositories.CrudRepository;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Laptop;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LaptopRepository extends CrudRepository<Laptop, Long> {

    private static LaptopRepository laptopRepository;

    private LaptopRepository() {

    }

    public static LaptopRepository getInstance() {
        if (laptopRepository == null) {
            laptopRepository = new LaptopRepository();
        }
        return laptopRepository;
    }

    @Override
    protected Class<Laptop> getEntityClass() {
        return Laptop.class;
    }
}
