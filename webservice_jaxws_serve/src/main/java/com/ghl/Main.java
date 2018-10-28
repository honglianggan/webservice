package com.ghl;

import javax.xml.ws.Endpoint;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 19:47
 * @Description:发布服务
 */
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/hello",new Hello());
    }
}
