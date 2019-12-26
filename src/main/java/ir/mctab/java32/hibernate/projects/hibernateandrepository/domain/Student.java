package ir.mctab.java32.hibernate.projects.hibernateandrepository.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String family;

    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name = "student_laptop",
            joinColumns = { @JoinColumn(name = "sid") },
            inverseJoinColumns = { @JoinColumn(name = "lid") })
    @ToString.Exclude
    private List<Laptop> laptops = new ArrayList<>();
}
