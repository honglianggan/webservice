package com.ghl;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.List;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 19:02
 * @Description:
 */
public class MyIntercepter extends AbstractPhaseInterceptor<SoapMessage> {
    public MyIntercepter() {
        super(Phase.PRE_INVOKE);
    }
    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {

        List<Header> headers = soapMessage.getHeaders();
        if (headers == null || headers.size() == 0) {
            throw new Fault(new IllegalArgumentException("没有headers，拦截器拦截"));
        }
        Header header = headers.get(0);
        Element element = (Element) header.getObject();
        NodeList userList = element.getElementsByTagName("user");
        NodeList pwdList = element.getElementsByTagName("password");
        System.out.println(userList.toString());
        //System.out.println(userList.item(0).getTextContent());
        //身份验证
        if (userList.getLength() != 1) {
            throw new Fault(new IllegalArgumentException("用户名格式不对"));
        }
        if (pwdList.getLength() != 1) {
            throw new Fault(new IllegalArgumentException("密码格式不对"));
        }
        String username = userList.item(0).getTextContent();

        String password = pwdList.item(0).getTextContent();
        if (!("admin".equals(username)) || !("123".equals(password))) {
            throw new IllegalArgumentException("用户名或密码错误");
        }
    }
}
