package com;
//entity => private attributes, Parameterized cons,Getter and setter
public class Employee {
	
	private int eid;
	private String name;
	private String desgn;
	private double sal;
	public Employee(int eid, String name, String desgn, double sal) {
		this.eid = eid;
		this.name = name;
		this.desgn = desgn;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee: eid=" + eid + ", name=" + name + ", desgn=" + desgn + ", sal=" + sal;
	}
	
	
}
