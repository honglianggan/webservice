package com.ghl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/26 19:20
 * @Description:  ESI
 */

@WebService
public interface IHello {
    @WebMethod @WebResult(name = "result") String sayHello(@WebParam(name = "name") String name);
}
