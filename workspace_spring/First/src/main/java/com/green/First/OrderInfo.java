package com.green.First;

public class OrderInfo {
	private int proNo;
	private String proName;
	private int proPrice;
	private int proCnt;
	private String proId;
	private int sumPrice;

	public OrderInfo() {
	}

	public OrderInfo(int proNo, String proName, int proPrice, int proCnt, String proId) {
		this.proNo = proNo;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proCnt = proCnt;
		this.proId = proId;
	}

	public int getProNo() {
		return proNo;
	}

	public void setProNo(int proNo) {
		this.proNo = proNo;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getProCnt() {
		return proCnt;
	}

	public void setProCnt(int proCnt) {
		this.proCnt = proCnt;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public int getSumPrice() {
		return (proPrice*proCnt);
	}

	public void setSumPrice(int sumPrice) {
		this.sumPrice = (proPrice*proCnt);
	}

	@Override
	public String toString() {
		return "OrderInfo{" +
						"proNo=" + proNo +
						", proName='" + proName + '\'' +
						", proPrice=" + proPrice +
						", proCnt=" + proCnt +
						", proId='" + proId + '\'' +
						", sumPrice=" + sumPrice +
						'}';
	}
}
