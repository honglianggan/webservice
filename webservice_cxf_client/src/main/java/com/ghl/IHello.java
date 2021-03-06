package com.ghl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.17
 * 2018-10-25T20:03:51.719+08:00
 * Generated source version: 3.1.17
 * 
 */
@WebService(targetNamespace = "http://ghl.com/", name = "IHello")
@XmlSeeAlso({ObjectFactory.class})
public interface IHello {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ghl.com/", className = "com.ghl.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ghl.com/", className = "com.ghl.SayHelloResponse")
    @WebResult(name = "result", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}
