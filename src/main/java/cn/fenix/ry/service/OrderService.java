package cn.fenix.ry.service;

import java.util.List;
import java.util.Map;


import cn.fenix.ry.entity.OrderInformation;
import cn.fenix.ry.serviceImple.NotOrderInformationFound;
import cn.fenix.ry.util.CustomResult;

public interface OrderService{
	//查询订单
	List<Map<String,Object>>listOrderInformation() throws Exception;
	
	//根据物料编码查找订单
	List<Map<String, Object>>getOrdersByCoding(String materialCoding)throws Exception;
	
	//根据产品名称查找订单
	List<Map<String, Object>>getOrdersByName(String productName)throws Exception;
	
	//根据产品名称查找订单
	List<Map<String, Object>>getOrdersByParams(Map<String,Object> params)throws Exception;
	
	//增加订单
	CustomResult insert(OrderInformation cOrder) throws Exception;
	
	//删除订单
	CustomResult deleteOrder(String orderInformationId) throws Exception;
	
	//批量删除订单
	CustomResult deleteBatch(String[] orderIds) throws Exception;
	
	//部分修改订单
	CustomResult updateOrder(OrderInformation cOrder) throws NotOrderInformationFound;
	CustomResult updateOrderAll(OrderInformation cOrder) throws NotOrderInformationFound;
	//Boolean updateOrder(OrderInformation cOrder) throws NotOrderInformationFound;
	//Boolean updateOrderAll(OrderInformation cOrder) throws NotOrderInformationFound;
}
