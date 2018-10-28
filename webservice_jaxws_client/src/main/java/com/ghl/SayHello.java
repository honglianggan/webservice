package com.ghl;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/23 21:27
 * @Description:
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "sayHello",
        propOrder = {"name"}
)
public class SayHello {
    protected String name;

    public SayHello() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }
}
