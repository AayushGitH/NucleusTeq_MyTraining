package Training.week_6.FMS;

import java.io.Serializable;

public class Employee implements Serializable
{
	// Properties
			private int Eid;
			private String EName;
			private String EField;
			private String Salary;
			
			// Getters and Setters
			public int getEid() {
				return Eid;
			}
			public void setEid(int eid) {
				Eid = eid;
			}
			public String getEName() {
				return EName;
			}
			public void setEName(String eName) {
				EName = eName;
			}
			public String getEField() {
				return EField;
			}
			public void setEField(String eField) {
				EField = eField;
			}
			public String getSalary() {
				return Salary;
			}
			public void setSalary(String salary) {
				Salary = salary;
			}
			
			// Constructors
			public Employee(int eid, String eName, String eField, String salary) 
			{
				super();
				Eid = eid;
				EName = eName;
				EField = eField;
				Salary = salary;
			}
			public Employee() 
			{
				super();
			}
			
			// toString() method
			@Override
			public String toString() {
				return "Employee [Eid=" + Eid + ", EName=" + EName + ", EField=" + EField + ", Salary=" + Salary + "]";
			}
			
			
}
