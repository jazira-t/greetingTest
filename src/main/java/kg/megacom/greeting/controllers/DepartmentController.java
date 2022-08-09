package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Department;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {
    @Override
    public List<Department> findAll() {
        return Arrays.asList(
                new Department(1L, "Backend developers", true),
                new Department(2L, "Frontend developers", true),
                new Department(3L, "Administration", true));
    }

    @Override
    public Department getById(Long id) {
        return new Department(id, "Administration", true);
    }

    @Override
    public Department save(Department department) {
        department.setId(10L);
        return department;
    }

    @Override
    public Department update(Department department) {
        department.setName("Administration");
        return department;
    }

    @Override
    public Department remove(Long id) {
        return new Department(id, "Administration", false);
    }
}
