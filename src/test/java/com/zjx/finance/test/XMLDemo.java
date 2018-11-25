package com.zjx.finance.test;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLDemo {

public static void parserNode(Element ele,HashMap<String, Object> map){
		
		System.out.println(ele.getName()+":"+ele.getText().trim());
		map.put(ele.getName(), ele.getText().trim());
		//从Users根节点开始遍历，像【属性=值】的形式存为一个Attribute对象存储在List集合中
		List<Attribute> attrList = ele.attributes();
		for(Attribute attr : attrList){
			//每循环一次，解析此节点的一个【属性=值】，没有则输出空
			String name = attr.getName();
			String value = attr.getValue();
			System.out.println(name+"="+value);
			map.put(name, value);
		}
		
		List<Element> eleList = ele.elements();
		//递归遍历父节点下的所有子节点
		for(Element e : eleList){
			parserNode(e,map);
		}
	}
	
	public static void main(String[] args) throws DocumentException {
			/*String fileName="E:/workspace/finance/src/main/resources/static/xml/SS001.xml";
			File file=new File(fileName);
			HashMap<String, Object> map=getVal(file);
			System.out.println(map);*/
		
		String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<appMsg><appHeader><GWTradeCode>WNCGBXML020</GWTradeCode>"
				+ "<GWInstId>30000050</GWInstId><GWVersion>1.0.0</GWVersion>"
				+ "<GWRespTime>20181122203033128</GWRespTime><GWSenderSN>"
				+ "201811222030331281502177</GWSenderSN><GWErrorCode>000000"
				+ "</GWErrorCode><GWErrorMsg>处理成功</GWErrorMsg></appHeader>"
				+ "<appBody><resCode>000000</resCode><resMsg>处理成功</resMsg>"
				+ "<flowNo>2018112220032667343389</flowNo><num>1</num><Items>"
				+ "<thirdCoupNo>5856777866</thirdCoupNo><result>000000</result>" + "</Items></appBody></appMsg>\r\n";
		HashMap<String, Object> map=getVal(xmlStr);
		System.out.println(map);
	}
	
	public static HashMap<String, Object> getVal(File file) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(file);
		Element ele = document.getRootElement();
		HashMap<String, Object> map=new HashMap<String,Object>();
		parserNode(ele,map);
		return map;
	}
	
	public static HashMap<String,Object> getVal(String xmlStr) throws DocumentException{
		Document document = DocumentHelper.parseText(xmlStr);
		Element ele = document.getRootElement();
		HashMap<String, Object> map=new HashMap<String,Object>();
		parserNode(ele,map);
		return map;
	}

}
