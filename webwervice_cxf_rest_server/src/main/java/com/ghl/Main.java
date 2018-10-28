package com.ghl;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/27 17:52
 * @Description:  发布rest风格的服务
 */
public class Main {
    public static void main(String[] args) {

        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        //设置服务实现类
        //jaxrsServerFactoryBean.setServiceBean(new StudentImpl());
        //设置资源类
        jaxrsServerFactoryBean.setResourceClasses(StudentImpl.class);
        //设置服务地址
        jaxrsServerFactoryBean.setAddress("http://127.0.0.1:12347/user");
        //只有加了下面这条语句，才能返回json格式
        jaxrsServerFactoryBean.setProvider(new JacksonJaxbJsonProvider());
        //发布服务
        jaxrsServerFactoryBean.create();

    }
}
