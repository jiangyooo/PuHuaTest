package word;


import com.deepoove.poi.data.RowRenderData;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

/**
 * @author shenzewei
 * @date 2022/12/23
 */
public class TableData {

    private List<List<RowRenderData>>  rowRenderDataList;

    public List<List<RowRenderData>> getRowRenderDataList() {
        return rowRenderDataList;
    }

    @Override
    public String toString() {
        return "TableData{" +
                "rowRenderDataList=" + rowRenderDataList +
                '}';
    }

    public void setRowRenderDataList(List<List<RowRenderData>> rowRenderDataList) {
        this.rowRenderDataList = rowRenderDataList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof TableData)) return false;

        TableData tableData = (TableData) o;

        return new EqualsBuilder()
                .append(getRowRenderDataList(), tableData.getRowRenderDataList())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getRowRenderDataList())
                .toHashCode();
    }
}
