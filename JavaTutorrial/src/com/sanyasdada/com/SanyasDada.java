package com.sanyasdada.com;

public class SanyasDada {
	private int rollNo;
	private String name;
	private String dream;
	private float salary;
	


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SanyasDada(int rollNo, String name, String dream, float salary) {
		this.rollNo = rollNo;
		this.name = name;
		this.dream = dream;
		this.salary = salary;
	}

	public String getDream() {
		return dream;
	}

	public void setDream(String dream) {
		this.dream = dream;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SanyasDada [rollNo=" + rollNo + ", name=" + name + ", dream=" + dream + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dream == null) ? 0 : dream.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanyasDada other = (SanyasDada) obj;
		if (dream == null) {
			if (other.dream != null)
				return false;
		} else if (!dream.equals(other.dream))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
	
	

}
