package command;

import java.util.date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeCommand {
	Long empNo;
	String empID;
	String empPW;
	String empPwcon;
	String empName;
	String empDeptNumber;
	String empEmail;
	String empPhoneNumber;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	Date hiredate;
	Long salary;
}
