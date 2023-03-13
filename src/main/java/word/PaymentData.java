package word;

import com.deepoove.poi.config.Name;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;


/**
 * @author shenzewei
 * @date 2022/12/20
 */
public class PaymentData implements Serializable {
	@Name("table")
	private TableData tableData;
	
	private String Province;
	
	private String Year;
	private String Month;
	private String startYear;
	
	private String startMonth;
	
	private String startDay;
	
	
	private String endYear;
	
	private String endMonth;
	
	private String endDay;
	private String monthSum;
	
	private String ratio;
	
	private String ycLines;
	
	private String ycperrcent;
	private String wzLines;
	
	private String wzperrcent;
	
	private String ndLines;
	
	private String ndperrcent;
	private String szsLines;
	
	private String szsperrcent;
	private String zwLines;
	
	private String zwperrcent;
	private String gyLines;
	
	private String gyperrcent;
	
	public PaymentData() {
	
	}
	
	public PaymentData(TableData tableData, String province, String year, String month, String startYear, String startMonth, String startDay, String endYear, String endMonth, String endDay, String monthSum, String ratio, String ycLines, String ycperrcent, String wzLines, String wzperrcent, String ndLines, String ndperrcent, String szsLines, String szsperrcent, String zwLines, String zwperrcent, String gyLines, String gyperrcent) {
		this.tableData = tableData;
		Province = province;
		Year = year;
		Month = month;
		this.startYear = startYear;
		this.startMonth = startMonth;
		this.startDay = startDay;
		this.endYear = endYear;
		this.endMonth = endMonth;
		this.endDay = endDay;
		this.monthSum = monthSum;
		this.ratio = ratio;
		this.ycLines = ycLines;
		this.ycperrcent = ycperrcent;
		this.wzLines = wzLines;
		this.wzperrcent = wzperrcent;
		this.ndLines = ndLines;
		this.ndperrcent = ndperrcent;
		this.szsLines = szsLines;
		this.szsperrcent = szsperrcent;
		this.zwLines = zwLines;
		this.zwperrcent = zwperrcent;
		this.gyLines = gyLines;
		this.gyperrcent = gyperrcent;
	}
	
