package cn.itcast.day11.demo05;

public class DemoMain {

    public static void main(String[] args) {
        MyInterface obj = new MyInterfaceImpl();//多态，左父右子
        obj.method();
    }
}
