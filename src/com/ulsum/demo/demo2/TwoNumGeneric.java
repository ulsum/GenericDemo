package com.ulsum.demo.demo2;

public class TwoNumGeneric<E, X> {

    private E num1;
    private X num2;

    public void getNum(E num1, X num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public E getNum1() {
        return num1;
    }

    public void setNum1(E num1) {
        this.num1 = num1;
    }

    public X getNum2() {
        return num2;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }

    // 测试
    public static void main(String[] args) {
        TwoNumGeneric<Integer, Float> numObj = new TwoNumGeneric<>();
        numObj.getNum(25, 5.0f);
        System.out.println("num1 = " + numObj.getNum1());
        System.out.println("num2 = " + numObj.getNum2());
    }

}
