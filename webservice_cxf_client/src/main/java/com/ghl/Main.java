package com.ghl;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 20:05
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        //创建服务视图
        IHelloService service = new IHelloService();
        //得到服务接口，通过service标签的port子标签的name属性得到
        IHello port = service.getIHelloPort();
        //创建代理客户端，不创建代理客户端，不能添加拦截器
        Client client = ClientProxy.getClient(port);
        client.getOutInterceptors().add(new MyInterceptor("admin","123"));
        //通过服务接口调用方法
        String result = port.sayHello("tom");
        System.out.println(result);

    }
}
