package cn.itcast.day05.demo04;

/*
一个方法可以有0、1、多个参数，但是只能有0或者1个返回值，不能有多个返回值
如果希望一个方法当中产生多个结果数据进行返回，可以使用【数组】作为返回值类型

任何数据类型都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值
数组作为方法的返回值，返回的其实也是数组的地址值
* */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);

        System.out.println("main方法接收到的返回值数组是：");
        System.out.println(result);//地址值

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数

        //两个结果都希望进行返回
        //需要一个数组，数组可以保存多个结果

        /*int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;*/

        int[] array = {sum, avg};
        System.out.println("calculate方法内部的数组是：");
        System.out.println(array);
        return array;
    }
}
