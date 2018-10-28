package com.ghl;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.message.SOAPHeaderElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 20:51
 * @Description:   通用webservice客户端，不用生成客户端
 */
public class WebServiceClient {
    public static String client(String temp){
        String result = "";
        try {
            String endpoint = "http://127.0.0.1:12346/hello";
            // 直接引用远程的wsdl文件
            // 以下都是套路
            //String bts = "111";
            String namespace = "http://ghl.com/";
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(endpoint));
            //call.setEncodingStyle("utf-8");
            //如果有，一定要加下面这条语句
            //call.setSOAPActionURI("http://tempuri.org/GetAlarmBTSlte");
            //WSDL里面描述的方法名称
            call.setOperationName(new QName(namespace, "sayHello"));
            //添加Headers
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.newDocument();
            //定义三个对象
            Element element = doc.createElement("authHeader");
            Element userElement = doc.createElement("user");
            Element pwdElement = doc.createElement("password");
            userElement.setTextContent("admin");
            pwdElement.setTextContent("123");
            element.appendChild(userElement);
            element.appendChild(pwdElement);
            SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement(element);
            call.addHeader(soapHeaderElement);
           /* 调用.net开发的webservice接口
                    call.addParameter(new QName(namespace, "name"),
                    org.apache.axis.encoding.XMLType.XSD_STRING,
                    javax.xml.rpc.ParameterMode.IN);*/

            call.addParameter("name",
                    org.apache.axis.encoding.XMLType.XSD_STRING,
                    javax.xml.rpc.ParameterMode.IN);
            //设置返回类型
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
            //call.setUseSOAPAction(true);

            result = (String) call.invoke(new Object[] {temp});

            // 给方法传递参数，并且调用方法
            //System.out.println("--SOAP Request: " + call.getMessageContext().getRequestMessage().getSOAPPartAsString());
            //输出SOAP返回报文
            //System.out.println("--SOAP Response: " + call.getResponseMessage().getSOAPPartAsString());
            System.out.println("result is " + result);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return result;
    }
    public static void main(String[] args) {
        client("甘鸿亮");
    }
}
