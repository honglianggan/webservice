package com.ghl;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 21:30
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        //新建服务类
        HelloService service = new HelloService();
        //获取服务实现类
        IHello hello = service.getHelloPort();
        //调用方法
        String result = hello.sayHello("tom");
        System.out.println(result);
    }
}
