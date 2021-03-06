package cn.fenix.ry.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 原材料信息表
 * @author wenye
 * @Time 2017-6-4
 */
public class RawRecord implements Serializable{
	private static final long serialVersionUID = 2743209351535250134L;
		private String rowRecordId;      //原材料记录表Id
		private String pickingId;        //领料表Id
		private String materialReturnId; //退料表Id
		private String materialStockId;  //材料库存表Id
		private String orderNo;          //订单号
		private String productName;      //产品名称
		private String orderAmount;      //订单数量
		private String materialModel;    //材料编码
		private String unit;             //单位
		private Double expectAmount;     //计划领料数
		private Double stockAmount;      //库存数
		private Double requestAmount;    //需求数
		private String  pickingDate;      //领料日期
		private Double pickingAmount;    //领料数量
		private Double backAmount;       //退料数
		private String backDate;           //退料日期
		private Double pickingTotal;     //领料总数
		private Double unclaimedAmount;  //未领数
		private Double unitPrice;        //单价
		private Double weight;           //总量
		private Double amount;           //金额
		private String remarks;          //备注
		private Date created;            //创建日期
		private Date updated;            //修改日期
		public RawRecord() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RawRecord(String rowRecordId, String pickingId, String materialReturnId, String materialStockId,
				String orderNo, String productName, String orderAmount, String materialModel, String unit,
				Double expectAmount, Double stockAmount, Double requestAmount, String pickingDate, Double pickingAmount,
				Double backAmount, String backDate, Double pickingTotal, Double unclaimedAmount, Double unitPrice,
				Double weight, Double amount, String remarks, Date created, Date updated) {
			super();
			this.rowRecordId = rowRecordId;
			this.pickingId = pickingId;
			this.materialReturnId = materialReturnId;
			this.materialStockId = materialStockId;
			this.orderNo = orderNo;
			this.productName = productName;
			this.orderAmount = orderAmount;
			this.materialModel = materialModel;
			this.unit = unit;
			this.expectAmount = expectAmount;
			this.stockAmount = stockAmount;
			this.requestAmount = requestAmount;
			this.pickingDate = pickingDate;
			this.pickingAmount = pickingAmount;
			this.backAmount = backAmount;
			this.backDate = backDate;
			this.pickingTotal = pickingTotal;
			this.unclaimedAmount = unclaimedAmount;
			this.unitPrice = unitPrice;
			this.weight = weight;
			this.amount = amount;
			this.remarks = remarks;
			this.created = created;
			this.updated = updated;
		}
		public String getRowRecordId() {
			return rowRecordId;
		}
		public void setRowRecordId(String rowRecordId) {
			this.rowRecordId = rowRecordId;
		}
		public String getPickingId() {
			return pickingId;
		}
		public void setPickingId(String pickingId) {
			this.pickingId = pickingId;
		}
		public String getMaterialReturnId() {
			return materialReturnId;
		}
		public void setMaterialReturnId(String materialReturnId) {
			this.materialReturnId = materialReturnId;
		}
		public String getMaterialStockId() {
			return materialStockId;
		}
		public void setMaterialStockId(String materialStockId) {
			this.materialStockId = materialStockId;
		}
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getOrderAmount() {
			return orderAmount;
		}
		public void setOrderAmount(String orderAmount) {
			this.orderAmount = orderAmount;
		}
		public String getMaterialModel() {
			return materialModel;
		}
		public void setMaterialModel(String materialModel) {
			this.materialModel = materialModel;
		}
		public String getUnit() {
			return unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public Double getExpectAmount() {
			return expectAmount;
		}
		public void setExpectAmount(Double expectAmount) {
			this.expectAmount = expectAmount;
		}
		public Double getStockAmount() {
			return stockAmount;
		}
		public void setStockAmount(Double stockAmount) {
			this.stockAmount = stockAmount;
		}
		public Double getRequestAmount() {
			return requestAmount;
		}
		public void setRequestAmount(Double requestAmount) {
			this.requestAmount = requestAmount;
		}
		public String getPickingDate() {
			return pickingDate;
		}
		public void setPickingDate(String pickingDate) {
			this.pickingDate = pickingDate;
		}
		public Double getPickingAmount() {
			return pickingAmount;
		}
		public void setPickingAmount(Double pickingAmount) {
			this.pickingAmount = pickingAmount;
		}
		public Double getBackAmount() {
			return backAmount;
		}
		public void setBackAmount(Double backAmount) {
			this.backAmount = backAmount;
		}
		public String getBackDate() {
			return backDate;
		}
		public void setBackDate(String backDate) {
			this.backDate = backDate;
		}
		public Double getPickingTotal() {
			return pickingTotal;
		}
		public void setPickingTotal(Double pickingTotal) {
			this.pickingTotal = pickingTotal;
		}
		public Double getUnclaimedAmount() {
			return unclaimedAmount;
		}
		public void setUnclaimedAmount(Double unclaimedAmount) {
			this.unclaimedAmount = unclaimedAmount;
		}
		public Double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(Double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public Double getWeight() {
			return weight;
		}
		public void setWeight(Double weight) {
			this.weight = weight;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public Date getCreated() {
			return created;
		}
		public void setCreated(Date created) {
			this.created = created;
		}
		public Date getUpdated() {
			return updated;
		}
		public void setUpdated(Date updated) {
			this.updated = updated;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public String toString() {
			return "RawRecord [rowRecordId=" + rowRecordId + ", pickingId=" + pickingId + ", materialReturnId="
					+ materialReturnId + ", materialStockId=" + materialStockId + ", orderNo=" + orderNo
					+ ", productName=" + productName + ", orderAmount=" + orderAmount + ", materialModel="
					+ materialModel + ", unit=" + unit + ", expectAmount=" + expectAmount + ", stockAmount="
					+ stockAmount + ", requestAmount=" + requestAmount + ", pickingDate=" + pickingDate
					+ ", pickingAmount=" + pickingAmount + ", backAmount=" + backAmount + ", backDate=" + backDate
					+ ", pickingTotal=" + pickingTotal + ", unclaimedAmount=" + unclaimedAmount + ", unitPrice="
					+ unitPrice + ", weight=" + weight + ", amount=" + amount + ", remarks=" + remarks + ", created="
					+ created + ", updated=" + updated + "]";
		}
}
