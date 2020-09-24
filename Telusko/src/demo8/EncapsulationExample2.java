package demo8;
//declaring private and using setters and getters is encapsulation
public class EncapsulationExample2 {
public static void main(String[] args) {
	Emp e1=new Emp();
	//e1.empId=3;
	e1.setEmpId(3);
	//e1.empName="Geetha";
	e1.setEmpName("Geetha");
	Emp e2=new Emp();
	//e2.empId=5;
	e2.setEmpId(5);
	//e2.empName="Seetha";
	e2.setEmpName("Seetha");
	System.out.println(e1.getEmpId()+e1.getEmpName());
	System.out.println(e2.getEmpId()+e2.getEmpName());
	
	
}
}

class Emp
{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}