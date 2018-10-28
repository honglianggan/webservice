package com.ghl;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 21:28
 * @Description:
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "sayHelloResponse",
        propOrder = {"result"}
)
public class SayHelloResponse {
    protected String result;

    public SayHelloResponse() {
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String var1) {
        this.result = var1;
    }
}

