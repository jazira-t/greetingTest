package kg.megacom.greeting.services;

import kg.megacom.greeting.models.Department;

import java.util.List;

public interface DepartmentService {

    Department save (Department department);

    Department update (Department department);

    List<Department> findAll();
}
