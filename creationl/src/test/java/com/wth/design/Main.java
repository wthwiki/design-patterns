package com.wth.design;


import com.wth.design.singleton.Singleton;
import org.junit.Test;

public class Main {

    /**
     * 测试懒汉模式创建单例
     */
    @Test
    public void test(){
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        // 获取的两个对象是同一个对象
        System.out.println(singleton == singleton1);
    }

}
