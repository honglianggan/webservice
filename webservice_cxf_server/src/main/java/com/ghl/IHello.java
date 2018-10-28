package com.ghl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.http.HTTPBinding;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 16:20
 * @Description: SEI接口
 */
@WebService
@BindingType(SOAPBinding.SOAP11HTTP_BINDING)
public interface IHello {
    /**
     * @param name
     * @return
     */
    @WebMethod @WebResult(name = "result") String sayHello(@WebParam(name = "name") String name);
}
