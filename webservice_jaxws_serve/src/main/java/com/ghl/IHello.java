package com.ghl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 19:35
 * @Description:  创建SEI（Service Endpoint Interface）接口，本质上是Java接口,在接口上用注解改变返回值和参数名称
 */
@WebService
public interface IHello {
    /**
     * @param name
     * @return
     */
    @WebMethod @WebResult(name = "result") String sayHello(@WebParam(name = "name") String name);
}
