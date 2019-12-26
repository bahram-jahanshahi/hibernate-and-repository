package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositpries;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Laptop;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.LaptopRepository;

import java.util.stream.Stream;

public class TestLaptopRepository {
    static LaptopRepository laptopRepository = LaptopRepository.getInstance();

    public static void main(String[] args) {
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
        laptopRepository
                .findAll()
                .stream()
                // .map(laptop -> laptop.getHardwareConfig())
                .filter(laptop -> laptop.getHardwareConfig().contains("i9"))
                .flatMap(laptop -> Stream.of(laptopRepository.findById(laptop.getId()).getTitle()))
                .forEach(System.out::println);
    }
}
