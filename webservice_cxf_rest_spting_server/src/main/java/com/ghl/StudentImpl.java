package com.ghl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author : ganhonglaing
 * @Date : 2018/10/27 17:49
 * @Description:  学生接口实现类
 */
public class StudentImpl implements IStudent {

    @Override
    public Student query(int id) {
       Student st = new Student();
       st.setId(1);
       st.setBirthday(new Date());
       st.setName("tom");
       return st;
    }

    @Override
    public List<Student> queryList(String name) {
        Student st = new Student();
        st.setId(110);
        st.setName("张三");
        st.setBirthday(new Date());

        Student st2 = new Student();
        st2.setId(120);
        st2.setName("李四");
        st2.setBirthday(new Date());

        List<Student> list = new ArrayList<>();
        list.add(st);
        list.add(st2);
        return list;

    }
}
