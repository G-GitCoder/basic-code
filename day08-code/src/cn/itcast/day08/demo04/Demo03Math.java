package cn.itcast.day08.demo04;

/*
java.lang.Math
数学相关的工具类，里边提供了大量的静态方法，完成与数学运算相关的操作

public static double abd(double num):获取绝对值，有多种重载
public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入

Math.PI：代表近似的圆周率常量
* */
public class Demo03Math {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-2.5));
    }
}
