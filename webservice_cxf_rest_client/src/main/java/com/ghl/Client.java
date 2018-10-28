package com.ghl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.List;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/27 20:53
 * @Description:  rest客户端
 */
public class Client {
    public static void main(String[] args) {
        String baseAddress = "http://127.0.0.1:12347/user";
//        List<Object> providerList = new ArrayList<>();
//        providerList.add(new JacksonJaxbJsonProvider());
        Response response = WebClient.create(baseAddress).path("/student").path("/queryList/1?_type=xml").accept(MediaType.APPLICATION_XML).type(MediaType.APPLICATION_XML).get();
//        String jsonStr = JSONObject.toJSONString(student);
//        JSONObject jsonStudent = JSON.parseObject(jsonStr);
//        System.out.println(jsonStudent.get("name"));
//        System.out.println(jsonStudent.get("id"));
        }


    public static String getBeanXml(Object object){
        String xml = null;
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            StringWriter writer = new StringWriter();
            marshaller.marshal(object, writer);
            xml = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xml;
    }

}
