package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface EmployeeRepository extends CrudRepository<Employee, Long> {

}