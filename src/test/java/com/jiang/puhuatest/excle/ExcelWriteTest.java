package com.jiang.puhuatest.excle;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author JiangBing
 * @Email 15333079013@163.com
 * @Date 2023/3/9 15:05
 */
public class ExcelWriteTest {
	@Test
	public void excelWrite(){
		//1、创建一个文件对象
		File excelFile = new File("C:\\Users\\JiangBing\\Desktop\\TestExcle.xlsx");
		//2、判断文件是否存在，不存在则创建一个Excel文件
		if (!excelFile.exists()) {
			try {
				excelFile.createNewFile();//创建一个新的文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//3、指定需要那个class去写。然后写到第一个sheet，名字为模版，然后文件流会自动关闭
		EasyExcel.write(excelFile, ExcelOrder.class).sheet("Test").doWrite(data());
	}
	private List<ExcelOrder> data(){
		//创建一个List集合
		List excelOrderList = new ArrayList();
		
		/*
		 *xls版本的Excel最多一次可写0 ...65535行
		 * xlsx 版本的Excel最多一次可写0...1048575行
		 */
		//超出报异常：java.lang.IllegalArgumentException: Invalid row number (65536) outside allowable range (0..65535)
		for (int i=0;i<5000;i++){
			ExcelOrder data = new ExcelOrder();
			data.setDate("2022022"+(i+1));
			data.setPc("偏差"+i);
			data.setSy("损益" + i);
			excelOrderList.add(data);
		}
		
		return excelOrderList;//返回list集合
	}
}
