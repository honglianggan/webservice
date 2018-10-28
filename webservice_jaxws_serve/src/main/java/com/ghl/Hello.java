package com.ghl;

import javax.jws.WebService;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 19:39
 * @Description:   要发布接口，@WebService(endpointInterface = "com.ghl.IHello")，必须在接口上用webservice注解
 *                   否则，com.sun.xml.internal.ws.model.RuntimeModelerException: 端点接口com.ghl.IHello没有 Web 服务注释
 *                   发布接口，则在wsdl文档中portType为接口，如果不发布接口，则为类
 */
@WebService(endpointInterface = "com.ghl.IHello")
public class Hello implements IHello {
    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
