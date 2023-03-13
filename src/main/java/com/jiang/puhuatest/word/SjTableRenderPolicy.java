package com.jiang.puhuatest.word;


import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.policy.DynamicTableRenderPolicy;
import com.deepoove.poi.policy.MiniTableRenderPolicy;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shenzewei
 * @date 2022/12/22
 * 渲染省间交易复盘表格策略
 */
@Component
public class SjTableRenderPolicy extends DynamicTableRenderPolicy {

    private final static Logger log = LoggerFactory.getLogger(SjTableRenderPolicy.class);

    @Override
    public void render(XWPFTable xwpfTable, Object o) {
        if(o==null) {
            return ;
        }
        TableData tableData = (TableData) o;
        //渲染表格开始行数
        int startRow = 2;
        //结束行
        int endRow = startRow;
        //删除原本行数据
        xwpfTable.removeRow(startRow);
        //循环插入行(考虑省间一个时间段内都多个阶梯价，按照每个时间段为一个list集合传输)
        for (List<RowRenderData> rowRenderDatas : tableData.getRowRenderDataList()) {
            //单个时间段的数据集
            //循环插入行
            for (RowRenderData rowRenderData : rowRenderDatas) {
                XWPFTableRow insertNewTableRow = xwpfTable.insertNewTableRow(startRow);
                //根据属性数量决定插入列数
                for (int j = 0; j < 3; j++) {
                    insertNewTableRow.createCell();
                }
                //渲染一行数据
                MiniTableRenderPolicy.Helper.renderRow(xwpfTable, startRow, rowRenderData);
                endRow++;
            }
            log.info("起始行数:{}",startRow);
            log.info("结束行数:{}",endRow);
            //合并单元格
            //TableTools.mergeCellsHorizonal(xwpfTable,startRow,1,2);
//            TableTools.mergeCellsVertically(xwpfTable,0,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,1,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,5,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,6,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,7,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,8,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,9,startRow,endRow-1);
//            TableTools.mergeCellsVertically(xwpfTable,10,startRow,endRow-1);
            startRow=endRow;
        }
    }
}
