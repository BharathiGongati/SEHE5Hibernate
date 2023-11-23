package org.jsp.springhibernatedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.springhibernatedemo.dto.Department;
import org.jsp.springhibernatedemo.dto.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class DepartmentDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Transactional
	public Employee saveDeprtment(Employee e) {
		template.save(e);
		return e;
		
	}
	@Transactional
	public Employee updateDepartment(Employee e) {
		template.update(e);
		return e;
		
	}
	public Employee findDepartmentById(int id) {
		
		return template.get(Employee.class, id);
		
	}
	@Transactional
	public boolean deleteDepartment(int id) {
		Employee e=findDepartmentById(id);
		if(e!=null) {
			template.delete(e);
			return true;
		}
		return false;
		
	}
	public List<Department> findAll(){
		return template.loadAll(Department.class);
		
	}


}
