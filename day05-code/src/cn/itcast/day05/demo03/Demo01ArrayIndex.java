package cn.itcast.day05.demo03;

/*
数组的索引编号从0开始，一直到【数组的长度 - 1】为止
如果访问数组元素的时候，索引编号并不存在，将会发生【数组索引越界异常】
ArrayIndexOutOfBoundsException

原因：索引编号写错了
解决：修改为存在的正确的索引编号
* */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //错误写法，并不存在3号元素
//        System.out.println(array[3]);
    }
}
