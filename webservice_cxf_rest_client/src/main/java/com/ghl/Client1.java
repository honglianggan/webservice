package com.ghl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/27 21:12
 * @Description: 客户端实现2   直接返回json或者xml字符串
 */
public class Client1 {

    public static void main(String[] args) throws IOException {
        //第一步：创建服务地址，不是WSDL地址
        URL url = new URL("http://localhost:8080/user/student/queryList/110?_type=json");
        //第二步：打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步：设置参数
        //3.1发送方式设置：POST必须大写
        connection.setRequestMethod("GET");
        //3.2设置数据格式：content-type
        //3.3设置输入输出，因为默认新创建的connection没有读写权限，
        connection.setDoInput(true);

        //第五步：接收服务端响应，打印
        int responseCode = connection.getResponseCode();
        if(200 == responseCode){//表示服务端响应成功
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String temp = null;
            while(null != (temp = br.readLine())){
                sb.append(temp);
            }
            System.out.println(sb.toString());
            //dom4j解析返回数据，课下作业
            is.close();
            isr.close();
            br.close();
        }
    }
}

