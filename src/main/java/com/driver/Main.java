package com.driver;
import java.util.*;

public class Main {
    static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    static class B extends A{
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.meth());

        B obj1=new B();
        System.out.println(obj1.meth());

    }


}