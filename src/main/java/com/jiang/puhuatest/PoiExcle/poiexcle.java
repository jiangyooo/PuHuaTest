package com.jiang.puhuatest.PoiExcle;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JiangBing
 * {@code @email} 15333079013@163.com
 * date  2023/3/10 15:19
 */
@Service
public class poiexcle implements excleDownload {
//	public void createxcle() {
//		//相当于创建一个excel表格
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		//相当于创建一个sheet(一页)
//		XSSFSheet sheet = workbook.createSheet();
//		//创建一行
//		XSSFRow row = sheet.createRow(0);
//		//创建列(单元格) 第一行第一列
//		XSSFCell cell = row.createCell(0);
//		//给第一行第一列第一个单元格赋值
//		cell.setCellValue("名称");
//		//创建列(单元格) 第一行第二列
//		XSSFCell cell1 = row.createCell(1);
//		//给第一行第二列第一个单元格赋值
//		cell1.setCellValue("年龄");
//		//创建列(单元格) 第一行第三列
//		XSSFCell cell2 = row.createCell(2);
//		//给第一行第三列第一个单元格赋值
//		cell2.setCellValue("性别");
//		List<String> date = new ArrayList<String>();
//		date.add("2022-10-01");
//		date.add("2022-10-02");
//		date.add("2022-10-03");
//		date.add("2022-10-04");
//		date.add("2022-10-05");
//		date.add("2022-10-06");
//		List<String> pc = new ArrayList<String>();
//		pc.add("1");
//		pc.add("2");
//		pc.add("3");
//		pc.add("4");
//		pc.add("55");
//		pc.add("16");
//		List<String> sy = new ArrayList<String>();
//		sy.add("1");
//		sy.add("2");
//		sy.add("3");
//		sy.add("4");
//		sy.add("55");
//		sy.add("16");
//		//创建一行
//
//		for (int i = 0; i < date.size(); i++) {
//			row = sheet.createRow(1);
//			//创建列(单元格) 第二行第一列
//			cell = row.createCell(0);
//			//给第二行第一列第一个单元格赋值
//			cell.setCellValue(date.get(i));
//			//创建列(单元格) 第二行第二列
//			cell1 = row.createCell(1);
//			//给第二行第二列第一个单元格赋值
//			cell1.setCellValue(pc.get(i));
//			//创建列(单元格) 第二行第三列
//			cell2 = row.createCell(2);
//			//给第二行第三列第一个单元格赋值
//			cell2.setCellValue(sy.get(i));
//		}
//
//
//	}
	
	@Override
	public Object excled(HttpServletResponse response, HttpServletRequest request) {
		
		//相当于创建一个excel表格
		XSSFWorkbook workbook = new XSSFWorkbook();
		//相当于创建一个sheet(一页)
		XSSFSheet sheet = workbook.createSheet();
		//创建一行
		XSSFRow row = sheet.createRow(0);
		//创建列(单元格) 第一行第一列
		XSSFCell cell = row.createCell(0);
		//给第一行第一列第一个单元格赋值
		cell.setCellValue("日期");
		//创建列(单元格) 第一行第二列
		XSSFCell cell1 = row.createCell(1);
		//给第一行第二列第一个单元格赋值
		cell1.setCellValue("偏差");
		//创建列(单元格) 第一行第三列
		XSSFCell cell2 = row.createCell(2);
		//给第一行第三列第一个单元格赋值
		cell2.setCellValue("损益");
		List<String> date = new ArrayList<String>();
		date.add("2022-10-01");
		date.add("2022-10-02");
		date.add("2022-10-03");
		date.add("2022-10-04");
		date.add("2022-10-05");
		date.add("2022-10-06");
		List<Integer> pc = new ArrayList<Integer>();
		pc.add(1);
		pc.add(2);
		pc.add(3);
		pc.add(4);
		pc.add(55);
		pc.add(16);
		List<Integer> sy = new ArrayList<Integer>();
		sy.add(1);
		sy.add(2);
		sy.add(3);
		sy.add(4);
		sy.add(5);
		sy.add(16);
		//创建一行
		
		for (int i = 0; i < date.size(); i++) {
			row = sheet.createRow(1+i);
			//创建列(单元格) 第二行第一列
			cell = row.createCell(0);
			//给第二行第一列第一个单元格赋值
			cell.setCellValue(date.get(i));
			//创建列(单元格) 第二行第二列
			cell1 = row.createCell(1);
			//给第二行第二列第一个单元格赋值
			cell1.setCellValue(pc.get(i));
			//创建列(单元格) 第二行第三列
			cell2 = row.createCell(2);
			//给第二行第三列第一个单元格赋值
			cell2.setCellValue(sy.get(i));

		}
			try {
//				response.reset();
				response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode("测试模板.xlsx", "UTF-8"));
				response.setContentType("application/octet-stream；charset=UTF-8");
				workbook.write(response.getOutputStream());
				response.getOutputStream().flush();
				response.getOutputStream().close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
		return workbook;
		}

	}