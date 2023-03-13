package com.jiang.puhuatest.wordtl;//package com.example.wordtl;
//
//import com.deepoove.poi.XWPFTemplate;
//import com.deepoove.poi.data.RowRenderData;
//import com.deepoove.poi.data.Rows;
//import com.deepoove.poi.data.Tables;
//import com.deepoove.poi.data.Texts;
//import com.deepoove.poi.data.style.BorderStyle;
//import org.junit.jupiter.api.Test;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.HashMap;
//
///**
// * @Author JiangBing
// * @Email 15333079013@163.com
// * @Date 2023/1/11 14:44
// */
//public class wordTL {
//	@Test
//	void text() throws Exception {
//		String filePath = "C:\\Users\\JiangBing\\Desktop\\1.docx";
//		String targetPath = "C:\\Users\\JiangBing\\Desktop\\代理购电业务客户诉求分析.docx";
//		String date = "2022";
//		XWPFTemplate template = XWPFTemplate.compile(filePath).render(new HashMap<String, Object>() {
//			{
//				/**文本测试*/
//				put("getProvince", Texts.of("宁夏").create());
//				put("getYear", Texts.of(date).create());
//				put("getMonth", Texts.of("1").create());
//				put("startMonth", Texts.of("1").create());
//				put("startDay", Texts.of("1").create());
//				put("endMonth", Texts.of("1").create());
//				put("endDay", Texts.of("9").create());
//				put("startMonth", Texts.of("1").create());
//				put("startDay", Texts.of("1").create());
//				put("endMonth", Texts.of("1").create());
//				put("endDay", Texts.of("9").create());
//				put("monthSum", Texts.of("166666").create());
//				put("ratio",Texts.of("5").create());
//
//				put("ycLines", Texts.of("100").create());
//				put("ycperrcent", Texts.of("3").create());
//
//				put("wzLines", Texts.of("200").create());
//				put("wzperrcent", Texts.of("6").create());
//
//				put("ndLines", Texts.of("300").create());
//				put("ndperrcent", Texts.of("9").create());
//				put("szsLines", Texts.of("400").create());
//				put("szsperrcent", Texts.of("12").create());
//
//				put("zwLines", Texts.of("500").create());
//				put("zwperrcent", Texts.of("15").create());
//
//				put("gyLines", Texts.of("600").create());
//				put("gyperrcent", Texts.of("20").create());
//
//				put("monthSum", Texts.of("2100").create());
//
//				put("table", Tables.of(new String[][]{new String[]{"类型", "工单数量", "备注"}, new String[]{"银川公司", "100", " "}, new String[]{"吴忠公司", "200", " "}, new String[]{"宁东公司", "300", " "}, new String[]{"石嘴山公司", "400", " "}, new String[]{"中卫公司", "500", " "}, new String[]{"固原公司", "600", " "}}).border(BorderStyle.DEFAULT).create());
//			}
//
//		});
//
//		template.writeAndClose(Files.newOutputStream(Paths.get(targetPath)));
//	}
//
////	@Test
////	void table() throws Exception {
////		String filePath = "C:\\Users\\JiangBing\\Desktop\\1.docx";
////		String targetPath = "C:\\Users\\JiangBing\\Desktop\\tabletest.docx";
////		RowRenderData tableHead = Rows.of("类型", "工单数量", "备注").center().bgColor("4472c4").create();
////		// 第一行
////		RowRenderData row1 = Rows.create("银川公司", "100", " ");
////		// 第二行
////		RowRenderData row2 = Rows.create("吴忠公司  ", "200", " ");
////
////		RowRenderData row3 = Rows.create("宁东公司", "300", " ");
////		RowRenderData row4 = Rows.create("石嘴山公司", "400", " ");
////		RowRenderData row5 = Rows.create("中卫公司", "500", " ");
////		RowRenderData row6 = Rows.create("固原公司", "600", " ");
////
////
////		XWPFTemplate template = XWPFTemplate.compile(filePath).render(new HashMap<String, Object>() {
////			{
////				put("table", Tables.of(tableHead, row1, row2, row3, row4, row5, row6).center().create());
////			}
////		});
////		template.writeAndClose(Files.newOutputStream(Paths.get(targetPath)));
////
////	}
//
//}
