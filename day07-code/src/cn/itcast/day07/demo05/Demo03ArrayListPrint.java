package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素
格式参照{元素@元素@元素}

System.out.println(list);       [10,20,30]
printArrayList(list);           {10@20@30}
* */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("宋远桥");
        System.out.println(list);//[张三丰, 张无忌, 张翠山, 宋远桥]

        printArrayList(list);
    }

    /*
    定义方法的三要素：
    返回值类型：只是进行打印，没有运算，没有结果，用void
    方法名称：printArrayList
    参数列表：ArrayList
    * */
    public static void printArrayList(ArrayList<String> list) {
        //{元素@元素@元素}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i == list.size() - 1) {
                System.out.println("}");
            } else {
                System.out.print("@");
            }
        }
    }
}
