package cn.itcast.day05.demo03;
/*
获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度

注意：数组一旦创建，程序运行期间，长度不可改变
* */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1,2,1,1,2,2,2,2,3,4};
        int len = arrayB.length;
        System.out.println(len);
        System.out.println("==================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
