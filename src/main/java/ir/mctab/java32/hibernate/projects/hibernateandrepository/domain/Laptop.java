package ir.mctab.java32.hibernate.projects.hibernateandrepository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String hardwareConfig;

    // @ManyToMany(mappedBy = "laptops", cascade = CascadeType.PERSIST)
    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name = "student_laptop",
            joinColumns = { @JoinColumn(name = "lid") },
            inverseJoinColumns = { @JoinColumn(name = "sid") })
    private List<Student> students = new ArrayList<>();


}
