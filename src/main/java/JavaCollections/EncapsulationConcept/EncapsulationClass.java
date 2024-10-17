package JavaCollections.EncapsulationConcept;

public class EncapsulationClass { // 1.
	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {
		EncapsulationClass emp = new EncapsulationClass();
		emp.setSsn(123456);
		emp.setEmpName("Rohan");
		emp.setEmpAge(26);

		System.out.println(emp.getSsn());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAge());

	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
