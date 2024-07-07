package akshaymhaske.com.ems.repository;

import akshaymhaske.com.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
