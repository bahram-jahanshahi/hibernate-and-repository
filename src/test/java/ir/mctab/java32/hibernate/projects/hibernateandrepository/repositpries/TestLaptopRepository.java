package ir.mctab.java32.hibernate.projects.hibernateandrepository.repositpries;

import ir.mctab.java32.hibernate.projects.hibernateandrepository.domain.Laptop;
import ir.mctab.java32.hibernate.projects.hibernateandrepository.repositories.LaptopRepository;

public class TestLaptopRepository {
    static LaptopRepository laptopRepository = LaptopRepository.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            laptopRepository
                    .save(
                            new Laptop(
                                    null,
                                    "Laptop" + i,
                                    "Core i9 8MB 16G 4G 1T SSD"
                            )
                    );
        }
    }
}
