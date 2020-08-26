package cn.itcast.day04.demo03;

//题目：定义一个方法，打印指定次数的HelloWorld
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    /*
    * 三要素：
    * 返回值类型：void
    * 方法名称：printCount
    * 参数列表：打印次数，int num
    * */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello, World!" + i);
        }
    }
}
