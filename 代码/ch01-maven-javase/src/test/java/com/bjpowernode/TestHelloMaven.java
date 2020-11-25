package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd(){

        System.out.println("====testAdd 测试add方法=====");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10,20);
        //判断结果是否正确
        Assert.assertEquals(30,res);
    }

    @Test
    public void testAdd2(){

        System.out.println("22222====testAdd 测试add方法=====");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10,20);
        //判断结果是否正确
        Assert.assertEquals(30,res);
    }
}
