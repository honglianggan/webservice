package com.ghl;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 16:33
 * @Description:使用cxf发布webservice
 */
public class Main {
    public static void main(String[] args) {
        //JaxWsServerFactoryBean发布服务
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置接口
        jaxWsServerFactoryBean.setServiceClass(IHello.class);
        //设置实现类
        jaxWsServerFactoryBean.setServiceBean(new Hello());
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12346/hello");
        //添加in日志信息
        jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        //添加out日志信息
        jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        jaxWsServerFactoryBean.getInInterceptors().add(new MyIntercepter());
        jaxWsServerFactoryBean.create();
    }
}
