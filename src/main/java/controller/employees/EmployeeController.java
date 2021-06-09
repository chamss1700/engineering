package controller.employees;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("emp")
public class EmployeeController {
	@RequestMapping("empList")
	public String empList() {
		return "employee/emplist";
	}
	@RequestMapping("empReget")
	public String empReget() {
		return "employee/employeeForm";
	}
	@RequestMapping(value ="empjoin", method=RequestMethod.POST)
	public String empJoin() {
		return "redirect: empList";
	}

}
