package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositpries;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Laptop;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Student;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.LaptopRepository;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.StudentRepository;

import java.util.Arrays;

public class TestStudentRepository {

    static StudentRepository studentRepository = StudentRepository.getInstance();
    static LaptopRepository laptopRepository = LaptopRepository.getInstance();

    public static void main(String[] args) {
        Student student12 = studentRepository.findById(12L);
        System.out.println("Before Getting laptops");
        student12
                .getLaptops()
                .forEach(System.out::println);
        System.out.println("After Getting laptops");
                /*.stream()
                .map(laptop -> laptop.getTitle())
                .forEach(System.out::println);*/

        /*Laptop laptop3 = laptopRepository.findById(3L);
        Laptop laptop6 = laptopRepository.findById(6L);
        Laptop laptop9 = laptopRepository.findById(9L);

        student12.getLaptops().addAll(
                Arrays.asList(laptop3, laptop6, laptop9)
        );

        studentRepository.update(student12);*/

        /*Laptop laptop3 = laptopRepository.findById(3L);
        laptop3
                .getStudents()
                //.stream()
                //.map(student -> student.getFamily())
                .forEach(System.out::println);*/
    }
}
