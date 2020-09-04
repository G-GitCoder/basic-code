package cn.itcast.day05.demo03;
/*
所有的引用类型变量，都可以赋值为一个null，但是代表什么都没有

数组必须进行new初始化才能使用其中的元素
如果只是赋值了一个null，没有进行new创建，将会发生【空指针异常】
NullPointerException
* */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}
