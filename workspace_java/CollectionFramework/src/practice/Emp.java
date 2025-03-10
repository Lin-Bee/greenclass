package practice;

public class Emp {
	private int comNum;
	private String name;
	private String dept;
	private String cell;
	private int pay;

	public Emp(){}
	public Emp(int comNum, String name, String dept, String cell, int pay) {
		this.comNum = comNum;
		this.name = name;
		this.dept = dept;
		this.cell = cell;
		this.pay = pay;
	}

	public int getComNum() {	return comNum;	}
	public void setComNum(int comNum) {	this.comNum = comNum;	}

	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}

	public String getDept() {	return dept;	}
	public void setDept(String dept) {	this.dept = dept;	}

	public String getCell() {	return cell;	}
	public void setCell(String cell) {	this.cell = cell;	}

	public int getPay() {	return pay;	}
	public void setPay(int pay) {	this.pay = pay;	}

	@Override
	public String toString() {
		return "Emp{" +
						"comNum=" + comNum +
						", name='" + name + '\'' +
						", dept='" + dept + '\'' +
						", cell='" + cell + '\'' +
						", pay=" + pay +
						'}';
	}
}
