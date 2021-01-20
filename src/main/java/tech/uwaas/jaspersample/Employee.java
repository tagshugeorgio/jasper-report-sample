package tech.uwaas.jaspersample;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.UUID;

@ToString
@Entity
@Getter
public class Employee {

    @Id
    private UUID id;

    private String name;

    private String designation;

    private double salary;

    private String doj;

    @PrePersist
    void onCreate() {
        this.id = UUID.randomUUID();
    }

    public Employee(String name, String designation, double salary, String doj) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.doj = doj;
    }

    protected Employee() {
        this.name = null;
        this.designation = null;
        this.salary = 0;
        this.doj = null;
    }
}
