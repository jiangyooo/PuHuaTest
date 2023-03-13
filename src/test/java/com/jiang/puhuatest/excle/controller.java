package com.jiang.puhuatest.excle;//package com.example.excle;
//
//import com.alibaba.excel.EasyExcel;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.text.SimpleDateFormat;
//
///**
// * @author JiangBing
// * @email 15333079013@163.com
// * @date 2023/3/10 15:42
// */
//@RestController
//@RequestMapping(value = "/down")
//public class controller {
//
//	public R download(HttpServletResponse response, @RequestBody String[] ids) throws IOException {
//		List<PlanEntity> list = planService.selectByIds(ids);
//		log.warn("获取数据:\n"+list);
//		String fileName=new String("学生表.xlsx".getBytes(), StandardCharsets.UTF_8)+new SimpleDateFormat().format(new Date());
//		response.setContentType("application/vnd.ms-excel");
//		response.setCharacterEncoding("utf-8");
//		response.setHeader("Content-Disposition","attachment;fileName="+fileName);
//		EasyExcel.write(response.getOutputStream(),PlanEntity.class)
//				.sheet("test")
//				.doWrite(list);
//		log.info("导出数据:\n"+list);
//		return R.ok().put("fileName",fileName);
//	}
//
//}
