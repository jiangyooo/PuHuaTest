package com.jiang.puhuatest.excle;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @Author JiangBing
 * @Email 15333079013@163.com
 * @Date 2023/3/9 15:00
 */
public class ExcelOrder {
	@ExcelProperty("日期")
	private String Date;
	
	@ExcelProperty("偏差")
	private String pc;
	
	@ExcelProperty("损益分摊标准")
	private String sy;
	
	public String getDate() {
		return Date;
	}
	
	public void setDate(String date) {
		Date = date;
	}
	
	public String getPc() {
		return pc;
	}
	
	public void setPc(String pc) {
		this.pc = pc;
	}
	
	public String getSy() {
		return sy;
	}
	
	public void setSy(String sy) {
		this.sy = sy;
	}
	
	public ExcelOrder(String date, String pc, String sy) {
		Date = date;
		this.pc = pc;
		this.sy = sy;
	}
	
	public ExcelOrder() {
		super();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
