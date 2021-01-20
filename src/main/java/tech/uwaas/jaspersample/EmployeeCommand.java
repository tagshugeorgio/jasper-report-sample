package tech.uwaas.jaspersample;

import lombok.Data;

@Data
public class EmployeeCommand {

    private String name;

    private String designation;

    private double salary;

    private String doj;
}
