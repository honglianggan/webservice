package com.ghl;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 20:12
 * @Description:
 */
public class MyInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String username;
    private String password;

    public MyInterceptor(String username, String password) {
        super(Phase.PREPARE_SEND);
        this.username = username;
        this.password = password;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        Document doc = DOMUtils.createDocument();

        //定义三个对象
        Element element = doc.createElement("authHeader");
        Element userElement = doc.createElement("user");
        Element pwdElement = doc.createElement("password");

        userElement.setTextContent(username);
        pwdElement.setTextContent(password);
        element.appendChild(userElement);
        element.appendChild(pwdElement);
        headers.add(new Header(new QName("name"),element));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
