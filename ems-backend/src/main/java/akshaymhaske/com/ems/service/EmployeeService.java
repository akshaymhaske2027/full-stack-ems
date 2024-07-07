package akshaymhaske.com.ems.service;

import akshaymhaske.com.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId,EmployeeDto employeeDtoUpdate);
    void deleteEmployee(Long employeeId);

}
