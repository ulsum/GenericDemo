package com.ulsum.demo.demo2;

// 泛型类
public class NumGeneric<E> {            // 可以写<E>或者<T>

    private E num;

    public E getNum() {
        return num;
    }

    public void setNum(E num) {
        this.num = num;
    }

    // 测试
    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println("Integer = " + intNum.getNum());

        NumGeneric<Float> floatNum = new NumGeneric<>();
        floatNum.setNum(5.0f);
        System.out.println("Float = " + floatNum.getNum());
    }

}
