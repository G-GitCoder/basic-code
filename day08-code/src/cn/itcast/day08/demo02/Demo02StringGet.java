package cn.itcast.day08.demo02;

/*
String当中与获取相关的常用方法有：

public int length():获取字符串当中含有的字符个数，即字符串的长度
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1
* */
public class Demo02StringGet {

    public static void main(String[] args) {
        //获取字符串的长度
        int length = "fshjdghflargfkqefl".length();
        System.out.println("字符串的长度是：" + length);
        System.out.println("=====================");

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello,原封不动
        System.out.println(str2);//World,原封不动
        System.out.println(str3);//HelloWorld，新的字符串
        System.out.println("=====================");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);
        System.out.println("=====================");

        //查找参数字符串在本来字符串当中第一次出现的索引位置
        //如果没有，返回-1
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次出现llo的索引值是：" + index);//2

        System.out.println("HelloWorld".indexOf("abc"));//-1
    }
}
