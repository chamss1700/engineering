package service.employees;

import command.EmployeeCommand;
import model.EmployeeDTO;

public class employeeservice {
	public void insertEMP(EmployeeCommand employeeCommand) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpDeptNumber(employeeCommand.getEmpDeptNumber());
		dto.setEmpEmail(employeeCommand.getEmpEmail());
		dto.setEmpId(employeeCommand.getEmpID());
		dto.setEmpName(employeeCommand.getEmpName());
		dto.setEmpPhoneNumber(employeeCommand.getEmpPhoneNumber());
		dto.setEmpPw(employeeCommand.getEmpPw());
		dto.setHireDate(employeeCommand.getHireDate());
		dto.setSalary(employeeCommand.getSalary());
	}

}
