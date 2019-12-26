package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositpries;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Laptop;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Student;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.LaptopRepository;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.StudentRepository;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestLaptopRepository {
    static LaptopRepository laptopRepository = LaptopRepository.getInstance();
    static StudentRepository studentRepository = StudentRepository.getInstance();

    public static void main(String[] args) {

        Laptop laptop40 = laptopRepository.findById(40L);

        laptop40.getStudents().forEach(System.out::println);

        Student student16 = studentRepository.findById(16L);
        Student student17 = studentRepository.findById(17L);
        Student student18 = studentRepository.findById(18L);

        laptop40
                .getStudents()
                .addAll(
                        Arrays.asList(student16, student17, student18)
                );

        laptopRepository.update(laptop40);


        /*for (int i = 0; i < 50; i++) {
            laptopRepository
                    .save(
                            new Laptop(
                                    null,
                                    "Laptop" + i,
                                    "Core i9 8MB 16G 4G 1T SSD"
                            )
                    );
        }*/
        /*laptopRepository
                .findAll()
                .stream()
                //.map(laptop -> Arrays.asList(laptop.getTitle()).stream())
                //.map(laptop -> laptop.getHardwareConfig())
                .filter(laptop -> laptop.getHardwareConfig().contains(" i9"))
                .flatMap(laptop -> Stream.of(laptopRepository.findById(laptop.getId()).getTitle()))
                .forEach(System.out::println);*/
    }
}
