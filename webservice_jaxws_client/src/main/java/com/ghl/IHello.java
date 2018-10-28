package com.ghl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 21:23
 * @Description:
 */
@WebService(
        name = "IHello",
        targetNamespace = "http://ghl.com/"
)
@XmlSeeAlso({ObjectFactory.class})
public interface IHello {
    @WebMethod
    @WebResult(
            name = "result",
            targetNamespace = ""
    )
    @RequestWrapper(
            localName = "sayHello",
            targetNamespace = "http://ghl.com/",
            className = "com.ghl.SayHello"
    )
    @ResponseWrapper(
            localName = "sayHelloResponse",
            targetNamespace = "http://ghl.com/",
            className = "com.ghl.SayHelloResponse"
    )
    @Action(
            input = "http://ghl.com/IHello/sayHelloRequest",
            output = "http://ghl.com/IHello/sayHelloResponse"
    )
    String sayHello(@WebParam(name = "name",targetNamespace = "") String var1);
}

