package cn.itcast.day04.demo02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件才能完成任务时，就是有参数
例如两个数字相加，必须知道两个数字各自是多少才能相加

无参数：小括号当中为空，一个方法不需要任何数据条件就能独立完成任务，就是无参数
例如定义一个方法，固定打印10次HelloWorld
* */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("=============");
        method2();
    }

    //【有参数】两个数字相乘，必须知道两个数字各自是多少，否则无法计算
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    //【无参数】固定打印输出10次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World" + i);
        }
    }
}
