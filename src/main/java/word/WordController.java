package word;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.RowRenderData;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static javax.swing.UIManager.put;

/**
 * @author shenzewei
 * @date 2022/12/20
 */
@RestController
@RequestMapping("/wordTemplate")
public class WordController {


    /**
     * word文档导出
     * @return
     */
    @RequestMapping("/create")
    public Object wordTemplate() throws Exception {
        String filePath = "C:\\Users\\JiangBing\\Desktop\\1.docx";
        String targetPath = "C:\\Users\\JiangBing\\Desktop\\代理购电业务客户诉求分析.docx";
        XWPFTemplate template = XWPFTemplate.compile(filePath).render(new HashMap<String, Object>() {{
            put("getProvince","宁夏");
            put("getYear","2022");
            put("getMonth","12");
            put("startMonth","12");
            put("startDay","01");
            put("endMonth","12");
            put("endDay","09");
            put("startMonth","12");
            put("startDay","01");
            put("endMonth","12");
            put("endDay","09");
            put("monthSum","2000");
            put("ratio","99");
            put("ycLines","100");
            put("ycperrcent","10");
            put("wzLines","200");
            put("wzperrcent","20");
            put("ndLines","300");
            put("ndperrcent","30");
            put("szsLines","400");
            put("szsperrcent","40");
            put("zwLines","500");
            put("zwperrcent","30");
            put("gyLines","600");
            put("gyperrcent","30");
            put("monthSum","2000");
    
        }});
        FileOutputStream out = new FileOutputStream(targetPath);
        template.write(out);
        out.flush();
        out.close();
        template.close();
        return "ok";
    }


    /**
     * 表格数据导出
     * @return
     */
    @RequestMapping("/downloadWord2")
    public Object downloadWord2(HttpServletRequest request, HttpServletResponse response){
        
        
        String filePath = "C:\\Users\\JiangBing\\Desktop\\1new.docx";
        String targetPath = "C:\\Users\\JiangBing\\Desktop\\代理购电业务客户诉求分析new.docx";
//        RowRenderData build1 = new RowRenderData().build("类型","工单数量","备注");
        RowRenderData build2 = new RowRenderData().build("银川公司", "100", " ");
        RowRenderData build3 = new RowRenderData().build("吴忠公司", "200", " ");
        RowRenderData build4 = new RowRenderData().build("宁东公司", "300", " ");
        RowRenderData build5 = new RowRenderData().build("石嘴山公司", "400", " ");
        RowRenderData build6 = new RowRenderData().build("中卫公司", "500", " ");
        RowRenderData build7 = RowRenderData.build("固原公司", "600", " ");
        PaymentData data1 = new PaymentData();
        TableData tableData = new TableData();
        List<List<RowRenderData>> data = new ArrayList<List<RowRenderData>>();
        //表格数据源
//        data.add(Arrays.asList(build1));
        data.add(Arrays.asList(build2));
        data.add(Arrays.asList(build3));
        data.add(Arrays.asList(build4));
        data.add(Arrays.asList(build5));
        data.add(Arrays.asList(build6));
        data.add(Arrays.asList(build7));
        tableData.setRowRenderDataList(data);
        //填充文字数据源
        data1.setTableData(tableData);
        data1.setProvince("宁夏");
        data1.setYear("2022");
        data1.setMonth("12");
        data1.setStartMonth("12");
        data1.setStartDay("01");
        data1.setEndMonth("12");
        data1.setEndDay("13");
        data1.setMonthSum("2000");
        data1.setRatio("22");
        data1.setYcLines("100");
        data1.setYcperrcent("1");
        data1.setWzLines("200");
        data1.setWzperrcent("2");
        data1.setNdLines("300");
        data1.setNdperrcent("3");
        data1.setSzsLines("400");
        data1.setSzsperrcent("4");
        data1.setZwLines("500");
        data1.setZwperrcent("5");
        data1.setGyLines("600");
        data1.setGyperrcent("6");
        //Configure configure = Configure.newBuilder().customPolicy("table", new SjTableRenderPolicy()).build();
        Configure.ConfigureBuilder builder = Configure.newBuilder();
        builder.customPolicy("table",new SjTableRenderPolicy());
        XWPFTemplate template = XWPFTemplate.compile(filePath,builder.build());
        /**
         * {@link SjTableRenderPolicy#render(XWPFTable, Object)}
         */
        template.render(data1);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(targetPath);
            template.write(out);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                template.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }






}
