package com.bdqn.text;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class text {
    public static void main(String[] args) throws  Exception {
        t1();
    }

    public static void t1() throws  Exception{
        Map obj=new HashMap();
        obj.put("name","自定义名字");
        Configuration cfg=new Configuration();
        cfg.setDefaultEncoding("utf-8");
        cfg.setDirectoryForTemplateLoading(new File("E:\\itripbackend\\itripbeans\\src\\main\\resources"));
        Template template=cfg.getTemplate("t1.flt");
        template.process(obj,new FileWriter("E://a.txt"));
        System.out.println("处理完成");
    }


    public static void t2() throws Exception {
        Map obj=new HashMap();
        List<entity> list=new ArrayList<entity>();
        for (int i=0;i<=10;i++){
            entity e=new entity();
            e.setId(i);
            e.setName("名字"+i);
            list.add(e);
        }
        obj.put("li",list);
        Configuration cfg=new Configuration();
        cfg.setDefaultEncoding("utf-8");
        cfg.setDirectoryForTemplateLoading(new File("E:\\itripbackend\\itripbeans\\src\\main\\resources"));
        Template template=cfg.getTemplate("b.flt");
        template.process(obj,new FileWriter("E://a.html"));
        System.out.println("处理完成");
    }
}
