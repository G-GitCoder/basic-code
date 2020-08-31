package cn.itcast.day05.demo01;

/*
动态初始化（指定长度）：在创建数组的时候，直接指定数组当中数据元素个数（即数组长度）
静态初始化（指定内容）：在创建数组的时候，不指定数据个数多少，直接指定数据内容

静态初始化基本格式：
数据类型[] 数组名称 = new 数据类型[]{元素1, 元素2, ..., 元素n};

注意事项：
虽然静态初始化没有直接指定长度，但是根据大括号里的元素具体内容，也可以自动推算出长度
* */
public class Demo02Array {
    public static void main(String[] args) {
        //直接创建一个数组，存int的数字，分别为：5,15,25,35
        int[] arrayA = new int[]{5, 15, 25, 35};

        //创建一个数组，用来装字符串"Hello"、"World"、"Java"
        String[] arrayB = new String[]{"Hello", "World", "Java"};
    }
}
