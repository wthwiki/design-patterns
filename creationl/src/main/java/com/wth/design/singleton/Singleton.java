package com.wth.design.singleton;

/**
 * 懒汉式创建单例
 */
public class Singleton {
    public static Singleton instance ;
    public static Singleton getSingleton(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
