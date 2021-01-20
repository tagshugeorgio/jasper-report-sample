package tech.uwaas.jaspersample;

import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.FileNotFoundException;

@RepositoryRestController
@RequiredArgsConstructor
public class EmployeeController {

    private final ReportService reportService;

    private final Employees employees;

    @PostMapping("/employees")
    public ResponseEntity<?> create(@RequestBody EmployeeCommand employeeCommand) {
        Employee employee = new Employee(employeeCommand.getName(), employeeCommand.getDesignation(), employeeCommand.getSalary(), employeeCommand.getDoj());
        return ResponseEntity.ok(employees.save(employee));
    }

    @GetMapping("/employees/report")
    public ResponseEntity<?> generateReport() throws FileNotFoundException, JRException {
        if(reportService.exportReport() == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}
