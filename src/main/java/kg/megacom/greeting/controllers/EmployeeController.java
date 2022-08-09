package kg.megacom.greeting.controllers;

import kg.megacom.greeting.models.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/employee/{name}")
    public Employee getEmployee(@PathVariable String name) {
        Employee employee = new Employee(1l, name, "Turapova");
        return employee;
    }

    @GetMapping("/employee")
    public Employee get(@RequestParam String name) {
        Employee employee = new Employee(1l, name, "Turapova");
        return employee;
    }
}
