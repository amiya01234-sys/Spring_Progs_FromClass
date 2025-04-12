package com.mart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mart.dao.IEmployeeDAO;
import com.mart.model.Employee;
@Service("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empDAO;
	
	
	
	
	
	public List<Employee> fetchEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		
		List<Employee> list=empDAO.getEmpsByDesgs(desg1, desg2, desg3);
		
		list.sort((t1,t2)->t1.getEmpno().compareTo(t2.getEmpno()));
		
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
		});
		return list;
	}

}
