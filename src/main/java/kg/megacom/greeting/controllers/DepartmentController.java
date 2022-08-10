package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Department;
import kg.megacom.greeting.services.DepartmentService;
import kg.megacom.greeting.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController implements CrudMethods<Department> {

    @Autowired
    private DepartmentService departmentService;
    @Override
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @Override
    public Department getById(Long id) {
        return new Department(id, "Administration", true);
    }

    @Override
    public Department save(Department department) {
        return departmentService.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentService.update(department);
    }

    @Override
    public Department remove(Long id) {
        return new Department(id, "Administration", false);
    }
}
