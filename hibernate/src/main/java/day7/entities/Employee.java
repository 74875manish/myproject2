package day7.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//Marks this class as an Entity
@Table(name = "new_employee_master_detiles")
public class Employee {
	@Id
	private int employee_id;
	@Column(name="employee_name")
	private String employee_name;
	@Column(name="employee_phone")
	private int employee_phone;
	@Column(name="employee_email")
	private String employee_email;
	
	@Column(name="employee_salary")
	private float employee_salary;
	
	
	
	public Employee() {
		
	}
	public Employee(int employee_id, String employee_name, int employee_phone, String employee_email,
			float employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_phone = employee_phone;
		this.employee_email = employee_email;
		this.employee_salary = employee_salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmployee_phone() {
		return employee_phone;
	}
	public void setEmployee_phone(int employee_phone) {
		this.employee_phone = employee_phone;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public float getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_phone="
				+ employee_phone + ", employee_email=" + employee_email + ", employee_salary=" + employee_salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employee_email, employee_id, employee_name, employee_phone, employee_salary);
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
		return Objects.equals(employee_email, other.employee_email) && employee_id == other.employee_id
				&& Objects.equals(employee_name, other.employee_name) && employee_phone == other.employee_phone
				&& Float.floatToIntBits(employee_salary) == Float.floatToIntBits(other.employee_salary);
	}
	
}
