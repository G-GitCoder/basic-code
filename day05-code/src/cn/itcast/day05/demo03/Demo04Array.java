package cn.itcast.day05.demo03;

//遍历数组：对数组中每一个元素逐个进行处理，默认处理方式就是打印输出
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        //原始方式
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        System.out.println(array[5]);//60
        System.out.println("=================");

        //使用循环，次数就是数组的长度
//        array.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
