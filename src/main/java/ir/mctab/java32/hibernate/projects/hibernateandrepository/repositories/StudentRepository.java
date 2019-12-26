package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.config.hibernate.repositories.CrudRepository;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Student;

public class StudentRepository extends CrudRepository<Student, Long> {
    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }

    private static StudentRepository studentRepository;

    private StudentRepository() {

    }

    public static StudentRepository getInstance() {
        if (studentRepository == null) {
            studentRepository = new StudentRepository();
        }
        return studentRepository;
    }
}
