package com.ghl;

import javax.jws.WebService;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/25 16:23
 * @Description:
 */
@WebService
public class Hello implements IHello {
    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
