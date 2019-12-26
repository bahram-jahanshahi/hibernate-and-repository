package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositpries;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Student;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.StudentRepository;

public class TestStudentRepository {

    static StudentRepository studentRepository = StudentRepository.getInstance();

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            studentRepository
                    .save(
                            new Student(
                                    null,
                                    "StudentName" + i,
                                    "StudentFamily" + i
                            )
                    );
        }
    }
}
