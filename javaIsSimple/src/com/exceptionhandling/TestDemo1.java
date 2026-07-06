package com.exceptionhandling;

public class TestDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new  ArithmeticException();
//            System.out.println(10/0);//unreachable code
            
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}