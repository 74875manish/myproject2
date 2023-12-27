package da7.bean;

import java.util.Objects;

public class NameAndphone {
	
	private String employee_name;
	private int employee_phone;
	public NameAndphone() {
		super();
	}
	public NameAndphone(String employee_name, int employee_phone) {
		super();
		this.employee_name = employee_name;
		this.employee_phone = employee_phone;
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
	@Override
	public String toString() {
		return "NameAndphone [employee_name=" + employee_name + ", employee_phone=" + employee_phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employee_name, employee_phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NameAndphone other = (NameAndphone) obj;
		return Objects.equals(employee_name, other.employee_name) && employee_phone == other.employee_phone;
	}
	
	

}
