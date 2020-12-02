package com.cg.domain;

import java.util.List;

public class SBU {
	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;

	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "\n Employee details:-----------\n" + empList
				+ "]";
	}

	
	
}
