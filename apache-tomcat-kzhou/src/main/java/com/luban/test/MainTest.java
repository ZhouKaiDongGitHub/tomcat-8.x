package com.luban.test;

/**
 * javac XXX.java
 * java XXX
 * JVM是在执行java XXX的时候就启动一个实例了，然后加载静态块。
 */
public class MainTest {

    static {
        System.out.println("--------静态块--------");
    }
    public static void main(String[] args) {
        System.out.println("--------main方法--------");
    }
}
