package com.mysite.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="employee_db")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employee_id;
	
	@Column(name = "first_name", nullable = false)
	private String first_name;
	@Column(name = "last_name", nullable = false)
	private String last_name;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "salary", nullable = false)
	private Integer salary;
	
	public Employee() {}
	
	public Employee(Integer employee_id, Integer salary, String first_name, String last_name, String email) {
		super();
		this.employee_id = employee_id;
		this.salary = salary;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, employee_id, first_name, last_name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && Objects.equals(employee_id, other.employee_id)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", salary=" + salary + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	

}