	@Override
	public String toString() {
		return "PaymentData{" +
				"tableData=" + tableData +
				", Province='" + Province + '\'' +
				", Year='" + Year + '\'' +
				", Month='" + Month + '\'' +
				", startYear='" + startYear + '\'' +
				", startMonth='" + startMonth + '\'' +
				", startDay='" + startDay + '\'' +
				", endYear='" + endYear + '\'' +
				", endMonth='" + endMonth + '\'' +
				", endDay='" + endDay + '\'' +
				", monthSum='" + monthSum + '\'' +
				", ratio='" + ratio + '\'' +
				", ycLines='" + ycLines + '\'' +
				", ycperrcent='" + ycperrcent + '\'' +
				", wzLines='" + wzLines + '\'' +
				", wzperrcent='" + wzperrcent + '\'' +
				", ndLines='" + ndLines + '\'' +
				", ndperrcent='" + ndperrcent + '\'' +
				", szsLines='" + szsLines + '\'' +
				", szsperrcent='" + szsperrcent + '\'' +
				", zwLines='" + zwLines + '\'' +
				", zwperrcent='" + zwperrcent + '\'' +
				", gyLines='" + gyLines + '\'' +
				", gyperrcent='" + gyperrcent + '\'' +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		
		if (!(o instanceof PaymentData)) return false;
		
		PaymentData that = (PaymentData) o;
		
		return new EqualsBuilder().append(getTableData(), that.getTableData()).append(getProvince(), that.getProvince()).append(getYear(), that.getYear()).append(getMonth(), that.getMonth()).append(getStartYear(), that.getStartYear()).append(getStartMonth(), that.getStartMonth()).append(getStartDay(), that.getStartDay()).append(getEndYear(), that.getEndYear()).append(getEndMonth(), that.getEndMonth()).append(getEndDay(), that.getEndDay()).append(getMonthSum(), that.getMonthSum()).append(getRatio(), that.getRatio()).append(getYcLines(), that.getYcLines()).append(getYcperrcent(), that.getYcperrcent()).append(getWzLines(), that.getWzLines()).append(getWzperrcent(), that.getWzperrcent()).append(getNdLines(), that.getNdLines()).append(getNdperrcent(), that.getNdperrcent()).append(getSzsLines(), that.getSzsLines()).append(getSzsperrcent(), that.getSzsperrcent()).append(getZwLines(), that.getZwLines()).append(getZwperrcent(), that.getZwperrcent()).append(getGyLines(), that.getGyLines()).append(getGyperrcent(), that.getGyperrcent()).isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getTableData()).append(getProvince()).append(getYear()).append(getMonth()).append(getStartYear()).append(getStartMonth()).append(getStartDay()).append(getEndYear()).append(getEndMonth()).append(getEndDay()).append(getMonthSum()).append(getRatio()).append(getYcLines()).append(getYcperrcent()).append(getWzLines()).append(getWzperrcent()).append(getNdLines()).append(getNdperrcent()).append(getSzsLines()).append(getSzsperrcent()).append(getZwLines()).append(getZwperrcent()).append(getGyLines()).append(getGyperrcent()).toHashCode();
	}
	
	public TableData getTableData() {
		return tableData;
	}
	
	public void setTableData(TableData tableData) {
		this.tableData = tableData;
	}
	
	public String getProvince() {
		return Province;
	}
	
	public void setProvince(String province) {
		Province = province;
	}
	
	public String getYear() {
		return Year;
	}
	
	public void setYear(String year) {
		Year = year;
	}
	
	public String getMonth() {
		return Month;
	}
	
	public void setMonth(String month) {
		Month = month;
	}
	
	public String getStartYear() {
		return startYear;
	}
	
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	
	public String getStartMonth() {
		return startMonth;
	}
	
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}
	
	public String getStartDay() {
		return startDay;
	}
	
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	
	public String getEndYear() {
		return endYear;
	}
	
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	
	public String getEndMonth() {
		return endMonth;
	}
	
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	
	public String getEndDay() {
		return endDay;
	}
	
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	
	public String getMonthSum() {
		return monthSum;
	}
	
	public void setMonthSum(String monthSum) {
		this.monthSum = monthSum;
	}
	
	public String getRatio() {
		return ratio;
	}
	
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	
	public String getYcLines() {
		return ycLines;
	}
	
	public void setYcLines(String ycLines) {
		this.ycLines = ycLines;
	}
	
	public String getYcperrcent() {
		return ycperrcent;
	}
	
	public void setYcperrcent(String ycperrcent) {
		this.ycperrcent = ycperrcent;
	}
	
	public String getWzLines() {
		return wzLines;
	}
	
	public void setWzLines(String wzLines) {
		this.wzLines = wzLines;
	}
	
	public String getWzperrcent() {
		return wzperrcent;
	}
	
	public void setWzperrcent(String wzperrcent) {
		this.wzperrcent = wzperrcent;
	}
	
	public String getNdLines() {
		return ndLines;
	}
	
	public void setNdLines(String ndLines) {
		this.ndLines = ndLines;
	}
	
	public String getNdperrcent() {
		return ndperrcent;
	}
	
	public void setNdperrcent(String ndperrcent) {
		this.ndperrcent = ndperrcent;
	}
	
	public String getSzsLines() {
		return szsLines;
	}
	
	public void setSzsLines(String szsLines) {
		this.szsLines = szsLines;
	}
	
	public String getSzsperrcent() {
		return szsperrcent;
	}
	
	public void setSzsperrcent(String szsperrcent) {
		this.szsperrcent = szsperrcent;
	}
	
	public String getZwLines() {
		return zwLines;
	}
	
	public void setZwLines(String zwLines) {
		this.zwLines = zwLines;
	}
	
	public String getZwperrcent() {
		return zwperrcent;
	}
	
	public void setZwperrcent(String zwperrcent) {
		this.zwperrcent = zwperrcent;
	}
	
	public String getGyLines() {
		return gyLines;
	}
	
	public void setGyLines(String gyLines) {
		this.gyLines = gyLines;
	}
	
	public String getGyperrcent() {
		return gyperrcent;
	}
	
	public void setGyperrcent(String gyperrcent) {
		this.gyperrcent = gyperrcent;
	}
}
