package akshaymhaske.com.ems.service.impl;


import akshaymhaske.com.ems.dto.EmployeeDto;
import akshaymhaske.com.ems.entity.Employee;
import akshaymhaske.com.ems.exception.ResourceNotFoundException;
import akshaymhaske.com.ems.mapper.EmployeeMapper;
import akshaymhaske.com.ems.repository.EmployeeRepository;
import akshaymhaske.com.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
      Employee employee=  employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee is not exist with given id : "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> all = employeeRepository.findAll();
        return all.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exist with given id : " + employeeId)
        );
        employee.setFirstName(updateEmployee.getFirstName());
        employee.setLastName(updateEmployee.getLastName());
        employee.setEmail(updateEmployee.getEmail());
        Employee saved = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(saved);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exist with given id : " + employeeId)
        );
        employeeRepository.deleteById(employeeId);
    }
}
