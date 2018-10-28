package com.ghl;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/27 17:45
 * @Description: 学生实体
 */

@XmlRootElement(name = "student")
public class Student {
    private int id;
    private String name;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
