package cn.itcast.day04.demo02;

/*
题目要求：定义一个方法，用来【求出】两个数的和（你帮我算，算完之后把结果告诉我）
题目变形：定义一个方法，用来【打印】两个数的和（你来计算，算完之后你直接显示结果，不用告诉我）

注意事项：
1.对于有返回值的方法，可以使用单独调用、赋值调用、打印调用；
2.对于无返回值的方法，只能使用单独调用，不能使用赋值调用、打印调用

* */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //有返回值
        //我调用你，你帮我算一下，算完把结果告诉我的num变量
        int num = getSum(10,20);//赋值调用
        System.out.println("结果是：" + num);

        System.out.println(getSum(10,20));//打印调用
        getSum(10,20);//单独调用，正确写法，但是返回值没有用到
        System.out.println("==================");

        //无返回值
        printSum(100,200);//单独调用

        //对于void没有返回值的方法，只能使用单独调用，不能使用赋值调用、打印调用
//        System.out.println(printSum(10,20););//错误写法
//        System.out.println(void);

//        int num2 = printSum(10,20);//错误写法
//        int num3 = void;
    }

    //我有返回值int，谁调用我，就把计算结果告诉谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    //我没有返回值，不把结果告诉任何人，自己打印输出结果
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
