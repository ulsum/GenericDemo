package com.ulsum.demo.demo3;

public class GenericMethod {

    // <E>或者<T>代表这个方法为泛型方法
    // 泛型方法不一定要在泛型类中
    public <E extends Number> void printValue(E e) {    // Number类以及它的子类
        System.out.println(e);
    }

    // 测试
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.printValue(123);
        gm.printValue(5.0f);
    }

}
