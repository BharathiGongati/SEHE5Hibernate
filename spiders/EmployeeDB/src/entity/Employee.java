package entity;

public class Employee {
	private String ename;
	private int id;
	private long phone;
	private double esal;
	private int eage;
	private String edesgn;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEdesgn() {
		return edesgn;
	}
	public void setEdesgn(String edesgn) {
		this.edesgn = edesgn;
	}
	public Employee(String ename, int id, long phone, double esal, int eage, String edesgn) {
		super();
		this.ename = ename;
		this.id = id;
		this.phone = phone;
		this.esal = esal;
		this.eage = eage;
		this.edesgn = edesgn;
	}
	@Override
	public String toString() {
		return " [ename=" + ename + ", id=" + id + ", phone=" + phone + ", esal=" + esal + ", eage=" + eage
				+ ", edesgn=" + edesgn ;
	}
	
	
	
}
