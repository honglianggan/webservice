package com.ghl;

import javax.jws.WebService;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/26 19:26
 * @Description:
 */
@WebService
public class Hello implements IHello {
    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
